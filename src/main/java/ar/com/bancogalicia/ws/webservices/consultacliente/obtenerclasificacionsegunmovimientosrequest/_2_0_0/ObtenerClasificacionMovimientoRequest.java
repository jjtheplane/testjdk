
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosrequest._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0.BGBAHeader;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Id;


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
 *         &lt;element name="Datos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlRootElement(name = "ObtenerClasificacionMovimientoRequest")
public class ObtenerClasificacionMovimientoRequest {

    @XmlElement(name = "BGBAHeader", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", required = true)
    protected BGBAHeader bgbaHeader;
    @XmlElement(name = "Datos", required = true)
    protected ObtenerClasificacionMovimientoRequest.Datos datos;

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
     *     {@link ObtenerClasificacionMovimientoRequest.Datos }
     *     
     */
    public ObtenerClasificacionMovimientoRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerClasificacionMovimientoRequest.Datos }
     *     
     */
    public void setDatos(ObtenerClasificacionMovimientoRequest.Datos value) {
        this.datos = value;
    }


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
     *         &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id"/&gt;
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
        "idPersona"
    })
    public static class Datos {

        @XmlElement(name = "IdPersona", required = true)
        protected Id idPersona;

        /**
         * Obtiene el valor de la propiedad idPersona.
         * 
         * @return
         *     possible object is
         *     {@link Id }
         *     
         */
        public Id getIdPersona() {
            return idPersona;
        }

        /**
         * Define el valor de la propiedad idPersona.
         * 
         * @param value
         *     allowed object is
         *     {@link Id }
         *     
         */
        public void setIdPersona(Id value) {
            this.idPersona = value;
        }

    }

}
