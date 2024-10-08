//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.mco._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.iso.standards.iso._19115.__3.gco._1.CodeListValueType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.iso.standards.iso._19115.__3.mco._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MDConstraints_QNAME = new QName("http://standards.iso.org/iso/19115/-3/mco/1.0", "MD_Constraints");
    private final static QName _MDSecurityConstraints_QNAME = new QName("http://standards.iso.org/iso/19115/-3/mco/1.0", "MD_SecurityConstraints");
    private final static QName _MDReleasability_QNAME = new QName("http://standards.iso.org/iso/19115/-3/mco/1.0", "MD_Releasability");
    private final static QName _MDRestrictionCode_QNAME = new QName("http://standards.iso.org/iso/19115/-3/mco/1.0", "MD_RestrictionCode");
    private final static QName _MDClassificationCode_QNAME = new QName("http://standards.iso.org/iso/19115/-3/mco/1.0", "MD_ClassificationCode");
    private final static QName _MDLegalConstraints_QNAME = new QName("http://standards.iso.org/iso/19115/-3/mco/1.0", "MD_LegalConstraints");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.iso.standards.iso._19115.__3.mco._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MDReleasabilityType }
     * 
     */
    public MDReleasabilityType createMDReleasabilityType() {
        return new MDReleasabilityType();
    }

    /**
     * Create an instance of {@link MDLegalConstraintsType }
     * 
     */
    public MDLegalConstraintsType createMDLegalConstraintsType() {
        return new MDLegalConstraintsType();
    }

    /**
     * Create an instance of {@link MDConstraintsType }
     * 
     */
    public MDConstraintsType createMDConstraintsType() {
        return new MDConstraintsType();
    }

    /**
     * Create an instance of {@link MDSecurityConstraintsType }
     * 
     */
    public MDSecurityConstraintsType createMDSecurityConstraintsType() {
        return new MDSecurityConstraintsType();
    }

    /**
     * Create an instance of {@link MDRestrictionCodePropertyType }
     * 
     */
    public MDRestrictionCodePropertyType createMDRestrictionCodePropertyType() {
        return new MDRestrictionCodePropertyType();
    }

    /**
     * Create an instance of {@link MDConstraintsPropertyType }
     * 
     */
    public MDConstraintsPropertyType createMDConstraintsPropertyType() {
        return new MDConstraintsPropertyType();
    }

    /**
     * Create an instance of {@link MDSecurityConstraintsPropertyType }
     * 
     */
    public MDSecurityConstraintsPropertyType createMDSecurityConstraintsPropertyType() {
        return new MDSecurityConstraintsPropertyType();
    }

    /**
     * Create an instance of {@link MDLegalConstraintsPropertyType }
     * 
     */
    public MDLegalConstraintsPropertyType createMDLegalConstraintsPropertyType() {
        return new MDLegalConstraintsPropertyType();
    }

    /**
     * Create an instance of {@link MDReleasabilityPropertyType }
     * 
     */
    public MDReleasabilityPropertyType createMDReleasabilityPropertyType() {
        return new MDReleasabilityPropertyType();
    }

    /**
     * Create an instance of {@link MDClassificationCodePropertyType }
     * 
     */
    public MDClassificationCodePropertyType createMDClassificationCodePropertyType() {
        return new MDClassificationCodePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDConstraintsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/mco/1.0", name = "MD_Constraints", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/mcc/1.0", substitutionHeadName = "Abstract_Constraints")
    public JAXBElement<MDConstraintsType> createMDConstraints(MDConstraintsType value) {
        return new JAXBElement<MDConstraintsType>(_MDConstraints_QNAME, MDConstraintsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDSecurityConstraintsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/mco/1.0", name = "MD_SecurityConstraints", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/mco/1.0", substitutionHeadName = "MD_Constraints")
    public JAXBElement<MDSecurityConstraintsType> createMDSecurityConstraints(MDSecurityConstraintsType value) {
        return new JAXBElement<MDSecurityConstraintsType>(_MDSecurityConstraints_QNAME, MDSecurityConstraintsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDReleasabilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/mco/1.0", name = "MD_Releasability", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/gco/1.0", substitutionHeadName = "AbstractObject")
    public JAXBElement<MDReleasabilityType> createMDReleasability(MDReleasabilityType value) {
        return new JAXBElement<MDReleasabilityType>(_MDReleasability_QNAME, MDReleasabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/mco/1.0", name = "MD_RestrictionCode", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/gco/1.0", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDRestrictionCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDRestrictionCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/mco/1.0", name = "MD_ClassificationCode", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/gco/1.0", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDClassificationCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDClassificationCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDLegalConstraintsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/mco/1.0", name = "MD_LegalConstraints", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/mco/1.0", substitutionHeadName = "MD_Constraints")
    public JAXBElement<MDLegalConstraintsType> createMDLegalConstraints(MDLegalConstraintsType value) {
        return new JAXBElement<MDLegalConstraintsType>(_MDLegalConstraints_QNAME, MDLegalConstraintsType.class, null, value);
    }

}
