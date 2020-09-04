
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

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
 *         &lt;element name="FechaContrato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaVencimientoActa" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaVencimientoContrato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TipoInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TomoLibroFolioInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoJurisdiccionInscripcion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="DetalleJurisdiccionInscripcion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoAFJP" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NombreContacto" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoContacto" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}telefonoBasico"/&gt;
 *         &lt;element name="FechaUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisConstitucionSociedad" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoFondoComunInversion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MarcaDuracionContratoSociedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaCierreEjercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjetoSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionDuracionContratoSociedad" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
    "fechaContrato",
    "fechaInscripcion",
    "fechaVencimientoActa",
    "fechaVencimientoContrato",
    "tipoInscripcion",
    "numeroInscripcion",
    "tomoLibroFolioInscripcion",
    "codigoJurisdiccionInscripcion",
    "detalleJurisdiccionInscripcion",
    "codigoAFJP",
    "nombreContacto",
    "telefonoContacto",
    "fechaUltimaActualizacion",
    "codigoPaisConstitucionSociedad",
    "codigoFondoComunInversion",
    "marcaDuracionContratoSociedad",
    "fechaCierreEjercicio",
    "objetoSocial",
    "descripcionDuracionContratoSociedad"
})
@XmlRootElement(name = "Organizacion")
public class Organizacion {

    @XmlElement(name = "FechaContrato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaContrato;
    @XmlElement(name = "FechaInscripcion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInscripcion;
    @XmlElement(name = "FechaVencimientoActa")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoActa;
    @XmlElement(name = "FechaVencimientoContrato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoContrato;
    @XmlElement(name = "TipoInscripcion")
    protected String tipoInscripcion;
    @XmlElement(name = "NumeroInscripcion")
    protected String numeroInscripcion;
    @XmlElement(name = "TomoLibroFolioInscripcion")
    protected String tomoLibroFolioInscripcion;
    @XmlElement(name = "CodigoJurisdiccionInscripcion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoJurisdiccionInscripcion;
    @XmlElement(name = "DetalleJurisdiccionInscripcion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String detalleJurisdiccionInscripcion;
    @XmlElement(name = "CodigoAFJP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoAFJP;
    @XmlElement(name = "NombreContacto")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nombreContacto;
    @XmlElement(name = "TelefonoContacto", required = true)
    protected TelefonoBasico telefonoContacto;
    @XmlElement(name = "FechaUltimaActualizacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacion;
    @XmlElement(name = "CodigoPaisConstitucionSociedad")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoPaisConstitucionSociedad;
    @XmlElement(name = "CodigoFondoComunInversion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoFondoComunInversion;
    @XmlElement(name = "MarcaDuracionContratoSociedad")
    protected String marcaDuracionContratoSociedad;
    @XmlElement(name = "FechaCierreEjercicio")
    protected String fechaCierreEjercicio;
    @XmlElement(name = "ObjetoSocial")
    protected String objetoSocial;
    @XmlElement(name = "DescripcionDuracionContratoSociedad")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String descripcionDuracionContratoSociedad;

    /**
     * Obtiene el valor de la propiedad fechaContrato.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaContrato() {
        return fechaContrato;
    }

    /**
     * Define el valor de la propiedad fechaContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaContrato(XMLGregorianCalendar value) {
        this.fechaContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Define el valor de la propiedad fechaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInscripcion(XMLGregorianCalendar value) {
        this.fechaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoActa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoActa() {
        return fechaVencimientoActa;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoActa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoActa(XMLGregorianCalendar value) {
        this.fechaVencimientoActa = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoContrato.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoContrato() {
        return fechaVencimientoContrato;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoContrato(XMLGregorianCalendar value) {
        this.fechaVencimientoContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInscripcion() {
        return tipoInscripcion;
    }

    /**
     * Define el valor de la propiedad tipoInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInscripcion(String value) {
        this.tipoInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    /**
     * Define el valor de la propiedad numeroInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInscripcion(String value) {
        this.numeroInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad tomoLibroFolioInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomoLibroFolioInscripcion() {
        return tomoLibroFolioInscripcion;
    }

    /**
     * Define el valor de la propiedad tomoLibroFolioInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomoLibroFolioInscripcion(String value) {
        this.tomoLibroFolioInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoJurisdiccionInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoJurisdiccionInscripcion() {
        return codigoJurisdiccionInscripcion;
    }

    /**
     * Define el valor de la propiedad codigoJurisdiccionInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoJurisdiccionInscripcion(String value) {
        this.codigoJurisdiccionInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleJurisdiccionInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleJurisdiccionInscripcion() {
        return detalleJurisdiccionInscripcion;
    }

    /**
     * Define el valor de la propiedad detalleJurisdiccionInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleJurisdiccionInscripcion(String value) {
        this.detalleJurisdiccionInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAFJP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAFJP() {
        return codigoAFJP;
    }

    /**
     * Define el valor de la propiedad codigoAFJP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAFJP(String value) {
        this.codigoAFJP = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreContacto() {
        return nombreContacto;
    }

    /**
     * Define el valor de la propiedad nombreContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreContacto(String value) {
        this.nombreContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoContacto.
     * 
     * @return
     *     possible object is
     *     {@link TelefonoBasico }
     *     
     */
    public TelefonoBasico getTelefonoContacto() {
        return telefonoContacto;
    }

    /**
     * Define el valor de la propiedad telefonoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonoBasico }
     *     
     */
    public void setTelefonoContacto(TelefonoBasico value) {
        this.telefonoContacto = value;
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

    /**
     * Obtiene el valor de la propiedad codigoPaisConstitucionSociedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisConstitucionSociedad() {
        return codigoPaisConstitucionSociedad;
    }

    /**
     * Define el valor de la propiedad codigoPaisConstitucionSociedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisConstitucionSociedad(String value) {
        this.codigoPaisConstitucionSociedad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoFondoComunInversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFondoComunInversion() {
        return codigoFondoComunInversion;
    }

    /**
     * Define el valor de la propiedad codigoFondoComunInversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFondoComunInversion(String value) {
        this.codigoFondoComunInversion = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaDuracionContratoSociedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaDuracionContratoSociedad() {
        return marcaDuracionContratoSociedad;
    }

    /**
     * Define el valor de la propiedad marcaDuracionContratoSociedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaDuracionContratoSociedad(String value) {
        this.marcaDuracionContratoSociedad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCierreEjercicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCierreEjercicio() {
        return fechaCierreEjercicio;
    }

    /**
     * Define el valor de la propiedad fechaCierreEjercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCierreEjercicio(String value) {
        this.fechaCierreEjercicio = value;
    }

    /**
     * Obtiene el valor de la propiedad objetoSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoSocial() {
        return objetoSocial;
    }

    /**
     * Define el valor de la propiedad objetoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoSocial(String value) {
        this.objetoSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionDuracionContratoSociedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionDuracionContratoSociedad() {
        return descripcionDuracionContratoSociedad;
    }

    /**
     * Define el valor de la propiedad descripcionDuracionContratoSociedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionDuracionContratoSociedad(String value) {
        this.descripcionDuracionContratoSociedad = value;
    }

}
