
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="CodigoSegmento" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoRolSegmento" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
    "codigoSegmento",
    "codigoRolSegmento"
})
@XmlRootElement(name = "Segmentacion")
public class Segmentacion {

    @XmlElement(name = "CodigoSegmento")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoSegmento;
    @XmlElement(name = "CodigoRolSegmento")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoRolSegmento;

    /**
     * Obtiene el valor de la propiedad codigoSegmento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSegmento() {
        return codigoSegmento;
    }

    /**
     * Define el valor de la propiedad codigoSegmento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSegmento(String value) {
        this.codigoSegmento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRolSegmento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRolSegmento() {
        return codigoRolSegmento;
    }

    /**
     * Define el valor de la propiedad codigoRolSegmento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRolSegmento(String value) {
        this.codigoRolSegmento = value;
    }

}
