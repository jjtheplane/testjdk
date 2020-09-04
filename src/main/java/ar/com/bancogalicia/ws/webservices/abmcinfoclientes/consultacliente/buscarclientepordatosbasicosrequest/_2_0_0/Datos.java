
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclientepordatosbasicosrequest._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._2_0_0.Documento;


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
 *         &lt;element name="Rellamada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}SeleccionTipoPersona"/&gt;
 *         &lt;element name="CriterioBusqueda"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}PorDocumento"/&gt;
 *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}PorRazonSocial"/&gt;
 *                   &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}PorNombreApellido"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "rellamada",
    "seleccionTipoPersona",
    "criterioBusqueda"
})
@XmlRootElement(name = "Datos")
public class Datos {

    @XmlElement(name = "Rellamada")
    protected String rellamada;
    @XmlElement(name = "SeleccionTipoPersona", required = true)
    protected String seleccionTipoPersona;
    @XmlElement(name = "CriterioBusqueda", required = true)
    protected Datos.CriterioBusqueda criterioBusqueda;

    /**
     * Obtiene el valor de la propiedad rellamada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRellamada() {
        return rellamada;
    }

    /**
     * Define el valor de la propiedad rellamada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRellamada(String value) {
        this.rellamada = value;
    }

    /**
     * Obtiene el valor de la propiedad seleccionTipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeleccionTipoPersona() {
        return seleccionTipoPersona;
    }

    /**
     * Define el valor de la propiedad seleccionTipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeleccionTipoPersona(String value) {
        this.seleccionTipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad criterioBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link Datos.CriterioBusqueda }
     *     
     */
    public Datos.CriterioBusqueda getCriterioBusqueda() {
        return criterioBusqueda;
    }

    /**
     * Define el valor de la propiedad criterioBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link Datos.CriterioBusqueda }
     *     
     */
    public void setCriterioBusqueda(Datos.CriterioBusqueda value) {
        this.criterioBusqueda = value;
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}PorDocumento"/&gt;
     *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}PorRazonSocial"/&gt;
     *         &lt;element ref="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/consultacliente/buscarclientepordatosbasicosrequest/2_0_0}PorNombreApellido"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "porDocumento",
        "porRazonSocial",
        "porNombreApellido"
    })
    public static class CriterioBusqueda {

        @XmlElement(name = "PorDocumento")
        protected Documento porDocumento;
        @XmlElement(name = "PorRazonSocial")
        protected PorRazonSocial porRazonSocial;
        @XmlElement(name = "PorNombreApellido")
        protected PorNombreApellido porNombreApellido;

        /**
         * Obtiene el valor de la propiedad porDocumento.
         * 
         * @return
         *     possible object is
         *     {@link Documento }
         *     
         */
        public Documento getPorDocumento() {
            return porDocumento;
        }

        /**
         * Define el valor de la propiedad porDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link Documento }
         *     
         */
        public void setPorDocumento(Documento value) {
            this.porDocumento = value;
        }

        /**
         * Obtiene el valor de la propiedad porRazonSocial.
         * 
         * @return
         *     possible object is
         *     {@link PorRazonSocial }
         *     
         */
        public PorRazonSocial getPorRazonSocial() {
            return porRazonSocial;
        }

        /**
         * Define el valor de la propiedad porRazonSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link PorRazonSocial }
         *     
         */
        public void setPorRazonSocial(PorRazonSocial value) {
            this.porRazonSocial = value;
        }

        /**
         * Obtiene el valor de la propiedad porNombreApellido.
         * 
         * @return
         *     possible object is
         *     {@link PorNombreApellido }
         *     
         */
        public PorNombreApellido getPorNombreApellido() {
            return porNombreApellido;
        }

        /**
         * Define el valor de la propiedad porNombreApellido.
         * 
         * @param value
         *     allowed object is
         *     {@link PorNombreApellido }
         *     
         */
        public void setPorNombreApellido(PorNombreApellido value) {
            this.porNombreApellido = value;
        }

    }

}
