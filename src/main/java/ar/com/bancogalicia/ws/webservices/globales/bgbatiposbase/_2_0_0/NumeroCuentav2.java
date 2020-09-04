
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para numeroCuentav2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="numeroCuentav2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdPaisBanco" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico3"/&gt;
 *         &lt;element name="IdBanco" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico15"/&gt;
 *         &lt;element name="Numero" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico35"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IdBackend" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numeroCuentav2", propOrder = {
    "idPaisBanco",
    "idBanco",
    "numero"
})
public class NumeroCuentav2 {

    @XmlElement(name = "IdPaisBanco", required = true)
    protected String idPaisBanco;
    @XmlElement(name = "IdBanco", required = true)
    protected String idBanco;
    @XmlElement(name = "Numero", required = true)
    protected String numero;
    @XmlAttribute(name = "IdBackend")
    protected String idBackend;

    /**
     * Obtiene el valor de la propiedad idPaisBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaisBanco() {
        return idPaisBanco;
    }

    /**
     * Define el valor de la propiedad idPaisBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaisBanco(String value) {
        this.idPaisBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad idBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBanco() {
        return idBanco;
    }

    /**
     * Define el valor de la propiedad idBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBanco(String value) {
        this.idBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad idBackend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBackend() {
        return idBackend;
    }

    /**
     * Define el valor de la propiedad idBackend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBackend(String value) {
        this.idBackend = value;
    }

}
