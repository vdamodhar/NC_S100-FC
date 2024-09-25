//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:24:11 PM PDT 
//


package _int.iho.s100gml._5;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.opengis.gml._3.OrientableCurveType;
import net.opengis.gml._3.ReferenceType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _int.iho.s100gml._5 package. 
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

    private final static QName _InformationAssociation_QNAME = new QName("http://www.iho.int/s100gml/5.0", "informationAssociation");
    private final static QName _Point_QNAME = new QName("http://www.iho.int/s100gml/5.0", "Point");
    private final static QName _PointProperty_QNAME = new QName("http://www.iho.int/s100gml/5.0", "pointProperty");
    private final static QName _MultiPoint_QNAME = new QName("http://www.iho.int/s100gml/5.0", "MultiPoint");
    private final static QName _MultiPointProperty_QNAME = new QName("http://www.iho.int/s100gml/5.0", "multiPointProperty");
    private final static QName _Curve_QNAME = new QName("http://www.iho.int/s100gml/5.0", "Curve");
    private final static QName _CurveProperty_QNAME = new QName("http://www.iho.int/s100gml/5.0", "curveProperty");
    private final static QName _CompositeCurve_QNAME = new QName("http://www.iho.int/s100gml/5.0", "CompositeCurve");
    private final static QName _OrientableCurve_QNAME = new QName("http://www.iho.int/s100gml/5.0", "OrientableCurve");
    private final static QName _Surface_QNAME = new QName("http://www.iho.int/s100gml/5.0", "Surface");
    private final static QName _SurfaceProperty_QNAME = new QName("http://www.iho.int/s100gml/5.0", "surfaceProperty");
    private final static QName _Polygon_QNAME = new QName("http://www.iho.int/s100gml/5.0", "Polygon");
    private final static QName _PolygonProperty_QNAME = new QName("http://www.iho.int/s100gml/5.0", "polygonProperty");
    private final static QName _S100ArcByCenterPoint_QNAME = new QName("http://www.iho.int/s100gml/5.0", "S100_ArcByCenterPoint");
    private final static QName _S100CircleByCenterPoint_QNAME = new QName("http://www.iho.int/s100gml/5.0", "S100_CircleByCenterPoint");
    private final static QName _S100GMSplineCurve_QNAME = new QName("http://www.iho.int/s100gml/5.0", "S100_GM_SplineCurve");
    private final static QName _S100GMPolynomialSpline_QNAME = new QName("http://www.iho.int/s100gml/5.0", "S100_GM_PolynomialSpline");
    private final static QName _S100GMCurve_QNAME = new QName("http://www.iho.int/s100gml/5.0", "S100_GM_Curve");
    private final static QName _ComplianceLevel_QNAME = new QName("http://www.iho.int/s100gml/5.0", "complianceLevel");
    private final static QName _S100GMPolynomialSplineTypeDerivativeAtStart_QNAME = new QName("http://www.iho.int/s100gml/5.0", "derivativeAtStart");
    private final static QName _S100GMPolynomialSplineTypeDerivativeAtEnd_QNAME = new QName("http://www.iho.int/s100gml/5.0", "derivativeAtEnd");
    private final static QName _S100GMPolynomialSplineTypeNumDerivativeInterior_QNAME = new QName("http://www.iho.int/s100gml/5.0", "numDerivativeInterior");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _int.iho.s100gml._5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VectorType }
     * 
     */
    public VectorType createVectorType() {
        return new VectorType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link PointPropertyType }
     * 
     */
    public PointPropertyType createPointPropertyType() {
        return new PointPropertyType();
    }

    /**
     * Create an instance of {@link MultiPointType }
     * 
     */
    public MultiPointType createMultiPointType() {
        return new MultiPointType();
    }

    /**
     * Create an instance of {@link MultiPointPropertyType }
     * 
     */
    public MultiPointPropertyType createMultiPointPropertyType() {
        return new MultiPointPropertyType();
    }

    /**
     * Create an instance of {@link CurveType }
     * 
     */
    public CurveType createCurveType() {
        return new CurveType();
    }

    /**
     * Create an instance of {@link CurvePropertyType }
     * 
     */
    public CurvePropertyType createCurvePropertyType() {
        return new CurvePropertyType();
    }

    /**
     * Create an instance of {@link CompositeCurveType }
     * 
     */
    public CompositeCurveType createCompositeCurveType() {
        return new CompositeCurveType();
    }

    /**
     * Create an instance of {@link SurfaceType }
     * 
     */
    public SurfaceType createSurfaceType() {
        return new SurfaceType();
    }

    /**
     * Create an instance of {@link SurfacePropertyType }
     * 
     */
    public SurfacePropertyType createSurfacePropertyType() {
        return new SurfacePropertyType();
    }

    /**
     * Create an instance of {@link PolygonType }
     * 
     */
    public PolygonType createPolygonType() {
        return new PolygonType();
    }

    /**
     * Create an instance of {@link PolygonPropertyType }
     * 
     */
    public PolygonPropertyType createPolygonPropertyType() {
        return new PolygonPropertyType();
    }

    /**
     * Create an instance of {@link S100ArcByCenterPointType }
     * 
     */
    public S100ArcByCenterPointType createS100ArcByCenterPointType() {
        return new S100ArcByCenterPointType();
    }

    /**
     * Create an instance of {@link S100CircleByCenterPointType }
     * 
     */
    public S100CircleByCenterPointType createS100CircleByCenterPointType() {
        return new S100CircleByCenterPointType();
    }

    /**
     * Create an instance of {@link S100GMSplineCurveType }
     * 
     */
    public S100GMSplineCurveType createS100GMSplineCurveType() {
        return new S100GMSplineCurveType();
    }

    /**
     * Create an instance of {@link S100GMPolynomialSplineType }
     * 
     */
    public S100GMPolynomialSplineType createS100GMPolynomialSplineType() {
        return new S100GMPolynomialSplineType();
    }

    /**
     * Create an instance of {@link S100GMCurveType }
     * 
     */
    public S100GMCurveType createS100GMCurveType() {
        return new S100GMCurveType();
    }

    /**
     * Create an instance of {@link DataSetIdentificationType }
     * 
     */
    public DataSetIdentificationType createDataSetIdentificationType() {
        return new DataSetIdentificationType();
    }

    /**
     * Create an instance of {@link AbstractInformationType }
     * 
     */
    public AbstractInformationType createAbstractInformationType() {
        return new AbstractInformationType();
    }

    /**
     * Create an instance of {@link AbstractFeatureType }
     * 
     */
    public AbstractFeatureType createAbstractFeatureType() {
        return new AbstractFeatureType();
    }

    /**
     * Create an instance of {@link S100SpatialAttributeType }
     * 
     */
    public S100SpatialAttributeType createS100SpatialAttributeType() {
        return new S100SpatialAttributeType();
    }

    /**
     * Create an instance of {@link S100GMKnotType }
     * 
     */
    public S100GMKnotType createS100GMKnotType() {
        return new S100GMKnotType();
    }

    /**
     * Create an instance of {@link KnotPropertyType }
     * 
     */
    public KnotPropertyType createKnotPropertyType() {
        return new KnotPropertyType();
    }

    /**
     * Create an instance of {@link S100TruncatedDate }
     * 
     */
    public S100TruncatedDate createS100TruncatedDate() {
        return new S100TruncatedDate();
    }

    /**
     * Create an instance of {@link DatasetType }
     * 
     */
    public DatasetType createDatasetType() {
        return new DatasetType();
    }

    /**
     * Create an instance of {@link VectorType.Origin }
     * 
     */
    public VectorType.Origin createVectorTypeOrigin() {
        return new VectorType.Origin();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "informationAssociation")
    public JAXBElement<ReferenceType> createInformationAssociation(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_InformationAssociation_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "Point", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<PointType> createPoint(PointType value) {
        return new JAXBElement<PointType>(_Point_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "pointProperty")
    public JAXBElement<PointPropertyType> createPointProperty(PointPropertyType value) {
        return new JAXBElement<PointPropertyType>(_PointProperty_QNAME, PointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "MultiPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiPointType> createMultiPoint(MultiPointType value) {
        return new JAXBElement<MultiPointType>(_MultiPoint_QNAME, MultiPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiPointPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "multiPointProperty")
    public JAXBElement<MultiPointPropertyType> createMultiPointProperty(MultiPointPropertyType value) {
        return new JAXBElement<MultiPointPropertyType>(_MultiPointProperty_QNAME, MultiPointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "Curve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Curve")
    public JAXBElement<CurveType> createCurve(CurveType value) {
        return new JAXBElement<CurveType>(_Curve_QNAME, CurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "curveProperty")
    public JAXBElement<CurvePropertyType> createCurveProperty(CurvePropertyType value) {
        return new JAXBElement<CurvePropertyType>(_CurveProperty_QNAME, CurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "CompositeCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<CompositeCurveType> createCompositeCurve(CompositeCurveType value) {
        return new JAXBElement<CompositeCurveType>(_CompositeCurve_QNAME, CompositeCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "OrientableCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<OrientableCurveType> createOrientableCurve(OrientableCurveType value) {
        return new JAXBElement<OrientableCurveType>(_OrientableCurve_QNAME, OrientableCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "Surface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Surface")
    public JAXBElement<SurfaceType> createSurface(SurfaceType value) {
        return new JAXBElement<SurfaceType>(_Surface_QNAME, SurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "surfaceProperty")
    public JAXBElement<SurfacePropertyType> createSurfaceProperty(SurfacePropertyType value) {
        return new JAXBElement<SurfacePropertyType>(_SurfaceProperty_QNAME, SurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "Polygon", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Polygon")
    public JAXBElement<PolygonType> createPolygon(PolygonType value) {
        return new JAXBElement<PolygonType>(_Polygon_QNAME, PolygonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "polygonProperty")
    public JAXBElement<PolygonPropertyType> createPolygonProperty(PolygonPropertyType value) {
        return new JAXBElement<PolygonPropertyType>(_PolygonProperty_QNAME, PolygonPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100ArcByCenterPointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link S100ArcByCenterPointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "S100_ArcByCenterPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<S100ArcByCenterPointType> createS100ArcByCenterPoint(S100ArcByCenterPointType value) {
        return new JAXBElement<S100ArcByCenterPointType>(_S100ArcByCenterPoint_QNAME, S100ArcByCenterPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100CircleByCenterPointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link S100CircleByCenterPointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "S100_CircleByCenterPoint", substitutionHeadNamespace = "http://www.iho.int/s100gml/5.0", substitutionHeadName = "S100_ArcByCenterPoint")
    public JAXBElement<S100CircleByCenterPointType> createS100CircleByCenterPoint(S100CircleByCenterPointType value) {
        return new JAXBElement<S100CircleByCenterPointType>(_S100CircleByCenterPoint_QNAME, S100CircleByCenterPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100GMSplineCurveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link S100GMSplineCurveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "S100_GM_SplineCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<S100GMSplineCurveType> createS100GMSplineCurve(S100GMSplineCurveType value) {
        return new JAXBElement<S100GMSplineCurveType>(_S100GMSplineCurve_QNAME, S100GMSplineCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100GMPolynomialSplineType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link S100GMPolynomialSplineType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "S100_GM_PolynomialSpline", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<S100GMPolynomialSplineType> createS100GMPolynomialSpline(S100GMPolynomialSplineType value) {
        return new JAXBElement<S100GMPolynomialSplineType>(_S100GMPolynomialSpline_QNAME, S100GMPolynomialSplineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100GMCurveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link S100GMCurveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "S100_GM_Curve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<S100GMCurveType> createS100GMCurve(S100GMCurveType value) {
        return new JAXBElement<S100GMCurveType>(_S100GMCurve_QNAME, S100GMCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "complianceLevel")
    public JAXBElement<BigInteger> createComplianceLevel(BigInteger value) {
        return new JAXBElement<BigInteger>(_ComplianceLevel_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VectorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "derivativeAtStart", scope = S100GMPolynomialSplineType.class)
    public JAXBElement<VectorType> createS100GMPolynomialSplineTypeDerivativeAtStart(VectorType value) {
        return new JAXBElement<VectorType>(_S100GMPolynomialSplineTypeDerivativeAtStart_QNAME, VectorType.class, S100GMPolynomialSplineType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VectorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "derivativeAtEnd", scope = S100GMPolynomialSplineType.class)
    public JAXBElement<VectorType> createS100GMPolynomialSplineTypeDerivativeAtEnd(VectorType value) {
        return new JAXBElement<VectorType>(_S100GMPolynomialSplineTypeDerivativeAtEnd_QNAME, VectorType.class, S100GMPolynomialSplineType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/5.0", name = "numDerivativeInterior", scope = S100GMPolynomialSplineType.class)
    public JAXBElement<BigInteger> createS100GMPolynomialSplineTypeNumDerivativeInterior(BigInteger value) {
        return new JAXBElement<BigInteger>(_S100GMPolynomialSplineTypeNumDerivativeInterior_QNAME, BigInteger.class, S100GMPolynomialSplineType.class, value);
    }

}
