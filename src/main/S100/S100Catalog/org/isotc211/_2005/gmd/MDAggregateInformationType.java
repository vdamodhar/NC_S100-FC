//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:27:16 PM PDT 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;


/**
 * Encapsulates the dataset aggregation information
 * 
 * <p>Java class for MD_AggregateInformation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_AggregateInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aggregateDataSetName" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="aggregateDataSetIdentifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="associationType" type="{http://www.isotc211.org/2005/gmd}DS_AssociationTypeCode_PropertyType"/&gt;
 *         &lt;element name="initiativeType" type="{http://www.isotc211.org/2005/gmd}DS_InitiativeTypeCode_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_AggregateInformation_Type", propOrder = {
    "aggregateDataSetName",
    "aggregateDataSetIdentifier",
    "associationType",
    "initiativeType"
})
public class MDAggregateInformationType
    extends AbstractObjectType
{

    protected CICitationPropertyType aggregateDataSetName;
    protected MDIdentifierPropertyType aggregateDataSetIdentifier;
    @XmlElement(required = true)
    protected DSAssociationTypeCodePropertyType associationType;
    protected DSInitiativeTypeCodePropertyType initiativeType;

    /**
     * Gets the value of the aggregateDataSetName property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getAggregateDataSetName() {
        return aggregateDataSetName;
    }

    /**
     * Sets the value of the aggregateDataSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setAggregateDataSetName(CICitationPropertyType value) {
        this.aggregateDataSetName = value;
    }

    /**
     * Gets the value of the aggregateDataSetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getAggregateDataSetIdentifier() {
        return aggregateDataSetIdentifier;
    }

    /**
     * Sets the value of the aggregateDataSetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setAggregateDataSetIdentifier(MDIdentifierPropertyType value) {
        this.aggregateDataSetIdentifier = value;
    }

    /**
     * Gets the value of the associationType property.
     * 
     * @return
     *     possible object is
     *     {@link DSAssociationTypeCodePropertyType }
     *     
     */
    public DSAssociationTypeCodePropertyType getAssociationType() {
        return associationType;
    }

    /**
     * Sets the value of the associationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSAssociationTypeCodePropertyType }
     *     
     */
    public void setAssociationType(DSAssociationTypeCodePropertyType value) {
        this.associationType = value;
    }

    /**
     * Gets the value of the initiativeType property.
     * 
     * @return
     *     possible object is
     *     {@link DSInitiativeTypeCodePropertyType }
     *     
     */
    public DSInitiativeTypeCodePropertyType getInitiativeType() {
        return initiativeType;
    }

    /**
     * Sets the value of the initiativeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSInitiativeTypeCodePropertyType }
     *     
     */
    public void setInitiativeType(DSInitiativeTypeCodePropertyType value) {
        this.initiativeType = value;
    }

}
