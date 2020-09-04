
package ar.com.bancogalicia.ws.webservices.globales.bgbaheader._1_0_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.bancogalicia.ws.webservices.globales.bgbaheader._1_0_0 package. 
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

    private final static QName _Operador_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", "Operador");
    private final static QName _IdGalicia_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", "IdGalicia");
    private final static QName _IdInterno_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", "IdInterno");
    private final static QName _IpUsuarioFinal_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", "IpUsuarioFinal");
    private final static QName _IdOperacion_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", "IdOperacion");
    private final static QName _Canal_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", "Canal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.bancogalicia.ws.webservices.globales.bgbaheader._1_0_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModuloAplicativo }
     * 
     */
    public ModuloAplicativo createModuloAplicativo() {
        return new ModuloAplicativo();
    }

    /**
     * Create an instance of {@link BGBAHeader }
     * 
     */
    public BGBAHeader createBGBAHeader() {
        return new BGBAHeader();
    }

    /**
     * Create an instance of {@link IdOperacionUnico }
     * 
     */
    public IdOperacionUnico createIdOperacionUnico() {
        return new IdOperacionUnico();
    }

    /**
     * Create an instance of {@link Consumidores }
     * 
     */
    public Consumidores createConsumidores() {
        return new Consumidores();
    }

    /**
     * Create an instance of {@link Consumidor }
     * 
     */
    public Consumidor createConsumidor() {
        return new Consumidor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", name = "Operador")
    public JAXBElement<String> createOperador(String value) {
        return new JAXBElement<String>(_Operador_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", name = "IdGalicia")
    public JAXBElement<String> createIdGalicia(String value) {
        return new JAXBElement<String>(_IdGalicia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", name = "IdInterno")
    public JAXBElement<String> createIdInterno(String value) {
        return new JAXBElement<String>(_IdInterno_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", name = "IpUsuarioFinal")
    public JAXBElement<String> createIpUsuarioFinal(String value) {
        return new JAXBElement<String>(_IpUsuarioFinal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", name = "IdOperacion")
    public JAXBElement<String> createIdOperacion(String value) {
        return new JAXBElement<String>(_IdOperacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0", name = "Canal")
    public JAXBElement<String> createCanal(String value) {
        return new JAXBElement<String>(_Canal_QNAME, String.class, null, value);
    }

}
