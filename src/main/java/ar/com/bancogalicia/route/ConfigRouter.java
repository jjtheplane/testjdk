package ar.com.bancogalicia.route;

import ar.com.bancogalicia.config.ActiveMqConfig;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigRouter  extends RouteBuilder{

    @Autowired
    private ActiveMqConfig amqConfig;

    @Override
    public void configure() throws Exception {
        getContext().addComponent("activemq", amqConfig.getMqComponent());
    }
}
