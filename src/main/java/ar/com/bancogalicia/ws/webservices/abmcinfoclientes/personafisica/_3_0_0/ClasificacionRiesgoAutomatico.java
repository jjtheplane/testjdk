
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
 *         &lt;element name="TipoCalificacionAutomaticoActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaClasificacionAutomaticoActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClasificacionAutomaticoActual" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NumeroComunicacionCentralAutomaticoActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClaveRevisionAutomaticoActual" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaRevisionAutomaticoActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaActualizacionAutomaticoActual" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TipoCalificacionAutomaticoAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaClasificacionAutomaticoAnterior" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClasificacionAutomaticoAnterior" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NumeroComunicacionCentralAutomaticoAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClaveRevisionAutomaticoAnterior" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaRevisionAutomaticoAnterior" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaActualizacionAutomaticoAnterior" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaRevisionManualAnterior" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaActualizacionManualAnterior" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "tipoCalificacionAutomaticoActual",
    "fechaClasificacionAutomaticoActual",
    "codigoClasificacionAutomaticoActual",
    "numeroComunicacionCentralAutomaticoActual",
    "codigoClaveRevisionAutomaticoActual",
    "fechaUltimaRevisionAutomaticoActual",
    "fechaUltimaActualizacionAutomaticoActual",
    "tipoCalificacionAutomaticoAnterior",
    "fechaClasificacionAutomaticoAnterior",
    "codigoClasificacionAutomaticoAnterior",
    "numeroComunicacionCentralAutomaticoAnterior",
    "codigoClaveRevisionAutomaticoAnterior",
    "fechaUltimaRevisionAutomaticoAnterior",
    "fechaUltimaActualizacionAutomaticoAnterior",
    "fechaUltimaRevisionManualAnterior",
    "fechaUltimaActualizacionManualAnterior"
})
@XmlRootElement(name = "ClasificacionRiesgoAutomatico")
public class ClasificacionRiesgoAutomatico {

    @XmlElement(name = "TipoCalificacionAutomaticoActual")
    protected String tipoCalificacionAutomaticoActual;
    @XmlElement(name = "FechaClasificacionAutomaticoActual")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaClasificacionAutomaticoActual;
    @XmlElement(name = "CodigoClasificacionAutomaticoActual")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClasificacionAutomaticoActual;
    @XmlElement(name = "NumeroComunicacionCentralAutomaticoActual")
    protected String numeroComunicacionCentralAutomaticoActual;
    @XmlElement(name = "CodigoClaveRevisionAutomaticoActual")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClaveRevisionAutomaticoActual;
    @XmlElement(name = "FechaUltimaRevisionAutomaticoActual")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaRevisionAutomaticoActual;
    @XmlElement(name = "FechaUltimaActualizacionAutomaticoActual")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacionAutomaticoActual;
    @XmlElement(name = "TipoCalificacionAutomaticoAnterior")
    protected String tipoCalificacionAutomaticoAnterior;
    @XmlElement(name = "FechaClasificacionAutomaticoAnterior")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaClasificacionAutomaticoAnterior;
    @XmlElement(name = "CodigoClasificacionAutomaticoAnterior")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClasificacionAutomaticoAnterior;
    @XmlElement(name = "NumeroComunicacionCentralAutomaticoAnterior")
    protected String numeroComunicacionCentralAutomaticoAnterior;
    @XmlElement(name = "CodigoClaveRevisionAutomaticoAnterior")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoClaveRevisionAutomaticoAnterior;
    @XmlElement(name = "FechaUltimaRevisionAutomaticoAnterior")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaRevisionAutomaticoAnterior;
    @XmlElement(name = "FechaUltimaActualizacionAutomaticoAnterior")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacionAutomaticoAnterior;
    @XmlElement(name = "FechaUltimaRevisionManualAnterior")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaRevisionManualAnterior;
    @XmlElement(name = "FechaUltimaActualizacionManualAnterior")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacionManualAnterior;

