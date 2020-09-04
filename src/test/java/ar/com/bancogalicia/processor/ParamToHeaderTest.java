package ar.com.bancogalicia.processor;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class ParamToHeaderTest extends CamelTestSupport {

    private static final ParamToHeader paramToHeader = new ParamToHeader();

    @Test
    public void givenIdHostAndIdAdhesion_whenParamToHeader_thenIdHostAdhesionIsSetProperly() throws Exception {
        Exchange exchange = new DefaultExchange(context);
        String idHost = "456";
        String idAdhesion = "123";
        Map<String, Object> headers = new HashMap<>();
        headers.put("id_adhesion", idAdhesion);
        headers.put("id_host", idHost);
        exchange.getIn().setHeaders(headers);

        String expectedIdHostAhesion = StringUtils.leftPad(idHost, 10, "0").concat(StringUtils.leftPad(idAdhesion, 10, "0"));

        paramToHeader.process(exchange);

        String receivedIdHostAdhesion = exchange.getOut().getHeader("id_host_adhesion").toString();
        Assert.assertEquals(expectedIdHostAhesion, receivedIdHostAdhesion);
    }
}
