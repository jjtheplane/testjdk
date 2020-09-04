
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

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
 *         &lt;element name="ValorSemaforo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionSemaforo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="DatosPadron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "valorSemaforo",
    "descripcionSemaforo",
    "datosPadron"
})
@XmlRootElement(name = "Padron")
public class Padron {

    @XmlElement(name = "ValorSemaforo")
    protected String valorSemaforo;
    @XmlElement(name = "DescripcionSemaforo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String descripcionSemaforo;
    @XmlElement(name = "DatosPadron")
    protected String datosPadron;

    /**
     * Obtiene el valor de la propiedad valorSemaforo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorSemaforo() {
        return valorSemaforo;
    }

    /**
     * Define el valor de la propiedad valorSemaforo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorSemaforo(String value) {
        this.valorSemaforo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionSemaforo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionSemaforo() {
        return descripcionSemaforo;
    }

    /**
     * Define el valor de la propiedad descripcionSemaforo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionSemaforo(String value) {
        this.descripcionSemaforo = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPadron.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosPadron() {
        return datosPadron;
    }

    /**
     * Define el valor de la propiedad datosPadron.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosPadron(String value) {
        this.datosPadron = value;
    }

}
