
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.persona._1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificacionScoring complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificacionScoring"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}VerificacionDatosFijosClienteSIO" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}VerificacionBalanceVigenteSIO" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}VerificacionBalanceAnteriorSIO" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}VerificacionDatosFijosResponsableSIO" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}VerificacionBalanceVigenteSAAR" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}VerificacionBalanceAnteriorSAAR" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificacionScoring", propOrder = {
    "verificacionDatosFijosClienteSIO",
    "verificacionBalanceVigenteSIO",
    "verificacionBalanceAnteriorSIO",
    "verificacionDatosFijosResponsableSIO",
    "verificacionBalanceVigenteSAAR",
    "verificacionBalanceAnteriorSAAR"
})
public class VerificacionScoring {

    @XmlElement(name = "VerificacionDatosFijosClienteSIO")
    protected VerificacionDatosFijosClienteSIO verificacionDatosFijosClienteSIO;
    @XmlElement(name = "VerificacionBalanceVigenteSIO")
    protected VerificacionBalanceVigenteSIO verificacionBalanceVigenteSIO;
    @XmlElement(name = "VerificacionBalanceAnteriorSIO")
    protected VerificacionBalanceAnteriorSIO verificacionBalanceAnteriorSIO;
    @XmlElement(name = "VerificacionDatosFijosResponsableSIO")
    protected VerificacionDatosFijosResponsableSIO verificacionDatosFijosResponsableSIO;
    @XmlElement(name = "VerificacionBalanceVigenteSAAR")
    protected VerificacionBalanceVigenteSAAR verificacionBalanceVigenteSAAR;
    @XmlElement(name = "VerificacionBalanceAnteriorSAAR")
    protected VerificacionBalanceAnteriorSAAR verificacionBalanceAnteriorSAAR;

    /**
     * Obtiene el valor de la propiedad verificacionDatosFijosClienteSIO.
     * 
     * @return
     *     possible object is
     *     {@link VerificacionDatosFijosClienteSIO }
     *     
     */
    public VerificacionDatosFijosClienteSIO getVerificacionDatosFijosClienteSIO() {
        return verificacionDatosFijosClienteSIO;
    }

    /**
     * Define el valor de la propiedad verificacionDatosFijosClienteSIO.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificacionDatosFijosClienteSIO }
     *     
     */
    public void setVerificacionDatosFijosClienteSIO(VerificacionDatosFijosClienteSIO value) {
        this.verificacionDatosFijosClienteSIO = value;
    }

    /**
     * Obtiene el valor de la propiedad verificacionBalanceVigenteSIO.
     * 
     * @return
     *     possible object is
     *     {@link VerificacionBalanceVigenteSIO }
     *     
     */
    public VerificacionBalanceVigenteSIO getVerificacionBalanceVigenteSIO() {
        return verificacionBalanceVigenteSIO;
    }

    /**
     * Define el valor de la propiedad verificacionBalanceVigenteSIO.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificacionBalanceVigenteSIO }
     *     
     */
    public void setVerificacionBalanceVigenteSIO(VerificacionBalanceVigenteSIO value) {
        this.verificacionBalanceVigenteSIO = value;
    }

    /**
     * Obtiene el valor de la propiedad verificacionBalanceAnteriorSIO.
     * 
     * @return
     *     possible object is
     *     {@link VerificacionBalanceAnteriorSIO }
     *     
     */
    public VerificacionBalanceAnteriorSIO getVerificacionBalanceAnteriorSIO() {
        return verificacionBalanceAnteriorSIO;
    }

    /**
     * Define el valor de la propiedad verificacionBalanceAnteriorSIO.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificacionBalanceAnteriorSIO }
     *     
     */
    public void setVerificacionBalanceAnteriorSIO(VerificacionBalanceAnteriorSIO value) {
        this.verificacionBalanceAnteriorSIO = value;
    }

    /**
     * Obtiene el valor de la propiedad verificacionDatosFijosResponsableSIO.
     * 
     * @return
     *     possible object is
     *     {@link VerificacionDatosFijosResponsableSIO }
     *     
     */
    public VerificacionDatosFijosResponsableSIO getVerificacionDatosFijosResponsableSIO() {
        return verificacionDatosFijosResponsableSIO;
    }

    /**
     * Define el valor de la propiedad verificacionDatosFijosResponsableSIO.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificacionDatosFijosResponsableSIO }
     *     
     */
    public void setVerificacionDatosFijosResponsableSIO(VerificacionDatosFijosResponsableSIO value) {
        this.verificacionDatosFijosResponsableSIO = value;
    }

    /**
     * Obtiene el valor de la propiedad verificacionBalanceVigenteSAAR.
     * 
     * @return
     *     possible object is
     *     {@link VerificacionBalanceVigenteSAAR }
     *     
     */
    public VerificacionBalanceVigenteSAAR getVerificacionBalanceVigenteSAAR() {
        return verificacionBalanceVigenteSAAR;
    }

    /**
     * Define el valor de la propiedad verificacionBalanceVigenteSAAR.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificacionBalanceVigenteSAAR }
     *     
     */
    public void setVerificacionBalanceVigenteSAAR(VerificacionBalanceVigenteSAAR value) {
        this.verificacionBalanceVigenteSAAR = value;
    }

    /**
     * Obtiene el valor de la propiedad verificacionBalanceAnteriorSAAR.
     * 
     * @return
     *     possible object is
     *     {@link VerificacionBalanceAnteriorSAAR }
     *     
     */
    public VerificacionBalanceAnteriorSAAR getVerificacionBalanceAnteriorSAAR() {
        return verificacionBalanceAnteriorSAAR;
    }

    /**
     * Define el valor de la propiedad verificacionBalanceAnteriorSAAR.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificacionBalanceAnteriorSAAR }
     *     
     */
    public void setVerificacionBalanceAnteriorSAAR(VerificacionBalanceAnteriorSAAR value) {
        this.verificacionBalanceAnteriorSAAR = value;
    }

}
