
package ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0;

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
 *         &lt;element name="IdGalicia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdConsumidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "idGalicia",
    "idConsumidor",
    "idProveedor"
})
@XmlRootElement(name = "ModuloAplicativo")
public class ModuloAplicativo {

    @XmlElement(name = "IdGalicia", required = true)
    protected String idGalicia;
    @XmlElement(name = "IdConsumidor")
    protected String idConsumidor;
    @XmlElement(name = "IdProveedor")
    protected String idProveedor;

    /**
     * Obtiene el valor de la propiedad idGalicia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdGalicia() {
        return idGalicia;
    }

    /**
     * Define el valor de la propiedad idGalicia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdGalicia(String value) {
        this.idGalicia = value;
    }

    /**
     * Obtiene el valor de la propiedad idConsumidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdConsumidor() {
        return idConsumidor;
    }

    /**
     * Define el valor de la propiedad idConsumidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdConsumidor(String value) {
        this.idConsumidor = value;
    }

    /**
     * Obtiene el valor de la propiedad idProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /**
     * Define el valor de la propiedad idProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProveedor(String value) {
        this.idProveedor = value;
    }

}
