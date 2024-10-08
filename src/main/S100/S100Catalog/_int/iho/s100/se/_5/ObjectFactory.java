//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:27:16 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _int.iho.s100.se._5 package. 
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

    private final static QName _Permit_QNAME = new QName("http://www.iho.int/s100/se/5.2", "Permit");
    private final static QName _StandaloneDigitalSignature_QNAME = new QName("http://www.iho.int/s100/se/5.2", "StandaloneDigitalSignature");
    private final static QName _S100SEDigitalSignature_QNAME = new QName("http://www.iho.int/s100/se/5.2", "S100_SE_DigitalSignature");
    private final static QName _S100SESignatureOnSignature_QNAME = new QName("http://www.iho.int/s100/se/5.2", "S100_SE_SignatureOnSignature");
    private final static QName _S100SESignatureOnData_QNAME = new QName("http://www.iho.int/s100/se/5.2", "S100_SE_SignatureOnData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _int.iho.s100.se._5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link S100SECertificateContainerType }
     * 
     */
    public S100SECertificateContainerType createS100SECertificateContainerType() {
        return new S100SECertificateContainerType();
    }

    /**
     * Create an instance of {@link ProductsPermitType }
     * 
     */
    public ProductsPermitType createProductsPermitType() {
        return new ProductsPermitType();
    }

    /**
     * Create an instance of {@link PermitType }
     * 
     */
    public PermitType createPermitType() {
        return new PermitType();
    }

    /**
     * Create an instance of {@link StandaloneDigitalSignature }
     * 
     */
    public StandaloneDigitalSignature createStandaloneDigitalSignature() {
        return new StandaloneDigitalSignature();
    }

    /**
     * Create an instance of {@link S100SEDigitalSignature }
     * 
     */
    public S100SEDigitalSignature createS100SEDigitalSignature() {
        return new S100SEDigitalSignature();
    }

    /**
     * Create an instance of {@link S100SESignatureOnSignature }
     * 
     */
    public S100SESignatureOnSignature createS100SESignatureOnSignature() {
        return new S100SESignatureOnSignature();
    }

    /**
     * Create an instance of {@link S100SESignatureOnData }
     * 
     */
    public S100SESignatureOnData createS100SESignatureOnData() {
        return new S100SESignatureOnData();
    }

    /**
     * Create an instance of {@link PermitHeaderType }
     * 
     */
    public PermitHeaderType createPermitHeaderType() {
        return new PermitHeaderType();
    }

    /**
     * Create an instance of {@link DatasetPermitType }
     * 
     */
    public DatasetPermitType createDatasetPermitType() {
        return new DatasetPermitType();
    }

    /**
     * Create an instance of {@link S100SEDigitalSignaturePropertyType }
     * 
     */
    public S100SEDigitalSignaturePropertyType createS100SEDigitalSignaturePropertyType() {
        return new S100SEDigitalSignaturePropertyType();
    }

    /**
     * Create an instance of {@link S100SEDigitalSignatureReferencePropertyType }
     * 
     */
    public S100SEDigitalSignatureReferencePropertyType createS100SEDigitalSignatureReferencePropertyType() {
        return new S100SEDigitalSignatureReferencePropertyType();
    }

    /**
     * Create an instance of {@link S100SECertificateType }
     * 
     */
    public S100SECertificateType createS100SECertificateType() {
        return new S100SECertificateType();
    }

    /**
     * Create an instance of {@link S100SEAdditionalSignature }
     * 
     */
    public S100SEAdditionalSignature createS100SEAdditionalSignature() {
        return new S100SEAdditionalSignature();
    }

    /**
     * Create an instance of {@link S100SECertificateContainerType.SchemeAdministrator }
     * 
     */
    public S100SECertificateContainerType.SchemeAdministrator createS100SECertificateContainerTypeSchemeAdministrator() {
        return new S100SECertificateContainerType.SchemeAdministrator();
    }

    /**
     * Create an instance of {@link ProductsPermitType.Product }
     * 
     */
    public ProductsPermitType.Product createProductsPermitTypeProduct() {
        return new ProductsPermitType.Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PermitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100/se/5.2", name = "Permit")
    public JAXBElement<PermitType> createPermit(PermitType value) {
        return new JAXBElement<PermitType>(_Permit_QNAME, PermitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandaloneDigitalSignature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StandaloneDigitalSignature }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100/se/5.2", name = "StandaloneDigitalSignature")
    public JAXBElement<StandaloneDigitalSignature> createStandaloneDigitalSignature(StandaloneDigitalSignature value) {
        return new JAXBElement<StandaloneDigitalSignature>(_StandaloneDigitalSignature_QNAME, StandaloneDigitalSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100SEDigitalSignature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link S100SEDigitalSignature }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100/se/5.2", name = "S100_SE_DigitalSignature")
    public JAXBElement<S100SEDigitalSignature> createS100SEDigitalSignature(S100SEDigitalSignature value) {
        return new JAXBElement<S100SEDigitalSignature>(_S100SEDigitalSignature_QNAME, S100SEDigitalSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100SESignatureOnSignature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link S100SESignatureOnSignature }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100/se/5.2", name = "S100_SE_SignatureOnSignature", substitutionHeadNamespace = "http://www.iho.int/s100/se/5.2", substitutionHeadName = "S100_SE_DigitalSignature")
    public JAXBElement<S100SESignatureOnSignature> createS100SESignatureOnSignature(S100SESignatureOnSignature value) {
        return new JAXBElement<S100SESignatureOnSignature>(_S100SESignatureOnSignature_QNAME, S100SESignatureOnSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100SESignatureOnData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link S100SESignatureOnData }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100/se/5.2", name = "S100_SE_SignatureOnData", substitutionHeadNamespace = "http://www.iho.int/s100/se/5.2", substitutionHeadName = "S100_SE_DigitalSignature")
    public JAXBElement<S100SESignatureOnData> createS100SESignatureOnData(S100SESignatureOnData value) {
        return new JAXBElement<S100SESignatureOnData>(_S100SESignatureOnData_QNAME, S100SESignatureOnData.class, null, value);
    }

}
