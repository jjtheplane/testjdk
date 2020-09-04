
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para numeroCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="numeroCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdPaisBanco" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/1_1_0}alfanumericoLE3"/&gt;
 *         &lt;element name="IdBanco" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/1_1_0}alfanumericoLE15"/&gt;
 *         &lt;element name="Numero" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/1_1_0}alfanumericoLE35"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numeroCuenta", propOrder = {
    "idPaisBanco",
    "idBanco",
    "numero"
})
public class NumeroCuenta {

    @XmlElement(name = "IdPaisBanco", required = true)
    protected String idPaisBanco;
    @XmlElement(name = "IdBanco", required = true)
    protected String idBanco;
    @XmlElement(name = "Numero", required = true)
    protected String numero;

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

}
