
package ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para idMensaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idMensaje"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0&gt;alfanumerico32"&gt;
 *       &lt;attribute name="idEsquema" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}alfanumerico3" default="UUI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idMensaje", propOrder = {
    "value"
})
public class IdMensaje {

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
            return "UUI";
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
