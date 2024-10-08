//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100presentation._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100symboldefinition._5.CRSType;
import _int.iho.s100symboldefinition._5.TextLine;
import _int.iho.s100symboldefinition._5.TextPoint;


/**
 * A base class for drawing instructions that uses geometry not available in the dataset. The geometry is generated by the portrayal functions according to a defined CRS
 * 
 * <p>Java class for AugmentedGeometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugmentedGeometry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100Presentation/5.2}DrawingInstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crs" type="{http://www.iho.int/S100SymbolDefinition/5.2}CRSType"/&gt;
 *         &lt;group ref="{http://www.iho.int/S100SymbolDefinition/5.2}Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AugmentedGeometry", propOrder = {
    "crs",
    "textPoint",
    "textLine"
})
@XmlSeeAlso({
    AugmentedPoint.class,
    AugmentedLineOrArea.class
})
public abstract class AugmentedGeometry
    extends DrawingInstruction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CRSType crs;
    protected TextPoint textPoint;
    protected TextLine textLine;

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link CRSType }
     *     
     */
    public CRSType getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSType }
     *     
     */
    public void setCrs(CRSType value) {
        this.crs = value;
    }

    /**
     * Gets the value of the textPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TextPoint }
     *     
     */
    public TextPoint getTextPoint() {
        return textPoint;
    }

    /**
     * Sets the value of the textPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextPoint }
     *     
     */
    public void setTextPoint(TextPoint value) {
        this.textPoint = value;
    }

    /**
     * Gets the value of the textLine property.
     * 
     * @return
     *     possible object is
     *     {@link TextLine }
     *     
     */
    public TextLine getTextLine() {
        return textLine;
    }

    /**
     * Sets the value of the textLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextLine }
     *     
     */
    public void setTextLine(TextLine value) {
        this.textLine = value;
    }

}
