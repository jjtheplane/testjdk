
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.persona._1_0_0.VerificacionScoring;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Periodo;


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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}Basicos" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}Organizacion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}NombresAdicionales" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}Domicilio" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}Telefonos" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}Email" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}Fax" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}UIFTipoCLiente" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}UIFPerfilCliente" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosComerciales" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}Proveedor" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}ImpuestosSellos" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}ExencionRetencionIVA" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}ExencionRetencionGanancias" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}ExencionRetencionIBR" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}ClasificacionRiesgo" minOccurs="0"/&gt;
 *         &lt;element name="ConstanciaInscripcionIVA" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}periodo" minOccurs="0"/&gt;
 *         &lt;element name="ConstanciaInscripcionGanancias" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}periodo" minOccurs="0"/&gt;
 *         &lt;element name="ConstanciaInscripcionMonotributo" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}periodo" minOccurs="0"/&gt;
 *         &lt;element name="VerificacionScoring" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}verificacionScoring" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}CandadoImpositivo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}Segmentacion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosSectorContable" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosActividadAFIP" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosAtencionPreferencial" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosPerfilCliente" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosClienteReal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosPosesionEmail" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosTributariosExterior" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosIERIC" minOccurs="0"/&gt;
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
    "basicos",
    "organizacion",
    "nombresAdicionales",
    "domicilio",
    "telefonos",
    "email",
    "fax",
    "uifTipoCLiente",
    "uifPerfilCliente",
    "datosComerciales",
    "proveedor",
    "impuestosSellos",
    "exencionRetencionIVA",
    "exencionRetencionGanancias",
    "exencionRetencionIBR",
    "clasificacionRiesgo",
    "constanciaInscripcionIVA",
    "constanciaInscripcionGanancias",
    "constanciaInscripcionMonotributo",
    "verificacionScoring",
    "candadoImpositivo",
    "segmentacion",
    "datosSectorContable",
    "datosActividadAFIP",
    "datosAtencionPreferencial",
    "datosPerfilCliente",
    "datosClienteReal",
    "datosPosesionEmail",
    "datosTributariosExterior",
    "datosIERIC"
})
@XmlRootElement(name = "PersonaJuridica")
public class PersonaJuridica {

