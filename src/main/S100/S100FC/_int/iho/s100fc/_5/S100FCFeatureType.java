//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:22:14 PM PDT 
//


package _int.iho.s100fc._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100cd._5.S100CDFeatureUseType;


/**
 * <p>Java class for S100_FC_FeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_FeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FC/5.2}S100_FC_ObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="superType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="featureUseType" type="{http://www.iho.int/S100CD/5.0}S100_CD_FeatureUseType"/&gt;
 *         &lt;element name="featureBinding" type="{http://www.iho.int/S100FC/5.2}S100_FC_FeatureBinding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="permittedPrimitives" type="{http://www.iho.int/S100FC/5.2}S100_FC_SpatialPrimitiveType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_FeatureType", propOrder = {
    "superType",
    "subType",
    "featureUseType",
    "featureBinding",
    "permittedPrimitives"
})
public class S100FCFeatureType
    extends S100FCObjectType
{

    protected String superType;
    protected List<String> subType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100CDFeatureUseType featureUseType;
    protected List<S100FCFeatureBinding> featureBinding;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<S100FCSpatialPrimitiveType> permittedPrimitives;

    /**
     * Gets the value of the superType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperType() {
        return superType;
    }

    /**
     * Sets the value of the superType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperType(String value) {
        this.superType = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubType() {
        if (subType == null) {
            subType = new ArrayList<String>();
        }
        return this.subType;
    }

    /**
     * Gets the value of the featureUseType property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDFeatureUseType }
     *     
     */
    public S100CDFeatureUseType getFeatureUseType() {
        return featureUseType;
    }

    /**
     * Sets the value of the featureUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDFeatureUseType }
     *     
     */
    public void setFeatureUseType(S100CDFeatureUseType value) {
        this.featureUseType = value;
    }

    /**
     * Gets the value of the featureBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCFeatureBinding }
     * 
     * 
     */
    public List<S100FCFeatureBinding> getFeatureBinding() {
        if (featureBinding == null) {
            featureBinding = new ArrayList<S100FCFeatureBinding>();
        }
        return this.featureBinding;
    }

    /**
     * Gets the value of the permittedPrimitives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permittedPrimitives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermittedPrimitives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCSpatialPrimitiveType }
     * 
     * 
     */
    public List<S100FCSpatialPrimitiveType> getPermittedPrimitives() {
        if (permittedPrimitives == null) {
            permittedPrimitives = new ArrayList<S100FCSpatialPrimitiveType>();
        }
        return this.permittedPrimitives;
    }

}
