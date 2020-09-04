
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import java.math.BigDecimal;
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
 *         &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NaturalezaJuridica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PatrimonioNeto" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}decimal14_2" minOccurs="0"/&gt;
 *         &lt;element name="IngresosAnuales" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}decimal14_2" minOccurs="0"/&gt;
 *         &lt;element name="CantidadPersonalOcupado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoActividadPrincipal" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicioActividadPrincipal" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TipoOrganizacionInternaCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOrganizacionInternaCredito" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionImpositivaGanancias" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MarcaPracticaAjuste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionImpositivaIVA" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionImpositivaIBR" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoJurisdiccionIBR" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NumeroIdentificacionIBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionTributariaTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionTributariaNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroImportadorExportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroRegistroIndustria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaAltaPersona" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPreferPrivate" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaCalificacionPreferPrivate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "tipoPersona",
    "naturalezaJuridica",
    "nombre",
    "patrimonioNeto",
    "ingresosAnuales",
    "cantidadPersonalOcupado",
    "codigoActividadPrincipal",
    "fechaInicioActividadPrincipal",
    "tipoOrganizacionInternaCredito",
    "codigoOrganizacionInternaCredito",
    "codigoCondicionImpositivaGanancias",
    "marcaPracticaAjuste",
    "codigoCondicionImpositivaIVA",
    "codigoCondicionImpositivaIBR",
    "codigoJurisdiccionIBR",
    "numeroIdentificacionIBR",
    "identificacionTributariaTipo",
    "identificacionTributariaNumero",
    "numeroImportadorExportador",
    "numeroRegistroIndustria",
    "fechaAltaPersona",
    "fechaUltimaActualizacion",
    "codigoPreferPrivate",
    "fechaUltimaCalificacionPreferPrivate"
})
@XmlRootElement(name = "Basicos")
public class Basicos {

