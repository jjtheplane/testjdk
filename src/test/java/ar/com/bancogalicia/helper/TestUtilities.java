package ar.com.bancogalicia.helper;

import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.ClientPomPersonId;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienteresponse._4_0_0.ObtenerClienteResponse;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienteresponse._4_0_0.ObtenerClienteResult;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.persona._1_0_0.Persona;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.*;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ClasificacionCliente;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResponse;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResult;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.SucursalMadre;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.BGBAResultadoOperacion;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.Severidad;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigo;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.math.BigInteger;

public class TestUtilities {

    public static String BASE_API = "/v2/pom/";

    public static ClientInformationResponse getClientInformationResponse() {
        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();
        ClientPomPersonId clientPomPersonId = new ClientPomPersonId();
        clientPomPersonId.setIdPomPerson("123");
        clientInformationResponse.setIdPomPersona(clientPomPersonId.getIdPomPerson());
        return clientInformationResponse;
    }

    public static PersonaFisica getPersonFisica(){
        PersonaFisica personaFisica = new PersonaFisica();
        Basicos basicos = new Basicos();
        personaFisica.setBasicos(basicos);
        Documentos documentos = new Documentos();
        Documento doc = new Documento();
        documentos.getDocumento().add(doc);
        basicos.setDocumentos(documentos);
        NombrePersonaFisica nombrePersonaFisica = new NombrePersonaFisica();
        nombrePersonaFisica.setApellido("Messi");
        nombrePersonaFisica.setNombre("Lionel");
        basicos.setCodigoSexo("Masculino");
        basicos.setNombrePersona(nombrePersonaFisica);
        DatosNacimiento datosNacimiento = new DatosNacimiento();
        datosNacimiento.setFechaNacimiento(XMLGregorianCalendarImpl.createDate(1, 1, 1, 1));
        basicos.setDatosNacimiento(datosNacimiento);
        Telefonos telefonos = new Telefonos();
        personaFisica.setTelefonos(telefonos);
        Auditoria auditoria = new Auditoria();
        personaFisica.setAuditoria(auditoria);
        Domicilio domicilio = new Domicilio();
        personaFisica.setDomicilio(domicilio);
        String email = "email@homtmail.com";
        personaFisica.setEmail(email);
        return personaFisica;
    }

    private static ObtenerClasificacionSegunMovimientosResponse getObtenerClasificacionSegunMovimientosResponse(){
        ObtenerClasificacionSegunMovimientosResponse obtenerClasificacionSegunMovimientosResponse = new ObtenerClasificacionSegunMovimientosResponse();
        ObtenerClasificacionSegunMovimientosResponse.Datos datos = new ObtenerClasificacionSegunMovimientosResponse.Datos();
        ClasificacionCliente clasificacionCliente= new ClasificacionCliente();

        SucursalMadre sucursalMadre= new SucursalMadre();
        sucursalMadre.setNumero(BigInteger.valueOf(10));
        Codigo codigo = new Codigo();
        codigo.setValue("Codigo sucursal");
        sucursalMadre.setCodigoRol(codigo);

        clasificacionCliente.setSucursalMadre(sucursalMadre);

        datos.setClasificacionCliente(clasificacionCliente);
        obtenerClasificacionSegunMovimientosResponse.setDatos(datos);

        return obtenerClasificacionSegunMovimientosResponse;
    }

    public static ObtenerClasificacionSegunMovimientosResult getObtenerClasificacionSegunMovimientosResult(){
        ObtenerClasificacionSegunMovimientosResult obtenerClasificacionSegunMovimientosResult= new ObtenerClasificacionSegunMovimientosResult();
        obtenerClasificacionSegunMovimientosResult.setObtenerClasificacionSegunMovimientosResponse(getObtenerClasificacionSegunMovimientosResponse());
        return obtenerClasificacionSegunMovimientosResult;
    }

    public static ObtenerClienteResult getObtenerClienteResult() {
        ObtenerClienteResult obtenerClienteResult = new ObtenerClienteResult();
        ObtenerClienteResponse obtenerClienteResponse = new ObtenerClienteResponse();
        BGBAResultadoOperacion bgbaResultadoOperacion = new BGBAResultadoOperacion();
        bgbaResultadoOperacion.setSeveridad(Severidad.OK);
        obtenerClienteResponse.setBGBAResultadoOperacion(bgbaResultadoOperacion);
        obtenerClienteResponse.setPersonaFisica(getPersonFisica());

        Persona persona = new Persona();
        persona.setIdPersona("1400");
        persona.setCodigoTipoPersona("Fisica");
        obtenerClienteResponse.setPersona(persona);
        obtenerClienteResult.setObtenerClienteResponse(obtenerClienteResponse);
        return obtenerClienteResult;
    }

    private TestUtilities() {

    }

}
