package ar.com.bancogalicia.helper;

import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienteresponse._4_0_0.ObtenerClienteResponse;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.PersonaFisica;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.PersonaJuridica;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.BGBAResultadoOperacion;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.Severidad;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import ar.com.bancogalicia.helpers.Utils;

@RunWith(MockitoJUnitRunner.class)
public class Helpers {

    @Test
    public void givenOnbChannelId_thenIsOfbRequestWillReturnFalse() throws Exception {
        String listChannelIds = "ofb,officebanking";
        String channelId = "onb";
        Assert.assertFalse(Utils.validateChannelId(listChannelIds, channelId));
    }

    @Test
    public void givenOfbChannelId_thenIsOfbRequestWillReturnTrue() throws Exception {
        String listChannelIds = "ofb,officebanking";
        String channelId = "ofb";
        Assert.assertTrue(Utils.validateChannelId(listChannelIds, channelId));
    }

    @Test
    public void givenPersonaFisica_whenCheckPersonType_thenResponseIsRetailTrue() throws Exception {
        ObtenerClienteResponse obtenerClienteResponse = new ObtenerClienteResponse();
        obtenerClienteResponse.setPersonaFisica(new PersonaFisica());
        obtenerClienteResponse.setPersonaJuridica(null);
        boolean isReatil = Utils.isRetailPerson(obtenerClienteResponse);
        Assert.assertTrue(isReatil);
    }

    @Test
    public void givenPersonaJuridica_whenCheckPersonType_thenResponseIsRetailFalse() throws Exception {
        ObtenerClienteResponse obtenerClienteResponse = new ObtenerClienteResponse();
        obtenerClienteResponse.setPersonaFisica(null);
        obtenerClienteResponse.setPersonaJuridica(new PersonaJuridica());
        boolean isReatil = Utils.isRetailPerson(obtenerClienteResponse);
        Assert.assertFalse(isReatil);
    }

    @Test
    public void givenPersonaFisica_whenCheckPersonType_thenResponseIsCorporteFalse() throws Exception {
        ObtenerClienteResponse obtenerClienteResponse = new ObtenerClienteResponse();
        obtenerClienteResponse.setPersonaFisica(new PersonaFisica());
        obtenerClienteResponse.setPersonaJuridica(null);
        boolean isCorporate = Utils.isCorporatePerson(obtenerClienteResponse);
        Assert.assertFalse(isCorporate);
    }

    @Test
    public void givenPersonaJuridica_whenCheckPersonType_thenResponseIsCorporateTrue() throws Exception {
        ObtenerClienteResponse obtenerClienteResponse = new ObtenerClienteResponse();
        obtenerClienteResponse.setPersonaFisica(null);
        obtenerClienteResponse.setPersonaJuridica(new PersonaJuridica());
        boolean isCorporate = Utils.isCorporatePerson(obtenerClienteResponse);
        Assert.assertTrue(isCorporate);
    }

    @Test
    public void givenPersona_whenCheckIfExists_thenTrue() throws Exception {
        ObtenerClienteResponse obtenerClienteResponse = new ObtenerClienteResponse();
        BGBAResultadoOperacion bgbaResultadoOperacion = new BGBAResultadoOperacion();
        bgbaResultadoOperacion.setSeveridad(Severidad.OK);
        obtenerClienteResponse.setBGBAResultadoOperacion(bgbaResultadoOperacion);
        boolean existsPerson = Utils.existsPersonFromNv(obtenerClienteResponse);
        Assert.assertTrue(existsPerson);
    }

}

