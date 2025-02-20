package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente._5_0_1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2019-03-07T17:47:52.391-03:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/5_0_0", name = "ConsultaCliente")
@XmlSeeAlso({ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienterequest._4_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductoresponse._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.globales.bgbaheader._1_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.globales.bgbatipossoporte._3_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.persona._1_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienteresponse._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosrequest._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienterequest._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteresponsecommon._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosresponse._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosrequest._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.globales.bgbatipossoporte._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._1_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductorequest._2_0_0.ObjectFactory.class, ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienteresponse._4_0_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ConsultaCliente {

    @WebMethod(operationName = "BuscarClientePorDatosBasicos", action = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/BuscarClientePorDatosBasicos")
    @WebResult(name = "BuscarClientePorDatosBasicosResult", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosresponse/2_0_0", partName = "parameters")
    public ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosresponse._2_0_0.BuscarClientePorDatosBasicosResult buscarClientePorDatosBasicos(
        @WebParam(partName = "parameters", name = "BuscarClientePorDatosBasicos", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0")
        ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosrequest._2_0_0.BuscarClientePorDatosBasicos parameters
    ) throws BGBAResultadoOperacionFalla;

    @WebMethod(operationName = "ObtenerCliente", action = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/ObtenerCliente")
    @WebResult(name = "ObtenerClienteResult", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienteresponse/4_0_0", partName = "parameters")
    public ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienteresponse._4_0_0.ObtenerClienteResult obtenerCliente(
        @WebParam(partName = "parameters", name = "ObtenerCliente", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0")
        ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienterequest._4_0_0.ObtenerCliente parameters
    ) throws BGBAResultadoOperacionFalla;

    @WebMethod(operationName = "BuscarClientePorProducto", action = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/BuscarClientePorProducto")
    @WebResult(name = "BuscarClientePorProductoResult", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteporproductoresponse/2_0_0", partName = "parameters")
    public ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductoresponse._2_0_0.BuscarClientePorProductoResult buscarClientePorProducto(
        @WebParam(partName = "parameters", name = "BuscarClientePorProducto", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteporproductorequest/2_0_0")
        ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductorequest._2_0_0.BuscarClientePorProducto parameters
    ) throws BGBAResultadoOperacionFalla;

    @WebMethod(operationName = "ObtenerClasificacionSegunMovimientos", action = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/ObtenerClasificacionSegunMovimientos")
    @WebResult(name = "ObtenerClasificacionSegunMovimientosResult", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerclasificacionsegunmovimientosresponse/2_0_0", partName = "parameters")
    public ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResult obtenerClasificacionSegunMovimientos(
        @WebParam(partName = "parameters", name = "ObtenerClasificacionSegunMovimientos", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerclasificacionsegunmovimientosrequest/2_0_0")
        ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosrequest._2_0_0.ObtenerClasificacionSegunMovimientos parameters
    ) throws BGBAResultadoOperacionFalla;

    @WebMethod(operationName = "ObtenerRelacionesCliente", action = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/ObtenerRelacionesCliente")
    @WebResult(name = "ObtenerRelacionesClienteResult", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerrelacionesclienteresponse/2_0_0", partName = "parameters")
    public ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienteresponse._2_0_0.ObtenerRelacionesClienteResult obtenerRelacionesCliente(
        @WebParam(partName = "parameters", name = "ObtenerRelacionesCliente", targetNamespace = "http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerrelacionesclienterequest/2_0_0")
        ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienterequest._2_0_0.ObtenerRelacionesCliente parameters
    ) throws BGBAResultadoOperacionFalla;
}
