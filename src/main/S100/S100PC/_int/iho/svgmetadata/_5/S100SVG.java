//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.svgmetadata._5;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Description"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}publisher use="required""/&gt;
 *                 &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}creationDate use="required""/&gt;
 *                 &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}source"/&gt;
 *                 &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}format"/&gt;
 *                 &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}version use="required""/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "description"
})
@XmlRootElement(name = "S100SVG")
public class S100SVG {

    @XmlElement(name = "Description", required = true)
    protected S100SVG.Description description;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link S100SVG.Description }
     *     
     */
    public S100SVG.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SVG.Description }
     *     
     */
    public void setDescription(S100SVG.Description value) {
        this.description = value;
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
     *       &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}publisher use="required""/&gt;
     *       &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}creationDate use="required""/&gt;
     *       &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}source"/&gt;
     *       &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}format"/&gt;
     *       &lt;attribute ref="{http://www.iho.int/SVGMetadata/5.2}version use="required""/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Description {

        @XmlAttribute(name = "publisher", namespace = "http://www.iho.int/SVGMetadata/5.2", required = true)
        protected String publisher;
        @XmlAttribute(name = "creationDate", namespace = "http://www.iho.int/SVGMetadata/5.2", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar creationDate;
        @XmlAttribute(name = "source", namespace = "http://www.iho.int/SVGMetadata/5.2")
        protected String source;
        @XmlAttribute(name = "format", namespace = "http://www.iho.int/SVGMetadata/5.2")
        protected String format;
        @XmlAttribute(name = "version", namespace = "http://www.iho.int/SVGMetadata/5.2", required = true)
        protected BigDecimal version;

        /**
         * Gets the value of the publisher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublisher() {
            return publisher;
        }

        /**
         * Sets the value of the publisher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublisher(String value) {
            this.publisher = value;
        }

        /**
         * Gets the value of the creationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreationDate() {
            return creationDate;
        }

        /**
         * Sets the value of the creationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreationDate(XMLGregorianCalendar value) {
            this.creationDate = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

    }

}
