//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:26:08 PM PDT 
//


package _int.iho.s100.ic._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_FC_SpatialPrimitiveType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="S100_FC_SpatialPrimitiveType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noGeometry"/&gt;
 *     &lt;enumeration value="point"/&gt;
 *     &lt;enumeration value="pointSet"/&gt;
 *     &lt;enumeration value="curve"/&gt;
 *     &lt;enumeration value="surface"/&gt;
 *     &lt;enumeration value="coverage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_FC_SpatialPrimitiveType")
@XmlEnum
public enum S100FCSpatialPrimitiveType {

    @XmlEnumValue("noGeometry")
    NO_GEOMETRY("noGeometry"),
    @XmlEnumValue("point")
    POINT("point"),
    @XmlEnumValue("pointSet")
    POINT_SET("pointSet"),
    @XmlEnumValue("curve")
    CURVE("curve"),
    @XmlEnumValue("surface")
    SURFACE("surface"),
    @XmlEnumValue("coverage")
    COVERAGE("coverage");
    private final String value;

    S100FCSpatialPrimitiveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100FCSpatialPrimitiveType fromValue(String v) {
        for (S100FCSpatialPrimitiveType c: S100FCSpatialPrimitiveType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
