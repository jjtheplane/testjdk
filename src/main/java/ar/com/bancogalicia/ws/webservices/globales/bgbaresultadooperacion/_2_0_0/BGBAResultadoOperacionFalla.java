
package ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0}BGBAResultadoOperacion"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0}BGBAResultadoOperacionLog"/&gt;
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
    "bgbaResultadoOperacion",
    "bgbaResultadoOperacionLog"
})
@XmlRootElement(name = "BGBAResultadoOperacionFalla")
public class BGBAResultadoOperacionFalla {

    @XmlElement(name = "BGBAResultadoOperacion", required = true)
    protected BGBAResultadoOperacion bgbaResultadoOperacion;
    @XmlElement(name = "BGBAResultadoOperacionLog", required = true)
    protected BGBAResultadoOperacionLog bgbaResultadoOperacionLog;

    /**
     * Obtiene el valor de la propiedad bgbaResultadoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link BGBAResultadoOperacion }
     *     
     */
    public BGBAResultadoOperacion getBGBAResultadoOperacion() {
        return bgbaResultadoOperacion;
    }

    /**
     * Define el valor de la propiedad bgbaResultadoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BGBAResultadoOperacion }
     *     
     */
    public void setBGBAResultadoOperacion(BGBAResultadoOperacion value) {
        this.bgbaResultadoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad bgbaResultadoOperacionLog.
     * 
     * @return
     *     possible object is
     *     {@link BGBAResultadoOperacionLog }
     *     
     */
    public BGBAResultadoOperacionLog getBGBAResultadoOperacionLog() {
        return bgbaResultadoOperacionLog;
    }

    /**
     * Define el valor de la propiedad bgbaResultadoOperacionLog.
     * 
     * @param value
     *     allowed object is
     *     {@link BGBAResultadoOperacionLog }
     *     
     */
    public void setBGBAResultadoOperacionLog(BGBAResultadoOperacionLog value) {
        this.bgbaResultadoOperacionLog = value;
    }

}
