
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductorequest._2_0_0;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductorequest._2_0_0 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductorequest._2_0_0
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
     * Create an instance of {@link Datos.CriterioBusqueda }
     * 
     */
    public Datos.CriterioBusqueda createDatosCriterioBusqueda() {
        return new Datos.CriterioBusqueda();
    }

    /**
     * Create an instance of {@link BuscarClientePorProductoRequest }
     * 
     */
    public BuscarClientePorProductoRequest createBuscarClientePorProductoRequest() {
        return new BuscarClientePorProductoRequest();
    }

    /**
     * Create an instance of {@link BuscarClientePorProducto }
     * 
     */
    public BuscarClientePorProducto createBuscarClientePorProducto() {
        return new BuscarClientePorProducto();
    }

    /**
     * Create an instance of {@link Datos.CriterioBusqueda.PorProducto }
     * 
     */
    public Datos.CriterioBusqueda.PorProducto createDatosCriterioBusquedaPorProducto() {
        return new Datos.CriterioBusqueda.PorProducto();
    }

}
