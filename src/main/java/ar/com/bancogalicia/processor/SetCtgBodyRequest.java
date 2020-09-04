package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.CtgAccessionBodyRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class SetCtgBodyRequest implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        ClientInformationResponse clientInfo = exchange.getProperty(CamelConstants.PROPERTY_TEMP_CLIENT_INFO, ClientInformationResponse.class);
        String idHost = clientInfo.getIdHost();
        CtgAccessionBodyRequest ctgAccessionBodyRequest = new CtgAccessionBodyRequest(idHost);
        exchange.getIn().setBody(ctgAccessionBodyRequest);
    }
}
