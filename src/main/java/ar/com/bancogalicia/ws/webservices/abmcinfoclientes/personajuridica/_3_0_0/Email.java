
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Email" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}emailURI" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="UsoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsoBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioDisponible1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioDisponible2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioPresente1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioPresente2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "email",
    "id",
    "codigoTipo",
    "usoPersona",
    "usoBanco",
    "horarioDisponible1",
    "horarioDisponible2",
    "horarioPresente1",
    "horarioPresente2"
})
@XmlRootElement(name = "Email")
public class Email {

    @XmlElement(name = "Email")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String email;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "CodigoTipo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoTipo;
    @XmlElement(name = "UsoPersona")
    protected String usoPersona;
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

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Obtiene el valor de la propiedad usoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoPersona() {
        return usoPersona;
    }

    /**
     * Define el valor de la propiedad usoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoPersona(String value) {
        this.usoPersona = value;
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

}
