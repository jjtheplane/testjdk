package ar.com.bancogalicia.route;

import ar.com.bancogalicia.exception.GenerateIdPomException;
import ar.com.bancogalicia.exception.IncorrectClientRequestException;
import ar.com.bancogalicia.exception.IncorrectFormatException;
import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.helpers.ErrorConstants;
import ar.com.bancogalicia.helpers.SwaggerInfoConstants;
import ar.com.bancogalicia.helpers.Utils;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.PomPersonIdContainer;
import ar.com.bancogalicia.pojo.Response.StandardRestResponse;
import ar.com.bancogalicia.pojo.swagger.SwaggerHostPomResponse;
import ar.com.bancogalicia.pojo.swagger.SwaggerResponseRetail;
import ar.com.bancogalicia.processor.*;
import ar.com.bancogalicia.processor.logprocessor.InfoLogManagerProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.http.common.HttpOperationFailedException;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
public class CamelRouter extends RouteBuilder {

    @Autowired
    ProcessJwt processJwt;
    @Autowired
    RestProcessor restProcessor;
    @Autowired
    CleanParamsProcessor cleanParamsProcessor;
    @Autowired
    ParamToHeader paramToHeader;
    @Autowired
    PomPersonGeneratorProcessor pomPersonGeneratorProcessor;
    @Autowired
    PomPersonKeyToHeader pomPersonKeyToHeader;
    @Autowired
    KeyHeaderGenerator keyHeaderGenerator;
    @Autowired
    RestResponseProcessorWithIdPom restResponseProcessorWithIdPom;
    @Autowired
    RestResponseProcessorWithIdHost restResponseProccesorWithIdHost;
    @Autowired
    ErrorProcessor errorProcessor;
    @Autowired
    InfoLogManagerProcessor infoLogManagerProcessor;
    @Autowired
    ResponseHost responseHost;

    @Value(value = "${cache.user}")
    private String cacheUser;
    @Value(value = "${cache.pass}")
    private String cachePass;
    @Value(value = "${cache.name.information.cache}")
    private String informationCacheName;
    @Value(value = "${cache.name.relation.cache}")
    private String relationCacheName;
    @Value(value = "${cache.name.relation.pom.host.cache}")
    private String hostPomrelationCacheName;
    @Value(value = "${cache.url}")
    private String baseUrlCache;

    @Value(value = "${handler.nv.error.code}")
    private String codeNv;
    @Value(value = "${handler.nv.error.message}")
    private String messageNv;
    @Value(value = "${handler.cache.error.code}")
    private String codeCache;
    @Value(value = "${handler.cache.error.message}")
    private String messageCache;

    @Value(value = "${activemq.topic.name}")
    String activeMqTopicName;

    @Autowired
    private SetFirstHost setFirstHost;

