
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para codigo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="codigo"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
 *       &lt;attribute name="idLista" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}token60" /&gt;
 *       &lt;attribute name="organizacionIdLista" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}token60" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codigo", propOrder = {
    "value"
})
public class Codigo {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String value;
    @XmlAttribute(name = "idLista")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idLista;
    @XmlAttribute(name = "organizacionIdLista")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String organizacionIdLista;

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
     * Obtiene el valor de la propiedad idLista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLista() {
        return idLista;
    }

    /**
     * Define el valor de la propiedad idLista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLista(String value) {
        this.idLista = value;
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

}
