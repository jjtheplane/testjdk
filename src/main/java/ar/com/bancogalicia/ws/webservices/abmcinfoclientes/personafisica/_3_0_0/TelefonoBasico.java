
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para telefonoBasico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="telefonoBasico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Basico" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}telefonoBasicoRespuestaNV"/&gt;
 *         &lt;group ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}telefonoExtra"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telefonoBasico", propOrder = {
    "basico",
    "codigoUso",
    "usoBanco",
    "disponibilidad"
})
public class TelefonoBasico {

    @XmlElement(name = "Basico", required = true)
    protected TelefonoBasicoRespuestaNV basico;
    @XmlElement(name = "CodigoUso")
    protected String codigoUso;
    @XmlElement(name = "UsoBanco")
    protected String usoBanco;
    @XmlElement(name = "Disponibilidad")
    protected TelefonoBasico.Disponibilidad disponibilidad;

    /**
     * Obtiene el valor de la propiedad basico.
     * 
     * @return
     *     possible object is
     *     {@link TelefonoBasicoRespuestaNV }
     *     
     */
    public TelefonoBasicoRespuestaNV getBasico() {
        return basico;
    }

    /**
     * Define el valor de la propiedad basico.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonoBasicoRespuestaNV }
     *     
     */
    public void setBasico(TelefonoBasicoRespuestaNV value) {
        this.basico = value;
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
     *     {@link TelefonoBasico.Disponibilidad }
     *     
     */
    public TelefonoBasico.Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Define el valor de la propiedad disponibilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonoBasico.Disponibilidad }
     *     
     */
    public void setDisponibilidad(TelefonoBasico.Disponibilidad value) {
        this.disponibilidad = value;
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
