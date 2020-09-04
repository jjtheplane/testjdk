
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
 *         &lt;group ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}idOperacionGrupo"/&gt;
 *         &lt;element name="IdReferencia" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}idOperacionUnico" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}Operador" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}Canal"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}ModuloAplicativo"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}IpUsuarioFinal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/globales/bgbaheader/1_0_0}Consumidores"/&gt;
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
    "idOperacion",
    "idOperacionUnico",
    "idReferencia",
    "operador",
    "canal",
    "moduloAplicativo",
    "ipUsuarioFinal",
    "consumidores"
})
@XmlRootElement(name = "BGBAHeader")
public class BGBAHeader {

    @XmlElement(name = "IdOperacion")
    protected String idOperacion;
    @XmlElement(name = "IdOperacionUnico")
    protected IdOperacionUnico idOperacionUnico;
    @XmlElement(name = "IdReferencia")
    protected IdOperacionUnico idReferencia;
    @XmlElement(name = "Operador", nillable = true)
    protected String operador;
    @XmlElement(name = "Canal", required = true)
    protected String canal;
    @XmlElement(name = "ModuloAplicativo", required = true)
    protected ModuloAplicativo moduloAplicativo;
    @XmlElement(name = "IpUsuarioFinal")
    protected String ipUsuarioFinal;
    @XmlElement(name = "Consumidores", required = true)
    protected Consumidores consumidores;

    /**
     * Obtiene el valor de la propiedad idOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOperacion() {
        return idOperacion;
    }

    /**
     * Define el valor de la propiedad idOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOperacion(String value) {
        this.idOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOperacionUnico.
     * 
     * @return
     *     possible object is
     *     {@link IdOperacionUnico }
     *     
     */
    public IdOperacionUnico getIdOperacionUnico() {
        return idOperacionUnico;
    }

    /**
     * Define el valor de la propiedad idOperacionUnico.
     * 
     * @param value
     *     allowed object is
     *     {@link IdOperacionUnico }
     *     
     */
    public void setIdOperacionUnico(IdOperacionUnico value) {
        this.idOperacionUnico = value;
    }

    /**
     * Obtiene el valor de la propiedad idReferencia.
     * 
     * @return
     *     possible object is
     *     {@link IdOperacionUnico }
     *     
     */
    public IdOperacionUnico getIdReferencia() {
        return idReferencia;
    }

    /**
     * Define el valor de la propiedad idReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link IdOperacionUnico }
     *     
     */
    public void setIdReferencia(IdOperacionUnico value) {
        this.idReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad operador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Define el valor de la propiedad operador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperador(String value) {
        this.operador = value;
    }

    /**
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Obtiene el valor de la propiedad moduloAplicativo.
     * 
     * @return
     *     possible object is
     *     {@link ModuloAplicativo }
     *     
     */
    public ModuloAplicativo getModuloAplicativo() {
        return moduloAplicativo;
    }

    /**
     * Define el valor de la propiedad moduloAplicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuloAplicativo }
     *     
     */
    public void setModuloAplicativo(ModuloAplicativo value) {
        this.moduloAplicativo = value;
    }

    /**
     * Obtiene el valor de la propiedad ipUsuarioFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpUsuarioFinal() {
        return ipUsuarioFinal;
    }

    /**
     * Define el valor de la propiedad ipUsuarioFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpUsuarioFinal(String value) {
        this.ipUsuarioFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad consumidores.
     * 
     * @return
     *     possible object is
     *     {@link Consumidores }
     *     
     */
    public Consumidores getConsumidores() {
        return consumidores;
    }

    /**
     * Define el valor de la propiedad consumidores.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumidores }
     *     
     */
    public void setConsumidores(Consumidores value) {
        this.consumidores = value;
    }

}
