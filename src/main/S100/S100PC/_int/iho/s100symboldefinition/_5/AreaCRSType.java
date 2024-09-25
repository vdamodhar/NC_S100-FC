//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100symboldefinition._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaCRSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AreaCRSType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Global"/&gt;
 *     &lt;enumeration value="LocalGeometry"/&gt;
 *     &lt;enumeration value="GlobalGeometry"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AreaCRSType")
@XmlEnum
public enum AreaCRSType {


    /**
     * Anchor point is consistent with a location on the drawing device for, example starting
     * 				with the corner of the screen. As screen pans the pattern will appear to shift/move through the object on screen
     * 
     */
    @XmlEnumValue("Global")
    GLOBAL("Global"),

    /**
     * Anchor point is consistent with the local geometry of the object being depicted, for
     * 				example the upper left corner of the object. Patterns of adjacent objects may not match
     * 
     */
    @XmlEnumValue("LocalGeometry")
    LOCAL_GEOMETRY("LocalGeometry"),

    /**
     * The anchor point of the fill pattern is defined at a common location such that patterns
     * 				remain consistent relative to all area objects
     * 
     */
    @XmlEnumValue("GlobalGeometry")
    GLOBAL_GEOMETRY("GlobalGeometry");
    private final String value;

    AreaCRSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaCRSType fromValue(String v) {
        for (AreaCRSType c: AreaCRSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
