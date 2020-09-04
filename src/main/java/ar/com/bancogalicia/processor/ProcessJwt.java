package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.common.security.CAPPrincipal;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class ProcessJwt implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String idPom = getCAPPrincipal().getIdPersonaPom();
        exchange.getIn().setHeader("id_pom_person", idPom);
    }

    public CAPPrincipal getCAPPrincipal() {
        CAPPrincipal capPrincipal = null;
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof CAPPrincipal) {
            capPrincipal = (CAPPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }
        return capPrincipal;
    }

}
