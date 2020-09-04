package ar.com.bancogalicia.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.service.TransitionService;

@Component
public class PomPersonGeneratorProcessor implements Processor {

	@Autowired
	private TransitionService transitionService;

    @Override
    public void process(Exchange exchange) throws Exception {
        ClientInformationResponse clientInformationResponse = exchange.getIn().getBody(ClientInformationResponse.class);
        Boolean noCache = exchange.getProperty(CamelConstants.PROPERTY_NO_CACHE, Boolean.class);

        Long idPom = null;
        String idHost = exchange.getIn().getHeader("id_host").toString();
        if (exchange.getProperty(CamelConstants.PROPERTY_CHECK_EXISTS_POM_PERSON, Boolean.class)) {
        	String idPomHeader = exchange.getIn().getHeader("id_pom_person").toString();
        	try {
        		idPom = Long.valueOf(idPomHeader);
        	} catch (NumberFormatException e) {
        		idPom = getIdPomFromDB(idHost, clientInformationResponse.getEmployeeBgbaCode());
        	}
        } else {
        	idPom = Long.valueOf(clientInformationResponse.getIdPomPersona());
        	if (clientInformationResponse.getIdPomPersona() == null 
        			&& exchange.getIn().getHeader("id_host") != null) {
        		idPom = getIdPomFromDB(idHost, clientInformationResponse.getEmployeeBgbaCode());
        	}
        }
        clientInformationResponse.setIdPomPersona(idPom.toString());

        if (noCache != null && noCache) {
            clientInformationResponse.setIdPomPersona(null);
        } else {
            exchange.getOut().setHeader("id_pom_person", clientInformationResponse.getIdPomPersona());
        }

        exchange.getOut().setBody(clientInformationResponse);
        exchange.getOut().setHeader("id_host", exchange.getIn().getHeader("id_host"));
        exchange.getOut().setHeader("id_host_adhesion", exchange.getIn().getHeader("id_host_adhesion"));
    }

    private Long getIdPomFromDB(String idHost, String employeeBGBACode) {
    	return transitionService.getIdPomByIdHost(idHost, employeeBGBACode);
    }
}
