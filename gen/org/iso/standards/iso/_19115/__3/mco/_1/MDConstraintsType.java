//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.mco._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractCitationPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractConstraintsType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractResponsibilityPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.MDBrowseGraphicPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.MDScopePropertyType;


/**
 * <p>Java class for MD_Constraints_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Constraints_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Constraints_Type">
 *       &lt;sequence>
 *         &lt;element name="useLimitation" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constraintApplicationScope" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}MD_Scope_PropertyType" minOccurs="0"/>
 *         &lt;element name="graphic" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}MD_BrowseGraphic_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="releasability" type="{http://standards.iso.org/iso/19115/-3/mco/1.0}MD_Releasability_PropertyType" minOccurs="0"/>
 *         &lt;element name="responsibleParty" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Responsibility_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Constraints_Type", propOrder = {
    "useLimitation",
    "constraintApplicationScope",
    "graphic",
    "reference",
    "releasability",
    "responsibleParty"
})
@XmlSeeAlso({
    MDLegalConstraintsType.class,
    MDSecurityConstraintsType.class
})
public class MDConstraintsType
    extends AbstractConstraintsType
{

    protected List<CharacterStringPropertyType> useLimitation;
    protected MDScopePropertyType constraintApplicationScope;
    protected List<MDBrowseGraphicPropertyType> graphic;
    protected List<AbstractCitationPropertyType> reference;
    protected MDReleasabilityPropertyType releasability;
    protected List<AbstractResponsibilityPropertyType> responsibleParty;

    /**
     * Gets the value of the useLimitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useLimitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseLimitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getUseLimitation() {
        if (useLimitation == null) {
            useLimitation = new ArrayList<CharacterStringPropertyType>();
        }
        return this.useLimitation;
    }

    /**
     * Gets the value of the constraintApplicationScope property.
     * 
     * @return
     *     possible object is
     *     {@link MDScopePropertyType }
     *     
     */
    public MDScopePropertyType getConstraintApplicationScope() {
        return constraintApplicationScope;
    }

    /**
     * Sets the value of the constraintApplicationScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDScopePropertyType }
     *     
     */
    public void setConstraintApplicationScope(MDScopePropertyType value) {
        this.constraintApplicationScope = value;
    }

    /**
     * Gets the value of the graphic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDBrowseGraphicPropertyType }
     * 
     * 
     */
    public List<MDBrowseGraphicPropertyType> getGraphic() {
        if (graphic == null) {
            graphic = new ArrayList<MDBrowseGraphicPropertyType>();
        }
        return this.graphic;
    }

    /**
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCitationPropertyType }
     * 
     * 
     */
    public List<AbstractCitationPropertyType> getReference() {
        if (reference == null) {
            reference = new ArrayList<AbstractCitationPropertyType>();
        }
        return this.reference;
    }

    /**
     * Gets the value of the releasability property.
     * 
     * @return
     *     possible object is
     *     {@link MDReleasabilityPropertyType }
     *     
     */
    public MDReleasabilityPropertyType getReleasability() {
        return releasability;
    }

    /**
     * Sets the value of the releasability property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDReleasabilityPropertyType }
     *     
     */
    public void setReleasability(MDReleasabilityPropertyType value) {
        this.releasability = value;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractResponsibilityPropertyType }
     * 
     * 
     */
    public List<AbstractResponsibilityPropertyType> getResponsibleParty() {
        if (responsibleParty == null) {
            responsibleParty = new ArrayList<AbstractResponsibilityPropertyType>();
        }
        return this.responsibleParty;
    }

}
