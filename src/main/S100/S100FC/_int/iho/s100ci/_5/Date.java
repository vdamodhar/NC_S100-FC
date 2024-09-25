//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:22:14 PM PDT 
//


package _int.iho.s100ci._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * S100 differs from ISO 19115-1/3 in allowing reduced forms for date
 * 
 * <p>Java class for Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Date"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.iho.int/S100CI/5.0}dateExt"/&gt;
 *         &lt;element name="dateType" type="{http://www.iho.int/S100CI/5.0}DateTypeCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Date", propOrder = {
    "date",
    "dateType"
})
public class Date {

    @XmlElement(required = true, nillable = true)
    protected DateExt date;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DateTypeCode dateType;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateExt }
     *     
     */
    public DateExt getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateExt }
     *     
     */
    public void setDate(DateExt value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link DateTypeCode }
     *     
     */
    public DateTypeCode getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTypeCode }
     *     
     */
    public void setDateType(DateTypeCode value) {
        this.dateType = value;
    }

}
