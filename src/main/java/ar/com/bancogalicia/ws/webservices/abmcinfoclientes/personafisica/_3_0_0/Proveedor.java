
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
 *         &lt;element name="MarcaProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarcaDatosIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarcaDatosGanancias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarcaDatosIBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "marcaProveedor",
    "marcaDatosIVA",
    "marcaDatosGanancias",
    "marcaDatosIBR"
})
@XmlRootElement(name = "Proveedor")
public class Proveedor {

    @XmlElement(name = "MarcaProveedor")
    protected String marcaProveedor;
    @XmlElement(name = "MarcaDatosIVA")
    protected String marcaDatosIVA;
    @XmlElement(name = "MarcaDatosGanancias")
    protected String marcaDatosGanancias;
    @XmlElement(name = "MarcaDatosIBR")
    protected String marcaDatosIBR;

    /**
     * Obtiene el valor de la propiedad marcaProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaProveedor() {
        return marcaProveedor;
    }

    /**
     * Define el valor de la propiedad marcaProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaProveedor(String value) {
        this.marcaProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaDatosIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaDatosIVA() {
        return marcaDatosIVA;
    }

    /**
     * Define el valor de la propiedad marcaDatosIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaDatosIVA(String value) {
        this.marcaDatosIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaDatosGanancias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaDatosGanancias() {
        return marcaDatosGanancias;
    }

    /**
     * Define el valor de la propiedad marcaDatosGanancias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaDatosGanancias(String value) {
        this.marcaDatosGanancias = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaDatosIBR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaDatosIBR() {
        return marcaDatosIBR;
    }

    /**
     * Define el valor de la propiedad marcaDatosIBR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaDatosIBR(String value) {
        this.marcaDatosIBR = value;
    }

}
