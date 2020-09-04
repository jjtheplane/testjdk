package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.query.obtenercliente.QueryAdapterBodyRequestObtenerCliente;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class SetQueryAdapterBodyRequestObtenerCliente implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String idHost = exchange.getIn().getHeader(CamelConstants.PROPERTY_ID_HOST, String.class);
        QueryAdapterBodyRequestObtenerCliente queryAdapterBodyRequestObtenerCliente = new QueryAdapterBodyRequestObtenerCliente(idHost);
        exchange.getIn().setBody(queryAdapterBodyRequestObtenerCliente);
    }
}
