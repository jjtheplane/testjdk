
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductorequest._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteporproductorequest/2_0_0}BuscarClientePorProductoRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "buscarClientePorProductoRequest"
})
@XmlRootElement(name = "BuscarClientePorProducto")
public class BuscarClientePorProducto {

    @XmlElement(name = "BuscarClientePorProductoRequest", required = true)
    protected BuscarClientePorProductoRequest buscarClientePorProductoRequest;

    /**
     * Obtiene el valor de la propiedad buscarClientePorProductoRequest.
     * 
     * @return
     *     possible object is
     *     {@link BuscarClientePorProductoRequest }
     *     
     */
    public BuscarClientePorProductoRequest getBuscarClientePorProductoRequest() {
        return buscarClientePorProductoRequest;
    }

    /**
     * Define el valor de la propiedad buscarClientePorProductoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscarClientePorProductoRequest }
     *     
     */
    public void setBuscarClientePorProductoRequest(BuscarClientePorProductoRequest value) {
        this.buscarClientePorProductoRequest = value;
    }

}
