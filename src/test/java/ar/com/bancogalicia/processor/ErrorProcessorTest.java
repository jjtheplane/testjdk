package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helper.TestUtilities;
import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.Response.StandardRestResponse;
import com.google.gson.Gson;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpMethod;

@RunWith(MockitoJUnitRunner.class)
public class ErrorProcessorTest extends CamelTestSupport {

    private static final ErrorProcessor errorProcessor = new ErrorProcessor();

    @Test
    public void givenErrorParameters_whenProcessInErrorProcessor_thenResponseIsCorrect() throws Exception {
        Exchange exchange = new DefaultExchange(context);

        exchange.setProperty(CamelConstants.PROPERTY_MESSAGE, "messageRestQueryError");
        exchange.setProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH, TestUtilities.BASE_API + "data");
        exchange.setProperty(CamelConstants.PROPERTY_RESPONSE_ERROR_CODE, "codeNv");
        exchange.setProperty(CamelConstants.PROPERTY_RESPONSE_META_METHOD, HttpMethod.GET);

        errorProcessor.process(exchange);

        String expectedMetaOperation = "/v2/pom/data";

        StandardRestResponse errorReceived = exchange.getIn().getBody(StandardRestResponse.class);
        Assert.assertNotNull(errorReceived);
        Assert.assertEquals(expectedMetaOperation, errorReceived.getMeta().getOperation());
    }

}
