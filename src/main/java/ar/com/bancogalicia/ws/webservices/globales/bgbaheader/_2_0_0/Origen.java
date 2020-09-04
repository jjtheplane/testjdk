
package ar.com.bancogalicia.ws.webservices.globales.bgbaheader._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Origen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Origen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}ModuloAplicativo"/&gt;
 *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrganizacionInterna" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}organizacionInterna" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}Equipo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}Terminal" minOccurs="0"/&gt;
 *         &lt;element name="FechaHoraCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}IdCliente" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}Operador" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/2_0_0}Supervision" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Origen", propOrder = {
    "moduloAplicativo",
    "canal",
    "organizacionInterna",
    "equipo",
    "terminal",
    "fechaHoraCreacion",
    "idCliente",
    "operador",
    "supervision"
})
public class Origen {

    @XmlElement(name = "ModuloAplicativo", required = true)
    protected ModuloAplicativo moduloAplicativo;
    @XmlElement(name = "Canal")
    protected String canal;
    @XmlElement(name = "OrganizacionInterna")
    protected OrganizacionInterna organizacionInterna;
    @XmlElement(name = "Equipo")
    protected Equipo equipo;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "FechaHoraCreacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCreacion;
    @XmlElement(name = "IdCliente")
    protected IdCliente idCliente;
    @XmlElement(name = "Operador")
    protected Operador operador;
    @XmlElement(name = "Supervision")
    protected String supervision;

    /**
     * Obtiene el valor de la propiedad moduloAplicativo.
     * 
     * @return
     *     possible object is
     *     {@link ModuloAplicativo }
     *     
     */
    public ModuloAplicativo getModuloAplicativo() {
        return moduloAplicativo;
    }

    /**
     * Define el valor de la propiedad moduloAplicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuloAplicativo }
     *     
     */
    public void setModuloAplicativo(ModuloAplicativo value) {
        this.moduloAplicativo = value;
    }

    /**
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Obtiene el valor de la propiedad organizacionInterna.
     * 
     * @return
     *     possible object is
     *     {@link OrganizacionInterna }
     *     
     */
    public OrganizacionInterna getOrganizacionInterna() {
        return organizacionInterna;
    }

    /**
     * Define el valor de la propiedad organizacionInterna.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizacionInterna }
     *     
     */
    public void setOrganizacionInterna(OrganizacionInterna value) {
        this.organizacionInterna = value;
    }

    /**
     * Identificación de la máquina que generó el mensaje Original
     * 
     * @return
     *     possible object is
     *     {@link Equipo }
     *     
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Define el valor de la propiedad equipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipo }
     *     
     */
    public void setEquipo(Equipo value) {
        this.equipo = value;
    }

    /**
     * Terminal donde se generó el mensaje Original
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Define el valor de la propiedad terminal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    /**
     * Define el valor de la propiedad fechaHoraCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraCreacion(XMLGregorianCalendar value) {
        this.fechaHoraCreacion = value;
    }

    /**
     * Identificador del cliente para el cual se generó el mensaje Original
     * 
     * @return
     *     possible object is
     *     {@link IdCliente }
     *     
     */
    public IdCliente getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCliente }
     *     
     */
    public void setIdCliente(IdCliente value) {
        this.idCliente = value;
    }

    /**
     * Legajo del operador que generó el mensaje Original
     * 
     * @return
     *     possible object is
     *     {@link Operador }
     *     
     */
    public Operador getOperador() {
        return operador;
    }

    /**
     * Define el valor de la propiedad operador.
     * 
     * @param value
     *     allowed object is
     *     {@link Operador }
     *     
     */
    public void setOperador(Operador value) {
        this.operador = value;
    }

    /**
     * Información relevante a la autorización necesaria para ejecutar la operación
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervision() {
        return supervision;
    }

    /**
     * Define el valor de la propiedad supervision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervision(String value) {
        this.supervision = value;
    }

}
