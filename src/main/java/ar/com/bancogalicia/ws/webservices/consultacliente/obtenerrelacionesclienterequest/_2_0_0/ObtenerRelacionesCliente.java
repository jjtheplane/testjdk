
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienterequest._2_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerrelacionesclienterequest/2_0_0}ObtenerRelacionesClienteRequest" minOccurs="0"/&gt;
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
    "obtenerRelacionesClienteRequest"
})
@XmlRootElement(name = "ObtenerRelacionesCliente")
public class ObtenerRelacionesCliente {

    @XmlElement(name = "ObtenerRelacionesClienteRequest")
    protected ObtenerRelacionesClienteRequest obtenerRelacionesClienteRequest;

    /**
     * Obtiene el valor de la propiedad obtenerRelacionesClienteRequest.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerRelacionesClienteRequest }
     *     
     */
    public ObtenerRelacionesClienteRequest getObtenerRelacionesClienteRequest() {
        return obtenerRelacionesClienteRequest;
    }

    /**
     * Define el valor de la propiedad obtenerRelacionesClienteRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerRelacionesClienteRequest }
     *     
     */
    public void setObtenerRelacionesClienteRequest(ObtenerRelacionesClienteRequest value) {
        this.obtenerRelacionesClienteRequest = value;
    }

}
