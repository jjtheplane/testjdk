
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;group ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personajuridica/3_0_0}telefonoConId" minOccurs="0"/&gt;
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
    "idTelefono",
    "tipo",
    "basico",
    "codigoUso",
    "usoBanco",
    "disponibilidad"
})
@XmlRootElement(name = "Telefono")
public class Telefono {

    @XmlElement(name = "IdTelefono")
    protected String idTelefono;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "Basico")
    protected TelefonoBasicoRespuestaNV basico;
    @XmlElement(name = "CodigoUso")
    protected String codigoUso;
    @XmlElement(name = "UsoBanco")
    protected String usoBanco;
    @XmlElement(name = "Disponibilidad")
    protected Telefono.Disponibilidad disponibilidad;

    /**
     * Obtiene el valor de la propiedad idTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTelefono() {
        return idTelefono;
    }

    /**
     * Define el valor de la propiedad idTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTelefono(String value) {
        this.idTelefono = value;
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="HorarioDisponible" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="HorarioPresente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        protected String horarioDisponible;
        @XmlElement(name = "HorarioPresente", required = true)
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
