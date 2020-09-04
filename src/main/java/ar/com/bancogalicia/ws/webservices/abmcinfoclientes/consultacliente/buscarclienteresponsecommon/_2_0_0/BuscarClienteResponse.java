
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteresponsecommon._2_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.BGBAResultadoOperacion;
import ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0.BGBAResultadoOperacionLog;


/**
 * 
 * 				Mensaje de respuesta a un
 * 				BuscarClientePorDatosBasicosQuery
 * 			
 * 
 * <p>Clase Java para buscarClienteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarClienteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0}BGBAResultadoOperacion"/&gt;
 *         &lt;element name="Datos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Rellamada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Personas"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Persona" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice minOccurs="0"&gt;
 *                                       &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}PersonaFisica"/&gt;
 *                                       &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}PersonaJuridica"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
@XmlType(name = "buscarClienteResponse", propOrder = {
    "bgbaResultadoOperacion",
    "datos",
    "bgbaResultadoOperacionLog"
})
public class BuscarClienteResponse {

    @XmlElement(name = "BGBAResultadoOperacion", namespace = "http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0", required = true)
    protected BGBAResultadoOperacion bgbaResultadoOperacion;
    @XmlElement(name = "Datos")
    protected BuscarClienteResponse.Datos datos;
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
     *     {@link BuscarClienteResponse.Datos }
     *     
     */
    public BuscarClienteResponse.Datos getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscarClienteResponse.Datos }
     *     
     */
    public void setDatos(BuscarClienteResponse.Datos value) {
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
     *         &lt;element name="Rellamada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Personas"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Persona" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice minOccurs="0"&gt;
     *                             &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}PersonaFisica"/&gt;
     *                             &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}PersonaJuridica"/&gt;
     *                           &lt;/choice&gt;
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
        "rellamada",
        "personas"
    })
    public static class Datos {

        @XmlElement(name = "Rellamada")
        protected String rellamada;
        @XmlElement(name = "Personas", required = true)
        protected BuscarClienteResponse.Datos.Personas personas;

        /**
         * Obtiene el valor de la propiedad rellamada.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRellamada() {
            return rellamada;
        }

        /**
         * Define el valor de la propiedad rellamada.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRellamada(String value) {
            this.rellamada = value;
        }

        /**
         * Obtiene el valor de la propiedad personas.
         * 
         * @return
         *     possible object is
         *     {@link BuscarClienteResponse.Datos.Personas }
         *     
         */
        public BuscarClienteResponse.Datos.Personas getPersonas() {
            return personas;
        }

        /**
         * Define el valor de la propiedad personas.
         * 
         * @param value
         *     allowed object is
         *     {@link BuscarClienteResponse.Datos.Personas }
         *     
         */
        public void setPersonas(BuscarClienteResponse.Datos.Personas value) {
            this.personas = value;
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
         *         &lt;element name="Persona" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice minOccurs="0"&gt;
         *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}PersonaFisica"/&gt;
         *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}PersonaJuridica"/&gt;
         *                 &lt;/choice&gt;
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
            "persona"
        })
        public static class Personas {

            @XmlElement(name = "Persona", required = true)
            protected List<BuscarClienteResponse.Datos.Personas.Persona> persona;

            /**
             * Gets the value of the persona property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the persona property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPersona().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BuscarClienteResponse.Datos.Personas.Persona }
             * 
             * 
             */
            public List<BuscarClienteResponse.Datos.Personas.Persona> getPersona() {
                if (persona == null) {
                    persona = new ArrayList<BuscarClienteResponse.Datos.Personas.Persona>();
                }
                return this.persona;
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
             *       &lt;choice minOccurs="0"&gt;
             *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}PersonaFisica"/&gt;
             *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}PersonaJuridica"/&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "personaFisica",
                "personaJuridica"
            })
            public static class Persona {

                @XmlElement(name = "PersonaFisica")
                protected PersonaFisica personaFisica;
                @XmlElement(name = "PersonaJuridica")
                protected PersonaJuridica personaJuridica;

                /**
                 * Obtiene el valor de la propiedad personaFisica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PersonaFisica }
                 *     
                 */
                public PersonaFisica getPersonaFisica() {
                    return personaFisica;
                }

                /**
                 * Define el valor de la propiedad personaFisica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PersonaFisica }
                 *     
                 */
                public void setPersonaFisica(PersonaFisica value) {
                    this.personaFisica = value;
                }

                /**
                 * Obtiene el valor de la propiedad personaJuridica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PersonaJuridica }
                 *     
                 */
                public PersonaJuridica getPersonaJuridica() {
                    return personaJuridica;
                }

                /**
                 * Define el valor de la propiedad personaJuridica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PersonaJuridica }
                 *     
                 */
                public void setPersonaJuridica(PersonaJuridica value) {
                    this.personaJuridica = value;
                }

            }

        }

    }

}
