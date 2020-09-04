
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosresponse._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteresponsecommon._2_0_0.BuscarClienteResponse;


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
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosresponse/2_0_0}BuscarClientePorDatosBasicosResponse"/&gt;
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
    "buscarClientePorDatosBasicosResponse"
})
@XmlRootElement(name = "BuscarClientePorDatosBasicosResult")
public class BuscarClientePorDatosBasicosResult {

    @XmlElement(name = "BuscarClientePorDatosBasicosResponse", required = true)
    protected BuscarClienteResponse buscarClientePorDatosBasicosResponse;

    /**
     * Obtiene el valor de la propiedad buscarClientePorDatosBasicosResponse.
     * 
     * @return
     *     possible object is
     *     {@link BuscarClienteResponse }
     *     
     */
    public BuscarClienteResponse getBuscarClientePorDatosBasicosResponse() {
        return buscarClientePorDatosBasicosResponse;
    }

    /**
     * Define el valor de la propiedad buscarClientePorDatosBasicosResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscarClienteResponse }
     *     
     */
    public void setBuscarClientePorDatosBasicosResponse(BuscarClienteResponse value) {
        this.buscarClientePorDatosBasicosResponse = value;
    }

}
