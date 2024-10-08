//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.cit._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractExtentPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractResponsibilityType;


/**
 * <p>Java class for CI_Responsibility_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Responsibility_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Responsibility_Type">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://standards.iso.org/iso/19115/-3/cit/1.0}CI_RoleCode_PropertyType"/>
 *         &lt;element name="extent" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="party" type="{http://standards.iso.org/iso/19115/-3/cit/1.0}AbstractCI_Party_PropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Responsibility_Type", propOrder = {
    "role",
    "extent",
    "party"
})
public class CIResponsibilityType
    extends AbstractResponsibilityType
{

    @XmlElement(required = true)
    protected CIRoleCodePropertyType role;
    protected List<AbstractExtentPropertyType> extent;
    @XmlElement(required = true)
    protected List<AbstractCIPartyPropertyType> party;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public CIRoleCodePropertyType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public void setRole(CIRoleCodePropertyType value) {
        this.role = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractExtentPropertyType }
     * 
     * 
     */
    public List<AbstractExtentPropertyType> getExtent() {
        if (extent == null) {
            extent = new ArrayList<AbstractExtentPropertyType>();
        }
        return this.extent;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCIPartyPropertyType }
     * 
     * 
     */
    public List<AbstractCIPartyPropertyType> getParty() {
        if (party == null) {
            party = new ArrayList<AbstractCIPartyPropertyType>();
        }
        return this.party;
    }

}
