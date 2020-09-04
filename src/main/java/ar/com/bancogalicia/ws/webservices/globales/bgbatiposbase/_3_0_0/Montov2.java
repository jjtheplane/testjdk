
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para montov2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="montov2"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *       &lt;attribute name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="organizacionIdLista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="listIdMoneda" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}alfanumerico" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "montov2", propOrder = {
    "value"
})
public class Montov2 {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "moneda")
    protected String moneda;
    @XmlAttribute(name = "organizacionIdLista")
    protected String organizacionIdLista;
    @XmlAttribute(name = "listIdMoneda")
    protected String listIdMoneda;

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

    /**
     * Obtiene el valor de la propiedad organizacionIdLista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizacionIdLista() {
        return organizacionIdLista;
    }

    /**
     * Define el valor de la propiedad organizacionIdLista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizacionIdLista(String value) {
        this.organizacionIdLista = value;
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
        return listIdMoneda;
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

}
