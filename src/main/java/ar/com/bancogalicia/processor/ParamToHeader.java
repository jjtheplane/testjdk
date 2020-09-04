package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;


@Component
public class ParamToHeader implements Processor {


    @Override
    public void process(Exchange exchange) throws Exception {

        String idAdhesion = exchange.getIn().getHeader(CamelConstants.PROPERTY_ID_ADHESION).toString();
        String idHost = exchange.getIn().getHeader(CamelConstants.PROPERTY_ID_HOST).toString();
        String idHostAdhesion = StringUtils.leftPad(idHost, 10, "0").concat(StringUtils.leftPad(idAdhesion, 10, "0")); // KEY FOR DATAGRID
        
        exchange.getOut().setHeader("id_host_adhesion", idHostAdhesion);
        exchange.getOut().setHeader(CamelConstants.PROPERTY_ID_HOST, idHost);
        exchange.getOut().setHeader(CamelConstants.PROPERTY_ID_ADHESION, idAdhesion);

    }
}
