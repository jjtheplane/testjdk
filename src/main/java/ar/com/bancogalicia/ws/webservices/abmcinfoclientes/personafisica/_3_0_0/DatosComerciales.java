
package ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="FechaDeclaracionIngresos" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IngresoFijo" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="IngresoVariable" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="IngresoNoDemostrado" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="DeudaOtro" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="CuotaOtro" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="DeudaComercial" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="CuotaComercial" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="DeudaHipotecaria" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="CuotaHipotecaria" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="DeudaPersonal" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="CuotaPersonal" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="GastosFijos" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="ValorPropiedad" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="FechaHabitaVivienda" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MarcaTieneHipoteca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImporteAlquilerPropiedad" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="CodigoNivelEstudio" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MarcaAcreditaHaberes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicioLaboral" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOcupacion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTrabajoRelacionDependencia" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCargoLaboral" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTrabajoIndependiente" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CantidadPersonasACargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeParticipacionNegocio" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}porcentajeEntero" minOccurs="0"/&gt;
 *         &lt;element name="AnioFundacion" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}anio" minOccurs="0"/&gt;
 *         &lt;element name="VentasBrutasMensual" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="ComprasBrutasMensual" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="MarcaLocalPropio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaCliente" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DeclaracionJuradaIngresosBrutos" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="DeclaracionJuradaGananciaNeta" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="DeclaracionJuradaIngresos" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="DeclaracionJuradaGanancias" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="DeclaracionJuradaParticipacionGanancias" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="DeclaracionJuradaPatrimonioNeto" type="{http://ws.bancogalicia.com.ar/webservices/abmcinfoclientes/personafisica/3_0_0}decimal16_2" minOccurs="0"/&gt;
 *         &lt;element name="CodigoActividadMonotributo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCategoriaMonotributo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="TipoMedioVinculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPautaIngreso" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CodigoMonedaIngreso" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaIngresoPais" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaActividadPrincipal" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MarcaBastanteo" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
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
    "fechaDeclaracionIngresos",
    "ingresoFijo",
    "ingresoVariable",
    "ingresoNoDemostrado",
    "deudaOtro",
    "cuotaOtro",
    "deudaComercial",
    "cuotaComercial",
    "deudaHipotecaria",
    "cuotaHipotecaria",
    "deudaPersonal",
    "cuotaPersonal",
    "gastosFijos",
    "valorPropiedad",
    "fechaHabitaVivienda",
    "marcaTieneHipoteca",
    "importeAlquilerPropiedad",
    "codigoNivelEstudio",
    "marcaAcreditaHaberes",
    "fechaInicioLaboral",
    "codigoOcupacion",
    "codigoTrabajoRelacionDependencia",
    "codigoCargoLaboral",
    "codigoTrabajoIndependiente",
    "cantidadPersonasACargo",
    "tipoNegocio",
    "porcentajeParticipacionNegocio",
    "anioFundacion",
    "ventasBrutasMensual",
    "comprasBrutasMensual",
    "marcaLocalPropio",
    "fechaCliente",
    "declaracionJuradaIngresosBrutos",
    "declaracionJuradaGananciaNeta",
    "declaracionJuradaIngresos",
    "declaracionJuradaGanancias",
    "declaracionJuradaParticipacionGanancias",
    "declaracionJuradaPatrimonioNeto",
    "codigoActividadMonotributo",
    "codigoCategoriaMonotributo",
    "tipoMedioVinculacion",
    "tipoIngreso",
    "codigoPautaIngreso",
    "codigoMonedaIngreso",
    "fechaIngresoPais",
    "codigoProvinciaActividadPrincipal",
    "marcaBastanteo"
})
@XmlRootElement(name = "DatosComerciales")
public class DatosComerciales {

