
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerclasificacionsegunmovimientosresponse/2_0_0}ObtenerClasificacionSegunMovimientosResponse"/&gt;
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
    "obtenerClasificacionSegunMovimientosResponse"
})
@XmlRootElement(name = "ObtenerClasificacionSegunMovimientosResult")
public class ObtenerClasificacionSegunMovimientosResult {

    @XmlElement(name = "ObtenerClasificacionSegunMovimientosResponse", required = true)
    protected ObtenerClasificacionSegunMovimientosResponse obtenerClasificacionSegunMovimientosResponse;

    /**
     * Obtiene el valor de la propiedad obtenerClasificacionSegunMovimientosResponse.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerClasificacionSegunMovimientosResponse }
     *     
     */
    public ObtenerClasificacionSegunMovimientosResponse getObtenerClasificacionSegunMovimientosResponse() {
        return obtenerClasificacionSegunMovimientosResponse;
    }

    /**
     * Define el valor de la propiedad obtenerClasificacionSegunMovimientosResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerClasificacionSegunMovimientosResponse }
     *     
     */
    public void setObtenerClasificacionSegunMovimientosResponse(ObtenerClasificacionSegunMovimientosResponse value) {
        this.obtenerClasificacionSegunMovimientosResponse = value;
    }

}
