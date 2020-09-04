
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienteresponse._4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.persona._1_0_0.Persona;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.PersonaFisica;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.PersonaJuridica;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.BGBAResultadoOperacion;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.BGBAResultadoOperacionLog;


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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0}BGBAResultadoOperacion"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}Persona" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}PersonaFisica" minOccurs="0"/&gt;
 *           &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}PersonaJuridica" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0}BGBAResultadoOperacionLog"/&gt;
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
    "bgbaResultadoOperacion",
    "persona",
    "personaFisica",
    "personaJuridica",
    "bgbaResultadoOperacionLog"
})
@XmlRootElement(name = "ObtenerClienteResponse")
public class ObtenerClienteResponse {

    @XmlElement(name = "BGBAResultadoOperacion", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0", required = true)
    protected BGBAResultadoOperacion bgbaResultadoOperacion;
    @XmlElement(name = "Persona", namespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0")
    protected Persona persona;
    @XmlElement(name = "PersonaFisica", namespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0")
    protected PersonaFisica personaFisica;
    @XmlElement(name = "PersonaJuridica", namespace = "http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0")
    protected PersonaJuridica personaJuridica;
    @XmlElement(name = "BGBAResultadoOperacionLog", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0", required = true)
    protected BGBAResultadoOperacionLog bgbaResultadoOperacionLog;

    /**
     * Obtiene el valor de la propiedad bgbaResultadoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link BGBAResultadoOperacion }
     *     
     */
    public BGBAResultadoOperacion getBGBAResultadoOperacion() {
        return bgbaResultadoOperacion;
    }

    /**
     * Define el valor de la propiedad bgbaResultadoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BGBAResultadoOperacion }
     *     
     */
    public void setBGBAResultadoOperacion(BGBAResultadoOperacion value) {
        this.bgbaResultadoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad persona.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Define el valor de la propiedad persona.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersona(Persona value) {
        this.persona = value;
    }

    /**
     * Obtiene el valor de la propiedad personaFisica.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisica }
     *     
     */
    public PersonaFisica getPersonaFisica() {
        return personaFisica;
    }

    /**
     * Define el valor de la propiedad personaFisica.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisica }
     *     
     */
    public void setPersonaFisica(PersonaFisica value) {
        this.personaFisica = value;
    }

    /**
     * Obtiene el valor de la propiedad personaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link PersonaJuridica }
     *     
     */
    public PersonaJuridica getPersonaJuridica() {
        return personaJuridica;
    }

    /**
     * Define el valor de la propiedad personaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaJuridica }
     *     
     */
    public void setPersonaJuridica(PersonaJuridica value) {
        this.personaJuridica = value;
    }

    /**
     * Obtiene el valor de la propiedad bgbaResultadoOperacionLog.
     * 
     * @return
     *     possible object is
     *     {@link BGBAResultadoOperacionLog }
     *     
     */
    public BGBAResultadoOperacionLog getBGBAResultadoOperacionLog() {
        return bgbaResultadoOperacionLog;
    }

    /**
     * Define el valor de la propiedad bgbaResultadoOperacionLog.
     * 
     * @param value
     *     allowed object is
     *     {@link BGBAResultadoOperacionLog }
     *     
     */
    public void setBGBAResultadoOperacionLog(BGBAResultadoOperacionLog value) {
        this.bgbaResultadoOperacionLog = value;
    }

}
