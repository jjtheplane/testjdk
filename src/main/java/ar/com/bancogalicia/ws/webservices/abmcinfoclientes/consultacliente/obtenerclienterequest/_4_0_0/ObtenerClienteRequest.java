
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienterequest._4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Datos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}numeric10"/&gt;
 *                   &lt;element name="DatosSolicitados"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersona" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersonaFisica" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersonaJuridica" minOccurs="0"/&gt;
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
@XmlRootElement(name = "ObtenerClienteRequest")
public class ObtenerClienteRequest {

    @XmlElement(name = "BGBAHeader", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0", required = true)
    protected BGBAHeader bgbaHeader;
    @XmlElement(name = "Datos", required = true)
    protected ObtenerClienteRequest.Datos datos;

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
     *     {@link ObtenerClienteRequest.Datos }
     *     
     */
    public ObtenerClienteRequest.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerClienteRequest.Datos }
     *     
     */
    public void setDatos(ObtenerClienteRequest.Datos value) {
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
     *         &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}numeric10"/&gt;
     *         &lt;element name="DatosSolicitados"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersona" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersonaFisica" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersonaJuridica" minOccurs="0"/&gt;
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
        "idPersona",
        "datosSolicitados"
    })
    public static class Datos {

        @XmlElement(name = "IdPersona")
        @XmlSchemaType(name = "unsignedLong")
        protected long idPersona;
        @XmlElement(name = "DatosSolicitados", required = true)
        protected ObtenerClienteRequest.Datos.DatosSolicitados datosSolicitados;

        /**
         * Obtiene el valor de la propiedad idPersona.
         * 
         */
        public long getIdPersona() {
            return idPersona;
        }

        /**
         * Define el valor de la propiedad idPersona.
         * 
         */
        public void setIdPersona(long value) {
            this.idPersona = value;
        }

        /**
         * Obtiene el valor de la propiedad datosSolicitados.
         * 
         * @return
         *     possible object is
         *     {@link ObtenerClienteRequest.Datos.DatosSolicitados }
         *     
         */
        public ObtenerClienteRequest.Datos.DatosSolicitados getDatosSolicitados() {
            return datosSolicitados;
        }

        /**
         * Define el valor de la propiedad datosSolicitados.
         * 
         * @param value
         *     allowed object is
         *     {@link ObtenerClienteRequest.Datos.DatosSolicitados }
         *     
         */
        public void setDatosSolicitados(ObtenerClienteRequest.Datos.DatosSolicitados value) {
            this.datosSolicitados = value;
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
         *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersona" minOccurs="0"/&gt;
         *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersonaFisica" minOccurs="0"/&gt;
         *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}SolicitudDatosPersonaJuridica" minOccurs="0"/&gt;
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
            "solicitudDatosPersona",
            "solicitudDatosPersonaFisica",
            "solicitudDatosPersonaJuridica"
        })
        public static class DatosSolicitados {

            @XmlElement(name = "SolicitudDatosPersona")
            protected SolicitudDatosPersona solicitudDatosPersona;
            @XmlElement(name = "SolicitudDatosPersonaFisica")
            protected SolicitudDatosPersonaFisica solicitudDatosPersonaFisica;
            @XmlElement(name = "SolicitudDatosPersonaJuridica")
            protected SolicitudDatosPersonaJuridica solicitudDatosPersonaJuridica;

            /**
             * Obtiene el valor de la propiedad solicitudDatosPersona.
             * 
             * @return
             *     possible object is
             *     {@link SolicitudDatosPersona }
             *     
             */
            public SolicitudDatosPersona getSolicitudDatosPersona() {
                return solicitudDatosPersona;
            }

            /**
             * Define el valor de la propiedad solicitudDatosPersona.
             * 
             * @param value
             *     allowed object is
             *     {@link SolicitudDatosPersona }
             *     
             */
            public void setSolicitudDatosPersona(SolicitudDatosPersona value) {
                this.solicitudDatosPersona = value;
            }

            /**
             * Obtiene el valor de la propiedad solicitudDatosPersonaFisica.
             * 
             * @return
             *     possible object is
             *     {@link SolicitudDatosPersonaFisica }
             *     
             */
            public SolicitudDatosPersonaFisica getSolicitudDatosPersonaFisica() {
                return solicitudDatosPersonaFisica;
            }

            /**
             * Define el valor de la propiedad solicitudDatosPersonaFisica.
             * 
             * @param value
             *     allowed object is
             *     {@link SolicitudDatosPersonaFisica }
             *     
             */
            public void setSolicitudDatosPersonaFisica(SolicitudDatosPersonaFisica value) {
                this.solicitudDatosPersonaFisica = value;
            }

            /**
             * Obtiene el valor de la propiedad solicitudDatosPersonaJuridica.
             * 
             * @return
             *     possible object is
             *     {@link SolicitudDatosPersonaJuridica }
             *     
             */
            public SolicitudDatosPersonaJuridica getSolicitudDatosPersonaJuridica() {
                return solicitudDatosPersonaJuridica;
            }

            /**
             * Define el valor de la propiedad solicitudDatosPersonaJuridica.
             * 
             * @param value
             *     allowed object is
             *     {@link SolicitudDatosPersonaJuridica }
             *     
             */
            public void setSolicitudDatosPersonaJuridica(SolicitudDatosPersonaJuridica value) {
                this.solicitudDatosPersonaJuridica = value;
            }

        }

    }

}
