package ar.com.bancogalicia.config;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent;

@Component
public class ActiveMqConfig {

    @Value(value = "${updater.mq.broker}")
    private String urlBroker;
    @Value(value = "${mq.pass}")
    private String mqPass;
    @Value(value = "${mq.user}")
    private String mqUser;

    private ActiveMqConfig() {
        //ActiveMqConfig
    }

    public  ActiveMQComponent getMqComponent() {
        ActiveMQComponent activeMQComponent = activeMQComponent(urlBroker);
        activeMQComponent.setPassword(mqPass);
        activeMQComponent.setUsername(mqUser);
        activeMQComponent.setTimeToLive(600000);
        return activeMQComponent;
    }
}
