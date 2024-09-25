//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:27:16 PM PDT 
//


package org.iso.standards.iso._19115.__3.gco._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.iso.standards.iso._19115.__3.gex._1.AbstractEXGeographicExtentType;
import org.iso.standards.iso._19115.__3.gex._1.EXTemporalExtentType;
import org.iso.standards.iso._19115.__3.gex._1.EXVerticalExtentType;
import org.iso.standards.iso._19115.__3.lan._1.PTFreeTextType;
import org.iso.standards.iso._19115.__3.lan._1.PTLocaleType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractAcquisitionInformationType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractApplicationSchemaInformationType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractCitationType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractConstraintsType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractContentInformationType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractDistributionType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractExtentType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractFormatType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractLineageInformationType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractMaintenanceInformationType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractMetadataExtensionType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractMetadataType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractOnlineResourceType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractParameterType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractPlatformType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractPortrayalCatalogueInformationType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractReferenceSystemType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractResourceDescriptionType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractResponsibilityType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractSpatialRepresentationType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractSpatialResolutionType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractStandardOrderProcessType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractTypedDateType;
import org.iso.standards.iso._19115.__3.mcc._1.MDBrowseGraphicType;
import org.iso.standards.iso._19115.__3.mcc._1.MDIdentifierType;
import org.iso.standards.iso._19115.__3.mcc._1.MDScopeDescriptionType;
import org.iso.standards.iso._19115.__3.mcc._1.MDScopeType;
import org.iso.standards.iso._19115.__3.mcc._1.URIType;
import org.iso.standards.iso._19115.__3.mco._1.MDReleasabilityType;
import org.iso.standards.iso._19115.__3.mri._1.MDAssociatedResourceType;
import org.iso.standards.iso._19115.__3.mri._1.MDKeywordClassType;
import org.iso.standards.iso._19115.__3.mri._1.MDKeywordsType;
import org.iso.standards.iso._19115.__3.mri._1.MDRepresentativeFractionType;
import org.iso.standards.iso._19115.__3.mri._1.MDUsageType;


/**
 * <p>Java class for AbstractObject_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractObject_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}ObjectIdentification"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObject_Type")
@XmlSeeAlso({
    AbstractMaintenanceInformationType.class,
    TypeNameType.class,
    MemberNameType.class,
    MultiplicityType.class,
    MultiplicityRangeType.class,
    AbstractAcquisitionInformationType.class,
    AbstractApplicationSchemaInformationType.class,
    AbstractContentInformationType.class,
    AbstractDistributionType.class,
    AbstractFormatType.class,
    AbstractLineageInformationType.class,
    AbstractMetadataType.class,
    AbstractMetadataExtensionType.class,
    AbstractPlatformType.class,
    AbstractPortrayalCatalogueInformationType.class,
    AbstractReferenceSystemType.class,
    AbstractSpatialRepresentationType.class,
    AbstractStandardOrderProcessType.class,
    AbstractParameterType.class,
    MDBrowseGraphicType.class,
    MDIdentifierType.class,
    MDScopeType.class,
    MDScopeDescriptionType.class,
    URIType.class,
    org.iso.standards.iso._19115.__3.cit._2.CIAddressType.class,
    org.iso.standards.iso._19115.__3.cit._2.CIContactType.class,
    org.iso.standards.iso._19115.__3.cit._2.AbstractCIPartyType.class,
    org.iso.standards.iso._19115.__3.cit._2.CISeriesType.class,
    org.iso.standards.iso._19115.__3.cit._2.CITelephoneType.class,
    AbstractExtentType.class,
    AbstractEXGeographicExtentType.class,
    EXTemporalExtentType.class,
    EXVerticalExtentType.class,
    PTFreeTextType.class,
    PTLocaleType.class,
    org.iso.standards.iso._19115.__3.cit._1.CIAddressType.class,
    AbstractCitationType.class,
    org.iso.standards.iso._19115.__3.cit._1.CIContactType.class,
    AbstractTypedDateType.class,
    AbstractOnlineResourceType.class,
    org.iso.standards.iso._19115.__3.cit._1.AbstractCIPartyType.class,
    AbstractResponsibilityType.class,
    org.iso.standards.iso._19115.__3.cit._1.CISeriesType.class,
    org.iso.standards.iso._19115.__3.cit._1.CITelephoneType.class,
    MDReleasabilityType.class,
    AbstractConstraintsType.class,
    MDAssociatedResourceType.class,
    AbstractResourceDescriptionType.class,
    MDKeywordClassType.class,
    MDKeywordsType.class,
    MDRepresentativeFractionType.class,
    AbstractSpatialResolutionType.class,
    MDUsageType.class
})
public abstract class AbstractObjectType {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
