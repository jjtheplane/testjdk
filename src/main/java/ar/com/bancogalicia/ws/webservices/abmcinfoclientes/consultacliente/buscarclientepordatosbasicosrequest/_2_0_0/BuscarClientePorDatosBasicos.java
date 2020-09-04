
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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}BuscarClientePorDatosBasicosRequest"/&gt;
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
    "buscarClientePorDatosBasicosRequest"
})
@XmlRootElement(name = "BuscarClientePorDatosBasicos")
public class BuscarClientePorDatosBasicos {

    @XmlElement(name = "BuscarClientePorDatosBasicosRequest", required = true)
    protected BuscarClientePorDatosBasicosRequest buscarClientePorDatosBasicosRequest;

    /**
     * Obtiene el valor de la propiedad buscarClientePorDatosBasicosRequest.
     * 
     * @return
     *     possible object is
     *     {@link BuscarClientePorDatosBasicosRequest }
     *     
     */
    public BuscarClientePorDatosBasicosRequest getBuscarClientePorDatosBasicosRequest() {
        return buscarClientePorDatosBasicosRequest;
    }

    /**
     * Define el valor de la propiedad buscarClientePorDatosBasicosRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscarClientePorDatosBasicosRequest }
     *     
     */
    public void setBuscarClientePorDatosBasicosRequest(BuscarClientePorDatosBasicosRequest value) {
        this.buscarClientePorDatosBasicosRequest = value;
    }

}