    @XmlElement(name = "TipoPersona", required = true)
    protected String tipoPersona;
    @XmlElement(name = "NaturalezaJuridica", required = true)
    protected String naturalezaJuridica;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "PatrimonioNeto")
    protected BigDecimal patrimonioNeto;
    @XmlElement(name = "IngresosAnuales")
    protected BigDecimal ingresosAnuales;
    @XmlElement(name = "CantidadPersonalOcupado")
    protected String cantidadPersonalOcupado;
    @XmlElement(name = "CodigoActividadPrincipal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoActividadPrincipal;
    @XmlElement(name = "FechaInicioActividadPrincipal")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicioActividadPrincipal;
    @XmlElement(name = "TipoOrganizacionInternaCredito")
    protected String tipoOrganizacionInternaCredito;
    @XmlElement(name = "CodigoOrganizacionInternaCredito")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoOrganizacionInternaCredito;
    @XmlElement(name = "CodigoCondicionImpositivaGanancias")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoCondicionImpositivaGanancias;
    @XmlElement(name = "MarcaPracticaAjuste")
    protected String marcaPracticaAjuste;
    @XmlElement(name = "CodigoCondicionImpositivaIVA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoCondicionImpositivaIVA;
    @XmlElement(name = "CodigoCondicionImpositivaIBR")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoCondicionImpositivaIBR;
    @XmlElement(name = "CodigoJurisdiccionIBR")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoJurisdiccionIBR;
    @XmlElement(name = "NumeroIdentificacionIBR")
    protected String numeroIdentificacionIBR;
    @XmlElement(name = "IdentificacionTributariaTipo")
    protected String identificacionTributariaTipo;
    @XmlElement(name = "IdentificacionTributariaNumero")
    protected String identificacionTributariaNumero;
    @XmlElement(name = "NumeroImportadorExportador")
    protected String numeroImportadorExportador;
    @XmlElement(name = "NumeroRegistroIndustria")
    protected String numeroRegistroIndustria;
    @XmlElement(name = "FechaAltaPersona")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaAltaPersona;
    @XmlElement(name = "FechaUltimaActualizacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacion;
    @XmlElement(name = "CodigoPreferPrivate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoPreferPrivate;
    @XmlElement(name = "FechaUltimaCalificacionPreferPrivate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaCalificacionPreferPrivate;

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad naturalezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalezaJuridica() {
        return naturalezaJuridica;
    }

    /**
     * Define el valor de la propiedad naturalezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalezaJuridica(String value) {
        this.naturalezaJuridica = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad patrimonioNeto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPatrimonioNeto() {
        return patrimonioNeto;
    }

    /**
     * Define el valor de la propiedad patrimonioNeto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPatrimonioNeto(BigDecimal value) {
        this.patrimonioNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosAnuales.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosAnuales() {
        return ingresosAnuales;
    }

    /**
     * Define el valor de la propiedad ingresosAnuales.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosAnuales(BigDecimal value) {
        this.ingresosAnuales = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadPersonalOcupado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadPersonalOcupado() {
        return cantidadPersonalOcupado;
    }

    /**
     * Define el valor de la propiedad cantidadPersonalOcupado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadPersonalOcupado(String value) {
        this.cantidadPersonalOcupado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoActividadPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoActividadPrincipal() {
        return codigoActividadPrincipal;
    }

    /**
     * Define el valor de la propiedad codigoActividadPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoActividadPrincipal(String value) {
        this.codigoActividadPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioActividadPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioActividadPrincipal() {
        return fechaInicioActividadPrincipal;
    }

    /**
     * Define el valor de la propiedad fechaInicioActividadPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioActividadPrincipal(XMLGregorianCalendar value) {
        this.fechaInicioActividadPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOrganizacionInternaCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOrganizacionInternaCredito() {
        return tipoOrganizacionInternaCredito;
    }

    /**
     * Define el valor de la propiedad tipoOrganizacionInternaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOrganizacionInternaCredito(String value) {
        this.tipoOrganizacionInternaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOrganizacionInternaCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOrganizacionInternaCredito() {
        return codigoOrganizacionInternaCredito;
    }

    /**
     * Define el valor de la propiedad codigoOrganizacionInternaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOrganizacionInternaCredito(String value) {
        this.codigoOrganizacionInternaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCondicionImpositivaGanancias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCondicionImpositivaGanancias() {
        return codigoCondicionImpositivaGanancias;
    }

    /**
     * Define el valor de la propiedad codigoCondicionImpositivaGanancias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCondicionImpositivaGanancias(String value) {
        this.codigoCondicionImpositivaGanancias = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaPracticaAjuste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaPracticaAjuste() {
        return marcaPracticaAjuste;
    }

    /**
     * Define el valor de la propiedad marcaPracticaAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaPracticaAjuste(String value) {
        this.marcaPracticaAjuste = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCondicionImpositivaIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCondicionImpositivaIVA() {
        return codigoCondicionImpositivaIVA;
    }

    /**
     * Define el valor de la propiedad codigoCondicionImpositivaIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCondicionImpositivaIVA(String value) {
        this.codigoCondicionImpositivaIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCondicionImpositivaIBR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCondicionImpositivaIBR() {
        return codigoCondicionImpositivaIBR;
    }

    /**
     * Define el valor de la propiedad codigoCondicionImpositivaIBR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCondicionImpositivaIBR(String value) {
        this.codigoCondicionImpositivaIBR = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoJurisdiccionIBR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoJurisdiccionIBR() {
        return codigoJurisdiccionIBR;
    }

    /**
     * Define el valor de la propiedad codigoJurisdiccionIBR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoJurisdiccionIBR(String value) {
        this.codigoJurisdiccionIBR = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacionIBR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacionIBR() {
        return numeroIdentificacionIBR;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacionIBR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacionIBR(String value) {
        this.numeroIdentificacionIBR = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTributariaTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionTributariaTipo() {
        return identificacionTributariaTipo;
    }

    /**
     * Define el valor de la propiedad identificacionTributariaTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionTributariaTipo(String value) {
        this.identificacionTributariaTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTributariaNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionTributariaNumero() {
        return identificacionTributariaNumero;
    }

    /**
     * Define el valor de la propiedad identificacionTributariaNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionTributariaNumero(String value) {
        this.identificacionTributariaNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroImportadorExportador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroImportadorExportador() {
        return numeroImportadorExportador;
    }

    /**
     * Define el valor de la propiedad numeroImportadorExportador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroImportadorExportador(String value) {
        this.numeroImportadorExportador = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroRegistroIndustria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistroIndustria() {
        return numeroRegistroIndustria;
    }

    /**
     * Define el valor de la propiedad numeroRegistroIndustria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistroIndustria(String value) {
        this.numeroRegistroIndustria = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAltaPersona.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAltaPersona() {
        return fechaAltaPersona;
    }

    /**
     * Define el valor de la propiedad fechaAltaPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAltaPersona(XMLGregorianCalendar value) {
        this.fechaAltaPersona = value;
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
     * Obtiene el valor de la propiedad codigoPreferPrivate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPreferPrivate() {
        return codigoPreferPrivate;
    }

    /**
     * Define el valor de la propiedad codigoPreferPrivate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPreferPrivate(String value) {
        this.codigoPreferPrivate = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaCalificacionPreferPrivate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaCalificacionPreferPrivate() {
        return fechaUltimaCalificacionPreferPrivate;
    }

    /**
     * Define el valor de la propiedad fechaUltimaCalificacionPreferPrivate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaCalificacionPreferPrivate(XMLGregorianCalendar value) {
        this.fechaUltimaCalificacionPreferPrivate = value;
    }

}
