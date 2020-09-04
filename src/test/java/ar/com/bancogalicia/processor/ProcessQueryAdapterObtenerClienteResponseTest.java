package ar.com.bancogalicia.processor;

import java.util.Arrays;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import ar.com.bancogalicia.helper.TestUtilities;
import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.query.obtenercliente.Data;
import ar.com.bancogalicia.pojo.query.obtenercliente.QueryAdapterObtenerClienteResponse;
import ar.com.bancogalicia.service.TransitionService;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.persona._1_0_0.Persona;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.Basicos;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.Domicilio;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.Email;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.PersonaJuridica;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Domicilio2Salida;

@RunWith(MockitoJUnitRunner.class)
public class ProcessQueryAdapterObtenerClienteResponseTest extends CamelTestSupport {

	@InjectMocks
	private ProcessQueryAdapterObtenerClienteResponse processQueryAdapterObtenerClienteResponse;

	@Mock
	TransitionService transitionService;

    @Test
    public void givenObtenerClienteResponseWithPersonaFisica_whenProcess_thenCheckBody() throws Exception {
        String expectedTipoPersona = "Fisica";
        QueryAdapterObtenerClienteResponse queryAdapterObtenerClienteResponse =
                new QueryAdapterObtenerClienteResponse();

        Data data = new Data();
        data.setPersonaFisica(TestUtilities.getPersonFisica());
        Persona persona = new Persona();
        persona.setCodigoTipoPersona(expectedTipoPersona);
        data.setPersona(persona);

        queryAdapterObtenerClienteResponse.setData(Arrays.asList(data));
        Exchange exchange = new DefaultExchange(context);

        exchange.getIn().setBody(queryAdapterObtenerClienteResponse);
        Mockito.when(transitionService.getIdPomByPersonaFisica(Mockito.any(), Mockito.any())).thenReturn(new Long(614));
        processQueryAdapterObtenerClienteResponse.process(exchange);

        ClientInformationResponse receivedClientInfo = exchange.getProperty(CamelConstants.PROPERTY_BODY_CLIENT_INFO,
                ClientInformationResponse.class);
        Assert.assertNotNull(receivedClientInfo);
        Assert.assertEquals("614", receivedClientInfo.getIdPomPersona());
    }

    @Test
    public void givenObtenerClienteResponseWithPersonaJuridica_whenProcess_thenCheckBody() throws Exception {
        String expectedTipoPersona = "Juridica";
        String expectedGender = "J";
        QueryAdapterObtenerClienteResponse queryAdapterObtenerClienteResponse =
                new QueryAdapterObtenerClienteResponse();

        Data data = new Data();
        PersonaJuridica personaJuridica = new PersonaJuridica();

        Basicos basicos = new Basicos();
        basicos.setNombre("test nombre");
        basicos.setIdentificacionTributariaNumero("test IdentificacionTributariaNumero");

        Domicilio2Salida direccion = new Domicilio2Salida();

        Domicilio domicilio = new Domicilio();
        domicilio.setDireccion(direccion);
        domicilio.setEstandarizado("test estandarizado");
        domicilio.setFechaUltimaActualizacion(new XMLGregorianCalendarImpl());
        domicilio.setFechaGeorreferenciacion(new XMLGregorianCalendarImpl());
        domicilio.setFechaSolicitudVerificacion("test FechaSolicitudVerificacion");
        personaJuridica.setDomicilio(domicilio);
        Email email = new Email();
        personaJuridica.setEmail(email);

        personaJuridica.setBasicos(basicos);
        data.setPersonaJuridica(personaJuridica);
        Persona persona = new Persona();
        persona.setCodigoTipoPersona(expectedTipoPersona);
        data.setPersona(persona);

        queryAdapterObtenerClienteResponse.setData(Arrays.asList(data));
        Exchange exchange = new DefaultExchange(context);

        exchange.getIn().setBody(queryAdapterObtenerClienteResponse);
        Mockito.when(transitionService.getIdPomByPersonaJuridica(Mockito.any(), Mockito.any())).thenReturn(new Long(616));
        processQueryAdapterObtenerClienteResponse.process(exchange);

        ClientInformationResponse receivedClientInfo = exchange.getProperty(CamelConstants.PROPERTY_BODY_CLIENT_INFO,
                ClientInformationResponse.class);
        Assert.assertNotNull(receivedClientInfo);
        Assert.assertEquals(expectedGender, receivedClientInfo.getGender());
        Assert.assertEquals("616", receivedClientInfo.getIdPomPersona());
    }

}
