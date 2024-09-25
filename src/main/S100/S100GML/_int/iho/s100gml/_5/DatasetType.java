//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:24:11 PM PDT 
//


package _int.iho.s100gml._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureType;
import net.opengis.gml._3.AbstractGeometryType;
import net.opengis.gml._3.OrientableCurveType;


/**
 * Dataset element for dataset as "GML document"
 * 
 * <p>Java class for DatasetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatasetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatasetIdentificationInformation" type="{http://www.iho.int/s100gml/5.0}DataSetIdentificationType"/&gt;
 *         &lt;group ref="{http://www.iho.int/s100gml/5.0}Geometry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatasetType", propOrder = {
    "datasetIdentificationInformation",
    "geometry"
})
public class DatasetType
    extends AbstractFeatureType
{

    @XmlElement(name = "DatasetIdentificationInformation", required = true)
    protected DataSetIdentificationType datasetIdentificationInformation;
    @XmlElements({
        @XmlElement(name = "Point", type = PointType.class),
        @XmlElement(name = "MultiPoint", type = MultiPointType.class),
        @XmlElement(name = "Curve", type = CurveType.class),
        @XmlElement(name = "CompositeCurve", type = CompositeCurveType.class),
        @XmlElement(name = "OrientableCurve", type = OrientableCurveType.class),
        @XmlElement(name = "Surface", type = SurfaceType.class),
        @XmlElement(name = "Polygon", type = PolygonType.class)
    })
    protected List<AbstractGeometryType> geometry;

    /**
     * Gets the value of the datasetIdentificationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentificationType }
     *     
     */
    public DataSetIdentificationType getDatasetIdentificationInformation() {
        return datasetIdentificationInformation;
    }

    /**
     * Sets the value of the datasetIdentificationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentificationType }
     *     
     */
    public void setDatasetIdentificationInformation(DataSetIdentificationType value) {
        this.datasetIdentificationInformation = value;
    }

    /**
     * Allows spatial objects to be located outside feature objects.Gets the value of the geometry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurveType }
     * {@link CurveType }
     * {@link MultiPointType }
     * {@link PointType }
     * {@link PolygonType }
     * {@link SurfaceType }
     * {@link OrientableCurveType }
     * 
     * 
     */
    public List<AbstractGeometryType> getGeometry() {
        if (geometry == null) {
            geometry = new ArrayList<AbstractGeometryType>();
        }
        return this.geometry;
    }

}
