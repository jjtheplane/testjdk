package ar.com.bancogalicia.service;

import ar.com.bancogalicia.exception.GenerateIdPomException;
import ar.com.bancogalicia.model.PersonType;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.PersonaFisica;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.PersonaJuridica;

public interface TransitionService {

	Long getIdPomByPersonaFisica(PersonaFisica personaFisica, String idPersona) throws GenerateIdPomException;

	Long getIdPomByPersonaJuridica(PersonaJuridica personaJuridica, String idPersona) throws GenerateIdPomException;

	PersonType getPersonTypeByIdPom(String idPom);

	Long getIdPomByIdHost(String idHost, String employeeBgbaCode);
}
