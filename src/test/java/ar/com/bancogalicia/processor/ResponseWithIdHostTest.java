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
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ResponseWithIdHostTest extends CamelTestSupport {

    private static final RestResponseProcessorWithIdHost errorProcessor = new RestResponseProcessorWithIdHost();

    @Test
    public void givenBody_whenBuildResponse_thenResponseCorrectStructure() throws Exception {
        Exchange exchange = new DefaultExchange(context);


        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();

        exchange.getIn().setBody(clientInformationResponse);

        exchange.setProperty(CamelConstants.PROPERTY_MESSAGE, "messageRestQueryError");
        exchange.setProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH, TestUtilities.BASE_API + "data");

        errorProcessor.process(exchange);

        Assert.assertTrue(exchange.getOut().getBody() instanceof StandardRestResponse);
    }

}
