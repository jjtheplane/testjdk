
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.consultacliente.buscarclienteporproductorequest._2_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Rellamada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CriterioBusqueda"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PorProducto"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CodigoSubsistema" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}numeric5"/&gt;
 *                             &lt;element name="CuentaNumero" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico25"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
    "criterioBusqueda"
})
@XmlRootElement(name = "Datos")
public class Datos {

    @XmlElement(name = "Rellamada")
    protected String rellamada;
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
     *       &lt;sequence&gt;
     *         &lt;element name="PorProducto"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CodigoSubsistema" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}numeric5"/&gt;
     *                   &lt;element name="CuentaNumero" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico25"/&gt;
     *                 &lt;/sequence&gt;
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
        "porProducto"
    })
    public static class CriterioBusqueda {

        @XmlElement(name = "PorProducto", required = true)
        protected Datos.CriterioBusqueda.PorProducto porProducto;

        /**
         * Obtiene el valor de la propiedad porProducto.
         * 
         * @return
         *     possible object is
         *     {@link Datos.CriterioBusqueda.PorProducto }
         *     
         */
        public Datos.CriterioBusqueda.PorProducto getPorProducto() {
            return porProducto;
        }

        /**
         * Define el valor de la propiedad porProducto.
         * 
         * @param value
         *     allowed object is
         *     {@link Datos.CriterioBusqueda.PorProducto }
         *     
         */
        public void setPorProducto(Datos.CriterioBusqueda.PorProducto value) {
            this.porProducto = value;
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
         *         &lt;element name="CodigoSubsistema" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}numeric5"/&gt;
         *         &lt;element name="CuentaNumero" type="{http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/2_0_0}alfanumerico25"/&gt;
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
            "codigoSubsistema",
            "cuentaNumero"
        })
        public static class PorProducto {

            @XmlElement(name = "CodigoSubsistema")
            @XmlSchemaType(name = "unsignedLong")
            protected int codigoSubsistema;
            @XmlElement(name = "CuentaNumero", required = true)
            protected String cuentaNumero;

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
             * Obtiene el valor de la propiedad cuentaNumero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCuentaNumero() {
                return cuentaNumero;
            }

            /**
             * Define el valor de la propiedad cuentaNumero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCuentaNumero(String value) {
                this.cuentaNumero = value;
            }

        }

    }

}
