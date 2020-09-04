
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

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
 *         &lt;element name="Pasaporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "pasaporte"
})
@XmlRootElement(name = "DatosPasaporte")
public class DatosPasaporte {

    @XmlElement(name = "Pasaporte")
    protected String pasaporte;

    /**
     * Obtiene el valor de la propiedad pasaporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasaporte() {
        return pasaporte;
    }

    /**
     * Define el valor de la propiedad pasaporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasaporte(String value) {
        this.pasaporte = value;
    }

}
