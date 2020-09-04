
package ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="LogItem" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Severidad" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0}severidad2"/&gt;
 *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="URLDetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "logItem"
})
@XmlRootElement(name = "BGBAResultadoOperacionLog")
public class BGBAResultadoOperacionLog {

    @XmlElement(name = "LogItem")
    protected List<BGBAResultadoOperacionLog.LogItem> logItem;

    /**
     * Gets the value of the logItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BGBAResultadoOperacionLog.LogItem }
     * 
     * 
     */
    public List<BGBAResultadoOperacionLog.LogItem> getLogItem() {
        if (logItem == null) {
            logItem = new ArrayList<BGBAResultadoOperacionLog.LogItem>();
        }
        return this.logItem;
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
     *         &lt;element name="Severidad" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0}severidad2"/&gt;
     *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="URLDetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "severidad",
        "codigo",
        "descripcion",
        "tipo",
        "urlDetalle"
    })
    public static class LogItem {

        @XmlElement(name = "Severidad", required = true)
        @XmlSchemaType(name = "string")
        protected Severidad2 severidad;
        @XmlElement(name = "Codigo", required = true)
        protected String codigo;
        @XmlElement(name = "Descripcion", required = true)
        protected String descripcion;
        @XmlElement(name = "Tipo")
        protected String tipo;
        @XmlElement(name = "URLDetalle")
        protected String urlDetalle;

        /**
         * Obtiene el valor de la propiedad severidad.
         * 
         * @return
         *     possible object is
         *     {@link Severidad2 }
         *     
         */
        public Severidad2 getSeveridad() {
            return severidad;
        }

        /**
         * Define el valor de la propiedad severidad.
         * 
         * @param value
         *     allowed object is
         *     {@link Severidad2 }
         *     
         */
        public void setSeveridad(Severidad2 value) {
            this.severidad = value;
        }

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad tipo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipo() {
            return tipo;
        }

        /**
         * Define el valor de la propiedad tipo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipo(String value) {
            this.tipo = value;
        }

        /**
         * Obtiene el valor de la propiedad urlDetalle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURLDetalle() {
            return urlDetalle;
        }

        /**
         * Define el valor de la propiedad urlDetalle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURLDetalle(String value) {
            this.urlDetalle = value;
        }

    }

}
