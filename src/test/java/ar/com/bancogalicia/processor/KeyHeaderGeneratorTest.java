package ar.com.bancogalicia.processor;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class KeyHeaderGeneratorTest extends CamelTestSupport {

    private static final KeyHeaderGenerator keyHeaderGenerator = new KeyHeaderGenerator();

    @Test
    public void givenIdHostAndPom_whenProcessInKeyHeaderGenerator_thenBodyIsIdPomAndHeadersAreCorrect() throws Exception {
        Exchange exchange = new DefaultExchange(context);

        Map<String, Object> headers = new HashMap<>();
        headers.put("id_host_adhesion", "456123");
        headers.put("id_pom_person", "0016161640M20190104112752847");
        exchange.getIn().setHeaders(headers);

        keyHeaderGenerator.process(exchange);

        String expectedBody = "0016161640M20190104112752847";
        String expectedIdHostAhesion = "456123";

        String receivedBody = exchange.getOut().getBody(String.class);
        String receivedIdHostAdhesion = exchange.getOut().getHeader("id_host_adhesion").toString();

        Assert.assertEquals(expectedBody, receivedBody);
        Assert.assertEquals(expectedIdHostAhesion, receivedIdHostAdhesion);
    }
}
