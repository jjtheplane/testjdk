
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idCuentaPasivas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idCuentaPasivas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoSubsistema" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}numeric2"/&gt;
 *         &lt;element name="CodigoMoneda" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}numeric2"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/2_0_0}numeroCuenta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idCuentaPasivas", propOrder = {
    "codigoSubsistema",
    "codigoMoneda",
    "numeroCuenta"
})
public class IdCuentaPasivas {

    @XmlElement(name = "CodigoSubsistema")
    @XmlSchemaType(name = "unsignedLong")
    protected int codigoSubsistema;
    @XmlElement(name = "CodigoMoneda")
    @XmlSchemaType(name = "unsignedLong")
    protected int codigoMoneda;
    @XmlElement(name = "NumeroCuenta", required = true)
    protected NumeroCuenta numeroCuenta;

    /**
     * Obtiene el valor de la propiedad codigoSubsistema.
     * 
     */
    public int getCodigoSubsistema() {
        return codigoSubsistema;
    }

    /**
     * Define el valor de la propiedad codigoSubsistema.
     * 
     */
    public void setCodigoSubsistema(int value) {
        this.codigoSubsistema = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMoneda.
     * 
     */
    public int getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Define el valor de la propiedad codigoMoneda.
     * 
     */
    public void setCodigoMoneda(int value) {
        this.codigoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link NumeroCuenta }
     *     
     */
    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link NumeroCuenta }
     *     
     */
    public void setNumeroCuenta(NumeroCuenta value) {
        this.numeroCuenta = value;
    }

}
