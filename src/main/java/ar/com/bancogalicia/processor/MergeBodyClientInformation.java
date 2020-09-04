package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class MergeBodyClientInformation implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if(oldExchange == null) {
            return newExchange;
        } else {
            newExchange.setProperty(CamelConstants.PROPERTY_BODY_CLIENT_INFO,
                    oldExchange.getProperty(CamelConstants.PROPERTY_BODY_CLIENT_INFO));
            return newExchange;
        }
    }
}
