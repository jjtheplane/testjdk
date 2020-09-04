
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductoresponse._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteresponsecommon._2_0_0.BuscarClienteResponse;


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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteporproductoresponse/2_0_0}BuscarClientePorProductoResponse"/&gt;
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
    "buscarClientePorProductoResponse"
})
@XmlRootElement(name = "BuscarClientePorProductoResult")
public class BuscarClientePorProductoResult {

    @XmlElement(name = "BuscarClientePorProductoResponse", required = true)
    protected BuscarClienteResponse buscarClientePorProductoResponse;

    /**
     * Obtiene el valor de la propiedad buscarClientePorProductoResponse.
     * 
     * @return
     *     possible object is
     *     {@link BuscarClienteResponse }
     *     
     */
    public BuscarClienteResponse getBuscarClientePorProductoResponse() {
        return buscarClientePorProductoResponse;
    }

    /**
     * Define el valor de la propiedad buscarClientePorProductoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscarClienteResponse }
     *     
     */
    public void setBuscarClientePorProductoResponse(BuscarClienteResponse value) {
        this.buscarClientePorProductoResponse = value;
    }

}
