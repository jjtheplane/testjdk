package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.ctg.CtgResponse;
import ar.com.bancogalicia.pojo.ctg.Data;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProcessCtgAccessionResponse implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        CtgResponse ctgResponse = exchange.getIn().getBody(CtgResponse.class);
        Optional<Data> optionalData = ctgResponse.getData().stream().findFirst();
        ClientInformationResponse response = exchange.getProperty( CamelConstants.PROPERTY_TEMP_CLIENT_INFO, ClientInformationResponse.class);
        if(optionalData.isPresent()){
            response.setIdAdhesion(optionalData.get().getIdAdhesion());
        }
        exchange.getIn().setBody(response);
    }
}
