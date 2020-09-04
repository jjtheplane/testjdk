
package ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="idEsquema" type="{http://www.w3.org/2001/XMLSchema}string" default="LEGAJO" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Operador")
public class Operador {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "idEsquema")
    protected String idEsquema;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad idEsquema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEsquema() {
        if (idEsquema == null) {
            return "LEGAJO";
        } else {
            return idEsquema;
        }
    }

    /**
     * Define el valor de la propiedad idEsquema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEsquema(String value) {
        this.idEsquema = value;
    }

}
