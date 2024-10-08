//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:24:11 PM PDT 
//


package _int.iho.s100gml._5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * S-100 Data Set Identification. The fields correspond to S-100 10a-5.1.2.1 fields.
 *             Attributes encodingSpecification and encodingSpecificationEdition are actually redundant here because in an XML schema the encoding specification and encoding specification edition are usually implicit in the namespace URI.
 * 
 * <p>Java class for DataSetIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSetIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="encodingSpecification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="encodingSpecificationEdition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productEdition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="applicationProfile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datasetFileIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datasetTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datasetReferenceDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="datasetLanguage" type="{http://www.iho.int/s100gml/5.0}ISO-639-2"/&gt;
 *         &lt;element name="datasetAbstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datasetTopicCategory" type="{http://www.iho.int/s100gml/5.0}MD_TopicCategoryCode" maxOccurs="unbounded"/&gt;
 *         &lt;element name="datasetPurpose" type="{http://www.iho.int/s100gml/5.0}datasetPurposeType"/&gt;
 *         &lt;element name="updateNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetIdentificationType", propOrder = {
    "encodingSpecification",
    "encodingSpecificationEdition",
    "productIdentifier",
    "productEdition",
    "applicationProfile",
    "datasetFileIdentifier",
    "datasetTitle",
    "datasetReferenceDate",
    "datasetLanguage",
    "datasetAbstract",
    "datasetTopicCategory",
    "datasetPurpose",
    "updateNumber"
})
public class DataSetIdentificationType {

    @XmlElement(required = true)
    protected String encodingSpecification;
    @XmlElement(required = true)
    protected String encodingSpecificationEdition;
    @XmlElement(required = true)
    protected String productIdentifier;
    @XmlElement(required = true)
    protected String productEdition;
    @XmlElement(required = true)
    protected String applicationProfile;
    @XmlElement(required = true)
    protected String datasetFileIdentifier;
    @XmlElement(required = true)
    protected String datasetTitle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datasetReferenceDate;
    @XmlElement(required = true, defaultValue = "eng")
    protected String datasetLanguage;
    protected String datasetAbstract;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<MDTopicCategoryCode> datasetTopicCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DatasetPurposeType datasetPurpose;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger updateNumber;

    /**
     * Gets the value of the encodingSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingSpecification() {
        return encodingSpecification;
    }

    /**
     * Sets the value of the encodingSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingSpecification(String value) {
        this.encodingSpecification = value;
    }

    /**
     * Gets the value of the encodingSpecificationEdition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingSpecificationEdition() {
        return encodingSpecificationEdition;
    }

    /**
     * Sets the value of the encodingSpecificationEdition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingSpecificationEdition(String value) {
        this.encodingSpecificationEdition = value;
    }

    /**
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdentifier(String value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the productEdition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductEdition() {
        return productEdition;
    }

    /**
     * Sets the value of the productEdition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductEdition(String value) {
        this.productEdition = value;
    }

    /**
     * Gets the value of the applicationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationProfile() {
        return applicationProfile;
    }

    /**
     * Sets the value of the applicationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationProfile(String value) {
        this.applicationProfile = value;
    }

    /**
     * Gets the value of the datasetFileIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetFileIdentifier() {
        return datasetFileIdentifier;
    }

    /**
     * Sets the value of the datasetFileIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetFileIdentifier(String value) {
        this.datasetFileIdentifier = value;
    }

    /**
     * Gets the value of the datasetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetTitle() {
        return datasetTitle;
    }

    /**
     * Sets the value of the datasetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetTitle(String value) {
        this.datasetTitle = value;
    }

    /**
     * Gets the value of the datasetReferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatasetReferenceDate() {
        return datasetReferenceDate;
    }

    /**
     * Sets the value of the datasetReferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatasetReferenceDate(XMLGregorianCalendar value) {
        this.datasetReferenceDate = value;
    }

    /**
     * Gets the value of the datasetLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetLanguage() {
        return datasetLanguage;
    }

    /**
     * Sets the value of the datasetLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetLanguage(String value) {
        this.datasetLanguage = value;
    }

    /**
     * Gets the value of the datasetAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetAbstract() {
        return datasetAbstract;
    }

    /**
     * Sets the value of the datasetAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetAbstract(String value) {
        this.datasetAbstract = value;
    }

    /**
     * Gets the value of the datasetTopicCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetTopicCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetTopicCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDTopicCategoryCode }
     * 
     * 
     */
    public List<MDTopicCategoryCode> getDatasetTopicCategory() {
        if (datasetTopicCategory == null) {
            datasetTopicCategory = new ArrayList<MDTopicCategoryCode>();
        }
        return this.datasetTopicCategory;
    }

    /**
     * Gets the value of the datasetPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link DatasetPurposeType }
     *     
     */
    public DatasetPurposeType getDatasetPurpose() {
        return datasetPurpose;
    }

    /**
     * Sets the value of the datasetPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatasetPurposeType }
     *     
     */
    public void setDatasetPurpose(DatasetPurposeType value) {
        this.datasetPurpose = value;
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

}
