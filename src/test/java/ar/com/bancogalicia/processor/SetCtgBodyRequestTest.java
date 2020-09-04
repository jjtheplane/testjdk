package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.CtgAccessionBodyRequest;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SetCtgBodyRequestTest extends CamelTestSupport {

    private static final SetCtgBodyRequest setCtgBodyRequest = new SetCtgBodyRequest();

    @Test
    public void givenIdHost_whenSetBodyCtgRequest_thenCheckBodyIdHost() throws Exception {
        String expectedHost = "02";
        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();
        clientInformationResponse.setIdHost(expectedHost);
        Exchange exchange = new DefaultExchange(context);

        exchange.setProperty(CamelConstants.PROPERTY_TEMP_CLIENT_INFO, clientInformationResponse);
        setCtgBodyRequest.process(exchange);

        CtgAccessionBodyRequest receivedRequest = exchange.getIn().getBody(CtgAccessionBodyRequest.class);
        Assert.assertEquals(expectedHost, receivedRequest.getIdHost());
    }

}
