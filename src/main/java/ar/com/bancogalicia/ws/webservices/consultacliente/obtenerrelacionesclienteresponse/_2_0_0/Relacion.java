
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerrelacionesclienteresponse._2_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigo;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Documento;
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
 *         &lt;element name="CodigoRelacionPersonaPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
 *         &lt;element name="CodigoEstadoRelacion" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
 *         &lt;element name="IdPersona" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Documentos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Documento" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}documento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IdentificacionTributaria" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}documento" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}sexo"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RelacionObligatoria" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "codigoRelacionPersonaPersona",
    "codigoEstadoRelacion",
    "idPersona",
    "nombre",
    "documentos",
    "identificacionTributaria",
    "sexo",
    "fechaNacimiento",
    "relacionObligatoria"
})
@XmlRootElement(name = "Relacion")
public class Relacion {

    @XmlElement(name = "CodigoRelacionPersonaPersona", required = true)
    protected Codigo codigoRelacionPersonaPersona;
    @XmlElement(name = "CodigoEstadoRelacion", required = true)
    protected Codigo codigoEstadoRelacion;
    @XmlElement(name = "IdPersona", required = true)
    protected Id idPersona;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Documentos", required = true)
    protected Relacion.Documentos documentos;
    @XmlElement(name = "IdentificacionTributaria")
    protected Documento identificacionTributaria;
    @XmlElement(name = "Sexo", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sexo;
    @XmlElement(name = "FechaNacimiento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElement(name = "RelacionObligatoria")
    protected boolean relacionObligatoria;

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

    /**
     * Obtiene el valor de la propiedad codigoEstadoRelacion.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigoEstadoRelacion() {
        return codigoEstadoRelacion;
    }

    /**
     * Define el valor de la propiedad codigoEstadoRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigoEstadoRelacion(Codigo value) {
        this.codigoEstadoRelacion = value;
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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad documentos.
     * 
     * @return
     *     possible object is
     *     {@link Relacion.Documentos }
     *     
     */
    public Relacion.Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Define el valor de la propiedad documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Relacion.Documentos }
     *     
     */
    public void setDocumentos(Relacion.Documentos value) {
        this.documentos = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTributaria.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getIdentificacionTributaria() {
        return identificacionTributaria;
    }

    /**
     * Define el valor de la propiedad identificacionTributaria.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setIdentificacionTributaria(Documento value) {
        this.identificacionTributaria = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad relacionObligatoria.
     * 
     */
    public boolean isRelacionObligatoria() {
        return relacionObligatoria;
    }

    /**
     * Define el valor de la propiedad relacionObligatoria.
     * 
     */
    public void setRelacionObligatoria(boolean value) {
        this.relacionObligatoria = value;
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
     *         &lt;element name="Documento" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}documento" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "documento"
    })
    public static class Documentos {

        @XmlElement(name = "Documento")
        protected List<Documento> documento;

        /**
         * Gets the value of the documento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Documento }
         * 
         * 
         */
        public List<Documento> getDocumento() {
            if (documento == null) {
                documento = new ArrayList<Documento>();
            }
            return this.documento;
        }

    }

}
