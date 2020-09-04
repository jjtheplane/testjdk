
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}Documentos"/&gt;
 *         &lt;element name="NombrePersona" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}nombrePersonaFisica" minOccurs="0"/&gt;
 *         &lt;element name="CodigoSexo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}DatosNacimiento"/&gt;
 *         &lt;element name="CodigoProfesion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoEjerceProfesion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoSItuacionLaboral" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoActividadPrincipal" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoRelacionVivienda" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PatrimonioNeto" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal14_2" minOccurs="0"/&gt;
 *         &lt;element name="IngresosAnuales" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal14_2" minOccurs="0"/&gt;
 *         &lt;element name="CantidadPersonalOcupado" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="TipoOrganizacionInternaCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOrganizacionInternaCredito" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionTributariaTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionTributariaNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionImpositivaGanancias" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MarcaPracticaAjuste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionImpositivaIVA" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionImpositivaIBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoJurisdiccionIBR" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NumeroIdentificacionIBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroImportadorExportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroRegistroIndustria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoEmpleadoBGBA" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Legajo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="FechaAltaPersona" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "documentos",
    "nombrePersona",
    "codigoSexo",
    "codigoEstadoCivil",
    "datosNacimiento",
    "codigoProfesion",
    "codigoEjerceProfesion",
    "codigoSItuacionLaboral",
    "codigoActividadPrincipal",
    "codigoRelacionVivienda",
    "patrimonioNeto",
    "ingresosAnuales",
    "cantidadPersonalOcupado",
    "tipoOrganizacionInternaCredito",
    "codigoOrganizacionInternaCredito",
    "identificacionTributariaTipo",
    "identificacionTributariaNumero",
    "codigoCondicionImpositivaGanancias",
    "marcaPracticaAjuste",
    "codigoCondicionImpositivaIVA",
    "codigoCondicionImpositivaIBR",
    "codigoJurisdiccionIBR",
    "numeroIdentificacionIBR",
    "numeroImportadorExportador",
    "numeroRegistroIndustria",
    "codigoEmpleadoBGBA",
    "legajo",
    "fechaAltaPersona",
    "codigoPreferPrivate",
    "fechaUltimaCalificacionPreferPrivate"
})
@XmlRootElement(name = "Basicos")
public class Basicos {

