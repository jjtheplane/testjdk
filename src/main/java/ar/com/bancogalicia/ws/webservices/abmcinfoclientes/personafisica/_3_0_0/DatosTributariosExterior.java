
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Identificaciones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Identificacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroIdentificacionTributariaExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PaisResidenciaTributaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="PaisResidenciaHabitual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CondicionIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaRenovacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "identificaciones",
    "paisResidenciaHabitual",
    "condicionIngreso",
    "fechaRenovacion"
})
@XmlRootElement(name = "DatosTributariosExterior")
public class DatosTributariosExterior {

    @XmlElement(name = "Identificaciones")
    protected DatosTributariosExterior.Identificaciones identificaciones;
    @XmlElement(name = "PaisResidenciaHabitual")
    protected String paisResidenciaHabitual;
    @XmlElement(name = "CondicionIngreso")
    protected String condicionIngreso;
    @XmlElement(name = "FechaRenovacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaRenovacion;

    /**
     * Obtiene el valor de la propiedad identificaciones.
     * 
     * @return
     *     possible object is
     *     {@link DatosTributariosExterior.Identificaciones }
     *     
     */
    public DatosTributariosExterior.Identificaciones getIdentificaciones() {
        return identificaciones;
    }

    /**
     * Define el valor de la propiedad identificaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosTributariosExterior.Identificaciones }
     *     
     */
    public void setIdentificaciones(DatosTributariosExterior.Identificaciones value) {
        this.identificaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad paisResidenciaHabitual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisResidenciaHabitual() {
        return paisResidenciaHabitual;
    }

    /**
     * Define el valor de la propiedad paisResidenciaHabitual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisResidenciaHabitual(String value) {
        this.paisResidenciaHabitual = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionIngreso() {
        return condicionIngreso;
    }

    /**
     * Define el valor de la propiedad condicionIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionIngreso(String value) {
        this.condicionIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRenovacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRenovacion() {
        return fechaRenovacion;
    }

    /**
     * Define el valor de la propiedad fechaRenovacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRenovacion(XMLGregorianCalendar value) {
        this.fechaRenovacion = value;
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
     *         &lt;element name="Identificacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroIdentificacionTributariaExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PaisResidenciaTributaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "identificacion"
    })
    public static class Identificaciones {

        @XmlElement(name = "Identificacion")
        protected List<DatosTributariosExterior.Identificaciones.Identificacion> identificacion;

        /**
         * Gets the value of the identificacion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identificacion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentificacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatosTributariosExterior.Identificaciones.Identificacion }
         * 
         * 
         */
        public List<DatosTributariosExterior.Identificaciones.Identificacion> getIdentificacion() {
            if (identificacion == null) {
                identificacion = new ArrayList<DatosTributariosExterior.Identificaciones.Identificacion>();
            }
            return this.identificacion;
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
         *         &lt;element name="NumeroIdentificacionTributariaExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PaisResidenciaTributaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "numeroIdentificacionTributariaExterior",
            "paisResidenciaTributaria"
        })
        public static class Identificacion {

            @XmlElement(name = "NumeroIdentificacionTributariaExterior")
            protected String numeroIdentificacionTributariaExterior;
            @XmlElement(name = "PaisResidenciaTributaria")
            protected String paisResidenciaTributaria;

            /**
             * Obtiene el valor de la propiedad numeroIdentificacionTributariaExterior.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroIdentificacionTributariaExterior() {
                return numeroIdentificacionTributariaExterior;
            }

            /**
             * Define el valor de la propiedad numeroIdentificacionTributariaExterior.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroIdentificacionTributariaExterior(String value) {
                this.numeroIdentificacionTributariaExterior = value;
            }

            /**
             * Obtiene el valor de la propiedad paisResidenciaTributaria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaisResidenciaTributaria() {
                return paisResidenciaTributaria;
            }

            /**
             * Define el valor de la propiedad paisResidenciaTributaria.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaisResidenciaTributaria(String value) {
                this.paisResidenciaTributaria = value;
            }

        }

    }

}
