
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Domicilio2Salida;


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
 *         &lt;element name="Direccion" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}domicilio2salida" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaGeorreferenciacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SolicitudVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estandarizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "direccion",
    "fechaUltimaActualizacion",
    "fechaGeorreferenciacion",
    "solicitudVerificacion",
    "estandarizado"
})
@XmlRootElement(name = "Domicilio")
public class Domicilio {

    @XmlElement(name = "Direccion")
    protected Domicilio2Salida direccion;
    @XmlElement(name = "FechaUltimaActualizacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacion;
    @XmlElement(name = "FechaGeorreferenciacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaGeorreferenciacion;
    @XmlElement(name = "SolicitudVerificacion")
    protected String solicitudVerificacion;
    @XmlElement(name = "Estandarizado")
    protected String estandarizado;

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link Domicilio2Salida }
     *     
     */
    public Domicilio2Salida getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Domicilio2Salida }
     *     
     */
    public void setDireccion(Domicilio2Salida value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaActualizacion(XMLGregorianCalendar value) {
        this.fechaUltimaActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaGeorreferenciacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaGeorreferenciacion() {
        return fechaGeorreferenciacion;
    }

    /**
     * Define el valor de la propiedad fechaGeorreferenciacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaGeorreferenciacion(XMLGregorianCalendar value) {
        this.fechaGeorreferenciacion = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitudVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicitudVerificacion() {
        return solicitudVerificacion;
    }

    /**
     * Define el valor de la propiedad solicitudVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicitudVerificacion(String value) {
        this.solicitudVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstandarizado() {
        return estandarizado;
    }

    /**
     * Define el valor de la propiedad estandarizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstandarizado(String value) {
        this.estandarizado = value;
    }

}