    @Override
    public void configure() throws Exception {

        restConfiguration()
                .apiContextPath("/api-docs")
                .apiProperty("api.title", "pom-people-customer-information-receiver")
                .apiProperty("api.description", "Microservicio encargado de retornar los datos filiatorios de una persona/cliente del banco")
                .apiProperty("api.version", "1.0-SNAPSHOT")
                .apiProperty("cors", "true")
                .apiProperty("host", "")
                .apiContextRouteId("doc-api")
                .component("servlet")
                .skipBindingOnErrorCode(false)
                .bindingMode(RestBindingMode.json);


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

        // HANDLE ERROR IN GENERATE ID POM
        onException(GenerateIdPomException.class)
		        .handled(true)
		        .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("${property.CamelExceptionCaught.message}"))
		        .setProperty(CamelConstants.PROPERTY_MESSAGE, simple("${property.CamelExceptionCaught.message}"))
		        .setProperty(CamelConstants.PROPERTY_RESPONSE_ERROR_CODE, simple(codeNv))
		        .process(infoLogManagerProcessor)
		        .process(errorProcessor)
		        .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(400))
		        .setHeader(Exchange.CONTENT_TYPE, constant(CamelConstants.CONTENT_TYPE_JSON_UTF8))
		        .end();
     
        /**
         * ENDPOINT POR ID HOST
         */
        rest("/people")
                .get("/host" + CamelConstants.API_ROUTE_GET_DATA)
                    .description("Obtener datos filiatorios del cliente por idHost")
                    .param()
                        .name(SwaggerInfoConstants.PARAM_HEADER_CHANNEL)
                        .type(RestParamType.header)
                        .required(true)
                        .description(SwaggerInfoConstants.PARAM_HEADER_CHANNEL_DESCRIPTION)
                        .example(SwaggerInfoConstants.PARAM_HEADER_CHANNEL_VALUE_EXAMPLE)
                    .endParam()
                    .id("get-data-from-host")
                    .param()
                        .name("id")
                        .type(RestParamType.path)
                        .required(true)
                        .example("9000050238")
                        .description("id_host del cliente")
                    .endParam()
                    .param()
                    	.name(CamelConstants.PROPERTY_NO_CACHE)
                    	.type(RestParamType.query)
                    	.required(false)
                    	.example("true")
                    	.description("flag para nocache")
                    .endParam() // flag para nocache
                    .responseMessage().code(200).responseModel(SwaggerResponseRetail.class).endResponseMessage() //OK
                    .responseMessage().code(400).message(SwaggerInfoConstants.RESPONSE_MESSAGE_BAD_REQUEST).responseModel(StandardRestResponse.class).endResponseMessage() //Not-OK
                    .responseMessage().code(404).message(SwaggerInfoConstants.RESPONSE_MESSAGE_NOT_FOUND).endResponseMessage() //Not-found
                    .responseMessage().code(500).message(SwaggerInfoConstants.RESPONSE_MESSAGE_INTERNAL_ERROR).endResponseMessage() //FAIL
                    .route()

                    .setProperty(CamelConstants.PROPERTY_CHANNEL_FOR_REQUEST, header(SwaggerInfoConstants.PARAM_HEADER_CHANNEL))
	                    .process(new Processor() {
							@Override
							public void process(Exchange exchange) throws Exception {
								Boolean nocache = exchange.getIn().getHeader(CamelConstants.PROPERTY_NO_CACHE,Boolean.class);
								exchange.setProperty(CamelConstants.PROPERTY_NO_CACHE,(nocache != null)? nocache: Boolean.FALSE);
							}
						})
                    .process(cleanParamsProcessor)
                    .setHeader("id", simpleF("%s|0000000000", CamelConstants.CAMEL_EXPRESSION_GET_HEADER_ID))
                    .to(CamelConstants.CAMEL_COMPONENT_DIRECT_PERSON_DATA)
                    .end();

       
        /**
         * ENDPOINT POR JWT
         */
        rest("/people")
                .get("/retail/data").description("Obtener datos filiatorios de la persona logueada")
                    .param().name(SwaggerInfoConstants.PARAM_HEADER_CHANNEL).type(RestParamType.header).required(true)
                        .description(SwaggerInfoConstants.PARAM_HEADER_CHANNEL_DESCRIPTION).example(SwaggerInfoConstants.PARAM_HEADER_CHANNEL_VALUE_EXAMPLE).endParam()
                    .param().name(SwaggerInfoConstants.PARAM_HEADER_AUTHORIZATION).type(RestParamType.header).required(true)
                        .description("JWT de la persona logueada").endParam()
                    .responseMessage().code(200).message("Operación realizada con éxito.").responseModel(SwaggerResponseRetail.class).endResponseMessage() //OK
                    .responseMessage().code(500).message(SwaggerInfoConstants.RESPONSE_MESSAGE_INTERNAL_ERROR).endResponseMessage() //FAIL
                    .id("get-data-from-jwt-retail")
                    .route()
                    .setProperty(CamelConstants.PROPERTY_CHANNEL_FOR_REQUEST, header(SwaggerInfoConstants.PARAM_HEADER_CHANNEL))
                    .setProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH, simple(CamelConstants.CAMEL_EXPRESSION_GET_HEADER_HTTP_URI))
                    .setProperty(CamelConstants.PROPERTY_RESPONSE_META_METHOD, simple(CamelConstants.CAMEL_EXPRESSION_GET_HEADER_HTTP_METHOD))
                    .to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_DATA_FROM_JWT).endRest();

        /**
         * ENDPOINT POR ID POM -> ID HOST
         */
        rest("/people")
                .get("/{id_pom}/host").description("Obtener ID Host de un cliente.")
                .param()
                    .name(SwaggerInfoConstants.PARAM_HEADER_CHANNEL)
                    .type(RestParamType.header)
                    .required(true)
                    .description(SwaggerInfoConstants.PARAM_HEADER_CHANNEL_DESCRIPTION)
                    .example(SwaggerInfoConstants.PARAM_HEADER_CHANNEL_VALUE_EXAMPLE)
                .endParam()
                .id("get-host")
                .param()
                    .name("id_pom")
                    .type(RestParamType.path)
                    .required(true)
                    .example("1234")
                    .description("ID POM del cliente")
                .endParam()
                .responseMessage().code(200).responseModel(SwaggerHostPomResponse.class).endResponseMessage() //OK
                .responseMessage().message(SwaggerInfoConstants.RESPONSE_MESSAGE_NOT_FOUND).code(404).endResponseMessage() //Not-found
                .responseMessage().code(500).message(SwaggerInfoConstants.RESPONSE_MESSAGE_INTERNAL_ERROR).endResponseMessage() //FAIL
                .route()
                .setProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH, simple(CamelConstants.CAMEL_EXPRESSION_GET_HEADER_HTTP_URI))
                .setProperty(CamelConstants.PROPERTY_RESPONSE_META_METHOD, simple(CamelConstants.CAMEL_EXPRESSION_GET_HEADER_HTTP_METHOD))
                .to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_HOST).id("get-host")
                .endRest();

        /**
         * ENDPOINT (ID HOST | ID ADHESION)
         */
        rest("/people")
                .get(CamelConstants.API_ROUTE_GET_DATA)
                .description("Obtener datos filiatorios del cliente")
                .param().name(SwaggerInfoConstants.PARAM_HEADER_CHANNEL).type(RestParamType.header).required(true)
                    .description(SwaggerInfoConstants.PARAM_HEADER_CHANNEL_DESCRIPTION).example(SwaggerInfoConstants.PARAM_HEADER_CHANNEL_VALUE_EXAMPLE).endParam().id("v2-get-data")
                .param().name("id") .type(RestParamType.path).required(true)
                    .example("9000050238|777").description("ID compuesto del cliente. Formato: id_host|id_adhesion.").endParam()
                .param().name("from").type(RestParamType.query).required(false)
                    .description("Valida de donde proviene el pedido de datos filiatorios. Dato fijo: pom.").endParam()
                .responseMessage().code(200).responseModel(SwaggerResponseRetail.class).endResponseMessage() //OK
                .responseMessage().message(SwaggerInfoConstants.RESPONSE_MESSAGE_BAD_REQUEST).code(400).responseModel(StandardRestResponse.class).endResponseMessage() //Not-OK
                .responseMessage().code(500).message(SwaggerInfoConstants.RESPONSE_MESSAGE_INTERNAL_ERROR).endResponseMessage() //FAIL
                .route()
                .setProperty(CamelConstants.PROPERTY_CHANNEL_FOR_REQUEST, header(SwaggerInfoConstants.PARAM_HEADER_CHANNEL))
                .process(cleanParamsProcessor)
                .choice()
                    .when(header("from").isEqualTo("pom"))
                        .setHeader("id_pom_person",simple(CamelConstants.CAMEL_EXPRESSION_GET_HEADER_ID))
                        .to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_INFO_WITH_POM)
                    .endChoice()
                    .otherwise()
                        .to(CamelConstants.CAMEL_COMPONENT_DIRECT_PERSON_DATA)
                .end();

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_DATA_FROM_JWT)
                .process(processJwt)
                .removeHeader(HttpHeaders.AUTHORIZATION)
                .to(CamelConstants.CLIENT_INFORMATION_RESPONSE_WITH_IDPOM);

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_HOST)
                .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Getting ID Host from cache..."))
                .process(infoLogManagerProcessor)
                .process(errorProcessor)
                .setHeader(Exchange.HTTP_RESPONSE_CODE, simple("${property.CamelExceptionCaught.statusCode}"))
                .setHeader(Exchange.CONTENT_TYPE, constant(CamelConstants.CONTENT_TYPE_JSON_UTF8))
                .end()
        		.toD(Utils.getCacheUrlWithKey(baseUrlCache, hostPomrelationCacheName, "${headers.id_pom}", cacheUser, cachePass))
            .choice()
                .when(exchangeProperty("getHostForExpiredData"))
                    .process(setFirstHost)
                    .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("SEARCHING ${headers.id_host} ..."))
                    .process(infoLogManagerProcessor)
                    .process(errorProcessor)
                    .setHeader(Exchange.HTTP_RESPONSE_CODE, simple("${property.CamelExceptionCaught.statusCode}"))
                    .setHeader(Exchange.CONTENT_TYPE, constant(CamelConstants.CONTENT_TYPE_JSON_UTF8))
                    .end()
                .toD(Utils.getCacheUrlWithKey(baseUrlCache, hostPomrelationCacheName,"${headers.id_pom}", cacheUser, cachePass))
                .choice()
                    .when(exchangeProperty("getHostForExpiredData"))
                        .process(setFirstHost)
                        .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("SEARCHING ${headers.id_host} ..."))
                        .process(infoLogManagerProcessor)
                        .to(CamelConstants.CAMEL_COMPONENT_DIRECT_CLIENT_INFO_NOT_FOUND)
                    .otherwise()
                        .process(responseHost);

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_INFO_WITH_POM)	
        .setProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH, simple("${header.CamelHttpuri.toString().replace(\"%7C\",\"|\")}?${header.CamelHttpQuery}"))
                .setProperty(CamelConstants.PROPERTY_RESPONSE_META_METHOD, simple(CamelConstants.CAMEL_EXPRESSION_GET_HEADER_HTTP_METHOD))
                .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Getting from client information cache directly"))
                .process(infoLogManagerProcessor)
                .to(CamelConstants.CLIENT_INFORMATION_RESPONSE_WITH_IDPOM);

        from(CamelConstants.CLIENT_INFORMATION_RESPONSE_WITH_IDPOM)	
        	.removeHeaders(CamelConstants.CAMEL_HEADER_HTTP_ALL)
            .setHeader(Exchange.HTTP_METHOD, constant("GET"))
            .onException(HttpOperationFailedException.class)
                .handled(true)
                .to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_HOST_FROM_POM)
            .end()
        		.toD(Utils.getCacheUrlWithKey(
                        baseUrlCache,
                        informationCacheName,
                        CamelConstants.CAMEL_EXPRESSION_GET_HEADER_ID_POM_PERSON,cacheUser,cachePass) +
                        CamelConstants.HTTP_PARAM_BRIDGE_ENDPOINT_TRUE
                )
            .unmarshal().json(JsonLibrary.Jackson, ClientInformationResponse.class)
            .setProperty(CamelConstants.PROPERTY_TEMP_CLIENT_INFO, body())
            .to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_ADHESION)
            .process(restResponseProcessorWithIdPom);

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_HOST_FROM_POM)		
        .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("GETTING HOSTS OF: ${header.id_pom_person}"))
                .process(infoLogManagerProcessor)
                .setHeader("id_pom", simple(CamelConstants.CAMEL_EXPRESSION_GET_HEADER_ID_POM_PERSON))
                .setProperty("getHostForExpiredData", constant(true))
                .to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_HOST);

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_PERSON_DATA)	
        	.setProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH, simple("${header.CamelHttpuri.toString().replace(\"%7C\",\"|\")}"))
            .setProperty(CamelConstants.PROPERTY_RESPONSE_META_METHOD, simple(CamelConstants.CAMEL_EXPRESSION_GET_HEADER_HTTP_METHOD))
            .onException(IncorrectFormatException.class)
                .handled(true)
                .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Request invalida: example-> idHost|idAdhesion"))
                .setProperty(CamelConstants.PROPERTY_MESSAGE, simple(ErrorConstants.INCORRECT_FORMAT_PARAM_HOST_ADHESION))
                .setProperty(CamelConstants.PROPERTY_RESPONSE_ERROR_CODE, simple("41"))
                .process(infoLogManagerProcessor)
                .process(errorProcessor)
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(400))
                .setHeader(Exchange.CONTENT_TYPE, constant(CamelConstants.CONTENT_TYPE_JSON_UTF8))
            .end()
            .process(restProcessor)
            .process(cleanParamsProcessor)
            .choice()
                .when(exchangeProperty(CamelConstants.PROPERTY_ID_ADHESION).isNotNull())
					.when(exchangeProperty(CamelConstants.PROPERTY_NO_CACHE).isEqualTo(Boolean.TRUE))
							.setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Getting client information for idHost: ${headers.id_host} and idAdhesion: ${headers.id_adhesion}..."))
						.otherwise()
                    .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Getting client information for idHost: ${headers.id_host} and idAdhesion: ${headers.id_adhesion},Querying cache with id: ${headers.id_host}${headers.id_adhesion}..."))
                .otherwise()
					.when(exchangeProperty(CamelConstants.PROPERTY_NO_CACHE).isEqualTo(Boolean.TRUE))
							.setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Getting client information for idHost: ${headers.id_host}..."))
						.otherwise()
                    .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Getting client information for idHost: ${headers.id_host},Querying cache with id: ${headers.id_host}..."))
            .end()
            .process(infoLogManagerProcessor)
            .setBody(constant(null))
            .process(paramToHeader)
			.choice()
				.when(exchangeProperty(CamelConstants.PROPERTY_NO_CACHE).isEqualTo(Boolean.TRUE))
					.setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("No Cache request"))
					.process(infoLogManagerProcessor)
					.to(CamelConstants.CAMEL_COMPONENT_DIRECT_CLIENT_NOT_FOUND_IN_CACHE_RELATION)
				.endChoice()
				.otherwise()
					.to("direct:getToCache")
				.endChoice()
			.end();

        from("direct:getToCache")
        	.setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Get from key relation cache"))
            .process(infoLogManagerProcessor)
            .removeHeader(Exchange.HTTP_PATH)
            .setHeader(Exchange.HTTP_METHOD, constant("GET"))
            .onException(HttpOperationFailedException.class)
                .handled(true)
                .to(CamelConstants.CAMEL_COMPONENT_DIRECT_CLIENT_NOT_FOUND_IN_CACHE_RELATION)
            .end()
    		.toD(Utils.getCacheUrlWithKey(baseUrlCache, relationCacheName, CamelConstants.CAMEL_EXPRESSION_GET_HEADER_ID_HOST_ADHESION, cacheUser, cachePass))
            .unmarshal().json(JsonLibrary.Jackson, PomPersonIdContainer.class)
            .to("direct:getClientInformation");

        from("direct:getClientInformation")	
        	.process(pomPersonKeyToHeader)
            .onException(HttpOperationFailedException.class)
                .handled(true)
                .to(CamelConstants.CAMEL_COMPONENT_DIRECT_CLIENT_INFO_NOT_FOUND)
            .end()
    		.toD(Utils.getCacheUrlWithKey(baseUrlCache, informationCacheName, "${headers.id_pom_person}", cacheUser, cachePass))
            .unmarshal().json(JsonLibrary.Jackson, ClientInformationResponse.class)
            .setProperty(CamelConstants.PROPERTY_TEMP_CLIENT_INFO, body())
            .to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_ADHESION)
            .process(restResponseProccesorWithIdHost);

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_CLIENT_INFO_NOT_FOUND)		
        	.setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Cache information not found"))
            .setProperty(CamelConstants.PROPERTY_CHECK_EXISTS_POM_PERSON, constant(true))
            .to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_DATA_FROM_QUERY_ADAPTER)
            .process(infoLogManagerProcessor)
            .process(pomPersonGeneratorProcessor)
            .recipientList(simple("direct:sendClientInformationToQueue,direct:finalResponse"));

        from(CamelConstants.CAMEL_COMPONENT_DIRECT_CLIENT_NOT_FOUND_IN_CACHE_RELATION)
			.setProperty(CamelConstants.PROPERTY_CHECK_EXISTS_POM_PERSON, constant(false))
			.to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_DATA_FROM_QUERY_ADAPTER)
			.process(pomPersonGeneratorProcessor)
			.choice()
				.when(exchangeProperty(CamelConstants.PROPERTY_NO_CACHE).isEqualTo(Boolean.TRUE))
					.to("direct:finalResponse")
				.otherwise()
					.recipientList(simple("direct:sendClientInformationToQueue," + "direct:addToKeyRelationCache," + "direct:addHostPomRelation," + "direct:finalResponse"))
			.endChoice();

        from("direct:sendClientInformationToQueue")	
        	.setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Add to cache client information cache with key ${headers.id_pom_person}. Add to cache client information cache with key ${body[0]}"))
            .marshal().json(JsonLibrary.Jackson)
            .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
    		.setHeader("timeToLiveSeconds", constant(Long.valueOf(86400)))
    		.setHeader(Exchange.CONTENT_TYPE, constant("application/json; charset=utf-8"))
    		.toD(Utils.getCacheUrlWithKey(
    				baseUrlCache, 
    				informationCacheName,
    				CamelConstants.CAMEL_EXPRESSION_GET_HEADER_ID_POM_PERSON, 
    				cacheUser, 
    				cachePass));

        from("direct:addToKeyRelationCache")
        		.setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("With Body ${body[0]}. Adding to Key Relation cache with key ${headers.id_host_adhesion}"))
                .process(infoLogManagerProcessor)
                .process(keyHeaderGenerator)
                .marshal().json(JsonLibrary.Jackson)
                .convertBodyTo(String.class)
                .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
                .toD(Utils.getCacheUrlWithKey(
                		baseUrlCache,
						relationCacheName,
						CamelConstants.CAMEL_EXPRESSION_GET_HEADER_ID_HOST_ADHESION,
						cacheUser,
						cachePass));

        from("direct:addHostPomRelation")	
        		.setBody(simple("${headers.id_host}"))
                .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
                .toD(Utils.getCacheUrlWithKey(
                        baseUrlCache,
                        hostPomrelationCacheName,
                        CamelConstants.CAMEL_EXPRESSION_GET_HEADER_ID_POM_PERSON,
                        cacheUser,
                        cachePass) + CamelConstants.HTTP_PARAM_BRIDGE_ENDPOINT_TRUE)
                .setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Relation HOST-POM saved. POM ${headers.id_pom_person}. HOST ${headers.id_host_adhesion}"))
                .process(infoLogManagerProcessor);

		from("direct:finalResponse")
				.setProperty(CamelConstants.PROPERTY_CUSTOM_LOG, simple("Final Response from"))
				.process(infoLogManagerProcessor)
				.setProperty(CamelConstants.PROPERTY_TEMP_CLIENT_INFO, body())
				.to(CamelConstants.CAMEL_COMPONENT_DIRECT_GET_ADHESION)
				.process(restResponseProccesorWithIdHost);
    }
}
