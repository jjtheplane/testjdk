package ar.com.bancogalicia.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class KeyHeaderGenerator implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String cacheKey = exchange.getIn().getHeader("id_host_adhesion").toString();
        String idPomPerson = exchange.getIn().getHeader("id_pom_person").toString();
        exchange.getOut().setBody(idPomPerson);
        exchange.getOut().setHeader("id_host_adhesion", cacheKey);
        exchange.getOut().setHeader("id_pom_person", idPomPerson);
    }
}

