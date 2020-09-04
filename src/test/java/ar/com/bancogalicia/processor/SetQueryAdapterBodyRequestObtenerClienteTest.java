package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.query.obtenercliente.QueryAdapterBodyRequestObtenerCliente;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SetQueryAdapterBodyRequestObtenerClienteTest extends CamelTestSupport {

    private static final SetQueryAdapterBodyRequestObtenerCliente setQueryAdapterBodyRequestObtenerCliente =
            new SetQueryAdapterBodyRequestObtenerCliente();

    @Test
    public void givenIdHost_whenSetQueryAdapterBodyRequestObtenerCliente_thenCheckBodyIdHost() throws Exception {
        String expectedHost = "02";
        QueryAdapterBodyRequestObtenerCliente queryAdapterBodyRequestObtenerCliente =
                new QueryAdapterBodyRequestObtenerCliente(expectedHost);
        Exchange exchange = new DefaultExchange(context);

        exchange.getIn().setHeader(CamelConstants.PROPERTY_ID_HOST, expectedHost);
        setQueryAdapterBodyRequestObtenerCliente.process(exchange);

        QueryAdapterBodyRequestObtenerCliente receivedRequest =
                exchange.getIn().getBody(QueryAdapterBodyRequestObtenerCliente.class);
        Assert.assertEquals(queryAdapterBodyRequestObtenerCliente.getIdHost(), receivedRequest.getIdHost());
    }

}