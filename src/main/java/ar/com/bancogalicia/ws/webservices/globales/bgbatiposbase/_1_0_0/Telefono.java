
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para telefono complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="telefono"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/1_0_0}telefono"/&gt;
 *       &lt;attribute name="celular" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telefono", propOrder = {
    "codigoPais",
    "codigoArea",
    "numero",
    "interno",
    "codigoUso",
    "usoBanco",
    "disponibilidad"
})
public class Telefono {

    @XmlElement(name = "CodigoPais")
    protected String codigoPais;
    @XmlElement(name = "CodigoArea", required = true)
    protected String codigoArea;
    @XmlElement(name = "Numero", required = true)
    protected String numero;
    @XmlElement(name = "Interno")
    protected String interno;
    @XmlElement(name = "CodigoUso")
    protected String codigoUso;
    @XmlElement(name = "UsoBanco")
    protected String usoBanco;
    @XmlElement(name = "Disponibilidad")
    protected Telefono.Disponibilidad disponibilidad;
    @XmlAttribute(name = "celular")
    protected Boolean celular;

    /**
     * Obtiene el valor de la propiedad codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define el valor de la propiedad codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoArea() {
        return codigoArea;
    }

    /**
     * Define el valor de la propiedad codigoArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoArea(String value) {
        this.codigoArea = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad interno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterno() {
        return interno;
    }

    /**
     * Define el valor de la propiedad interno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterno(String value) {
        this.interno = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUso() {
        return codigoUso;
    }

    /**
     * Define el valor de la propiedad codigoUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUso(String value) {
        this.codigoUso = value;
    }

    /**
     * Obtiene el valor de la propiedad usoBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoBanco() {
        return usoBanco;
    }

    /**
     * Define el valor de la propiedad usoBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoBanco(String value) {
        this.usoBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad disponibilidad.
     * 
     * @return
     *     possible object is
     *     {@link Telefono.Disponibilidad }
     *     
     */
    public Telefono.Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Define el valor de la propiedad disponibilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefono.Disponibilidad }
     *     
     */
    public void setDisponibilidad(Telefono.Disponibilidad value) {
        this.disponibilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad celular.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCelular() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCelular(Boolean value) {
        this.celular = value;
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
     *         &lt;element name="HorarioDisponible" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *         &lt;element name="HorarioPresente" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
        "horarioDisponible",
        "horarioPresente"
    })
    public static class Disponibilidad {

        @XmlElement(name = "HorarioDisponible", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String horarioDisponible;
        @XmlElement(name = "HorarioPresente", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String horarioPresente;

        /**
         * Obtiene el valor de la propiedad horarioDisponible.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHorarioDisponible() {
            return horarioDisponible;
        }

        /**
         * Define el valor de la propiedad horarioDisponible.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHorarioDisponible(String value) {
            this.horarioDisponible = value;
        }

        /**
         * Obtiene el valor de la propiedad horarioPresente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHorarioPresente() {
            return horarioPresente;
        }

        /**
         * Define el valor de la propiedad horarioPresente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHorarioPresente(String value) {
            this.horarioPresente = value;
        }

    }

}
