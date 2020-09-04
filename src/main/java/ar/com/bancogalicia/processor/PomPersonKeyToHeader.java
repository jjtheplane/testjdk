package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.PomPersonIdContainer;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class PomPersonKeyToHeader implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        PomPersonIdContainer pomPersonIdContainer = exchange.getIn().getBody(PomPersonIdContainer.class);
        exchange.getOut().setHeader(CamelConstants.PROPERTY_ID_HOST,
                exchange.getIn().getHeader((CamelConstants.PROPERTY_ID_HOST)));
        exchange.getOut().setHeader(CamelConstants.PROPERTY_ID_ADHESION,
                exchange.getIn().getHeader((CamelConstants.PROPERTY_ID_ADHESION)));
        exchange.getOut().setHeader("id_pom_person", pomPersonIdContainer.getPomPersonId());
    }
}

