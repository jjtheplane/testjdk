
package ar.com.bancogalicia.ws.webservices.globales.bgbaheader._1_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}IdGalicia"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}IdInterno"/&gt;
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
    "idGalicia",
    "idInterno"
})
@XmlRootElement(name = "ModuloAplicativo")
public class ModuloAplicativo {

    @XmlElement(name = "IdGalicia", required = true)
    protected String idGalicia;
    @XmlElement(name = "IdInterno", required = true)
    protected String idInterno;

    /**
     * Obtiene el valor de la propiedad idGalicia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdGalicia() {
        return idGalicia;
    }

    /**
     * Define el valor de la propiedad idGalicia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdGalicia(String value) {
        this.idGalicia = value;
    }

    /**
     * Obtiene el valor de la propiedad idInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInterno() {
        return idInterno;
    }

    /**
     * Define el valor de la propiedad idInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInterno(String value) {
        this.idInterno = value;
    }

}
