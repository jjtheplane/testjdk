
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.obtenerclienterequest._4_0_0;

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
 *       &lt;all&gt;
 *         &lt;element name="SolicitaDatosOrganizacion" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaNombresAdicionales" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosClienteREAL" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/obtenerclienterequest/4_0_0}empty" minOccurs="0"/&gt;
 *         &lt;element name="SolicitaDatosIERIC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlRootElement(name = "SolicitudDatosPersonaJuridica")
public class SolicitudDatosPersonaJuridica {

    @XmlElement(name = "SolicitaDatosOrganizacion")
    protected Boolean solicitaDatosOrganizacion;
    @XmlElement(name = "SolicitaNombresAdicionales")
    protected Boolean solicitaNombresAdicionales;
    @XmlElement(name = "SolicitaDatosClienteREAL")
    protected Boolean solicitaDatosClienteREAL;
    @XmlElement(name = "SolicitaDatosIERIC")
    protected Boolean solicitaDatosIERIC;

    /**
     * Obtiene el valor de la propiedad solicitaDatosOrganizacion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosOrganizacion() {
        return solicitaDatosOrganizacion;
    }

    /**
     * Define el valor de la propiedad solicitaDatosOrganizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosOrganizacion(Boolean value) {
        this.solicitaDatosOrganizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaNombresAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaNombresAdicionales() {
        return solicitaNombresAdicionales;
    }

    /**
     * Define el valor de la propiedad solicitaNombresAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaNombresAdicionales(Boolean value) {
        this.solicitaNombresAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosClienteREAL.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosClienteREAL() {
        return solicitaDatosClienteREAL;
    }

    /**
     * Define el valor de la propiedad solicitaDatosClienteREAL.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosClienteREAL(Boolean value) {
        this.solicitaDatosClienteREAL = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitaDatosIERIC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaDatosIERIC() {
        return solicitaDatosIERIC;
    }

    /**
     * Define el valor de la propiedad solicitaDatosIERIC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaDatosIERIC(Boolean value) {
        this.solicitaDatosIERIC = value;
    }

}