    @XmlElement(name = "Basicos")
    protected Basicos basicos;
    @XmlElement(name = "Organizacion")
    protected Organizacion organizacion;
    @XmlElement(name = "NombresAdicionales")
    protected NombresAdicionales nombresAdicionales;
    @XmlElement(name = "Domicilio")
    protected Domicilio domicilio;
    @XmlElement(name = "Telefonos")
    protected Telefonos telefonos;
    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "Fax")
    protected TelefonoBasico fax;
    @XmlElement(name = "UIFTipoCLiente")
    protected UIFTipoCLiente uifTipoCLiente;
    @XmlElement(name = "UIFPerfilCliente")
    protected UIFPerfilCliente uifPerfilCliente;
    @XmlElement(name = "DatosComerciales")
    protected DatosComerciales datosComerciales;
    @XmlElement(name = "Proveedor")
    protected Proveedor proveedor;
    @XmlElement(name = "ImpuestosSellos")
    protected ImpuestosSellos impuestosSellos;
    @XmlElement(name = "ExencionRetencionIVA")
    protected ExencionRetencionIVA exencionRetencionIVA;
    @XmlElement(name = "ExencionRetencionGanancias")
    protected ExencionRetencionGanancias exencionRetencionGanancias;
    @XmlElement(name = "ExencionRetencionIBR")
    protected ExencionRetencionIBR exencionRetencionIBR;
    @XmlElement(name = "ClasificacionRiesgo")
    protected ClasificacionRiesgo clasificacionRiesgo;
    @XmlElement(name = "ConstanciaInscripcionIVA")
    protected Periodo constanciaInscripcionIVA;
    @XmlElement(name = "ConstanciaInscripcionGanancias")
    protected Periodo constanciaInscripcionGanancias;
    @XmlElement(name = "ConstanciaInscripcionMonotributo")
    protected Periodo constanciaInscripcionMonotributo;
    @XmlElement(name = "VerificacionScoring")
    protected VerificacionScoring verificacionScoring;
    @XmlElement(name = "CandadoImpositivo")
    protected CandadoImpositivo candadoImpositivo;
    @XmlElement(name = "Segmentacion")
    protected Segmentacion segmentacion;
    @XmlElement(name = "DatosSectorContable")
    protected DatosSectorContable datosSectorContable;
    @XmlElement(name = "DatosActividadAFIP")
    protected DatosActividadAFIP datosActividadAFIP;
    @XmlElement(name = "DatosAtencionPreferencial")
    protected DatosAtencionPreferencial datosAtencionPreferencial;
    @XmlElement(name = "DatosPerfilCliente")
    protected DatosPerfilCliente datosPerfilCliente;
    @XmlElement(name = "DatosClienteReal")
    protected DatosClienteReal datosClienteReal;
    @XmlElement(name = "DatosPosesionEmail")
    protected DatosPosesionEmail datosPosesionEmail;
    @XmlElement(name = "DatosTributariosExterior")
    protected DatosTributariosExterior datosTributariosExterior;
    @XmlElement(name = "DatosIERIC")
    protected DatosIERIC datosIERIC;

    /**
     * Obtiene el valor de la propiedad basicos.
     * 
     * @return
     *     possible object is
     *     {@link Basicos }
     *     
     */
    public Basicos getBasicos() {
        return basicos;
    }

    /**
     * Define el valor de la propiedad basicos.
     * 
     * @param value
     *     allowed object is
     *     {@link Basicos }
     *     
     */
    public void setBasicos(Basicos value) {
        this.basicos = value;
    }

    /**
     * Obtiene el valor de la propiedad organizacion.
     * 
     * @return
     *     possible object is
     *     {@link Organizacion }
     *     
     */
    public Organizacion getOrganizacion() {
        return organizacion;
    }

    /**
     * Define el valor de la propiedad organizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Organizacion }
     *     
     */
    public void setOrganizacion(Organizacion value) {
        this.organizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link NombresAdicionales }
     *     
     */
    public NombresAdicionales getNombresAdicionales() {
        return nombresAdicionales;
    }

    /**
     * Define el valor de la propiedad nombresAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link NombresAdicionales }
     *     
     */
    public void setNombresAdicionales(NombresAdicionales value) {
        this.nombresAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link Domicilio }
     *     
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link Domicilio }
     *     
     */
    public void setDomicilio(Domicilio value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonos.
     * 
     * @return
     *     possible object is
     *     {@link Telefonos }
     *     
     */
    public Telefonos getTelefonos() {
        return telefonos;
    }

    /**
     * Define el valor de la propiedad telefonos.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefonos }
     *     
     */
    public void setTelefonos(Telefonos value) {
        this.telefonos = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link TelefonoBasico }
     *     
     */
    public TelefonoBasico getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonoBasico }
     *     
     */
    public void setFax(TelefonoBasico value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad uifTipoCLiente.
     * 
     * @return
     *     possible object is
     *     {@link UIFTipoCLiente }
     *     
     */
    public UIFTipoCLiente getUIFTipoCLiente() {
        return uifTipoCLiente;
    }

    /**
     * Define el valor de la propiedad uifTipoCLiente.
     * 
     * @param value
     *     allowed object is
     *     {@link UIFTipoCLiente }
     *     
     */
    public void setUIFTipoCLiente(UIFTipoCLiente value) {
        this.uifTipoCLiente = value;
    }

    /**
     * Obtiene el valor de la propiedad uifPerfilCliente.
     * 
     * @return
     *     possible object is
     *     {@link UIFPerfilCliente }
     *     
     */
    public UIFPerfilCliente getUIFPerfilCliente() {
        return uifPerfilCliente;
    }

    /**
     * Define el valor de la propiedad uifPerfilCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link UIFPerfilCliente }
     *     
     */
    public void setUIFPerfilCliente(UIFPerfilCliente value) {
        this.uifPerfilCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad datosComerciales.
     * 
     * @return
     *     possible object is
     *     {@link DatosComerciales }
     *     
     */
    public DatosComerciales getDatosComerciales() {
        return datosComerciales;
    }

    /**
     * Define el valor de la propiedad datosComerciales.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosComerciales }
     *     
     */
    public void setDatosComerciales(DatosComerciales value) {
        this.datosComerciales = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link Proveedor }
     *     
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Proveedor }
     *     
     */
    public void setProveedor(Proveedor value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosSellos.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosSellos }
     *     
     */
    public ImpuestosSellos getImpuestosSellos() {
        return impuestosSellos;
    }

    /**
     * Define el valor de la propiedad impuestosSellos.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosSellos }
     *     
     */
    public void setImpuestosSellos(ImpuestosSellos value) {
        this.impuestosSellos = value;
    }

    /**
     * Obtiene el valor de la propiedad exencionRetencionIVA.
     * 
     * @return
     *     possible object is
     *     {@link ExencionRetencionIVA }
     *     
     */
    public ExencionRetencionIVA getExencionRetencionIVA() {
        return exencionRetencionIVA;
    }

    /**
     * Define el valor de la propiedad exencionRetencionIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link ExencionRetencionIVA }
     *     
     */
    public void setExencionRetencionIVA(ExencionRetencionIVA value) {
        this.exencionRetencionIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad exencionRetencionGanancias.
     * 
     * @return
     *     possible object is
     *     {@link ExencionRetencionGanancias }
     *     
     */
    public ExencionRetencionGanancias getExencionRetencionGanancias() {
        return exencionRetencionGanancias;
    }

    /**
     * Define el valor de la propiedad exencionRetencionGanancias.
     * 
     * @param value
     *     allowed object is
     *     {@link ExencionRetencionGanancias }
     *     
     */
    public void setExencionRetencionGanancias(ExencionRetencionGanancias value) {
        this.exencionRetencionGanancias = value;
    }

    /**
     * Obtiene el valor de la propiedad exencionRetencionIBR.
     * 
     * @return
     *     possible object is
     *     {@link ExencionRetencionIBR }
     *     
     */
    public ExencionRetencionIBR getExencionRetencionIBR() {
        return exencionRetencionIBR;
    }

    /**
     * Define el valor de la propiedad exencionRetencionIBR.
     * 
     * @param value
     *     allowed object is
     *     {@link ExencionRetencionIBR }
     *     
     */
    public void setExencionRetencionIBR(ExencionRetencionIBR value) {
        this.exencionRetencionIBR = value;
    }

    /**
     * Obtiene el valor de la propiedad clasificacionRiesgo.
     * 
     * @return
     *     possible object is
     *     {@link ClasificacionRiesgo }
     *     
     */
    public ClasificacionRiesgo getClasificacionRiesgo() {
        return clasificacionRiesgo;
    }

    /**
     * Define el valor de la propiedad clasificacionRiesgo.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasificacionRiesgo }
     *     
     */
    public void setClasificacionRiesgo(ClasificacionRiesgo value) {
        this.clasificacionRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad constanciaInscripcionIVA.
     * 
     * @return
     *     possible object is
     *     {@link Periodo }
     *     
     */
    public Periodo getConstanciaInscripcionIVA() {
        return constanciaInscripcionIVA;
    }

    /**
     * Define el valor de la propiedad constanciaInscripcionIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodo }
     *     
     */
    public void setConstanciaInscripcionIVA(Periodo value) {
        this.constanciaInscripcionIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad constanciaInscripcionGanancias.
     * 
     * @return
     *     possible object is
     *     {@link Periodo }
     *     
     */
    public Periodo getConstanciaInscripcionGanancias() {
        return constanciaInscripcionGanancias;
    }

    /**
     * Define el valor de la propiedad constanciaInscripcionGanancias.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodo }
     *     
     */
    public void setConstanciaInscripcionGanancias(Periodo value) {
        this.constanciaInscripcionGanancias = value;
    }

    /**
     * Obtiene el valor de la propiedad constanciaInscripcionMonotributo.
     * 
     * @return
     *     possible object is
     *     {@link Periodo }
     *     
     */
    public Periodo getConstanciaInscripcionMonotributo() {
        return constanciaInscripcionMonotributo;
    }

    /**
     * Define el valor de la propiedad constanciaInscripcionMonotributo.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodo }
     *     
     */
    public void setConstanciaInscripcionMonotributo(Periodo value) {
        this.constanciaInscripcionMonotributo = value;
    }

    /**
     * Obtiene el valor de la propiedad verificacionScoring.
     * 
     * @return
     *     possible object is
     *     {@link VerificacionScoring }
     *     
     */
    public VerificacionScoring getVerificacionScoring() {
        return verificacionScoring;
    }

    /**
     * Define el valor de la propiedad verificacionScoring.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificacionScoring }
     *     
     */
    public void setVerificacionScoring(VerificacionScoring value) {
        this.verificacionScoring = value;
    }

    /**
     * Obtiene el valor de la propiedad candadoImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link CandadoImpositivo }
     *     
     */
    public CandadoImpositivo getCandadoImpositivo() {
        return candadoImpositivo;
    }

    /**
     * Define el valor de la propiedad candadoImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link CandadoImpositivo }
     *     
     */
    public void setCandadoImpositivo(CandadoImpositivo value) {
        this.candadoImpositivo = value;
    }

    /**
     * Obtiene el valor de la propiedad segmentacion.
     * 
     * @return
     *     possible object is
     *     {@link Segmentacion }
     *     
     */
    public Segmentacion getSegmentacion() {
        return segmentacion;
    }

    /**
     * Define el valor de la propiedad segmentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Segmentacion }
     *     
     */
    public void setSegmentacion(Segmentacion value) {
        this.segmentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datosSectorContable.
     * 
     * @return
     *     possible object is
     *     {@link DatosSectorContable }
     *     
     */
    public DatosSectorContable getDatosSectorContable() {
        return datosSectorContable;
    }

    /**
     * Define el valor de la propiedad datosSectorContable.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSectorContable }
     *     
     */
    public void setDatosSectorContable(DatosSectorContable value) {
        this.datosSectorContable = value;
    }

    /**
     * Obtiene el valor de la propiedad datosActividadAFIP.
     * 
     * @return
     *     possible object is
     *     {@link DatosActividadAFIP }
     *     
     */
    public DatosActividadAFIP getDatosActividadAFIP() {
        return datosActividadAFIP;
    }

    /**
     * Define el valor de la propiedad datosActividadAFIP.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosActividadAFIP }
     *     
     */
    public void setDatosActividadAFIP(DatosActividadAFIP value) {
        this.datosActividadAFIP = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAtencionPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link DatosAtencionPreferencial }
     *     
     */
    public DatosAtencionPreferencial getDatosAtencionPreferencial() {
        return datosAtencionPreferencial;
    }

    /**
     * Define el valor de la propiedad datosAtencionPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosAtencionPreferencial }
     *     
     */
    public void setDatosAtencionPreferencial(DatosAtencionPreferencial value) {
        this.datosAtencionPreferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPerfilCliente.
     * 
     * @return
     *     possible object is
     *     {@link DatosPerfilCliente }
     *     
     */
    public DatosPerfilCliente getDatosPerfilCliente() {
        return datosPerfilCliente;
    }

    /**
     * Define el valor de la propiedad datosPerfilCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPerfilCliente }
     *     
     */
    public void setDatosPerfilCliente(DatosPerfilCliente value) {
        this.datosPerfilCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad datosClienteReal.
     * 
     * @return
     *     possible object is
     *     {@link DatosClienteReal }
     *     
     */
    public DatosClienteReal getDatosClienteReal() {
        return datosClienteReal;
    }

    /**
     * Define el valor de la propiedad datosClienteReal.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosClienteReal }
     *     
     */
    public void setDatosClienteReal(DatosClienteReal value) {
        this.datosClienteReal = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPosesionEmail.
     * 
     * @return
     *     possible object is
     *     {@link DatosPosesionEmail }
     *     
     */
    public DatosPosesionEmail getDatosPosesionEmail() {
        return datosPosesionEmail;
    }

    /**
     * Define el valor de la propiedad datosPosesionEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPosesionEmail }
     *     
     */
    public void setDatosPosesionEmail(DatosPosesionEmail value) {
        this.datosPosesionEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad datosTributariosExterior.
     * 
     * @return
     *     possible object is
     *     {@link DatosTributariosExterior }
     *     
     */
    public DatosTributariosExterior getDatosTributariosExterior() {
        return datosTributariosExterior;
    }

    /**
     * Define el valor de la propiedad datosTributariosExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosTributariosExterior }
     *     
     */
    public void setDatosTributariosExterior(DatosTributariosExterior value) {
        this.datosTributariosExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad datosIERIC.
     * 
     * @return
     *     possible object is
     *     {@link DatosIERIC }
     *     
     */
    public DatosIERIC getDatosIERIC() {
        return datosIERIC;
    }

    /**
     * Define el valor de la propiedad datosIERIC.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosIERIC }
     *     
     */
    public void setDatosIERIC(DatosIERIC value) {
        this.datosIERIC = value;
    }

}
