
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0;

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
 *         &lt;element name="CodigoSubsistema" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}numeric5"/&gt;
 *         &lt;element name="CodigoProducto" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}alfanumerico2" minOccurs="0"/&gt;
 *         &lt;element name="CodigoSubproducto" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}alfanumerico2" minOccurs="0"/&gt;
 *         &lt;element name="CodigoModificador" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}alfanumerico3"/&gt;
 *         &lt;element name="CodigoSector" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}alfanumerico1" minOccurs="0"/&gt;
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
    "codigoSubsistema",
    "codigoProducto",
    "codigoSubproducto",
    "codigoModificador",
    "codigoSector"
})
@XmlRootElement(name = "ClaseProductoNV")
public class ClaseProductoNV {

    @XmlElement(name = "CodigoSubsistema")
    protected int codigoSubsistema;
    @XmlElement(name = "CodigoProducto")
    protected String codigoProducto;
    @XmlElement(name = "CodigoSubproducto")
    protected String codigoSubproducto;
    @XmlElement(name = "CodigoModificador", required = true)
    protected String codigoModificador;
    @XmlElement(name = "CodigoSector")
    protected String codigoSector;

    /**
     * Obtiene el valor de la propiedad codigoSubsistema.
     * 
     */
    public int getCodigoSubsistema() {
        return codigoSubsistema;
    }

    /**
     * Define el valor de la propiedad codigoSubsistema.
     * 
     */
    public void setCodigoSubsistema(int value) {
        this.codigoSubsistema = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProducto(String value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSubproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSubproducto() {
        return codigoSubproducto;
    }

    /**
     * Define el valor de la propiedad codigoSubproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSubproducto(String value) {
        this.codigoSubproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoModificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoModificador() {
        return codigoModificador;
    }

    /**
     * Define el valor de la propiedad codigoModificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoModificador(String value) {
        this.codigoModificador = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSector() {
        return codigoSector;
    }

    /**
     * Define el valor de la propiedad codigoSector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSector(String value) {
        this.codigoSector = value;
    }

}
