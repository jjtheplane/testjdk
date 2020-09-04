
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="Direccion" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}domicilio2salida"/&gt;
 *         &lt;element name="Estandarizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaGeorreferenciacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="UsoBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioDisponible1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioDisponible2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioPresente1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioPresente2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarcaSolicitudVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaSolicitudVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoVerificacion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
    "estandarizado",
    "fechaUltimaActualizacion",
    "fechaGeorreferenciacion",
    "id",
    "codigoTipo",
    "usoBanco",
    "horarioDisponible1",
    "horarioDisponible2",
    "horarioPresente1",
    "horarioPresente2",
    "marcaSolicitudVerificacion",
    "fechaSolicitudVerificacion",
    "codigoVerificacion",
    "fechaVerificacion",
    "codigoError"
})
@XmlRootElement(name = "Domicilio")
public class Domicilio {

    @XmlElement(name = "Direccion", required = true)
    protected Domicilio2Salida direccion;
    @XmlElement(name = "Estandarizado")
    protected String estandarizado;
    @XmlElement(name = "FechaUltimaActualizacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacion;
    @XmlElement(name = "FechaGeorreferenciacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaGeorreferenciacion;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "CodigoTipo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoTipo;
    @XmlElement(name = "UsoBanco")
    protected String usoBanco;
    @XmlElement(name = "HorarioDisponible1")
    protected String horarioDisponible1;
    @XmlElement(name = "HorarioDisponible2")
    protected String horarioDisponible2;
    @XmlElement(name = "HorarioPresente1")
    protected String horarioPresente1;
    @XmlElement(name = "HorarioPresente2")
    protected String horarioPresente2;
    @XmlElement(name = "MarcaSolicitudVerificacion")
    protected String marcaSolicitudVerificacion;
    @XmlElement(name = "FechaSolicitudVerificacion")
    protected String fechaSolicitudVerificacion;
    @XmlElement(name = "CodigoVerificacion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoVerificacion;
    @XmlElement(name = "FechaVerificacion")
    protected String fechaVerificacion;
    @XmlElement(name = "CodigoError")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoError;

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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipo() {
        return codigoTipo;
    }

    /**
     * Define el valor de la propiedad codigoTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipo(String value) {
        this.codigoTipo = value;
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
     * Obtiene el valor de la propiedad horarioDisponible1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioDisponible1() {
        return horarioDisponible1;
    }

    /**
     * Define el valor de la propiedad horarioDisponible1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioDisponible1(String value) {
        this.horarioDisponible1 = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioDisponible2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioDisponible2() {
        return horarioDisponible2;
    }

    /**
     * Define el valor de la propiedad horarioDisponible2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioDisponible2(String value) {
        this.horarioDisponible2 = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioPresente1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioPresente1() {
        return horarioPresente1;
    }

    /**
     * Define el valor de la propiedad horarioPresente1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioPresente1(String value) {
        this.horarioPresente1 = value;
    }

    /**
     * Obtiene el valor de la propiedad horarioPresente2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioPresente2() {
        return horarioPresente2;
    }

    /**
     * Define el valor de la propiedad horarioPresente2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioPresente2(String value) {
        this.horarioPresente2 = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaSolicitudVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaSolicitudVerificacion() {
        return marcaSolicitudVerificacion;
    }

    /**
     * Define el valor de la propiedad marcaSolicitudVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaSolicitudVerificacion(String value) {
        this.marcaSolicitudVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSolicitudVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSolicitudVerificacion() {
        return fechaSolicitudVerificacion;
    }

    /**
     * Define el valor de la propiedad fechaSolicitudVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSolicitudVerificacion(String value) {
        this.fechaSolicitudVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    /**
     * Define el valor de la propiedad codigoVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerificacion(String value) {
        this.codigoVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVerificacion() {
        return fechaVerificacion;
    }

    /**
     * Define el valor de la propiedad fechaVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVerificacion(String value) {
        this.fechaVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

}
