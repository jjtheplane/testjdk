
package ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0 package. 
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

    private final static QName _IdMensaje_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", "IdMensaje");
    private final static QName _Equipo_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", "Equipo");
    private final static QName _IdConsumidorInterno_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", "IdConsumidorInterno");
    private final static QName _Supervision_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", "Supervision");
    private final static QName _Ip_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", "Ip");
    private final static QName _Terminal_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", "Terminal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BGBAHeader }
     * 
     */
    public BGBAHeader createBGBAHeader() {
        return new BGBAHeader();
    }

    /**
     * Create an instance of {@link Identificadores }
     * 
     */
    public Identificadores createIdentificadores() {
        return new Identificadores();
    }

    /**
     * Create an instance of {@link IdMensaje }
     * 
     */
    public IdMensaje createIdMensaje() {
        return new IdMensaje();
    }

    /**
     * Create an instance of {@link ModuloAplicativo }
     * 
     */
    public ModuloAplicativo createModuloAplicativo() {
        return new ModuloAplicativo();
    }

    /**
     * Create an instance of {@link Equipo }
     * 
     */
    public Equipo createEquipo() {
        return new Equipo();
    }

    /**
     * Create an instance of {@link Origen }
     * 
     */
    public Origen createOrigen() {
        return new Origen();
    }

    /**
     * Create an instance of {@link Operador }
     * 
     */
    public Operador createOperador() {
        return new Operador();
    }

    /**
     * Create an instance of {@link IdCliente }
     * 
     */
    public IdCliente createIdCliente() {
        return new IdCliente();
    }

    /**
     * Create an instance of {@link OrganizacionInterna }
     * 
     */
    public OrganizacionInterna createOrganizacionInterna() {
        return new OrganizacionInterna();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdMensaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", name = "IdMensaje")
    public JAXBElement<IdMensaje> createIdMensaje(IdMensaje value) {
        return new JAXBElement<IdMensaje>(_IdMensaje_QNAME, IdMensaje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Equipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", name = "Equipo")
    public JAXBElement<Equipo> createEquipo(Equipo value) {
        return new JAXBElement<Equipo>(_Equipo_QNAME, Equipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", name = "IdConsumidorInterno")
    public JAXBElement<String> createIdConsumidorInterno(String value) {
        return new JAXBElement<String>(_IdConsumidorInterno_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", name = "Supervision")
    public JAXBElement<String> createSupervision(String value) {
        return new JAXBElement<String>(_Supervision_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", name = "Ip")
    public JAXBElement<String> createIp(String value) {
        return new JAXBElement<String>(_Ip_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", name = "Terminal")
    public JAXBElement<String> createTerminal(String value) {
        return new JAXBElement<String>(_Terminal_QNAME, String.class, null, value);
    }

}
