
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

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
 *         &lt;element name="NoPoseeEmail" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}indicador" minOccurs="0"/&gt;
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
    "noPoseeEmail"
})
@XmlRootElement(name = "DatosPosesionEmail")
public class DatosPosesionEmail {

    @XmlElement(name = "NoPoseeEmail")
    protected String noPoseeEmail;

    /**
     * Obtiene el valor de la propiedad noPoseeEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPoseeEmail() {
        return noPoseeEmail;
    }

    /**
     * Define el valor de la propiedad noPoseeEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPoseeEmail(String value) {
        this.noPoseeEmail = value;
    }

}
