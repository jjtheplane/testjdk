
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienteresponse._2_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerrelacionesclienteresponse/2_0_0}ObtenerRelacionesClienteResponse" minOccurs="0"/&gt;
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
    "obtenerRelacionesClienteResponse"
})
@XmlRootElement(name = "ObtenerRelacionesClienteResult")
public class ObtenerRelacionesClienteResult {

    @XmlElement(name = "ObtenerRelacionesClienteResponse")
    protected ObtenerRelacionesClienteResponse obtenerRelacionesClienteResponse;

    /**
     * Obtiene el valor de la propiedad obtenerRelacionesClienteResponse.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerRelacionesClienteResponse }
     *     
     */
    public ObtenerRelacionesClienteResponse getObtenerRelacionesClienteResponse() {
        return obtenerRelacionesClienteResponse;
    }

    /**
     * Define el valor de la propiedad obtenerRelacionesClienteResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerRelacionesClienteResponse }
     *     
     */
    public void setObtenerRelacionesClienteResponse(ObtenerRelacionesClienteResponse value) {
        this.obtenerRelacionesClienteResponse = value;
    }

}
