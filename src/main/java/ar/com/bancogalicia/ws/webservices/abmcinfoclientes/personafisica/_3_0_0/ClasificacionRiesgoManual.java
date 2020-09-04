
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="TipoCalificacionManualActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaClasificacionManualActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClasificacionManualActual" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NumeroComunicacionCentralManualActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClaveRevisionManualActual" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaRevisionManualActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaActualizacionManualActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TipoCalificacionManualAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaClasificacionManualAnterior" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClasificacionManualAnterior" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NumeroComunicacionCentralManualAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClaveRevisionManualAnterior" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
    "tipoCalificacionManualActual",
    "fechaClasificacionManualActual",
    "codigoClasificacionManualActual",
    "numeroComunicacionCentralManualActual",
    "codigoClaveRevisionManualActual",
    "fechaUltimaRevisionManualActual",
    "fechaUltimaActualizacionManualActual",
    "tipoCalificacionManualAnterior",
    "fechaClasificacionManualAnterior",
    "codigoClasificacionManualAnterior",
    "numeroComunicacionCentralManualAnterior",
    "codigoClaveRevisionManualAnterior"
})
@XmlRootElement(name = "ClasificacionRiesgoManual")
public class ClasificacionRiesgoManual {

    @XmlElement(name = "TipoCalificacionManualActual")
    protected String tipoCalificacionManualActual;
    @XmlElement(name = "FechaClasificacionManualActual")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaClasificacionManualActual;
    @XmlElement(name = "CodigoClasificacionManualActual")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClasificacionManualActual;
    @XmlElement(name = "NumeroComunicacionCentralManualActual")
    protected String numeroComunicacionCentralManualActual;
    @XmlElement(name = "CodigoClaveRevisionManualActual")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClaveRevisionManualActual;
    @XmlElement(name = "FechaUltimaRevisionManualActual")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaRevisionManualActual;
    @XmlElement(name = "FechaUltimaActualizacionManualActual")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacionManualActual;
    @XmlElement(name = "TipoCalificacionManualAnterior")
    protected String tipoCalificacionManualAnterior;
    @XmlElement(name = "FechaClasificacionManualAnterior")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaClasificacionManualAnterior;
    @XmlElement(name = "CodigoClasificacionManualAnterior")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClasificacionManualAnterior;
    @XmlElement(name = "NumeroComunicacionCentralManualAnterior")
    protected String numeroComunicacionCentralManualAnterior;
    @XmlElement(name = "CodigoClaveRevisionManualAnterior")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClaveRevisionManualAnterior;

    /**
     * Obtiene el valor de la propiedad tipoCalificacionManualActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCalificacionManualActual() {
        return tipoCalificacionManualActual;
    }

    /**
     * Define el valor de la propiedad tipoCalificacionManualActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCalificacionManualActual(String value) {
        this.tipoCalificacionManualActual = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaClasificacionManualActual.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaClasificacionManualActual() {
        return fechaClasificacionManualActual;
    }

    /**
     * Define el valor de la propiedad fechaClasificacionManualActual.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaClasificacionManualActual(XMLGregorianCalendar value) {
        this.fechaClasificacionManualActual = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClasificacionManualActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClasificacionManualActual() {
        return codigoClasificacionManualActual;
    }

    /**
     * Define el valor de la propiedad codigoClasificacionManualActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClasificacionManualActual(String value) {
        this.codigoClasificacionManualActual = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComunicacionCentralManualActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroComunicacionCentralManualActual() {
        return numeroComunicacionCentralManualActual;
    }

    /**
     * Define el valor de la propiedad numeroComunicacionCentralManualActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroComunicacionCentralManualActual(String value) {
        this.numeroComunicacionCentralManualActual = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClaveRevisionManualActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClaveRevisionManualActual() {
        return codigoClaveRevisionManualActual;
    }

    /**
     * Define el valor de la propiedad codigoClaveRevisionManualActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClaveRevisionManualActual(String value) {
        this.codigoClaveRevisionManualActual = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaRevisionManualActual.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaRevisionManualActual() {
        return fechaUltimaRevisionManualActual;
    }

    /**
     * Define el valor de la propiedad fechaUltimaRevisionManualActual.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaRevisionManualActual(XMLGregorianCalendar value) {
        this.fechaUltimaRevisionManualActual = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacionManualActual.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaActualizacionManualActual() {
        return fechaUltimaActualizacionManualActual;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacionManualActual.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaActualizacionManualActual(XMLGregorianCalendar value) {
        this.fechaUltimaActualizacionManualActual = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCalificacionManualAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCalificacionManualAnterior() {
        return tipoCalificacionManualAnterior;
    }

    /**
     * Define el valor de la propiedad tipoCalificacionManualAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCalificacionManualAnterior(String value) {
        this.tipoCalificacionManualAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaClasificacionManualAnterior.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaClasificacionManualAnterior() {
        return fechaClasificacionManualAnterior;
    }

    /**
     * Define el valor de la propiedad fechaClasificacionManualAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaClasificacionManualAnterior(XMLGregorianCalendar value) {
        this.fechaClasificacionManualAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClasificacionManualAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClasificacionManualAnterior() {
        return codigoClasificacionManualAnterior;
    }

    /**
     * Define el valor de la propiedad codigoClasificacionManualAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClasificacionManualAnterior(String value) {
        this.codigoClasificacionManualAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComunicacionCentralManualAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroComunicacionCentralManualAnterior() {
        return numeroComunicacionCentralManualAnterior;
    }

    /**
     * Define el valor de la propiedad numeroComunicacionCentralManualAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroComunicacionCentralManualAnterior(String value) {
        this.numeroComunicacionCentralManualAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClaveRevisionManualAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClaveRevisionManualAnterior() {
        return codigoClaveRevisionManualAnterior;
    }

    /**
     * Define el valor de la propiedad codigoClaveRevisionManualAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClaveRevisionManualAnterior(String value) {
        this.codigoClaveRevisionManualAnterior = value;
    }

}
