//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:32:41 PM PDT 
//


package org.iso.standards.iso._19115.__3.gco._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Length_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Length_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}Length"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}nilReason"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Length_PropertyType", propOrder = {
    "length"
})
public class LengthPropertyType {

    @XmlElementRef(name = "Length", namespace = "http://standards.iso.org/iso/19115/-3/gco/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureType> length;
    @XmlAttribute(name = "nilReason", namespace = "http://standards.iso.org/iso/19115/-3/gco/1.0")
    protected List<String> nilReason;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public JAXBElement<MeasureType> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public void setLength(JAXBElement<MeasureType> value) {
        this.length = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

}
