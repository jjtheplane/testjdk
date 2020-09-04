
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import java.math.BigInteger;
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
 *         &lt;element name="CodigoProvinciaActividadPrincipal" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MarcaSituacionNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoActividadMonotributo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCategoriaMonotributo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MarcaBastanteo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
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
    "codigoProvinciaActividadPrincipal",
    "marcaSituacionNegocio",
    "codigoActividadMonotributo",
    "codigoCategoriaMonotributo",
    "marcaBastanteo"
})
@XmlRootElement(name = "DatosComerciales")
public class DatosComerciales {

    @XmlElement(name = "CodigoProvinciaActividadPrincipal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoProvinciaActividadPrincipal;
    @XmlElement(name = "MarcaSituacionNegocio")
    protected String marcaSituacionNegocio;
    @XmlElement(name = "CodigoActividadMonotributo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoActividadMonotributo;
    @XmlElement(name = "CodigoCategoriaMonotributo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoCategoriaMonotributo;
    @XmlElement(name = "MarcaBastanteo")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger marcaBastanteo;

    /**
     * Obtiene el valor de la propiedad codigoProvinciaActividadPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProvinciaActividadPrincipal() {
        return codigoProvinciaActividadPrincipal;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaActividadPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProvinciaActividadPrincipal(String value) {
        this.codigoProvinciaActividadPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaSituacionNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaSituacionNegocio() {
        return marcaSituacionNegocio;
    }

    /**
     * Define el valor de la propiedad marcaSituacionNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaSituacionNegocio(String value) {
        this.marcaSituacionNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoActividadMonotributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoActividadMonotributo() {
        return codigoActividadMonotributo;
    }

    /**
     * Define el valor de la propiedad codigoActividadMonotributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoActividadMonotributo(String value) {
        this.codigoActividadMonotributo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCategoriaMonotributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCategoriaMonotributo() {
        return codigoCategoriaMonotributo;
    }

    /**
     * Define el valor de la propiedad codigoCategoriaMonotributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCategoriaMonotributo(String value) {
        this.codigoCategoriaMonotributo = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaBastanteo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarcaBastanteo() {
        return marcaBastanteo;
    }

    /**
     * Define el valor de la propiedad marcaBastanteo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarcaBastanteo(BigInteger value) {
        this.marcaBastanteo = value;
    }

}
