
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductorequest._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0.BGBAHeader;


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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}BGBAHeader"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteporproductorequest/2_0_0}Datos"/&gt;
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
    "bgbaHeader",
    "datos"
})
@XmlRootElement(name = "BuscarClientePorProductoRequest")
public class BuscarClientePorProductoRequest {

    @XmlElement(name = "BGBAHeader", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", required = true)
    protected BGBAHeader bgbaHeader;
    @XmlElement(name = "Datos", required = true)
    protected Datos datos;

    /**
     * Obtiene el valor de la propiedad bgbaHeader.
     * 
     * @return
     *     possible object is
     *     {@link BGBAHeader }
     *     
     */
    public BGBAHeader getBGBAHeader() {
        return bgbaHeader;
    }

    /**
     * Define el valor de la propiedad bgbaHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BGBAHeader }
     *     
     */
    public void setBGBAHeader(BGBAHeader value) {
        this.bgbaHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link Datos }
     *     
     */
    public Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link Datos }
     *     
     */
    public void setDatos(Datos value) {
        this.datos = value;
    }

}
