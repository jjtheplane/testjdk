
package ar.com.bancogalicia.ws.webservices.globales.bgbaresultadooperacion._2_0_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para severidad2.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="severidad2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="WARNING"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "severidad2")
@XmlEnum
public enum Severidad2 {

    INFO,
    WARNING,
    ERROR;

    public String value() {
        return name();
    }

    public static Severidad2 fromValue(String v) {
        return valueOf(v);
    }

}
