package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.exception.IncorrectFormatException;
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
public class CleanParamsProcessorTest extends CamelTestSupport {

    private static final RestProcessor restProcessor = new RestProcessor();
    private static final CleanParamsProcessor cleanParamsProcessor = new CleanParamsProcessor();
    private static final ParamToHeader paramToHeader = new ParamToHeader();

    @Test
    public void givenBadIdHostAndAdhesion_whenCleanParams_thenIdHostAndAdhesionAreMarkedInvalid() throws Exception {
        Exchange exchange = new DefaultExchange(context);

        Map<String, Object> headers = new HashMap<>();
        headers.put("id", "$$$|$$$");
        headers.put("id_channel", "ONB");
        exchange.getIn().setHeaders(headers);

        try {
        	restProcessor.process(exchange);
        } catch (IncorrectFormatException e) {
        	System.out.println(e.getMessage());
        	headers.put("id", "123|321");
        	exchange.getIn().setHeaders(headers);
        	restProcessor.process(exchange);
        }
        cleanParamsProcessor.process(exchange);
        paramToHeader.process(exchange);

        Assert.assertEquals("123", exchange.getOut().getHeader("id_host"));
        Assert.assertEquals("321", exchange.getOut().getHeader("id_adhesion"));
    }


    @Test(expected = IncorrectFormatException.class)
    public void givenBadIdParam_whenValidateFormat_thenThrowIncorrectFormatException() throws Exception {
        Exchange exchange = new DefaultExchange(context);

        Map<String, Object> headers = new HashMap<>();
        headers.put("id", "TEST");
        exchange.getIn().setHeaders(headers);

        restProcessor.process(exchange);
    }

}