    @XmlElement(name = "Documentos", required = true)
    protected Documentos documentos;
    @XmlElement(name = "NombrePersona")
    protected NombrePersonaFisica nombrePersona;
    @XmlElement(name = "CodigoSexo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoSexo;
    @XmlElement(name = "CodigoEstadoCivil")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoEstadoCivil;
    @XmlElement(name = "DatosNacimiento", required = true)
    protected DatosNacimiento datosNacimiento;
    @XmlElement(name = "CodigoProfesion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoProfesion;
    @XmlElement(name = "CodigoEjerceProfesion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoEjerceProfesion;
    @XmlElement(name = "CodigoSItuacionLaboral")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoSItuacionLaboral;
    @XmlElement(name = "CodigoActividadPrincipal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoActividadPrincipal;
    @XmlElement(name = "CodigoRelacionVivienda")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoRelacionVivienda;
    @XmlElement(name = "PatrimonioNeto")
    protected BigDecimal patrimonioNeto;
    @XmlElement(name = "IngresosAnuales")
    protected BigDecimal ingresosAnuales;
    @XmlElement(name = "CantidadPersonalOcupado")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger cantidadPersonalOcupado;
    @XmlElement(name = "TipoOrganizacionInternaCredito")
    protected String tipoOrganizacionInternaCredito;
    @XmlElement(name = "CodigoOrganizacionInternaCredito")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoOrganizacionInternaCredito;
    @XmlElement(name = "IdentificacionTributariaTipo")
    protected String identificacionTributariaTipo;
    @XmlElement(name = "IdentificacionTributariaNumero")
    protected String identificacionTributariaNumero;
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
    protected String codigoCondicionImpositivaIBR;
    @XmlElement(name = "CodigoJurisdiccionIBR")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoJurisdiccionIBR;
    @XmlElement(name = "NumeroIdentificacionIBR")
    protected String numeroIdentificacionIBR;
    @XmlElement(name = "NumeroImportadorExportador")
    protected String numeroImportadorExportador;
    @XmlElement(name = "NumeroRegistroIndustria")
    protected String numeroRegistroIndustria;
    @XmlElement(name = "CodigoEmpleadoBGBA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoEmpleadoBGBA;
    @XmlElement(name = "Legajo")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger legajo;
    @XmlElement(name = "FechaAltaPersona")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaAltaPersona;
    @XmlElement(name = "CodigoPreferPrivate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoPreferPrivate;
    @XmlElement(name = "FechaUltimaCalificacionPreferPrivate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaCalificacionPreferPrivate;

    /**
     * Obtiene el valor de la propiedad documentos.
     * 
     * @return
     *     possible object is
     *     {@link Documentos }
     *     
     */
    public Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Define el valor de la propiedad documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentos }
     *     
     */
    public void setDocumentos(Documentos value) {
        this.documentos = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePersona.
     * 
     * @return
     *     possible object is
     *     {@link NombrePersonaFisica }
     *     
     */
    public NombrePersonaFisica getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Define el valor de la propiedad nombrePersona.
     * 
     * @param value
     *     allowed object is
     *     {@link NombrePersonaFisica }
     *     
     */
    public void setNombrePersona(NombrePersonaFisica value) {
        this.nombrePersona = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSexo() {
        return codigoSexo;
    }

    /**
     * Define el valor de la propiedad codigoSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSexo(String value) {
        this.codigoSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    /**
     * Define el valor de la propiedad codigoEstadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstadoCivil(String value) {
        this.codigoEstadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad datosNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link DatosNacimiento }
     *     
     */
    public DatosNacimiento getDatosNacimiento() {
        return datosNacimiento;
    }

    /**
     * Define el valor de la propiedad datosNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosNacimiento }
     *     
     */
    public void setDatosNacimiento(DatosNacimiento value) {
        this.datosNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProfesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProfesion() {
        return codigoProfesion;
    }

    /**
     * Define el valor de la propiedad codigoProfesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProfesion(String value) {
        this.codigoProfesion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEjerceProfesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEjerceProfesion() {
        return codigoEjerceProfesion;
    }

    /**
     * Define el valor de la propiedad codigoEjerceProfesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEjerceProfesion(String value) {
        this.codigoEjerceProfesion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSItuacionLaboral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSItuacionLaboral() {
        return codigoSItuacionLaboral;
    }

    /**
     * Define el valor de la propiedad codigoSItuacionLaboral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSItuacionLaboral(String value) {
        this.codigoSItuacionLaboral = value;
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
     * Obtiene el valor de la propiedad codigoRelacionVivienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRelacionVivienda() {
        return codigoRelacionVivienda;
    }

    /**
     * Define el valor de la propiedad codigoRelacionVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRelacionVivienda(String value) {
        this.codigoRelacionVivienda = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadPersonalOcupado() {
        return cantidadPersonalOcupado;
    }

    /**
     * Define el valor de la propiedad cantidadPersonalOcupado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadPersonalOcupado(BigInteger value) {
        this.cantidadPersonalOcupado = value;
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
     * Obtiene el valor de la propiedad codigoEmpleadoBGBA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmpleadoBGBA() {
        return codigoEmpleadoBGBA;
    }

    /**
     * Define el valor de la propiedad codigoEmpleadoBGBA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmpleadoBGBA(String value) {
        this.codigoEmpleadoBGBA = value;
    }

    /**
     * Obtiene el valor de la propiedad legajo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegajo() {
        return legajo;
    }

    /**
     * Define el valor de la propiedad legajo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegajo(BigInteger value) {
        this.legajo = value;
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
