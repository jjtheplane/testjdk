
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosrequest._2_0_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._2_0_0.Documento;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosrequest._2_0_0 package. 
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

    private final static QName _SeleccionTipoPersona_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0", "SeleccionTipoPersona");
    private final static QName _PorDocumento_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0", "PorDocumento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosrequest._2_0_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Datos }
     * 
     */
    public Datos createDatos() {
        return new Datos();
    }

    /**
     * Create an instance of {@link PorRazonSocial }
     * 
     */
    public PorRazonSocial createPorRazonSocial() {
        return new PorRazonSocial();
    }

    /**
     * Create an instance of {@link PorNombreApellido }
     * 
     */
    public PorNombreApellido createPorNombreApellido() {
        return new PorNombreApellido();
    }

    /**
     * Create an instance of {@link Datos.CriterioBusqueda }
     * 
     */
    public Datos.CriterioBusqueda createDatosCriterioBusqueda() {
        return new Datos.CriterioBusqueda();
    }

    /**
     * Create an instance of {@link BuscarClientePorDatosBasicosRequest }
     * 
     */
    public BuscarClientePorDatosBasicosRequest createBuscarClientePorDatosBasicosRequest() {
        return new BuscarClientePorDatosBasicosRequest();
    }

    /**
     * Create an instance of {@link BuscarClientePorDatosBasicos }
     * 
     */
    public BuscarClientePorDatosBasicos createBuscarClientePorDatosBasicos() {
        return new BuscarClientePorDatosBasicos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0", name = "SeleccionTipoPersona")
    public JAXBElement<String> createSeleccionTipoPersona(String value) {
        return new JAXBElement<String>(_SeleccionTipoPersona_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0", name = "PorDocumento")
    public JAXBElement<Documento> createPorDocumento(Documento value) {
        return new JAXBElement<Documento>(_PorDocumento_QNAME, Documento.class, null, value);
    }

}
