//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:27:16 PM PDT 
//


package _int.iho.s100.xc._5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import _int.iho.s100.se._5.S100SEDigitalSignature;
import _int.iho.s100.se._5.S100SEDigitalSignatureReferencePropertyType;
import _int.iho.s100.se._5.S100SESignatureOnData;
import _int.iho.s100.se._5.S100SESignatureOnSignature;
import org.iso.standards.iso._19115.__3.cit._2.CIResponsibilityPropertyType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;
import org.iso.standards.iso._19115.__3.lan._1.PTLocalePropertyType;
import org.iso.standards.iso._19115.__3.mmi._1.MDMaintenanceInformationPropertyType;


/**
 * Metadata about the individual datasets in the exchange catalogue.
 * 
 * <p>Java class for S100_DatasetDiscoveryMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_DatasetDiscoveryMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="description" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="datasetID" type="{http://www.iho.int/s100/xc/5.2}MRNType" minOccurs="0"/&gt;
 *         &lt;element name="compressionFlag" type="{http://www.iho.int/s100/xc/5.2}RestrictedBoolean"/&gt;
 *         &lt;element name="dataProtection" type="{http://www.iho.int/s100/xc/5.2}RestrictedBoolean"/&gt;
 *         &lt;element name="protectionScheme" type="{http://www.iho.int/s100/xc/5.2}S100_ProtectionScheme" minOccurs="0"/&gt;
 *         &lt;element name="digitalSignatureReference" type="{http://www.iho.int/s100/se/5.2}S100_SE_DigitalSignatureReference_PropertyType"/&gt;
 *         &lt;element name="digitalSignatureValue" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iho.int/s100/se/5.2}S100_SE_DigitalSignature"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="copyright" type="{http://www.iho.int/s100/xc/5.2}RestrictedBoolean"/&gt;
 *         &lt;element name="classification" type="{http://www.iho.int/s100/xc/5.2}S100_ClassificationCode_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="purpose" type="{http://www.iho.int/s100/xc/5.2}S100_Purpose" minOccurs="0"/&gt;
 *         &lt;element name="notForNavigation" type="{http://www.iho.int/s100/xc/5.2}RestrictedBoolean"/&gt;
 *         &lt;element name="specificUsage" type="{http://www.iho.int/s100/xc/5.2}S100_Usage_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="editionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="updateNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="updateApplicationDate" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}Date_Type" minOccurs="0"/&gt;
 *         &lt;element name="referenceID" type="{http://www.iho.int/s100/xc/5.2}MRNType" minOccurs="0"/&gt;
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="issueTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="boundingBox" type="{http://www.iho.int/s100/xc/5.2}S100_GeographicBoundingBox_Type" minOccurs="0"/&gt;
 *         &lt;element name="temporalExtent" type="{http://www.iho.int/s100/xc/5.2}S100_TemporalExtent" minOccurs="0"/&gt;
 *         &lt;element name="productSpecification" type="{http://www.iho.int/s100/xc/5.2}S100_ProductSpecification"/&gt;
 *         &lt;element name="producingAgency" type="{http://standards.iso.org/iso/19115/-3/cit/2.0}CI_Responsibility_PropertyType"/&gt;
 *         &lt;element name="producerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="encodingFormat" type="{http://www.iho.int/s100/xc/5.2}S100_EncodingFormat_PropertyType"/&gt;
 *         &lt;element name="dataCoverage" type="{http://www.iho.int/s100/xc/5.2}S100_DataCoverage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="defaultLocale" type="{http://standards.iso.org/iso/19115/-3/lan/1.0}PT_Locale_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="otherLocale" type="{http://standards.iso.org/iso/19115/-3/lan/1.0}PT_Locale_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="metadataPointOfContact" type="{http://standards.iso.org/iso/19115/-3/cit/2.0}CI_Responsibility_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="metadataDateStamp" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="replacedData" type="{http://www.iho.int/s100/xc/5.2}RestrictedBoolean" minOccurs="0"/&gt;
 *         &lt;element name="dataReplacement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="navigationPurpose" type="{http://www.iho.int/s100/xc/5.2}S100_NavigationPurpose" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="resourceMaintenance" type="{http://standards.iso.org/iso/19115/-3/mmi/1.0}MD_MaintenanceInformation_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_DatasetDiscoveryMetadata", propOrder = {
    "fileName",
    "description",
    "datasetID",
    "compressionFlag",
    "dataProtection",
    "protectionScheme",
    "digitalSignatureReference",
    "digitalSignatureValue",
    "copyright",
    "classification",
    "purpose",
    "notForNavigation",
    "specificUsage",
    "editionNumber",
    "updateNumber",
    "updateApplicationDate",
    "referenceID",
    "issueDate",
    "issueTime",
    "boundingBox",
    "temporalExtent",
    "productSpecification",
    "producingAgency",
    "producerCode",
    "encodingFormat",
    "dataCoverage",
    "comment",
    "defaultLocale",
    "otherLocale",
    "metadataPointOfContact",
    "metadataDateStamp",
    "replacedData",
    "dataReplacement",
    "navigationPurpose",
    "resourceMaintenance"
})
public class S100DatasetDiscoveryMetadata {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String fileName;
    protected CharacterStringPropertyType description;
    @XmlSchemaType(name = "anyURI")
    protected String datasetID;
    protected boolean compressionFlag;
    protected boolean dataProtection;
    @XmlSchemaType(name = "string")
    protected S100ProtectionScheme protectionScheme;
    @XmlElement(required = true)
    protected S100SEDigitalSignatureReferencePropertyType digitalSignatureReference;
    @XmlElement(required = true)
    protected List<S100DatasetDiscoveryMetadata.DigitalSignatureValue> digitalSignatureValue;
    protected boolean copyright;
    protected S100ClassificationCodePropertyType classification;
    @XmlSchemaType(name = "string")
    protected S100Purpose purpose;
    protected boolean notForNavigation;
    protected S100UsagePropertyType specificUsage;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger editionNumber;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger updateNumber;
    protected String updateApplicationDate;
    @XmlSchemaType(name = "anyURI")
    protected String referenceID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar issueTime;
    protected S100GeographicBoundingBoxType boundingBox;
    protected S100TemporalExtent temporalExtent;
    @XmlElement(required = true)
    protected S100ProductSpecification productSpecification;
    @XmlElement(required = true)
    protected CIResponsibilityPropertyType producingAgency;
    protected String producerCode;
    @XmlElement(required = true)
    protected S100EncodingFormatPropertyType encodingFormat;
    protected List<S100DataCoverage> dataCoverage;
    protected CharacterStringPropertyType comment;
    protected PTLocalePropertyType defaultLocale;
    protected List<PTLocalePropertyType> otherLocale;
    protected CIResponsibilityPropertyType metadataPointOfContact;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar metadataDateStamp;
    protected Boolean replacedData;
    protected List<String> dataReplacement;
    @XmlSchemaType(name = "string")
    protected List<S100NavigationPurpose> navigationPurpose;
    protected MDMaintenanceInformationPropertyType resourceMaintenance;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    /**
     * Gets the value of the datasetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetID() {
        return datasetID;
    }

    /**
     * Sets the value of the datasetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetID(String value) {
        this.datasetID = value;
    }

    /**
     * Gets the value of the compressionFlag property.
     * 
     */
    public boolean isCompressionFlag() {
        return compressionFlag;
    }

    /**
     * Sets the value of the compressionFlag property.
     * 
     */
    public void setCompressionFlag(boolean value) {
        this.compressionFlag = value;
    }

    /**
     * Gets the value of the dataProtection property.
     * 
     */
    public boolean isDataProtection() {
        return dataProtection;
    }

    /**
     * Sets the value of the dataProtection property.
     * 
     */
    public void setDataProtection(boolean value) {
        this.dataProtection = value;
    }

    /**
     * Gets the value of the protectionScheme property.
     * 
     * @return
     *     possible object is
     *     {@link S100ProtectionScheme }
     *     
     */
    public S100ProtectionScheme getProtectionScheme() {
        return protectionScheme;
    }

    /**
     * Sets the value of the protectionScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ProtectionScheme }
     *     
     */
    public void setProtectionScheme(S100ProtectionScheme value) {
        this.protectionScheme = value;
    }

    /**
     * Gets the value of the digitalSignatureReference property.
     * 
     * @return
     *     possible object is
     *     {@link S100SEDigitalSignatureReferencePropertyType }
     *     
     */
    public S100SEDigitalSignatureReferencePropertyType getDigitalSignatureReference() {
        return digitalSignatureReference;
    }

    /**
     * Sets the value of the digitalSignatureReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SEDigitalSignatureReferencePropertyType }
     *     
     */
    public void setDigitalSignatureReference(S100SEDigitalSignatureReferencePropertyType value) {
        this.digitalSignatureReference = value;
    }

    /**
     * Gets the value of the digitalSignatureValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalSignatureValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalSignatureValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100DatasetDiscoveryMetadata.DigitalSignatureValue }
     * 
     * 
     */
    public List<S100DatasetDiscoveryMetadata.DigitalSignatureValue> getDigitalSignatureValue() {
        if (digitalSignatureValue == null) {
            digitalSignatureValue = new ArrayList<S100DatasetDiscoveryMetadata.DigitalSignatureValue>();
        }
        return this.digitalSignatureValue;
    }

    /**
     * Gets the value of the copyright property.
     * 
     */
    public boolean isCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     */
    public void setCopyright(boolean value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link S100ClassificationCodePropertyType }
     *     
     */
    public S100ClassificationCodePropertyType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ClassificationCodePropertyType }
     *     
     */
    public void setClassification(S100ClassificationCodePropertyType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link S100Purpose }
     *     
     */
    public S100Purpose getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100Purpose }
     *     
     */
    public void setPurpose(S100Purpose value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the notForNavigation property.
     * 
     */
    public boolean isNotForNavigation() {
        return notForNavigation;
    }

    /**
     * Sets the value of the notForNavigation property.
     * 
     */
    public void setNotForNavigation(boolean value) {
        this.notForNavigation = value;
    }

    /**
     * Gets the value of the specificUsage property.
     * 
     * @return
     *     possible object is
     *     {@link S100UsagePropertyType }
     *     
     */
    public S100UsagePropertyType getSpecificUsage() {
        return specificUsage;
    }

    /**
     * Sets the value of the specificUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100UsagePropertyType }
     *     
     */
    public void setSpecificUsage(S100UsagePropertyType value) {
        this.specificUsage = value;
    }

    /**
     * Gets the value of the editionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEditionNumber() {
        return editionNumber;
    }

    /**
     * Sets the value of the editionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEditionNumber(BigInteger value) {
        this.editionNumber = value;
    }

    /**
     * Gets the value of the updateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpdateNumber() {
        return updateNumber;
    }

    /**
     * Sets the value of the updateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpdateNumber(BigInteger value) {
        this.updateNumber = value;
    }

    /**
     * Gets the value of the updateApplicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateApplicationDate() {
        return updateApplicationDate;
    }

    /**
     * Sets the value of the updateApplicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateApplicationDate(String value) {
        this.updateApplicationDate = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issueTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueTime() {
        return issueTime;
    }

    /**
     * Sets the value of the issueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueTime(XMLGregorianCalendar value) {
        this.issueTime = value;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link S100GeographicBoundingBoxType }
     *     
     */
    public S100GeographicBoundingBoxType getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100GeographicBoundingBoxType }
     *     
     */
    public void setBoundingBox(S100GeographicBoundingBoxType value) {
        this.boundingBox = value;
    }

    /**
     * Gets the value of the temporalExtent property.
     * 
     * @return
     *     possible object is
     *     {@link S100TemporalExtent }
     *     
     */
    public S100TemporalExtent getTemporalExtent() {
        return temporalExtent;
    }

    /**
     * Sets the value of the temporalExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100TemporalExtent }
     *     
     */
    public void setTemporalExtent(S100TemporalExtent value) {
        this.temporalExtent = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link S100ProductSpecification }
     *     
     */
    public S100ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100ProductSpecification }
     *     
     */
    public void setProductSpecification(S100ProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the producingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link CIResponsibilityPropertyType }
     *     
     */
    public CIResponsibilityPropertyType getProducingAgency() {
        return producingAgency;
    }

    /**
     * Sets the value of the producingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIResponsibilityPropertyType }
     *     
     */
    public void setProducingAgency(CIResponsibilityPropertyType value) {
        this.producingAgency = value;
    }

    /**
     * Gets the value of the producerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerCode() {
        return producerCode;
    }

    /**
     * Sets the value of the producerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerCode(String value) {
        this.producerCode = value;
    }

    /**
     * Gets the value of the encodingFormat property.
     * 
     * @return
     *     possible object is
     *     {@link S100EncodingFormatPropertyType }
     *     
     */
    public S100EncodingFormatPropertyType getEncodingFormat() {
        return encodingFormat;
    }

    /**
     * Sets the value of the encodingFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100EncodingFormatPropertyType }
     *     
     */
    public void setEncodingFormat(S100EncodingFormatPropertyType value) {
        this.encodingFormat = value;
    }

    /**
     * Gets the value of the dataCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100DataCoverage }
     * 
     * 
     */
    public List<S100DataCoverage> getDataCoverage() {
        if (dataCoverage == null) {
            dataCoverage = new ArrayList<S100DataCoverage>();
        }
        return this.dataCoverage;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setComment(CharacterStringPropertyType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the defaultLocale property.
     * 
     * @return
     *     possible object is
     *     {@link PTLocalePropertyType }
     *     
     */
    public PTLocalePropertyType getDefaultLocale() {
        return defaultLocale;
    }

    /**
     * Sets the value of the defaultLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTLocalePropertyType }
     *     
     */
    public void setDefaultLocale(PTLocalePropertyType value) {
        this.defaultLocale = value;
    }

    /**
     * Gets the value of the otherLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTLocalePropertyType }
     * 
     * 
     */
    public List<PTLocalePropertyType> getOtherLocale() {
        if (otherLocale == null) {
            otherLocale = new ArrayList<PTLocalePropertyType>();
        }
        return this.otherLocale;
    }

    /**
     * Gets the value of the metadataPointOfContact property.
     * 
     * @return
     *     possible object is
     *     {@link CIResponsibilityPropertyType }
     *     
     */
    public CIResponsibilityPropertyType getMetadataPointOfContact() {
        return metadataPointOfContact;
    }

    /**
     * Sets the value of the metadataPointOfContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIResponsibilityPropertyType }
     *     
     */
    public void setMetadataPointOfContact(CIResponsibilityPropertyType value) {
        this.metadataPointOfContact = value;
    }

    /**
     * Gets the value of the metadataDateStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMetadataDateStamp() {
        return metadataDateStamp;
    }

    /**
     * Sets the value of the metadataDateStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMetadataDateStamp(XMLGregorianCalendar value) {
        this.metadataDateStamp = value;
    }

    /**
     * Gets the value of the replacedData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplacedData() {
        return replacedData;
    }

    /**
     * Sets the value of the replacedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplacedData(Boolean value) {
        this.replacedData = value;
    }

    /**
     * Gets the value of the dataReplacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataReplacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataReplacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataReplacement() {
        if (dataReplacement == null) {
            dataReplacement = new ArrayList<String>();
        }
        return this.dataReplacement;
    }

    /**
     * Gets the value of the navigationPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navigationPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavigationPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100NavigationPurpose }
     * 
     * 
     */
    public List<S100NavigationPurpose> getNavigationPurpose() {
        if (navigationPurpose == null) {
            navigationPurpose = new ArrayList<S100NavigationPurpose>();
        }
        return this.navigationPurpose;
    }

    /**
     * Gets the value of the resourceMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public MDMaintenanceInformationPropertyType getResourceMaintenance() {
        return resourceMaintenance;
    }

    /**
     * Sets the value of the resourceMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public void setResourceMaintenance(MDMaintenanceInformationPropertyType value) {
        this.resourceMaintenance = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iho.int/s100/se/5.2}S100_SE_DigitalSignature"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "s100SEDigitalSignature"
    })
    public static class DigitalSignatureValue {

        @XmlElementRef(name = "S100_SE_DigitalSignature", namespace = "http://www.iho.int/s100/se/5.2", type = JAXBElement.class)
        protected JAXBElement<? extends S100SEDigitalSignature> s100SEDigitalSignature;

        /**
         * Gets the value of the s100SEDigitalSignature property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link S100SEDigitalSignature }{@code >}
         *     {@link JAXBElement }{@code <}{@link S100SESignatureOnData }{@code >}
         *     {@link JAXBElement }{@code <}{@link S100SESignatureOnSignature }{@code >}
         *     
         */
        public JAXBElement<? extends S100SEDigitalSignature> getS100SEDigitalSignature() {
            return s100SEDigitalSignature;
        }

        /**
         * Sets the value of the s100SEDigitalSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link S100SEDigitalSignature }{@code >}
         *     {@link JAXBElement }{@code <}{@link S100SESignatureOnData }{@code >}
         *     {@link JAXBElement }{@code <}{@link S100SESignatureOnSignature }{@code >}
         *     
         */
        public void setS100SEDigitalSignature(JAXBElement<? extends S100SEDigitalSignature> value) {
            this.s100SEDigitalSignature = value;
        }

    }

}
