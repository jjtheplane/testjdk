
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._2_0_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._2_0_0 package. 
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

    private final static QName _IdCuentaPasivas_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", "IdCuentaPasivas");
    private final static QName _IdCuenta_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", "IdCuenta");
    private final static QName _IdCuentaTarjetas_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", "IdCuentaTarjetas");
    private final static QName _IdProductoNV_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", "IdProductoNV");
    private final static QName _IdProductoBT_QNAME = new QName("http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", "IdProductoBT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._2_0_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdCuentaPasivas }
     * 
     */
    public IdCuentaPasivas createIdCuentaPasivas() {
        return new IdCuentaPasivas();
    }

    /**
     * Create an instance of {@link IdCuenta }
     * 
     */
    public IdCuenta createIdCuenta() {
        return new IdCuenta();
    }

    /**
     * Create an instance of {@link IdCuentaTarjetas }
     * 
     */
    public IdCuentaTarjetas createIdCuentaTarjetas() {
        return new IdCuentaTarjetas();
    }

    /**
     * Create an instance of {@link IdProductoNV }
     * 
     */
    public IdProductoNV createIdProductoNV() {
        return new IdProductoNV();
    }

    /**
     * Create an instance of {@link IdProductoBT }
     * 
     */
    public IdProductoBT createIdProductoBT() {
        return new IdProductoBT();
    }

    /**
     * Create an instance of {@link ClaseProductoNV }
     * 
     */
    public ClaseProductoNV createClaseProductoNV() {
        return new ClaseProductoNV();
    }

    /**
     * Create an instance of {@link ClaseProductoCatalogo }
     * 
     */
    public ClaseProductoCatalogo createClaseProductoCatalogo() {
        return new ClaseProductoCatalogo();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link Codigo }
     * 
     */
    public Codigo createCodigo() {
        return new Codigo();
    }

    /**
     * Create an instance of {@link Periodo }
     * 
     */
    public Periodo createPeriodo() {
        return new Periodo();
    }

    /**
     * Create an instance of {@link Monto }
     * 
     */
    public Monto createMonto() {
        return new Monto();
    }

    /**
     * Create an instance of {@link Saldo }
     * 
     */
    public Saldo createSaldo() {
        return new Saldo();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link NumeroCuenta }
     * 
     */
    public NumeroCuenta createNumeroCuenta() {
        return new NumeroCuenta();
    }

    /**
     * Create an instance of {@link NumeroCuentav2 }
     * 
     */
    public NumeroCuentav2 createNumeroCuentav2() {
        return new NumeroCuentav2();
    }

    /**
     * Create an instance of {@link TelefonoBasico }
     * 
     */
    public TelefonoBasico createTelefonoBasico() {
        return new TelefonoBasico();
    }

    /**
     * Create an instance of {@link TelefonoBasicoCodigoDeUso }
     * 
     */
    public TelefonoBasicoCodigoDeUso createTelefonoBasicoCodigoDeUso() {
        return new TelefonoBasicoCodigoDeUso();
    }

    /**
     * Create an instance of {@link DomicilioFisico }
     * 
     */
    public DomicilioFisico createDomicilioFisico() {
        return new DomicilioFisico();
    }

    /**
     * Create an instance of {@link Domicilio2 }
     * 
     */
    public Domicilio2 createDomicilio2() {
        return new Domicilio2();
    }

    /**
     * Create an instance of {@link Domicilio2Salida }
     * 
     */
    public Domicilio2Salida createDomicilio2Salida() {
        return new Domicilio2Salida();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCuentaPasivas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", name = "IdCuentaPasivas")
    public JAXBElement<IdCuentaPasivas> createIdCuentaPasivas(IdCuentaPasivas value) {
        return new JAXBElement<IdCuentaPasivas>(_IdCuentaPasivas_QNAME, IdCuentaPasivas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", name = "IdCuenta")
    public JAXBElement<IdCuenta> createIdCuenta(IdCuenta value) {
        return new JAXBElement<IdCuenta>(_IdCuenta_QNAME, IdCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCuentaTarjetas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", name = "IdCuentaTarjetas")
    public JAXBElement<IdCuentaTarjetas> createIdCuentaTarjetas(IdCuentaTarjetas value) {
        return new JAXBElement<IdCuentaTarjetas>(_IdCuentaTarjetas_QNAME, IdCuentaTarjetas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdProductoNV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", name = "IdProductoNV")
    public JAXBElement<IdProductoNV> createIdProductoNV(IdProductoNV value) {
        return new JAXBElement<IdProductoNV>(_IdProductoNV_QNAME, IdProductoNV.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdProductoBT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0", name = "IdProductoBT")
    public JAXBElement<IdProductoBT> createIdProductoBT(IdProductoBT value) {
        return new JAXBElement<IdProductoBT>(_IdProductoBT_QNAME, IdProductoBT.class, null, value);
    }

}
