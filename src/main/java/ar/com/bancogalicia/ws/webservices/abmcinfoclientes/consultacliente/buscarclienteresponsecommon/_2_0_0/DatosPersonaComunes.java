
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteresponsecommon._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigo;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Id;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.TelefonoBasico;
import ar.com.bancogalicia.ws.webservices.globales.bgbatipossoporte._2_0_0.DomicilioFisicoConVacios;


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
 *         &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id"/&gt;
 *         &lt;element name="Domicilio" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}domicilioFisicoConVacios"/&gt;
 *         &lt;element name="CodigoUso" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico_0_2"/&gt;
 *         &lt;element name="Telefono" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}telefonoBasico" minOccurs="0"/&gt;
 *         &lt;element name="IdPreferPrivate" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}numeric9"/&gt;
 *         &lt;element name="IdentificacionTributariaTipo" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico_0_2"/&gt;
 *         &lt;element name="IdentificacionTributariaNumero" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico_0_15"/&gt;
 *         &lt;element name="CodigoCondicionImpositiva" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
 *         &lt;element name="CodigoUnidadDeNegocio" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo" minOccurs="0"/&gt;
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
    "idPersona",
    "domicilio",
    "codigoUso",
    "telefono",
    "idPreferPrivate",
    "identificacionTributariaTipo",
    "identificacionTributariaNumero",
    "codigoCondicionImpositiva",
    "codigoUnidadDeNegocio"
})
@XmlRootElement(name = "DatosPersonaComunes")
public class DatosPersonaComunes {

    @XmlElement(name = "IdPersona", required = true)
    protected Id idPersona;
    @XmlElement(name = "Domicilio", required = true)
    protected DomicilioFisicoConVacios domicilio;
    @XmlElement(name = "CodigoUso", required = true)
    protected String codigoUso;
    @XmlElement(name = "Telefono")
    protected TelefonoBasico telefono;
    @XmlElement(name = "IdPreferPrivate")
    @XmlSchemaType(name = "unsignedLong")
    protected int idPreferPrivate;
    @XmlElement(name = "IdentificacionTributariaTipo", required = true)
    protected String identificacionTributariaTipo;
    @XmlElement(name = "IdentificacionTributariaNumero", required = true)
    protected String identificacionTributariaNumero;
    @XmlElement(name = "CodigoCondicionImpositiva", required = true)
    protected Codigo codigoCondicionImpositiva;
    @XmlElement(name = "CodigoUnidadDeNegocio")
    protected Codigo codigoUnidadDeNegocio;

    /**
     * Obtiene el valor de la propiedad idPersona.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getIdPersona() {
        return idPersona;
    }

    /**
     * Define el valor de la propiedad idPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setIdPersona(Id value) {
        this.idPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioFisicoConVacios }
     *     
     */
    public DomicilioFisicoConVacios getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioFisicoConVacios }
     *     
     */
    public void setDomicilio(DomicilioFisicoConVacios value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUso() {
        return codigoUso;
    }

    /**
     * Define el valor de la propiedad codigoUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUso(String value) {
        this.codigoUso = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link TelefonoBasico }
     *     
     */
    public TelefonoBasico getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonoBasico }
     *     
     */
    public void setTelefono(TelefonoBasico value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad idPreferPrivate.
     * 
     */
    public int getIdPreferPrivate() {
        return idPreferPrivate;
    }

    /**
     * Define el valor de la propiedad idPreferPrivate.
     * 
     */
    public void setIdPreferPrivate(int value) {
        this.idPreferPrivate = value;
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
     * Obtiene el valor de la propiedad codigoCondicionImpositiva.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigoCondicionImpositiva() {
        return codigoCondicionImpositiva;
    }

    /**
     * Define el valor de la propiedad codigoCondicionImpositiva.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigoCondicionImpositiva(Codigo value) {
        this.codigoCondicionImpositiva = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUnidadDeNegocio.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigoUnidadDeNegocio() {
        return codigoUnidadDeNegocio;
    }

    /**
     * Define el valor de la propiedad codigoUnidadDeNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigoUnidadDeNegocio(Codigo value) {
        this.codigoUnidadDeNegocio = value;
    }

}
