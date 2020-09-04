package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helper.TestUtilities;
import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.Response.StandardRestResponse;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.HttpMethod;

public class RestResponseProcessorWithIdPomTest extends CamelTestSupport {

    private static final RestResponseProcessorWithIdPom
            restResponseProcessorWithIdPom = new RestResponseProcessorWithIdPom();

    @Test
    public void givenClientInformationResponseBody_whenProcessInResponseProcessor_thenReceivedPathIsCorrect() throws Exception {
        String expectedPath = TestUtilities.BASE_API + "data";
        String expectedMethod = HttpMethod.GET;

        Exchange exchange = new DefaultExchange(context);
        exchange.setProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH, expectedPath);
        exchange.setProperty(CamelConstants.PROPERTY_RESPONSE_META_METHOD, expectedMethod);

        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();

        exchange.getIn().setBody(clientInformationResponse);
        restResponseProcessorWithIdPom.process(exchange);

        StandardRestResponse receivedClient = (StandardRestResponse) exchange.getOut().getBody();
        String receivedOperation = receivedClient.getMeta().getOperation();
        Assert.assertEquals(expectedPath, receivedOperation);
    }
}
