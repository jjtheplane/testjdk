
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Excluido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="FechaTramite" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "DatosAutonomo")
public class DatosAutonomo {

    @XmlElement(name = "Excluido")
    protected String excluido;
    @XmlElement(name = "Comprobante")
    protected String comprobante;
    @XmlElement(name = "Periodo")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger periodo;
    @XmlElement(name = "FechaTramite")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaTramite;

    /**
     * Obtiene el valor de la propiedad excluido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcluido() {
        return excluido;
    }

    /**
     * Define el valor de la propiedad excluido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcluido(String value) {
        this.excluido = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComprobante() {
        return comprobante;
    }

    /**
     * Define el valor de la propiedad comprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComprobante(String value) {
        this.comprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriodo(BigInteger value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTramite.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTramite() {
        return fechaTramite;
    }

    /**
     * Define el valor de la propiedad fechaTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTramite(XMLGregorianCalendar value) {
        this.fechaTramite = value;
    }

}
