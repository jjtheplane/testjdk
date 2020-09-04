
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
 *         &lt;element name="LimiteMensualCantidadOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LimiteMensualImporteOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LimiteMensualJustificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarcaOperacionComercioExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarcaOperacionInternacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegajoGenerador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegajoSupervisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "limiteMensualCantidadOperaciones",
    "limiteMensualImporteOperaciones",
    "limiteMensualJustificacion",
    "marcaOperacionComercioExterior",
    "marcaOperacionInternacional",
    "legajoGenerador",
    "legajoSupervisor"
})
@XmlRootElement(name = "UIFPerfilCliente")
public class UIFPerfilCliente {

    @XmlElement(name = "LimiteMensualCantidadOperaciones")
    protected String limiteMensualCantidadOperaciones;
    @XmlElement(name = "LimiteMensualImporteOperaciones")
    protected String limiteMensualImporteOperaciones;
    @XmlElement(name = "LimiteMensualJustificacion")
    protected String limiteMensualJustificacion;
    @XmlElement(name = "MarcaOperacionComercioExterior")
    protected String marcaOperacionComercioExterior;
    @XmlElement(name = "MarcaOperacionInternacional")
    protected String marcaOperacionInternacional;
    @XmlElement(name = "LegajoGenerador")
    protected String legajoGenerador;
    @XmlElement(name = "LegajoSupervisor")
    protected String legajoSupervisor;

    /**
     * Obtiene el valor de la propiedad limiteMensualCantidadOperaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimiteMensualCantidadOperaciones() {
        return limiteMensualCantidadOperaciones;
    }

    /**
     * Define el valor de la propiedad limiteMensualCantidadOperaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimiteMensualCantidadOperaciones(String value) {
        this.limiteMensualCantidadOperaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad limiteMensualImporteOperaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimiteMensualImporteOperaciones() {
        return limiteMensualImporteOperaciones;
    }

    /**
     * Define el valor de la propiedad limiteMensualImporteOperaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimiteMensualImporteOperaciones(String value) {
        this.limiteMensualImporteOperaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad limiteMensualJustificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimiteMensualJustificacion() {
        return limiteMensualJustificacion;
    }

    /**
     * Define el valor de la propiedad limiteMensualJustificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimiteMensualJustificacion(String value) {
        this.limiteMensualJustificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaOperacionComercioExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaOperacionComercioExterior() {
        return marcaOperacionComercioExterior;
    }

    /**
     * Define el valor de la propiedad marcaOperacionComercioExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaOperacionComercioExterior(String value) {
        this.marcaOperacionComercioExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaOperacionInternacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaOperacionInternacional() {
        return marcaOperacionInternacional;
    }

    /**
     * Define el valor de la propiedad marcaOperacionInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaOperacionInternacional(String value) {
        this.marcaOperacionInternacional = value;
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

    /**
     * Obtiene el valor de la propiedad legajoSupervisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegajoSupervisor() {
        return legajoSupervisor;
    }

    /**
     * Define el valor de la propiedad legajoSupervisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegajoSupervisor(String value) {
        this.legajoSupervisor = value;
    }

}
