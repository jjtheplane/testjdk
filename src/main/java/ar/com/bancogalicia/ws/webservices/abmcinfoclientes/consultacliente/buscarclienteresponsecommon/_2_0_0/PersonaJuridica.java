
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteresponsecommon._2_0_0;

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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclienteresponsecommon/2_0_0}DatosPersonaComunes"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "nombre"
})
@XmlRootElement(name = "PersonaJuridica")
public class PersonaJuridica {

    @XmlElement(name = "DatosPersonaComunes", required = true)
    protected DatosPersonaComunes datosPersonaComunes;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;

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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
