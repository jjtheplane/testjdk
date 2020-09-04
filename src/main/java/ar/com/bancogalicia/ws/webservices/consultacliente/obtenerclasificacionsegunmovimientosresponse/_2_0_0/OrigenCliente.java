
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigo;


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
 *         &lt;element name="Tipo" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo" minOccurs="0"/&gt;
 *         &lt;element name="Codigo" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo" minOccurs="0"/&gt;
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
    "tipo",
    "codigo"
})
@XmlRootElement(name = "OrigenCliente")
public class OrigenCliente {

    @XmlElement(name = "Tipo")
    protected Codigo tipo;
    @XmlElement(name = "Codigo")
    protected Codigo codigo;

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setTipo(Codigo value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigo(Codigo value) {
        this.codigo = value;
    }

}
