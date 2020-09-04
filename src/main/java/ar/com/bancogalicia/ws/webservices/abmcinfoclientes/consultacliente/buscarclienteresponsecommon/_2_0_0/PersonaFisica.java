
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteresponsecommon._2_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}DatosPersonaComunes"/&gt;
 *         &lt;element name="NombrePersona" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}nombrePersonaFisica"/&gt;
 *         &lt;element name="Documentos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Documento" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}documento" maxOccurs="2" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}sexo"/&gt;
 *         &lt;element name="IdConyuge" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}id" minOccurs="0"/&gt;
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
    "datosPersonaComunes",
    "nombrePersona",
    "documentos",
    "fechaNacimiento",
    "sexo",
    "idConyuge"
})
@XmlRootElement(name = "PersonaFisica")
public class PersonaFisica {

    @XmlElement(name = "DatosPersonaComunes", required = true)
    protected DatosPersonaComunes datosPersonaComunes;
    @XmlElement(name = "NombrePersona", required = true)
    protected NombrePersonaFisica nombrePersona;
    @XmlElement(name = "Documentos", required = true)
    protected PersonaFisica.Documentos documentos;
    @XmlElement(name = "FechaNacimiento")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElement(name = "Sexo", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sexo;
    @XmlElement(name = "IdConyuge")
    protected Id idConyuge;

    /**
     * Obtiene el valor de la propiedad datosPersonaComunes.
     * 
     * @return
     *     possible object is
     *     {@link DatosPersonaComunes }
     *     
     */
    public DatosPersonaComunes getDatosPersonaComunes() {
        return datosPersonaComunes;
    }

    /**
     * Define el valor de la propiedad datosPersonaComunes.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPersonaComunes }
     *     
     */
    public void setDatosPersonaComunes(DatosPersonaComunes value) {
        this.datosPersonaComunes = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePersona.
     * 
     * @return
     *     possible object is
     *     {@link NombrePersonaFisica }
     *     
     */
    public NombrePersonaFisica getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Define el valor de la propiedad nombrePersona.
     * 
     * @param value
     *     allowed object is
     *     {@link NombrePersonaFisica }
     *     
     */
    public void setNombrePersona(NombrePersonaFisica value) {
        this.nombrePersona = value;
    }

    /**
     * Obtiene el valor de la propiedad documentos.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisica.Documentos }
     *     
     */
    public PersonaFisica.Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Define el valor de la propiedad documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisica.Documentos }
     *     
     */
    public void setDocumentos(PersonaFisica.Documentos value) {
        this.documentos = value;
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
     * Obtiene el valor de la propiedad idConyuge.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getIdConyuge() {
        return idConyuge;
    }

    /**
     * Define el valor de la propiedad idConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setIdConyuge(Id value) {
        this.idConyuge = value;
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
     *         &lt;element name="Documento" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}documento" maxOccurs="2" minOccurs="0"/&gt;
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
