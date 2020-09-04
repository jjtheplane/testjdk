
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienterequest._4_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}ObtenerClienteRequest" minOccurs="0"/&gt;
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
    "obtenerClienteRequest"
})
@XmlRootElement(name = "ObtenerCliente")
public class ObtenerCliente {

    @XmlElement(name = "ObtenerClienteRequest")
    protected ObtenerClienteRequest obtenerClienteRequest;

    /**
     * Obtiene el valor de la propiedad obtenerClienteRequest.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerClienteRequest }
     *     
     */
    public ObtenerClienteRequest getObtenerClienteRequest() {
        return obtenerClienteRequest;
    }

    /**
     * Define el valor de la propiedad obtenerClienteRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerClienteRequest }
     *     
     */
    public void setObtenerClienteRequest(ObtenerClienteRequest value) {
        this.obtenerClienteRequest = value;
    }

}
