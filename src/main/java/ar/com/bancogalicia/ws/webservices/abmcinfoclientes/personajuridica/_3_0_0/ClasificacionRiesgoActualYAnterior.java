
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClasificacionRiesgoActualYAnterior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClasificacionRiesgoActualYAnterior"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Actual" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosClasificacionRiesgo" minOccurs="0"/&gt;
 *         &lt;element name="Anterior" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}DatosClasificacionRiesgo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClasificacionRiesgoActualYAnterior", propOrder = {
    "actual",
    "anterior"
})
public class ClasificacionRiesgoActualYAnterior {

    @XmlElement(name = "Actual")
    protected DatosClasificacionRiesgo actual;
    @XmlElement(name = "Anterior")
    protected DatosClasificacionRiesgo anterior;

    /**
     * Obtiene el valor de la propiedad actual.
     * 
     * @return
     *     possible object is
     *     {@link DatosClasificacionRiesgo }
     *     
     */
    public DatosClasificacionRiesgo getActual() {
        return actual;
    }

    /**
     * Define el valor de la propiedad actual.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosClasificacionRiesgo }
     *     
     */
    public void setActual(DatosClasificacionRiesgo value) {
        this.actual = value;
    }

    /**
     * Obtiene el valor de la propiedad anterior.
     * 
     * @return
     *     possible object is
     *     {@link DatosClasificacionRiesgo }
     *     
     */
    public DatosClasificacionRiesgo getAnterior() {
        return anterior;
    }

    /**
     * Define el valor de la propiedad anterior.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosClasificacionRiesgo }
     *     
     */
    public void setAnterior(DatosClasificacionRiesgo value) {
        this.anterior = value;
    }

}
