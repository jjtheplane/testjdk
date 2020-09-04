
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._1_0_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para monto3_3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="monto3_3"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/1_1_0&gt;decimal3_3"&gt;
 *       &lt;attribute name="listIdMoneda" type="{http://www.w3.org/2001/XMLSchema}string" default="NV" /&gt;
 *       &lt;attribute name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monto3_3", propOrder = {
    "value"
})
public class Monto33 {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "listIdMoneda")
    protected String listIdMoneda;
    @XmlAttribute(name = "moneda")
    protected String moneda;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad listIdMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListIdMoneda() {
        if (listIdMoneda == null) {
            return "NV";
        } else {
            return listIdMoneda;
        }
    }

    /**
     * Define el valor de la propiedad listIdMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListIdMoneda(String value) {
        this.listIdMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

}
