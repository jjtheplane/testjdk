
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienterequest._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0.BGBAHeader;
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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}BGBAHeader"/&gt;
 *         &lt;element name="Datos"&gt;
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
@XmlRootElement(name = "ObtenerRelacionesClienteRequest")
public class ObtenerRelacionesClienteRequest {

    @XmlElement(name = "BGBAHeader", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", required = true)
    protected BGBAHeader bgbaHeader;
    @XmlElement(name = "Datos", required = true)
    protected ObtenerRelacionesClienteRequest.Datos datos;

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
     *     {@link ObtenerRelacionesClienteRequest.Datos }
     *     
     */
    public ObtenerRelacionesClienteRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerRelacionesClienteRequest.Datos }
     *     
     */
    public void setDatos(ObtenerRelacionesClienteRequest.Datos value) {
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
        "idPersona"
    })
    public static class Datos {

        @XmlElement(name = "Rellamada")
        protected ObtenerRelacionesClienteRequest.Datos.Rellamada rellamada;
        @XmlElement(name = "IdPersona", required = true)
        protected Id idPersona;

        /**
         * Obtiene el valor de la propiedad rellamada.
         * 
         * @return
         *     possible object is
         *     {@link ObtenerRelacionesClienteRequest.Datos.Rellamada }
         *     
         */
        public ObtenerRelacionesClienteRequest.Datos.Rellamada getRellamada() {
            return rellamada;
        }

        /**
         * Define el valor de la propiedad rellamada.
         * 
         * @param value
         *     allowed object is
         *     {@link ObtenerRelacionesClienteRequest.Datos.Rellamada }
         *     
         */
        public void setRellamada(ObtenerRelacionesClienteRequest.Datos.Rellamada value) {
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
