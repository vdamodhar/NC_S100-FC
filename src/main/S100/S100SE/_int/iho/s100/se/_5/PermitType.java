//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:25:20 PM PDT 
//


package _int.iho.s100.se._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The root element of the permit file.
 * 
 * <p>Java class for PermitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="header" type="{http://www.iho.int/s100/se/5.2}PermitHeaderType"/&gt;
 *         &lt;element name="products" type="{http://www.iho.int/s100/se/5.2}ProductsPermitType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermitType", propOrder = {
    "headerAndProducts"
})
public class PermitType {

    @XmlElements({
        @XmlElement(name = "header", required = true, type = PermitHeaderType.class),
        @XmlElement(name = "products", required = true, type = ProductsPermitType.class)
    })
    protected List<Object> headerAndProducts;

    /**
     * Gets the value of the headerAndProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerAndProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderAndProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermitHeaderType }
     * {@link ProductsPermitType }
     * 
     * 
     */
    public List<Object> getHeaderAndProducts() {
        if (headerAndProducts == null) {
            headerAndProducts = new ArrayList<Object>();
        }
        return this.headerAndProducts;
    }

}
