
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idProductoBT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idProductoBT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoSubsistemaBT" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}numeric2"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}numeroCuenta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idProductoBT", propOrder = {
    "codigoSubsistemaBT",
    "numeroCuenta"
})
public class IdProductoBT {

    @XmlElement(name = "CodigoSubsistemaBT")
    protected int codigoSubsistemaBT;
    @XmlElement(name = "NumeroCuenta", required = true)
    protected NumeroCuenta numeroCuenta;

    /**
     * Obtiene el valor de la propiedad codigoSubsistemaBT.
     * 
     */
    public int getCodigoSubsistemaBT() {
        return codigoSubsistemaBT;
    }

    /**
     * Define el valor de la propiedad codigoSubsistemaBT.
     * 
     */
    public void setCodigoSubsistemaBT(int value) {
        this.codigoSubsistemaBT = value;
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
