package ar.com.bancogalicia.processor.logprocessor;

import ar.com.bancogalicia.helpers.CamelConstants;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class InfoLogManagerProcessor implements Processor {

    private final static Logger LOGGER = LoggerFactory.getLogger(InfoLogManagerProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        LOGGER.info(exchange.getProperty(CamelConstants.PROPERTY_CUSTOM_LOG).toString());
    }
}
