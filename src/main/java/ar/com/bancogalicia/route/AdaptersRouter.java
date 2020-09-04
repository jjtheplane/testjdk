package ar.com.bancogalicia.route;

import ar.com.bancogalicia.exception.IncorrectClientRequestException;
import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.helpers.ErrorConstants;
import ar.com.bancogalicia.helpers.SwaggerInfoConstants;
import ar.com.bancogalicia.pojo.ctg.CtgResponse;
import ar.com.bancogalicia.pojo.query.obtenercliente.QueryAdapterObtenerClienteResponse;
import ar.com.bancogalicia.pojo.query.scoring.QueryAdapterScoringResponse;
import ar.com.bancogalicia.processor.*;
import ar.com.bancogalicia.processor.logprocessor.InfoLogManagerProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import javax.ws.rs.HttpMethod;

@Component
public class AdaptersRouter extends RouteBuilder {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(AdaptersRouter.class);

    @Autowired
    InfoLogManagerProcessor infoLogManagerProcessor;

    @Value(value = "${url.ctg.accession}")
    private String adapterCtg;

    @Value(value = "${url.query.adapter}")
    private String hostQueryAdapter;

    @Value(value = "${base.path.query.adapter}")
    private String basePathQueryAdapter;

    @Autowired
    private SetCtgBodyRequest setCtgBodyRequest;

    @Autowired
    private ProcessCtgAccessionResponse processCtgAccessionResponse;

    @Autowired
    private SetQueryAdapterBodyRequestObtenerCliente setQueryAdapterBodyRequestObtenerCliente;

    @Autowired
    private ProcessQueryAdapterObtenerClienteResponse processQueryAdapterObtenerClienteResponse;

    @Autowired
    private ProcessQueryAdapterScoringResponse processQueryAdapterScoringResponse;

    @Autowired
    private MergeInfoFromQueryAdapter mergeInfoFromQueryAdapter;

    @Value(value = "${handler.nv.error.code}")
    private String codeNv;

    @Autowired
    ErrorProcessor errorProcessor;

    @Override
    public void configure() throws Exception {

        // HANDLE BAD REQUESTS
        onException(IncorrectClientRequestException.class)
                .handled(true)
                .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("${property.CamelExceptionCaught.message}"))
                .setProperty(CamelConstants.PROPERTY_MESSAGE, simple("${property.CamelExceptionCaught.message}"))
                .setProperty(CamelConstants.PROPERTY_RESPONSE_ERROR_CODE, simple(codeNv))
                .process(infoLogManagerProcessor)
                .process(errorProcessor)
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(400))
                .setHeader(Exchange.CONTENT_TYPE, constant(CamelConstants.CONTENT_TYPE_JSON_UTF8))
                .end();

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_DATA_FROM_QUERY_ADAPTER)	
                .removeHeader(Exchange.HTTP_PATH)
                .setHeader(SwaggerInfoConstants.PARAM_HEADER_CHANNEL, exchangeProperty(CamelConstants.PROPERTY_CHANNEL_FOR_REQUEST))
                .multicast()
                    .stopOnException()
                    .parallelProcessing()
                    .aggregationStrategy(new MergeBodyClientInformation())
                    .to("direct:get-data-from-query","direct:get-data-from-query-scoring")
                .end()
                .process(mergeInfoFromQueryAdapter);

        from("direct:get-data-from-query")	
                .process(setQueryAdapterBodyRequestObtenerCliente)
                .setHeader(Exchange.HTTP_METHOD, simple(HttpMethod.POST))
                .marshal().json(JsonLibrary.Jackson)
                .toD(hostQueryAdapter + basePathQueryAdapter + "?bridgeEndpoint=true&throwExceptionOnFailure=false")
    			.process(exchange -> LOGGER.info(String.format(CamelConstants.CUSTOMER_INFO_V2_LOG_MESSAGE
    					, exchange.getProperty("request_id") , 
    					exchange.getProperty("log_id_trace") , 
    					exchange.getIn().getHeader("id_host"), 
    					exchange.getIn().getHeader("id_pom_person"), 
    					LocalDateTime.now(), "Finalizo la llamada en endpoint query")))
                .choice()
                    .when(header(CamelConstants.CAMEL_HEADER_HTTP_RESPONSE_CODE).isEqualTo(200))
                        .unmarshal().json(JsonLibrary.Jackson, QueryAdapterObtenerClienteResponse.class)
                        .process(processQueryAdapterObtenerClienteResponse)
                        .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("---- Succes query-adapter ObtenerCliente ----"))
                        .process(infoLogManagerProcessor)
                    .endChoice()
                    .otherwise()
                        .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("---- Error query-adapter ObtenerCliente, status code: ${header.CamelHttpResponseCode} ----"))
                        .process(infoLogManagerProcessor)
                        .throwException(new IncorrectClientRequestException(ErrorConstants.INCORRECT_REQ))
                    .endChoice()
                .end();

        from("direct:get-data-from-query-scoring")	
                .setHeader(Exchange.HTTP_METHOD, simple(HttpMethod.GET))
                .setHeader("CamelHttpQuery", header(CamelConstants.PROPERTY_ID_HOST))
                .toD(hostQueryAdapter + basePathQueryAdapter + "/scoring" + "?bridgeEndpoint=true&throwExceptionOnFailure=false")
                .choice()
                    .when(header(CamelConstants.CAMEL_HEADER_HTTP_RESPONSE_CODE).isEqualTo(200))
                        .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("---- Succes query-adapter Scoring ----"))
                        .process(infoLogManagerProcessor)
                        .unmarshal().json(JsonLibrary.Jackson, QueryAdapterScoringResponse.class)
                        .process(processQueryAdapterScoringResponse)
                    .endChoice()
                    .otherwise()
                        .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("---- Error query-adapter Scoring, status code: ${header.CamelHttpResponseCode} ----"))
                        .process(infoLogManagerProcessor)
                        .throwException(new IncorrectClientRequestException(ErrorConstants.INCORRECT_REQ))
                    .endChoice()
                .end();

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_ADHESION)
                .process(setCtgBodyRequest)
                .removeHeader(Exchange.HTTP_PATH)
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .marshal().json(JsonLibrary.Jackson)
                .setHeader(SwaggerInfoConstants.PARAM_HEADER_CHANNEL, exchangeProperty(CamelConstants.PROPERTY_CHANNEL_FOR_REQUEST))
                .toD(adapterCtg + "?bridgeEndpoint=true&throwExceptionOnFailure=false")
                .choice()
                    .when(header(CamelConstants.CAMEL_HEADER_HTTP_RESPONSE_CODE).isEqualTo(200))
                        .unmarshal().json(JsonLibrary.Jackson, CtgResponse.class)
                        .process(processCtgAccessionResponse)
                .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("---- ctg-accession ----"))
                .process(infoLogManagerProcessor)
                    .endChoice()
                    .otherwise()
                        .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("---- Error calling ctg-accession ----"))
                        .process(infoLogManagerProcessor)
                        .setBody(exchangeProperty(CamelConstants.PROPERTY_TEMP_CLIENT_INFO))
                    .endChoice()
                .end();
    }
}
