
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienteresponse._4_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienteresponse/4_0_0}ObtenerClienteResponse" minOccurs="0"/&gt;
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
    "obtenerClienteResponse"
})
@XmlRootElement(name = "ObtenerClienteResult")
public class ObtenerClienteResult {

    @XmlElement(name = "ObtenerClienteResponse")
    protected ObtenerClienteResponse obtenerClienteResponse;

    /**
     * Obtiene el valor de la propiedad obtenerClienteResponse.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerClienteResponse }
     *     
     */
    public ObtenerClienteResponse getObtenerClienteResponse() {
        return obtenerClienteResponse;
    }

    /**
     * Define el valor de la propiedad obtenerClienteResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerClienteResponse }
     *     
     */
    public void setObtenerClienteResponse(ObtenerClienteResponse value) {
        this.obtenerClienteResponse = value;
    }

}
