
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

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
 *       &lt;sequence&gt;
 *         &lt;element name="MarcaCandadoIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarcaCandadoGanancias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "marcaCandadoIVA",
    "marcaCandadoGanancias"
})
@XmlRootElement(name = "CandadoImpositivo")
public class CandadoImpositivo {

    @XmlElement(name = "MarcaCandadoIVA")
    protected String marcaCandadoIVA;
    @XmlElement(name = "MarcaCandadoGanancias")
    protected String marcaCandadoGanancias;

    /**
     * Obtiene el valor de la propiedad marcaCandadoIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaCandadoIVA() {
        return marcaCandadoIVA;
    }

    /**
     * Define el valor de la propiedad marcaCandadoIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaCandadoIVA(String value) {
        this.marcaCandadoIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaCandadoGanancias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaCandadoGanancias() {
        return marcaCandadoGanancias;
    }

    /**
     * Define el valor de la propiedad marcaCandadoGanancias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaCandadoGanancias(String value) {
        this.marcaCandadoGanancias = value;
    }

}
