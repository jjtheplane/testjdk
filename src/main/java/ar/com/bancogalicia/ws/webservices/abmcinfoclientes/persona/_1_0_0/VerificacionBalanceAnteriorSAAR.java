
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.persona._1_0_0;

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
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}InformeFecha"/&gt;
 *         &lt;element name="Periodo" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/persona/1_0_0}periodo" minOccurs="0"/&gt;
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
    "informe",
    "fecha",
    "periodo"
})
@XmlRootElement(name = "VerificacionBalanceAnteriorSAAR")
public class VerificacionBalanceAnteriorSAAR {

    @XmlElement(name = "Informe", required = true)
    protected String informe;
    @XmlElement(name = "Fecha")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Periodo")
    protected String periodo;

    /**
     * Obtiene el valor de la propiedad informe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInforme() {
        return informe;
    }

    /**
     * Define el valor de la propiedad informe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInforme(String value) {
        this.informe = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

}
