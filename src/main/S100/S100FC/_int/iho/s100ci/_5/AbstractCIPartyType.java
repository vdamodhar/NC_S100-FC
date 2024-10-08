//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:22:14 PM PDT 
//


package _int.iho.s100ci._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * partyIdentifier type made xs:string consistent with other identifiers in the feature catalogue
 * 
 * <p>Java class for AbstractCI_Party_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCI_Party_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactInfo" type="{http://www.iho.int/S100CI/5.0}CI_Contact_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyIdentifier" type="{http://www.iho.int/S100CI/5.0}MD_Identifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCI_Party_Type", propOrder = {
    "name",
    "contactInfo",
    "partyIdentifier"
})
@XmlSeeAlso({
    CIIndividualType.class,
    CIOrganisationType.class
})
public abstract class AbstractCIPartyType {

    protected String name;
    protected List<CIContactType> contactInfo;
    protected List<MDIdentifierType> partyIdentifier;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIContactType }
     * 
     * 
     */
    public List<CIContactType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<CIContactType>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the partyIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDIdentifierType }
     * 
     * 
     */
    public List<MDIdentifierType> getPartyIdentifier() {
        if (partyIdentifier == null) {
            partyIdentifier = new ArrayList<MDIdentifierType>();
        }
        return this.partyIdentifier;
    }

}
