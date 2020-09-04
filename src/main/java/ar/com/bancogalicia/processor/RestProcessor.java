package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.exception.IncorrectFormatException;
import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.helpers.ErrorConstants;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class RestProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws IncorrectFormatException {
         try {
             String id = exchange.getIn().getHeader("id").toString();
             String[] parts = id.split("\\|");
             Long idHost = Long.parseLong(parts[0]);
             Long idAdhesion = Long.parseLong(parts[1]);

             exchange.setOut(exchange.getIn());
             exchange.getOut().setHeader(CamelConstants.PROPERTY_ID_HOST, idHost.toString());
             exchange.getOut().setHeader(CamelConstants.PROPERTY_ID_ADHESION, idAdhesion.toString());
         }
         catch (Exception e){
             throw new IncorrectFormatException(ErrorConstants.INVALID_FORMAT_HOST_ADHESION);
         }

    }
}

