
package ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigo;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigov2;


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
 *         &lt;element name="ValorCliente" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerclasificacionsegunmovimientosresponse/2_0_0}OrigenCliente" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Segmento" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Codigo" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigov2"/&gt;
 *                   &lt;element name="Rol" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigov2"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CodigoClasificacion" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerclasificacionsegunmovimientosresponse/2_0_0}SucursalMadre" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/consultacliente/obtenerclasificacionsegunmovimientosresponse/2_0_0}FuncionarioVigente" minOccurs="0"/&gt;
 *         &lt;element name="ClienteReal" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
 *         &lt;element name="ClientePrefer" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
 *         &lt;element name="ClientePrivate" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigo"/&gt;
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
    "valorCliente",
    "origenCliente",
    "segmento",
    "codigoClasificacion",
    "sucursalMadre",
    "funcionarioVigente",
    "clienteReal",
    "clientePrefer",
    "clientePrivate"
})
@XmlRootElement(name = "ClasificacionCliente")
public class ClasificacionCliente {

    @XmlElement(name = "ValorCliente", required = true)
    protected Codigo valorCliente;
    @XmlElement(name = "OrigenCliente")
    protected List<OrigenCliente> origenCliente;
    @XmlElement(name = "Segmento")
    protected ClasificacionCliente.Segmento segmento;
    @XmlElement(name = "CodigoClasificacion")
    protected Codigo codigoClasificacion;
    @XmlElement(name = "SucursalMadre")
    protected SucursalMadre sucursalMadre;
    @XmlElement(name = "FuncionarioVigente")
    protected FuncionarioVigente funcionarioVigente;
    @XmlElement(name = "ClienteReal", required = true)
    protected Codigo clienteReal;
    @XmlElement(name = "ClientePrefer", required = true)
    protected Codigo clientePrefer;
    @XmlElement(name = "ClientePrivate", required = true)
    protected Codigo clientePrivate;

    /**
     * Obtiene el valor de la propiedad valorCliente.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getValorCliente() {
        return valorCliente;
    }

    /**
     * Define el valor de la propiedad valorCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setValorCliente(Codigo value) {
        this.valorCliente = value;
    }

    /**
     * Gets the value of the origenCliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origenCliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigenCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrigenCliente }
     * 
     * 
     */
    public List<OrigenCliente> getOrigenCliente() {
        if (origenCliente == null) {
            origenCliente = new ArrayList<OrigenCliente>();
        }
        return this.origenCliente;
    }

    /**
     * Obtiene el valor de la propiedad segmento.
     * 
     * @return
     *     possible object is
     *     {@link ClasificacionCliente.Segmento }
     *     
     */
    public ClasificacionCliente.Segmento getSegmento() {
        return segmento;
    }

    /**
     * Define el valor de la propiedad segmento.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasificacionCliente.Segmento }
     *     
     */
    public void setSegmento(ClasificacionCliente.Segmento value) {
        this.segmento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClasificacion.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigoClasificacion() {
        return codigoClasificacion;
    }

    /**
     * Define el valor de la propiedad codigoClasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigoClasificacion(Codigo value) {
        this.codigoClasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursalMadre.
     * 
     * @return
     *     possible object is
     *     {@link SucursalMadre }
     *     
     */
    public SucursalMadre getSucursalMadre() {
        return sucursalMadre;
    }

    /**
     * Define el valor de la propiedad sucursalMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link SucursalMadre }
     *     
     */
    public void setSucursalMadre(SucursalMadre value) {
        this.sucursalMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad funcionarioVigente.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioVigente }
     *     
     */
    public FuncionarioVigente getFuncionarioVigente() {
        return funcionarioVigente;
    }

    /**
     * Define el valor de la propiedad funcionarioVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioVigente }
     *     
     */
    public void setFuncionarioVigente(FuncionarioVigente value) {
        this.funcionarioVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteReal.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getClienteReal() {
        return clienteReal;
    }

    /**
     * Define el valor de la propiedad clienteReal.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setClienteReal(Codigo value) {
        this.clienteReal = value;
    }

    /**
     * Obtiene el valor de la propiedad clientePrefer.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getClientePrefer() {
        return clientePrefer;
    }

    /**
     * Define el valor de la propiedad clientePrefer.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setClientePrefer(Codigo value) {
        this.clientePrefer = value;
    }

    /**
     * Obtiene el valor de la propiedad clientePrivate.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getClientePrivate() {
        return clientePrivate;
    }

    /**
     * Define el valor de la propiedad clientePrivate.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setClientePrivate(Codigo value) {
        this.clientePrivate = value;
    }


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
     *         &lt;element name="Codigo" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigov2"/&gt;
     *         &lt;element name="Rol" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0}codigov2"/&gt;
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
        "codigo",
        "rol"
    })
    public static class Segmento {

        @XmlElement(name = "Codigo", required = true)
        protected Codigov2 codigo;
        @XmlElement(name = "Rol", required = true)
        protected Codigov2 rol;

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link Codigov2 }
         *     
         */
        public Codigov2 getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link Codigov2 }
         *     
         */
        public void setCodigo(Codigov2 value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad rol.
         * 
         * @return
         *     possible object is
         *     {@link Codigov2 }
         *     
         */
        public Codigov2 getRol() {
            return rol;
        }

        /**
         * Define el valor de la propiedad rol.
         * 
         * @param value
         *     allowed object is
         *     {@link Codigov2 }
         *     
         */
        public void setRol(Codigov2 value) {
            this.rol = value;
        }

    }

}
