package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helper.TestUtilities;
import ar.com.bancogalicia.helpers.CamelConstants;
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
public class PomPersonGeneratorProcessorTest extends CamelTestSupport {

    private static final PomPersonGeneratorProcessor pomPersonGeneratorProcessor = new PomPersonGeneratorProcessor();

    @Test
    public void givenNotExistingPomPerson_whenProcessInPomPersonGeneratorProcessor_thenIdPomPersonIsNotNull() throws Exception {
        Exchange exchange = new DefaultExchange(context);
        exchange.setProperty("existingPomPersonId", "");
        exchange.setProperty("nocache", "false");

        Map<String, Object> headers = new HashMap<>();
        headers.put("id_adhesion", "1004");
        headers.put("id_host", "247198");
        exchange.getIn().setHeaders(headers);
        exchange.getIn().setBody(TestUtilities.getClientInformationResponse());

        pomPersonGeneratorProcessor.process(exchange);

        String receivedIdPomPersona = exchange.getOut().getHeader("id_pom_person").toString();
        Assert.assertNotNull(receivedIdPomPersona);
    }

    @Test
    public void givenExistingPomPerson_whenProcessInPomPersonGeneratorProcessor_thenIdPomPersonIsNotNull() throws Exception {
        Exchange exchange = new DefaultExchange(context);
        exchange.setProperty(CamelConstants.PROPERTY_NO_CACHE,false);

        Map<String, Object> headers = new HashMap<>();
        headers.put("id_adhesion", "1004");
        headers.put("id_host", "247198");
        headers.put("id_pom_person", "123123123");

        exchange.getIn().setBody(TestUtilities.getClientInformationResponse());
        exchange.getIn().setHeaders(headers);
        exchange.setProperty("existingPomPersonId", "true");
        exchange.setProperty("nocache", "false");

        pomPersonGeneratorProcessor.process(exchange);

        String receivedIdPomPersona = exchange.getOut().getHeader("id_pom_person").toString();
        Assert.assertNotNull(receivedIdPomPersona);
    }
}
