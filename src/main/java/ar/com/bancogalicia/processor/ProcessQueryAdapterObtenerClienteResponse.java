package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.exception.GenerateIdPomException;
import ar.com.bancogalicia.exception.IncorrectClientRequestException;
import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.helpers.ErrorConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.query.obtenercliente.Data;
import ar.com.bancogalicia.pojo.query.obtenercliente.QueryAdapterObtenerClienteResponse;
import ar.com.bancogalicia.service.TransitionService;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.*;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.PersonaJuridica;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class ProcessQueryAdapterObtenerClienteResponse implements Processor {

	@Autowired
	private TransitionService transitionService;
	
    @Override
    public void process(Exchange exchange) throws Exception {
        QueryAdapterObtenerClienteResponse response = exchange.getIn().getBody(QueryAdapterObtenerClienteResponse.class);
        Optional<Data> optionalData = response.getData().stream().findFirst();

        ClientInformationResponse clientInfo = getClientInfo(optionalData
                .orElseThrow(() -> new IncorrectClientRequestException(ErrorConstants.CLIENT_NOT_EXISTS_MESSAGE)));
        exchange.setProperty(CamelConstants.PROPERTY_BODY_CLIENT_INFO, clientInfo);
    }

    private ClientInformationResponse getClientInfo(Data data) throws IncorrectClientRequestException, GenerateIdPomException {
        String tipoPersona = data.getPersona().getCodigoTipoPersona();
        ClientInformationResponse clientInformationResponse;
        Long idPom = null;
        if(tipoPersona.equals("Fisica")){
        	idPom = transitionService.getIdPomByPersonaFisica(data.getPersonaFisica(), data.getPersona().getIdPersona());
            clientInformationResponse = buildClientInfoFromPersonaFisica(data.getPersonaFisica());
        } else {
        	idPom = transitionService.getIdPomByPersonaJuridica(data.getPersonaJuridica(), data.getPersona().getIdPersona());
            clientInformationResponse = buildClientInfoFromPersonaJuridica(data.getPersonaJuridica());
        }
        clientInformationResponse.setIdHost(data.getPersona().getIdPersona());
        clientInformationResponse.setIdPomPersona(idPom.toString());
        return clientInformationResponse;
    }

    private ClientInformationResponse buildClientInfoFromPersonaFisica(PersonaFisica personaFisica) throws IncorrectClientRequestException {
        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();
        clientInformationResponse.setPersonFisica(personaFisica);

        return clientInformationResponse;
    }

    private ClientInformationResponse buildClientInfoFromPersonaJuridica(PersonaJuridica personaJuridica) throws IncorrectClientRequestException {
        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();

        Telefonos telefonos = new Telefonos();
        PersonaFisica personaFisica = new PersonaFisica();
        NombrePersonaFisica nombrePersonaFisica = new NombrePersonaFisica();

        nombrePersonaFisica.setNombre(personaJuridica.getBasicos().getNombre());
        nombrePersonaFisica.setApellido("-");

        Documento documento = new Documento();
        documento.setEmisor(null);
        documento.setNumero(personaJuridica.getBasicos().getIdentificacionTributariaNumero());
        documento.setTipo("cuit");
        Documentos documentos = new Documentos();
        documentos.getDocumento().add(documento);

        Basicos basicos = new Basicos();
        // J is used as a genre to mark this client as a Juridical person
        basicos.setCodigoSexo("J");
        basicos.setNombrePersona(nombrePersonaFisica);
        basicos.setDocumentos(documentos);
        basicos.setIdentificacionTributariaNumero(personaJuridica.getBasicos().getIdentificacionTributariaNumero());
        basicos.setCodigoEmpleadoBGBA("-");
        basicos.setCodigoCondicionImpositivaIVA(personaJuridica.getBasicos().getCodigoCondicionImpositivaIVA());
        Domicilio domicilio = new Domicilio();
        domicilio.setDireccion(personaJuridica.getDomicilio().getDireccion());
        domicilio.setEstandarizado(personaJuridica.getDomicilio().getEstandarizado());
        domicilio.setFechaGeorreferenciacion(personaJuridica.getDomicilio().getFechaGeorreferenciacion());
        domicilio.setFechaUltimaActualizacion(personaJuridica.getDomicilio().getFechaUltimaActualizacion());
        domicilio.setSolicitudVerificacion(personaJuridica.getDomicilio().getFechaSolicitudVerificacion());

        personaFisica.setDomicilio(domicilio);
        personaFisica.setBasicos(basicos);
        personaFisica.setTelefonos(telefonos);
        personaFisica.setEmail(personaJuridica.getEmail().getEmail());
        clientInformationResponse.setPersonFisica(personaFisica);
        return clientInformationResponse;
    }
}
