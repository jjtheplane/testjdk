
package ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idCuentaTarjetas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="idCuentaTarjetas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoMarca" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}numeric3"/&gt;
 *         &lt;element name="NumeroCuentaCredito" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0}numeric10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idCuentaTarjetas", propOrder = {
    "codigoMarca",
    "numeroCuentaCredito"
})
public class IdCuentaTarjetas {

    @XmlElement(name = "CodigoMarca")
    protected int codigoMarca;
    @XmlElement(name = "NumeroCuentaCredito", required = true)
    protected BigDecimal numeroCuentaCredito;

    /**
     * Obtiene el valor de la propiedad codigoMarca.
     * 
     */
    public int getCodigoMarca() {
        return codigoMarca;
    }

    /**
     * Define el valor de la propiedad codigoMarca.
     * 
     */
    public void setCodigoMarca(int value) {
        this.codigoMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuentaCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroCuentaCredito() {
        return numeroCuentaCredito;
    }

    /**
     * Define el valor de la propiedad numeroCuentaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroCuentaCredito(BigDecimal value) {
        this.numeroCuentaCredito = value;
    }

}
