package ar.com.bancogalicia.processor;

import java.time.LocalDateTime;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class CleanParamsProcessor implements Processor {

    private static final String INVALID_HEADER = "INVALID";

    private String headers = "id_host|id_adhesion|id_channel|id_pom_person";

    private String invalidHeaderRegex = "[\\W]*"; // matches non alphanumeric header values
    @Override
    public void process(Exchange exchange) {
    	
        exchange.getIn().getHeaders().forEach((key, value) -> {
                    if (key.matches(headers) && value.toString().matches(invalidHeaderRegex)) {
                            exchange.getIn().setHeader(key, INVALID_HEADER);
                        }
                });
    }

}