    /**
     * Obtiene el valor de la propiedad tipoCalificacionAutomaticoActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCalificacionAutomaticoActual() {
        return tipoCalificacionAutomaticoActual;
    }

    /**
     * Define el valor de la propiedad tipoCalificacionAutomaticoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCalificacionAutomaticoActual(String value) {
        this.tipoCalificacionAutomaticoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaClasificacionAutomaticoActual.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaClasificacionAutomaticoActual() {
        return fechaClasificacionAutomaticoActual;
    }

    /**
     * Define el valor de la propiedad fechaClasificacionAutomaticoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaClasificacionAutomaticoActual(XMLGregorianCalendar value) {
        this.fechaClasificacionAutomaticoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClasificacionAutomaticoActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClasificacionAutomaticoActual() {
        return codigoClasificacionAutomaticoActual;
    }

    /**
     * Define el valor de la propiedad codigoClasificacionAutomaticoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClasificacionAutomaticoActual(String value) {
        this.codigoClasificacionAutomaticoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComunicacionCentralAutomaticoActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroComunicacionCentralAutomaticoActual() {
        return numeroComunicacionCentralAutomaticoActual;
    }

    /**
     * Define el valor de la propiedad numeroComunicacionCentralAutomaticoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroComunicacionCentralAutomaticoActual(String value) {
        this.numeroComunicacionCentralAutomaticoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClaveRevisionAutomaticoActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClaveRevisionAutomaticoActual() {
        return codigoClaveRevisionAutomaticoActual;
    }

    /**
     * Define el valor de la propiedad codigoClaveRevisionAutomaticoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClaveRevisionAutomaticoActual(String value) {
        this.codigoClaveRevisionAutomaticoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaRevisionAutomaticoActual.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaRevisionAutomaticoActual() {
        return fechaUltimaRevisionAutomaticoActual;
    }

    /**
     * Define el valor de la propiedad fechaUltimaRevisionAutomaticoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaRevisionAutomaticoActual(XMLGregorianCalendar value) {
        this.fechaUltimaRevisionAutomaticoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacionAutomaticoActual.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaActualizacionAutomaticoActual() {
        return fechaUltimaActualizacionAutomaticoActual;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacionAutomaticoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaActualizacionAutomaticoActual(XMLGregorianCalendar value) {
        this.fechaUltimaActualizacionAutomaticoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCalificacionAutomaticoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCalificacionAutomaticoAnterior() {
        return tipoCalificacionAutomaticoAnterior;
    }

    /**
     * Define el valor de la propiedad tipoCalificacionAutomaticoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCalificacionAutomaticoAnterior(String value) {
        this.tipoCalificacionAutomaticoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaClasificacionAutomaticoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaClasificacionAutomaticoAnterior() {
        return fechaClasificacionAutomaticoAnterior;
    }

    /**
     * Define el valor de la propiedad fechaClasificacionAutomaticoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaClasificacionAutomaticoAnterior(XMLGregorianCalendar value) {
        this.fechaClasificacionAutomaticoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClasificacionAutomaticoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClasificacionAutomaticoAnterior() {
        return codigoClasificacionAutomaticoAnterior;
    }

    /**
     * Define el valor de la propiedad codigoClasificacionAutomaticoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClasificacionAutomaticoAnterior(String value) {
        this.codigoClasificacionAutomaticoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComunicacionCentralAutomaticoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroComunicacionCentralAutomaticoAnterior() {
        return numeroComunicacionCentralAutomaticoAnterior;
    }

    /**
     * Define el valor de la propiedad numeroComunicacionCentralAutomaticoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroComunicacionCentralAutomaticoAnterior(String value) {
        this.numeroComunicacionCentralAutomaticoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClaveRevisionAutomaticoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClaveRevisionAutomaticoAnterior() {
        return codigoClaveRevisionAutomaticoAnterior;
    }

    /**
     * Define el valor de la propiedad codigoClaveRevisionAutomaticoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClaveRevisionAutomaticoAnterior(String value) {
        this.codigoClaveRevisionAutomaticoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaRevisionAutomaticoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaRevisionAutomaticoAnterior() {
        return fechaUltimaRevisionAutomaticoAnterior;
    }

    /**
     * Define el valor de la propiedad fechaUltimaRevisionAutomaticoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaRevisionAutomaticoAnterior(XMLGregorianCalendar value) {
        this.fechaUltimaRevisionAutomaticoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacionAutomaticoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaActualizacionAutomaticoAnterior() {
        return fechaUltimaActualizacionAutomaticoAnterior;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacionAutomaticoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaActualizacionAutomaticoAnterior(XMLGregorianCalendar value) {
        this.fechaUltimaActualizacionAutomaticoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaRevisionManualAnterior.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaRevisionManualAnterior() {
        return fechaUltimaRevisionManualAnterior;
    }

    /**
     * Define el valor de la propiedad fechaUltimaRevisionManualAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaRevisionManualAnterior(XMLGregorianCalendar value) {
        this.fechaUltimaRevisionManualAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacionManualAnterior.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaActualizacionManualAnterior() {
        return fechaUltimaActualizacionManualAnterior;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacionManualAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaActualizacionManualAnterior(XMLGregorianCalendar value) {
        this.fechaUltimaActualizacionManualAnterior = value;
    }

}
