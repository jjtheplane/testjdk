
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductoresponse._2_0_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteresponsecommon._2_0_0.BuscarClienteResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductoresponse._2_0_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarClientePorProductoResponse_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteporproductoresponse/2_0_0", "BuscarClientePorProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductoresponse._2_0_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarClientePorProductoResult }
     * 
     */
    public BuscarClientePorProductoResult createBuscarClientePorProductoResult() {
        return new BuscarClientePorProductoResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteporproductoresponse/2_0_0", name = "BuscarClientePorProductoResponse")
    public JAXBElement<BuscarClienteResponse> createBuscarClientePorProductoResponse(BuscarClienteResponse value) {
        return new JAXBElement<BuscarClienteResponse>(_BuscarClientePorProductoResponse_QNAME, BuscarClienteResponse.class, null, value);
    }

}
