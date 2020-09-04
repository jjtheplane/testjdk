
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosrequest._2_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerclasificacionsegunmovimientosrequest/2_0_0}ObtenerClasificacionMovimientoRequest"/&gt;
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
    "obtenerClasificacionMovimientoRequest"
})
@XmlRootElement(name = "ObtenerClasificacionSegunMovimientos")
public class ObtenerClasificacionSegunMovimientos {

    @XmlElement(name = "ObtenerClasificacionMovimientoRequest", required = true)
    protected ObtenerClasificacionMovimientoRequest obtenerClasificacionMovimientoRequest;

    /**
     * Obtiene el valor de la propiedad obtenerClasificacionMovimientoRequest.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerClasificacionMovimientoRequest }
     *     
     */
    public ObtenerClasificacionMovimientoRequest getObtenerClasificacionMovimientoRequest() {
        return obtenerClasificacionMovimientoRequest;
    }

    /**
     * Define el valor de la propiedad obtenerClasificacionMovimientoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerClasificacionMovimientoRequest }
     *     
     */
    public void setObtenerClasificacionMovimientoRequest(ObtenerClasificacionMovimientoRequest value) {
        this.obtenerClasificacionMovimientoRequest = value;
    }

}