    @XmlElement(name = "FechaDeclaracionIngresos")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDeclaracionIngresos;
    @XmlElement(name = "IngresoFijo")
    protected BigDecimal ingresoFijo;
    @XmlElement(name = "IngresoVariable")
    protected BigDecimal ingresoVariable;
    @XmlElement(name = "IngresoNoDemostrado")
    protected BigDecimal ingresoNoDemostrado;
    @XmlElement(name = "DeudaOtro")
    protected BigDecimal deudaOtro;
    @XmlElement(name = "CuotaOtro")
    protected BigDecimal cuotaOtro;
    @XmlElement(name = "DeudaComercial")
    protected BigDecimal deudaComercial;
    @XmlElement(name = "CuotaComercial")
    protected BigDecimal cuotaComercial;
    @XmlElement(name = "DeudaHipotecaria")
    protected BigDecimal deudaHipotecaria;
    @XmlElement(name = "CuotaHipotecaria")
    protected BigDecimal cuotaHipotecaria;
    @XmlElement(name = "DeudaPersonal")
    protected BigDecimal deudaPersonal;
    @XmlElement(name = "CuotaPersonal")
    protected BigDecimal cuotaPersonal;
    @XmlElement(name = "GastosFijos")
    protected BigDecimal gastosFijos;
    @XmlElement(name = "ValorPropiedad")
    protected BigDecimal valorPropiedad;
    @XmlElement(name = "FechaHabitaVivienda")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaHabitaVivienda;
    @XmlElement(name = "MarcaTieneHipoteca")
    protected String marcaTieneHipoteca;
    @XmlElement(name = "ImporteAlquilerPropiedad")
    protected BigDecimal importeAlquilerPropiedad;
    @XmlElement(name = "CodigoNivelEstudio")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoNivelEstudio;
    @XmlElement(name = "MarcaAcreditaHaberes")
    protected String marcaAcreditaHaberes;
    @XmlElement(name = "FechaInicioLaboral")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicioLaboral;
    @XmlElement(name = "CodigoOcupacion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoOcupacion;
    @XmlElement(name = "CodigoTrabajoRelacionDependencia")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoTrabajoRelacionDependencia;
    @XmlElement(name = "CodigoCargoLaboral")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoCargoLaboral;
    @XmlElement(name = "CodigoTrabajoIndependiente")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoTrabajoIndependiente;
    @XmlElement(name = "CantidadPersonasACargo")
    protected String cantidadPersonasACargo;
    @XmlElement(name = "TipoNegocio")
    protected String tipoNegocio;
    @XmlElement(name = "PorcentajeParticipacionNegocio")
    protected BigDecimal porcentajeParticipacionNegocio;
    @XmlElement(name = "AnioFundacion")
    protected String anioFundacion;
    @XmlElement(name = "VentasBrutasMensual")
    protected BigDecimal ventasBrutasMensual;
    @XmlElement(name = "ComprasBrutasMensual")
    protected BigDecimal comprasBrutasMensual;
    @XmlElement(name = "MarcaLocalPropio")
    protected String marcaLocalPropio;
    @XmlElement(name = "FechaCliente")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCliente;
    @XmlElement(name = "DeclaracionJuradaIngresosBrutos")
    protected BigDecimal declaracionJuradaIngresosBrutos;
    @XmlElement(name = "DeclaracionJuradaGananciaNeta")
    protected BigDecimal declaracionJuradaGananciaNeta;
    @XmlElement(name = "DeclaracionJuradaIngresos")
    protected BigDecimal declaracionJuradaIngresos;
    @XmlElement(name = "DeclaracionJuradaGanancias")
    protected BigDecimal declaracionJuradaGanancias;
    @XmlElement(name = "DeclaracionJuradaParticipacionGanancias")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger declaracionJuradaParticipacionGanancias;
    @XmlElement(name = "DeclaracionJuradaPatrimonioNeto")
    protected BigDecimal declaracionJuradaPatrimonioNeto;
    @XmlElement(name = "CodigoActividadMonotributo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoActividadMonotributo;
    @XmlElement(name = "CodigoCategoriaMonotributo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoCategoriaMonotributo;
    @XmlElement(name = "TipoMedioVinculacion")
    protected String tipoMedioVinculacion;
    @XmlElement(name = "TipoIngreso")
    protected String tipoIngreso;
    @XmlElement(name = "CodigoPautaIngreso")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoPautaIngreso;
    @XmlElement(name = "CodigoMonedaIngreso")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoMonedaIngreso;
    @XmlElement(name = "FechaIngresoPais")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaIngresoPais;
    @XmlElement(name = "CodigoProvinciaActividadPrincipal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoProvinciaActividadPrincipal;
    @XmlElement(name = "MarcaBastanteo")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger marcaBastanteo;

    /**
     * Obtiene el valor de la propiedad fechaDeclaracionIngresos.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDeclaracionIngresos() {
        return fechaDeclaracionIngresos;
    }

    /**
     * Define el valor de la propiedad fechaDeclaracionIngresos.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDeclaracionIngresos(XMLGregorianCalendar value) {
        this.fechaDeclaracionIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoFijo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoFijo() {
        return ingresoFijo;
    }

    /**
     * Define el valor de la propiedad ingresoFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoFijo(BigDecimal value) {
        this.ingresoFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoVariable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoVariable() {
        return ingresoVariable;
    }

    /**
     * Define el valor de la propiedad ingresoVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoVariable(BigDecimal value) {
        this.ingresoVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoNoDemostrado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoNoDemostrado() {
        return ingresoNoDemostrado;
    }

    /**
     * Define el valor de la propiedad ingresoNoDemostrado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoNoDemostrado(BigDecimal value) {
        this.ingresoNoDemostrado = value;
    }

    /**
     * Obtiene el valor de la propiedad deudaOtro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeudaOtro() {
        return deudaOtro;
    }

    /**
     * Define el valor de la propiedad deudaOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeudaOtro(BigDecimal value) {
        this.deudaOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaOtro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuotaOtro() {
        return cuotaOtro;
    }

    /**
     * Define el valor de la propiedad cuotaOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuotaOtro(BigDecimal value) {
        this.cuotaOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad deudaComercial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeudaComercial() {
        return deudaComercial;
    }

    /**
     * Define el valor de la propiedad deudaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeudaComercial(BigDecimal value) {
        this.deudaComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaComercial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuotaComercial() {
        return cuotaComercial;
    }

    /**
     * Define el valor de la propiedad cuotaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuotaComercial(BigDecimal value) {
        this.cuotaComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad deudaHipotecaria.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeudaHipotecaria() {
        return deudaHipotecaria;
    }

    /**
     * Define el valor de la propiedad deudaHipotecaria.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeudaHipotecaria(BigDecimal value) {
        this.deudaHipotecaria = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaHipotecaria.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuotaHipotecaria() {
        return cuotaHipotecaria;
    }

    /**
     * Define el valor de la propiedad cuotaHipotecaria.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuotaHipotecaria(BigDecimal value) {
        this.cuotaHipotecaria = value;
    }

    /**
     * Obtiene el valor de la propiedad deudaPersonal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeudaPersonal() {
        return deudaPersonal;
    }

    /**
     * Define el valor de la propiedad deudaPersonal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeudaPersonal(BigDecimal value) {
        this.deudaPersonal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaPersonal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuotaPersonal() {
        return cuotaPersonal;
    }

    /**
     * Define el valor de la propiedad cuotaPersonal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuotaPersonal(BigDecimal value) {
        this.cuotaPersonal = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosFijos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosFijos() {
        return gastosFijos;
    }

    /**
     * Define el valor de la propiedad gastosFijos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosFijos(BigDecimal value) {
        this.gastosFijos = value;
    }

    /**
     * Obtiene el valor de la propiedad valorPropiedad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPropiedad() {
        return valorPropiedad;
    }

    /**
     * Define el valor de la propiedad valorPropiedad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPropiedad(BigDecimal value) {
        this.valorPropiedad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHabitaVivienda.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHabitaVivienda() {
        return fechaHabitaVivienda;
    }

    /**
     * Define el valor de la propiedad fechaHabitaVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHabitaVivienda(XMLGregorianCalendar value) {
        this.fechaHabitaVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaTieneHipoteca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaTieneHipoteca() {
        return marcaTieneHipoteca;
    }

    /**
     * Define el valor de la propiedad marcaTieneHipoteca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaTieneHipoteca(String value) {
        this.marcaTieneHipoteca = value;
    }

    /**
     * Obtiene el valor de la propiedad importeAlquilerPropiedad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteAlquilerPropiedad() {
        return importeAlquilerPropiedad;
    }

    /**
     * Define el valor de la propiedad importeAlquilerPropiedad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteAlquilerPropiedad(BigDecimal value) {
        this.importeAlquilerPropiedad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNivelEstudio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNivelEstudio() {
        return codigoNivelEstudio;
    }

    /**
     * Define el valor de la propiedad codigoNivelEstudio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNivelEstudio(String value) {
        this.codigoNivelEstudio = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaAcreditaHaberes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaAcreditaHaberes() {
        return marcaAcreditaHaberes;
    }

    /**
     * Define el valor de la propiedad marcaAcreditaHaberes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaAcreditaHaberes(String value) {
        this.marcaAcreditaHaberes = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioLaboral.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioLaboral() {
        return fechaInicioLaboral;
    }

    /**
     * Define el valor de la propiedad fechaInicioLaboral.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioLaboral(XMLGregorianCalendar value) {
        this.fechaInicioLaboral = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOcupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOcupacion() {
        return codigoOcupacion;
    }

    /**
     * Define el valor de la propiedad codigoOcupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOcupacion(String value) {
        this.codigoOcupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTrabajoRelacionDependencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTrabajoRelacionDependencia() {
        return codigoTrabajoRelacionDependencia;
    }

    /**
     * Define el valor de la propiedad codigoTrabajoRelacionDependencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTrabajoRelacionDependencia(String value) {
        this.codigoTrabajoRelacionDependencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCargoLaboral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCargoLaboral() {
        return codigoCargoLaboral;
    }

    /**
     * Define el valor de la propiedad codigoCargoLaboral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCargoLaboral(String value) {
        this.codigoCargoLaboral = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTrabajoIndependiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTrabajoIndependiente() {
        return codigoTrabajoIndependiente;
    }

    /**
     * Define el valor de la propiedad codigoTrabajoIndependiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTrabajoIndependiente(String value) {
        this.codigoTrabajoIndependiente = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadPersonasACargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadPersonasACargo() {
        return cantidadPersonasACargo;
    }

    /**
     * Define el valor de la propiedad cantidadPersonasACargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadPersonasACargo(String value) {
        this.cantidadPersonasACargo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNegocio() {
        return tipoNegocio;
    }

    /**
     * Define el valor de la propiedad tipoNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNegocio(String value) {
        this.tipoNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeParticipacionNegocio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeParticipacionNegocio() {
        return porcentajeParticipacionNegocio;
    }

    /**
     * Define el valor de la propiedad porcentajeParticipacionNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeParticipacionNegocio(BigDecimal value) {
        this.porcentajeParticipacionNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad anioFundacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioFundacion() {
        return anioFundacion;
    }

    /**
     * Define el valor de la propiedad anioFundacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioFundacion(String value) {
        this.anioFundacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ventasBrutasMensual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVentasBrutasMensual() {
        return ventasBrutasMensual;
    }

    /**
     * Define el valor de la propiedad ventasBrutasMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVentasBrutasMensual(BigDecimal value) {
        this.ventasBrutasMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad comprasBrutasMensual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComprasBrutasMensual() {
        return comprasBrutasMensual;
    }

    /**
     * Define el valor de la propiedad comprasBrutasMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComprasBrutasMensual(BigDecimal value) {
        this.comprasBrutasMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaLocalPropio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaLocalPropio() {
        return marcaLocalPropio;
    }

    /**
     * Define el valor de la propiedad marcaLocalPropio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaLocalPropio(String value) {
        this.marcaLocalPropio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCliente.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCliente() {
        return fechaCliente;
    }

    /**
     * Define el valor de la propiedad fechaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCliente(XMLGregorianCalendar value) {
        this.fechaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad declaracionJuradaIngresosBrutos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaracionJuradaIngresosBrutos() {
        return declaracionJuradaIngresosBrutos;
    }

    /**
     * Define el valor de la propiedad declaracionJuradaIngresosBrutos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaracionJuradaIngresosBrutos(BigDecimal value) {
        this.declaracionJuradaIngresosBrutos = value;
    }

    /**
     * Obtiene el valor de la propiedad declaracionJuradaGananciaNeta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaracionJuradaGananciaNeta() {
        return declaracionJuradaGananciaNeta;
    }

    /**
     * Define el valor de la propiedad declaracionJuradaGananciaNeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaracionJuradaGananciaNeta(BigDecimal value) {
        this.declaracionJuradaGananciaNeta = value;
    }

    /**
     * Obtiene el valor de la propiedad declaracionJuradaIngresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaracionJuradaIngresos() {
        return declaracionJuradaIngresos;
    }

    /**
     * Define el valor de la propiedad declaracionJuradaIngresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaracionJuradaIngresos(BigDecimal value) {
        this.declaracionJuradaIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad declaracionJuradaGanancias.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaracionJuradaGanancias() {
        return declaracionJuradaGanancias;
    }

    /**
     * Define el valor de la propiedad declaracionJuradaGanancias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaracionJuradaGanancias(BigDecimal value) {
        this.declaracionJuradaGanancias = value;
    }

    /**
     * Obtiene el valor de la propiedad declaracionJuradaParticipacionGanancias.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeclaracionJuradaParticipacionGanancias() {
        return declaracionJuradaParticipacionGanancias;
    }

    /**
     * Define el valor de la propiedad declaracionJuradaParticipacionGanancias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeclaracionJuradaParticipacionGanancias(BigInteger value) {
        this.declaracionJuradaParticipacionGanancias = value;
    }

    /**
     * Obtiene el valor de la propiedad declaracionJuradaPatrimonioNeto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaracionJuradaPatrimonioNeto() {
        return declaracionJuradaPatrimonioNeto;
    }

    /**
     * Define el valor de la propiedad declaracionJuradaPatrimonioNeto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaracionJuradaPatrimonioNeto(BigDecimal value) {
        this.declaracionJuradaPatrimonioNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoActividadMonotributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoActividadMonotributo() {
        return codigoActividadMonotributo;
    }

    /**
     * Define el valor de la propiedad codigoActividadMonotributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoActividadMonotributo(String value) {
        this.codigoActividadMonotributo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCategoriaMonotributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCategoriaMonotributo() {
        return codigoCategoriaMonotributo;
    }

    /**
     * Define el valor de la propiedad codigoCategoriaMonotributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCategoriaMonotributo(String value) {
        this.codigoCategoriaMonotributo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMedioVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMedioVinculacion() {
        return tipoMedioVinculacion;
    }

    /**
     * Define el valor de la propiedad tipoMedioVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMedioVinculacion(String value) {
        this.tipoMedioVinculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIngreso() {
        return tipoIngreso;
    }

    /**
     * Define el valor de la propiedad tipoIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIngreso(String value) {
        this.tipoIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPautaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPautaIngreso() {
        return codigoPautaIngreso;
    }

    /**
     * Define el valor de la propiedad codigoPautaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPautaIngreso(String value) {
        this.codigoPautaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMonedaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMonedaIngreso() {
        return codigoMonedaIngreso;
    }

    /**
     * Define el valor de la propiedad codigoMonedaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMonedaIngreso(String value) {
        this.codigoMonedaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngresoPais.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngresoPais() {
        return fechaIngresoPais;
    }

    /**
     * Define el valor de la propiedad fechaIngresoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngresoPais(XMLGregorianCalendar value) {
        this.fechaIngresoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaActividadPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProvinciaActividadPrincipal() {
        return codigoProvinciaActividadPrincipal;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaActividadPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProvinciaActividadPrincipal(String value) {
        this.codigoProvinciaActividadPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaBastanteo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarcaBastanteo() {
        return marcaBastanteo;
    }

    /**
     * Define el valor de la propiedad marcaBastanteo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarcaBastanteo(BigInteger value) {
        this.marcaBastanteo = value;
    }

}
