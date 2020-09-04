
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
 *         &lt;element name="ClienteREAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaAltaClienteREAL" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "clienteREAL",
    "fechaAltaClienteREAL"
})
@XmlRootElement(name = "DatosClienteReal")
public class DatosClienteReal {

    @XmlElement(name = "ClienteREAL")
    protected String clienteREAL;
    @XmlElement(name = "FechaAltaClienteREAL")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaAltaClienteREAL;

    /**
     * Obtiene el valor de la propiedad clienteREAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteREAL() {
        return clienteREAL;
    }

    /**
     * Define el valor de la propiedad clienteREAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteREAL(String value) {
        this.clienteREAL = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAltaClienteREAL.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAltaClienteREAL() {
        return fechaAltaClienteREAL;
    }

    /**
     * Define el valor de la propiedad fechaAltaClienteREAL.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAltaClienteREAL(XMLGregorianCalendar value) {
        this.fechaAltaClienteREAL = value;
    }

}
