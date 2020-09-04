
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DatosClasificacionRiesgo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosClasificacionRiesgo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCalificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaClasificacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClasificacion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NumeroComunicacionCentral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClaveRevision" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaRevision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosClasificacionRiesgo", propOrder = {
    "tipoCalificacion",
    "fechaClasificacion",
    "codigoClasificacion",
    "numeroComunicacionCentral",
    "codigoClaveRevision",
    "fechaUltimaRevision",
    "fechaUltimaActualizacion"
})
public class DatosClasificacionRiesgo {

    @XmlElement(name = "TipoCalificacion")
    protected String tipoCalificacion;
    @XmlElement(name = "FechaClasificacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaClasificacion;
    @XmlElement(name = "CodigoClasificacion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClasificacion;
    @XmlElement(name = "NumeroComunicacionCentral")
    protected String numeroComunicacionCentral;
    @XmlElement(name = "CodigoClaveRevision")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClaveRevision;
    @XmlElement(name = "FechaUltimaRevision")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaRevision;
    @XmlElement(name = "FechaUltimaActualizacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacion;

    /**
     * Obtiene el valor de la propiedad tipoCalificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCalificacion() {
        return tipoCalificacion;
    }

    /**
     * Define el valor de la propiedad tipoCalificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCalificacion(String value) {
        this.tipoCalificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaClasificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaClasificacion() {
        return fechaClasificacion;
    }

    /**
     * Define el valor de la propiedad fechaClasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaClasificacion(XMLGregorianCalendar value) {
        this.fechaClasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClasificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClasificacion() {
        return codigoClasificacion;
    }

    /**
     * Define el valor de la propiedad codigoClasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClasificacion(String value) {
        this.codigoClasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComunicacionCentral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroComunicacionCentral() {
        return numeroComunicacionCentral;
    }

    /**
     * Define el valor de la propiedad numeroComunicacionCentral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroComunicacionCentral(String value) {
        this.numeroComunicacionCentral = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClaveRevision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClaveRevision() {
        return codigoClaveRevision;
    }

    /**
     * Define el valor de la propiedad codigoClaveRevision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClaveRevision(String value) {
        this.codigoClaveRevision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaRevision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    /**
     * Define el valor de la propiedad fechaUltimaRevision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaRevision(XMLGregorianCalendar value) {
        this.fechaUltimaRevision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaActualizacion(XMLGregorianCalendar value) {
        this.fechaUltimaActualizacion = value;
    }

}
