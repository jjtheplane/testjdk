
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="MarcaAtencionPreferencial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaAltaAtencionPreferencial" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "marcaAtencionPreferencial",
    "fechaAltaAtencionPreferencial"
})
@XmlRootElement(name = "DatosAtencionPreferencial")
public class DatosAtencionPreferencial {

    @XmlElement(name = "MarcaAtencionPreferencial")
    protected String marcaAtencionPreferencial;
    @XmlElement(name = "FechaAltaAtencionPreferencial")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaAltaAtencionPreferencial;

    /**
     * Obtiene el valor de la propiedad marcaAtencionPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaAtencionPreferencial() {
        return marcaAtencionPreferencial;
    }

    /**
     * Define el valor de la propiedad marcaAtencionPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaAtencionPreferencial(String value) {
        this.marcaAtencionPreferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAltaAtencionPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAltaAtencionPreferencial() {
        return fechaAltaAtencionPreferencial;
    }

    /**
     * Define el valor de la propiedad fechaAltaAtencionPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAltaAtencionPreferencial(XMLGregorianCalendar value) {
        this.fechaAltaAtencionPreferencial = value;
    }

}
