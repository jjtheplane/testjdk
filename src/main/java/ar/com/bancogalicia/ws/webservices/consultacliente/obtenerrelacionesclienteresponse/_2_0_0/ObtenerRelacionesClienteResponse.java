
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienteresponse._2_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.BGBAResultadoOperacion;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.BGBAResultadoOperacionLog;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigo;
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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0}BGBAResultadoOperacion"/&gt;
 *         &lt;element name="Datos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Rellamada" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id"/&gt;
 *                             &lt;element name="CodigoNaturalezaJuridica" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
 *                             &lt;element name="CodigoRelacionPersonaPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id"/&gt;
 *                   &lt;element name="Relaciones"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerrelacionesclienteresponse/2_0_0}Relacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "datos",
    "bgbaResultadoOperacionLog"
})
@XmlRootElement(name = "ObtenerRelacionesClienteResponse")
public class ObtenerRelacionesClienteResponse {

    @XmlElement(name = "BGBAResultadoOperacion", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0", required = true)
    protected BGBAResultadoOperacion bgbaResultadoOperacion;
    @XmlElement(name = "Datos")
    protected ObtenerRelacionesClienteResponse.Datos datos;
    @XmlElement(name = "BGBAResultadoOperacionLog", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0", required = true)
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
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerRelacionesClienteResponse.Datos }
     *     
     */
    public ObtenerRelacionesClienteResponse.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerRelacionesClienteResponse.Datos }
     *     
     */
    public void setDatos(ObtenerRelacionesClienteResponse.Datos value) {
        this.datos = value;
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
     *         &lt;element name="Rellamada" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id"/&gt;
     *                   &lt;element name="CodigoNaturalezaJuridica" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
     *                   &lt;element name="CodigoRelacionPersonaPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id"/&gt;
     *         &lt;element name="Relaciones"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerrelacionesclienteresponse/2_0_0}Relacion" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "rellamada",
        "idPersona",
        "relaciones"
    })
    public static class Datos {

        @XmlElement(name = "Rellamada")
        protected ObtenerRelacionesClienteResponse.Datos.Rellamada rellamada;
        @XmlElement(name = "IdPersona", required = true)
        protected Id idPersona;
        @XmlElement(name = "Relaciones", required = true)
        protected ObtenerRelacionesClienteResponse.Datos.Relaciones relaciones;

        /**
         * Obtiene el valor de la propiedad rellamada.
         * 
         * @return
         *     possible object is
         *     {@link ObtenerRelacionesClienteResponse.Datos.Rellamada }
         *     
         */
        public ObtenerRelacionesClienteResponse.Datos.Rellamada getRellamada() {
            return rellamada;
        }

        /**
         * Define el valor de la propiedad rellamada.
         * 
         * @param value
         *     allowed object is
         *     {@link ObtenerRelacionesClienteResponse.Datos.Rellamada }
         *     
         */
        public void setRellamada(ObtenerRelacionesClienteResponse.Datos.Rellamada value) {
            this.rellamada = value;
        }

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

        /**
         * Obtiene el valor de la propiedad relaciones.
         * 
         * @return
         *     possible object is
         *     {@link ObtenerRelacionesClienteResponse.Datos.Relaciones }
         *     
         */
        public ObtenerRelacionesClienteResponse.Datos.Relaciones getRelaciones() {
            return relaciones;
        }

        /**
         * Define el valor de la propiedad relaciones.
         * 
         * @param value
         *     allowed object is
         *     {@link ObtenerRelacionesClienteResponse.Datos.Relaciones }
         *     
         */
        public void setRelaciones(ObtenerRelacionesClienteResponse.Datos.Relaciones value) {
            this.relaciones = value;
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
         *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerrelacionesclienteresponse/2_0_0}Relacion" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "relacion"
        })
        public static class Relaciones {

            @XmlElement(name = "Relacion")
            protected List<Relacion> relacion;

            /**
             * Gets the value of the relacion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the relacion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRelacion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Relacion }
             * 
             * 
             */
            public List<Relacion> getRelacion() {
                if (relacion == null) {
                    relacion = new ArrayList<Relacion>();
                }
                return this.relacion;
            }

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
         *         &lt;element name="CodigoNaturalezaJuridica" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
         *         &lt;element name="CodigoRelacionPersonaPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
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
            "idPersona",
            "codigoNaturalezaJuridica",
            "codigoRelacionPersonaPersona"
        })
        public static class Rellamada {

            @XmlElement(name = "IdPersona", required = true)
            protected Id idPersona;
            @XmlElement(name = "CodigoNaturalezaJuridica", required = true)
            protected Codigo codigoNaturalezaJuridica;
            @XmlElement(name = "CodigoRelacionPersonaPersona", required = true)
            protected Codigo codigoRelacionPersonaPersona;

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

            /**
             * Obtiene el valor de la propiedad codigoNaturalezaJuridica.
             * 
             * @return
             *     possible object is
             *     {@link Codigo }
             *     
             */
            public Codigo getCodigoNaturalezaJuridica() {
                return codigoNaturalezaJuridica;
            }

            /**
             * Define el valor de la propiedad codigoNaturalezaJuridica.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigo }
             *     
             */
            public void setCodigoNaturalezaJuridica(Codigo value) {
                this.codigoNaturalezaJuridica = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoRelacionPersonaPersona.
             * 
             * @return
             *     possible object is
             *     {@link Codigo }
             *     
             */
            public Codigo getCodigoRelacionPersonaPersona() {
                return codigoRelacionPersonaPersona;
            }

            /**
             * Define el valor de la propiedad codigoRelacionPersonaPersona.
             * 
             * @param value
             *     allowed object is
             *     {@link Codigo }
             *     
             */
            public void setCodigoRelacionPersonaPersona(Codigo value) {
                this.codigoRelacionPersonaPersona = value;
            }

        }

    }

}
