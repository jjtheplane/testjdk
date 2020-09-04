
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import java.math.BigInteger;
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
 *         &lt;element name="MarcaExcepcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarcaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoActividadPrincipalAFIP" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="CodigoActividadSecundaria" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="FechaAlta" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "marcaExcepcion",
    "marcaOrigen",
    "codigoActividadPrincipalAFIP",
    "codigoActividadSecundaria",
    "fechaAlta"
})
@XmlRootElement(name = "DatosActividadAFIP")
public class DatosActividadAFIP {

    @XmlElement(name = "MarcaExcepcion")
    protected String marcaExcepcion;
    @XmlElement(name = "MarcaOrigen")
    protected String marcaOrigen;
    @XmlElement(name = "CodigoActividadPrincipalAFIP")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger codigoActividadPrincipalAFIP;
    @XmlElement(name = "CodigoActividadSecundaria")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger codigoActividadSecundaria;
    @XmlElement(name = "FechaAlta")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaAlta;

    /**
     * Obtiene el valor de la propiedad marcaExcepcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaExcepcion() {
        return marcaExcepcion;
    }

    /**
     * Define el valor de la propiedad marcaExcepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaExcepcion(String value) {
        this.marcaExcepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaOrigen() {
        return marcaOrigen;
    }

    /**
     * Define el valor de la propiedad marcaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaOrigen(String value) {
        this.marcaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoActividadPrincipalAFIP.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoActividadPrincipalAFIP() {
        return codigoActividadPrincipalAFIP;
    }

    /**
     * Define el valor de la propiedad codigoActividadPrincipalAFIP.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoActividadPrincipalAFIP(BigInteger value) {
        this.codigoActividadPrincipalAFIP = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoActividadSecundaria.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoActividadSecundaria() {
        return codigoActividadSecundaria;
    }

    /**
     * Define el valor de la propiedad codigoActividadSecundaria.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoActividadSecundaria(BigInteger value) {
        this.codigoActividadSecundaria = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAlta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Define el valor de la propiedad fechaAlta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAlta(XMLGregorianCalendar value) {
        this.fechaAlta = value;
    }

}
