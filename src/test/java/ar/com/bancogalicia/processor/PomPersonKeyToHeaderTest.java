package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.pojo.PomPersonIdContainer;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PomPersonKeyToHeaderTest extends CamelTestSupport {

    private static final PomPersonKeyToHeader pomPersonKeyToHeader = new PomPersonKeyToHeader();

    @Test
    public void givenPompersonIdContainer_whenProcessInPomPersonKeyToHeader_thenHeaderIdPomIsCorrect() throws Exception {
        Exchange exchange = new DefaultExchange(context);

        PomPersonIdContainer pomId = new PomPersonIdContainer("0016161640M20190104112752847");
        exchange.getIn().setBody(pomId);

        pomPersonKeyToHeader.process(exchange);

        String receivedPomId = exchange.getOut().getHeader("id_pom_person").toString();
        Assert.assertEquals(pomId.getPomPersonId(), receivedPomId);
    }
}
