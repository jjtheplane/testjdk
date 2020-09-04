
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
 *         &lt;element name="CodigoSegmentoAdicionalExtracto" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOrigenCliente" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
    "codigoSegmentoAdicionalExtracto",
    "codigoOrigenCliente"
})
@XmlRootElement(name = "SegmentacionVieja")
public class SegmentacionVieja {

    @XmlElement(name = "CodigoSegmentoAdicionalExtracto")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoSegmentoAdicionalExtracto;
    @XmlElement(name = "CodigoOrigenCliente")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoOrigenCliente;

    /**
     * Obtiene el valor de la propiedad codigoSegmentoAdicionalExtracto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSegmentoAdicionalExtracto() {
        return codigoSegmentoAdicionalExtracto;
    }

    /**
     * Define el valor de la propiedad codigoSegmentoAdicionalExtracto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSegmentoAdicionalExtracto(String value) {
        this.codigoSegmentoAdicionalExtracto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOrigenCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOrigenCliente() {
        return codigoOrigenCliente;
    }

    /**
     * Define el valor de la propiedad codigoOrigenCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOrigenCliente(String value) {
        this.codigoOrigenCliente = value;
    }

}
