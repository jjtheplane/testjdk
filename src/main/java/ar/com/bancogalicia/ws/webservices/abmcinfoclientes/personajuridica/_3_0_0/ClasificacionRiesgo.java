
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
 *         &lt;element name="Automatico" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}ClasificacionRiesgoActualYAnterior"/&gt;
 *         &lt;element name="Manual" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}ClasificacionRiesgoActualYAnterior"/&gt;
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
    "automatico",
    "manual"
})
@XmlRootElement(name = "ClasificacionRiesgo")
public class ClasificacionRiesgo {

    @XmlElement(name = "Automatico", required = true)
    protected ClasificacionRiesgoActualYAnterior automatico;
    @XmlElement(name = "Manual", required = true)
    protected ClasificacionRiesgoActualYAnterior manual;

    /**
     * Obtiene el valor de la propiedad automatico.
     * 
     * @return
     *     possible object is
     *     {@link ClasificacionRiesgoActualYAnterior }
     *     
     */
    public ClasificacionRiesgoActualYAnterior getAutomatico() {
        return automatico;
    }

    /**
     * Define el valor de la propiedad automatico.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasificacionRiesgoActualYAnterior }
     *     
     */
    public void setAutomatico(ClasificacionRiesgoActualYAnterior value) {
        this.automatico = value;
    }

    /**
     * Obtiene el valor de la propiedad manual.
     * 
     * @return
     *     possible object is
     *     {@link ClasificacionRiesgoActualYAnterior }
     *     
     */
    public ClasificacionRiesgoActualYAnterior getManual() {
        return manual;
    }

    /**
     * Define el valor de la propiedad manual.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasificacionRiesgoActualYAnterior }
     *     
     */
    public void setManual(ClasificacionRiesgoActualYAnterior value) {
        this.manual = value;
    }

}
