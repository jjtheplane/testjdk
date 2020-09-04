
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienterequest._4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="SolicitaDatosVinculos" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosAutonomo" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosPadron" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosAlerta" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosAuditoria" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosConyuge" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosSegmentacionVieja" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosOrigenTarjetaMIRA" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosCandado" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosClienteREAL" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosAnses" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosIERIC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "SolicitudDatosPersonaFisica")
public class SolicitudDatosPersonaFisica {

    @XmlElement(name = "SolicitaDatosVinculos")
    protected Boolean solicitaDatosVinculos;
    @XmlElement(name = "SolicitaDatosAutonomo")
    protected Boolean solicitaDatosAutonomo;
    @XmlElement(name = "SolicitaDatosPadron")
    protected Boolean solicitaDatosPadron;
    @XmlElement(name = "SolicitaDatosAlerta")
    protected Boolean solicitaDatosAlerta;
    @XmlElement(name = "SolicitaDatosAuditoria")
    protected Boolean solicitaDatosAuditoria;
    @XmlElement(name = "SolicitaDatosConyuge")
    protected Boolean solicitaDatosConyuge;
    @XmlElement(name = "SolicitaDatosSegmentacionVieja")
    protected Boolean solicitaDatosSegmentacionVieja;
    @XmlElement(name = "SolicitaDatosOrigenTarjetaMIRA")
    protected Boolean solicitaDatosOrigenTarjetaMIRA;
    @XmlElement(name = "SolicitaDatosCandado")
    protected Boolean solicitaDatosCandado;
    @XmlElement(name = "SolicitaDatosClienteREAL")
    protected Boolean solicitaDatosClienteREAL;
    @XmlElement(name = "SolicitaDatosAnses")
    protected Boolean solicitaDatosAnses;
    @XmlElement(name = "SolicitaDatosIERIC")
    protected Boolean solicitaDatosIERIC;

    /**
     * Obtiene el valor de la propiedad solicitaDatosVinculos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosVinculos() {
        return solicitaDatosVinculos;
    }

    /**
     * Define el valor de la propiedad solicitaDatosVinculos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosVinculos(Boolean value) {
        this.solicitaDatosVinculos = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosAutonomo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosAutonomo() {
        return solicitaDatosAutonomo;
    }

    /**
     * Define el valor de la propiedad solicitaDatosAutonomo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosAutonomo(Boolean value) {
        this.solicitaDatosAutonomo = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosPadron.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosPadron() {
        return solicitaDatosPadron;
    }

    /**
     * Define el valor de la propiedad solicitaDatosPadron.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosPadron(Boolean value) {
        this.solicitaDatosPadron = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosAlerta.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosAlerta() {
        return solicitaDatosAlerta;
    }

    /**
     * Define el valor de la propiedad solicitaDatosAlerta.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosAlerta(Boolean value) {
        this.solicitaDatosAlerta = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosAuditoria.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosAuditoria() {
        return solicitaDatosAuditoria;
    }

    /**
     * Define el valor de la propiedad solicitaDatosAuditoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosAuditoria(Boolean value) {
        this.solicitaDatosAuditoria = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosConyuge.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosConyuge() {
        return solicitaDatosConyuge;
    }

    /**
     * Define el valor de la propiedad solicitaDatosConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosConyuge(Boolean value) {
        this.solicitaDatosConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosSegmentacionVieja.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosSegmentacionVieja() {
        return solicitaDatosSegmentacionVieja;
    }

    /**
     * Define el valor de la propiedad solicitaDatosSegmentacionVieja.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosSegmentacionVieja(Boolean value) {
        this.solicitaDatosSegmentacionVieja = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosOrigenTarjetaMIRA.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosOrigenTarjetaMIRA() {
        return solicitaDatosOrigenTarjetaMIRA;
    }

    /**
     * Define el valor de la propiedad solicitaDatosOrigenTarjetaMIRA.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosOrigenTarjetaMIRA(Boolean value) {
        this.solicitaDatosOrigenTarjetaMIRA = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosCandado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosCandado() {
        return solicitaDatosCandado;
    }

    /**
     * Define el valor de la propiedad solicitaDatosCandado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosCandado(Boolean value) {
        this.solicitaDatosCandado = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosClienteREAL.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosClienteREAL() {
        return solicitaDatosClienteREAL;
    }

    /**
     * Define el valor de la propiedad solicitaDatosClienteREAL.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosClienteREAL(Boolean value) {
        this.solicitaDatosClienteREAL = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosAnses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosAnses() {
        return solicitaDatosAnses;
    }

    /**
     * Define el valor de la propiedad solicitaDatosAnses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosAnses(Boolean value) {
        this.solicitaDatosAnses = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosIERIC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosIERIC() {
        return solicitaDatosIERIC;
    }

    /**
     * Define el valor de la propiedad solicitaDatosIERIC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosIERIC(Boolean value) {
        this.solicitaDatosIERIC = value;
    }

}
