//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package org.w3._2000.svg;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineCap.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LineCap"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="butt"/&gt;
 *     &lt;enumeration value="round"/&gt;
 *     &lt;enumeration value="square"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineCap")
@XmlEnum
public enum LineCap {

    @XmlEnumValue("butt")
    BUTT("butt"),
    @XmlEnumValue("round")
    ROUND("round"),
    @XmlEnumValue("square")
    SQUARE("square");
    private final String value;

    LineCap(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineCap fromValue(String v) {
        for (LineCap c: LineCap.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
