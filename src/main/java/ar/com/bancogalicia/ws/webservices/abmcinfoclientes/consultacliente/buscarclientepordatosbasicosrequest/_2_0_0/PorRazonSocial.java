
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosrequest._2_0_0;

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
 *         &lt;element name="RazonSocial" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}string90"/&gt;
 *         &lt;element name="TipoBusqueda" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico2"/&gt;
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
    "razonSocial",
    "tipoBusqueda"
})
@XmlRootElement(name = "PorRazonSocial")
public class PorRazonSocial {

    @XmlElement(name = "RazonSocial", required = true)
    protected String razonSocial;
    @XmlElement(name = "TipoBusqueda", required = true)
    protected String tipoBusqueda;

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBusqueda() {
        return tipoBusqueda;
    }

    /**
     * Define el valor de la propiedad tipoBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBusqueda(String value) {
        this.tipoBusqueda = value;
    }

}
