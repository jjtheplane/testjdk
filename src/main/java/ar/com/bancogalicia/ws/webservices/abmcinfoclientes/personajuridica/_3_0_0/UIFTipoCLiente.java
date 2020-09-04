
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

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
 *         &lt;element name="TipoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirmaDeclaracionJurada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaFirmaDeclaracionJurada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegajoGenerador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "tipoCliente",
    "firmaDeclaracionJurada",
    "fechaFirmaDeclaracionJurada",
    "numeroSucursal",
    "legajoGenerador"
})
@XmlRootElement(name = "UIFTipoCLiente")
public class UIFTipoCLiente {

    @XmlElement(name = "TipoCliente")
    protected String tipoCliente;
    @XmlElement(name = "FirmaDeclaracionJurada")
    protected String firmaDeclaracionJurada;
    @XmlElement(name = "FechaFirmaDeclaracionJurada")
    protected String fechaFirmaDeclaracionJurada;
    @XmlElement(name = "NumeroSucursal")
    protected String numeroSucursal;
    @XmlElement(name = "LegajoGenerador")
    protected String legajoGenerador;

    /**
     * Obtiene el valor de la propiedad tipoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Define el valor de la propiedad tipoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCliente(String value) {
        this.tipoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad firmaDeclaracionJurada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmaDeclaracionJurada() {
        return firmaDeclaracionJurada;
    }

    /**
     * Define el valor de la propiedad firmaDeclaracionJurada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmaDeclaracionJurada(String value) {
        this.firmaDeclaracionJurada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFirmaDeclaracionJurada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFirmaDeclaracionJurada() {
        return fechaFirmaDeclaracionJurada;
    }

    /**
     * Define el valor de la propiedad fechaFirmaDeclaracionJurada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFirmaDeclaracionJurada(String value) {
        this.fechaFirmaDeclaracionJurada = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSucursal() {
        return numeroSucursal;
    }

    /**
     * Define el valor de la propiedad numeroSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSucursal(String value) {
        this.numeroSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad legajoGenerador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegajoGenerador() {
        return legajoGenerador;
    }

    /**
     * Define el valor de la propiedad legajoGenerador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegajoGenerador(String value) {
        this.legajoGenerador = value;
    }

}
