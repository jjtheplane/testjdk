package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.model.PersonType;
import ar.com.bancogalicia.service.TransitionService;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetFirstHost implements Processor {

	@Autowired
	private TransitionService transitionService;

	@Override
	public void process(Exchange exchange) throws Exception {
		String hosts = exchange.getIn().getBody(String.class);
		String[] hostsArr = hosts.split(",");
		exchange.getIn().setHeader("id_host", hostsArr[0]);

		PersonType personType = transitionService.getPersonTypeByIdPom(exchange.getIn().getHeader("id_pom_person").toString());
		Boolean isCorporate = PersonType.J.equals(personType);
		exchange.setProperty(CamelConstants.PROPERTY_IS_CORPORATE, isCorporate);
	}
}
