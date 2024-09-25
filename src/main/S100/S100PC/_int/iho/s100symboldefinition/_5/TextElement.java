//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100symboldefinition._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A sub element of a graphic text
 * 
 * <p>Java class for TextElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bodySize" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="flags" type="{http://www.iho.int/S100SymbolDefinition/5.2}TextFlags" minOccurs="0"/&gt;
 *         &lt;element name="foreground" type="{http://www.iho.int/S100SymbolDefinition/5.2}Color"/&gt;
 *         &lt;element name="background" type="{http://www.iho.int/S100SymbolDefinition/5.2}Color" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.iho.int/S100SymbolDefinition/5.2}Font"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="verticalOffset" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextElement", propOrder = {
    "text",
    "bodySize",
    "flags",
    "foreground",
    "background",
    "fontCharacteristics",
    "fontReference"
})
public class TextElement {

    @XmlElement(required = true)
    protected String text;
    protected double bodySize;
    protected TextFlags flags;
    @XmlElement(required = true)
    protected Color foreground;
    protected Color background;
    protected FontCharacteristics fontCharacteristics;
    protected FontReference fontReference;
    @XmlAttribute(name = "verticalOffset")
    protected Double verticalOffset;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the bodySize property.
     * 
     */
    public double getBodySize() {
        return bodySize;
    }

    /**
     * Sets the value of the bodySize property.
     * 
     */
    public void setBodySize(double value) {
        this.bodySize = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link TextFlags }
     *     
     */
    public TextFlags getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFlags }
     *     
     */
    public void setFlags(TextFlags value) {
        this.flags = value;
    }

    /**
     * Gets the value of the foreground property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getForeground() {
        return foreground;
    }

    /**
     * Sets the value of the foreground property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setForeground(Color value) {
        this.foreground = value;
    }

    /**
     * Gets the value of the background property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getBackground() {
        return background;
    }

    /**
     * Sets the value of the background property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setBackground(Color value) {
        this.background = value;
    }

    /**
     * Gets the value of the fontCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link FontCharacteristics }
     *     
     */
    public FontCharacteristics getFontCharacteristics() {
        return fontCharacteristics;
    }

    /**
     * Sets the value of the fontCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontCharacteristics }
     *     
     */
    public void setFontCharacteristics(FontCharacteristics value) {
        this.fontCharacteristics = value;
    }

    /**
     * Gets the value of the fontReference property.
     * 
     * @return
     *     possible object is
     *     {@link FontReference }
     *     
     */
    public FontReference getFontReference() {
        return fontReference;
    }

    /**
     * Sets the value of the fontReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontReference }
     *     
     */
    public void setFontReference(FontReference value) {
        this.fontReference = value;
    }

    /**
     * Gets the value of the verticalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getVerticalOffset() {
        if (verticalOffset == null) {
            return  0.0D;
        } else {
            return verticalOffset;
        }
    }

    /**
     * Sets the value of the verticalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVerticalOffset(Double value) {
        this.verticalOffset = value;
    }

}
