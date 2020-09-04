
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import java.math.BigDecimal;
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
 *         &lt;element name="ImpuestoSellos" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CodigoJurisdiccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PorcentajePercepcion" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}porcentaje3decimales" minOccurs="0"/&gt;
 *                   &lt;element name="FechaVencimientoPercepcion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "impuestoSellos"
})
@XmlRootElement(name = "ImpuestosSellos")
public class ImpuestosSellos {

    @XmlElement(name = "ImpuestoSellos")
    protected List<ImpuestosSellos.ImpuestoSellos> impuestoSellos;

    /**
     * Gets the value of the impuestoSellos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuestoSellos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuestoSellos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestosSellos.ImpuestoSellos }
     * 
     * 
     */
    public List<ImpuestosSellos.ImpuestoSellos> getImpuestoSellos() {
        if (impuestoSellos == null) {
            impuestoSellos = new ArrayList<ImpuestosSellos.ImpuestoSellos>();
        }
        return this.impuestoSellos;
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
     *         &lt;element name="CodigoJurisdiccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PorcentajePercepcion" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}porcentaje3decimales" minOccurs="0"/&gt;
     *         &lt;element name="FechaVencimientoPercepcion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
        "codigoJurisdiccion",
        "porcentajePercepcion",
        "fechaVencimientoPercepcion"
    })
    public static class ImpuestoSellos {

        @XmlElement(name = "CodigoJurisdiccion")
        protected String codigoJurisdiccion;
        @XmlElement(name = "PorcentajePercepcion")
        protected BigDecimal porcentajePercepcion;
        @XmlElement(name = "FechaVencimientoPercepcion")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaVencimientoPercepcion;

        /**
         * Obtiene el valor de la propiedad codigoJurisdiccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoJurisdiccion() {
            return codigoJurisdiccion;
        }

        /**
         * Define el valor de la propiedad codigoJurisdiccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoJurisdiccion(String value) {
            this.codigoJurisdiccion = value;
        }

        /**
         * Obtiene el valor de la propiedad porcentajePercepcion.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPorcentajePercepcion() {
            return porcentajePercepcion;
        }

        /**
         * Define el valor de la propiedad porcentajePercepcion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPorcentajePercepcion(BigDecimal value) {
            this.porcentajePercepcion = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaVencimientoPercepcion.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaVencimientoPercepcion() {
            return fechaVencimientoPercepcion;
        }

        /**
         * Define el valor de la propiedad fechaVencimientoPercepcion.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaVencimientoPercepcion(XMLGregorianCalendar value) {
            this.fechaVencimientoPercepcion = value;
        }

    }

}
