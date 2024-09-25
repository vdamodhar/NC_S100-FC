//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100alertcatalog._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100portrayalcatalog._5.CatalogItem;


/**
 * The alert behavior in route monitoring
 * 
 * <p>Java class for AlertItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100PortrayalCatalog/5.2}CatalogItem"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="routeMonitor" type="{http://www.iho.int/S100AlertCatalog/5.2}AlertInfo"/&gt;
 *           &lt;element name="routePlan" type="{http://www.iho.int/S100AlertCatalog/5.2}AlertInfo" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="routePlan" type="{http://www.iho.int/S100AlertCatalog/5.2}AlertInfo"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertItem", propOrder = {
    "rest"
})
public class AlertItem
    extends CatalogItem
{

    @XmlElementRefs({
        @XmlElementRef(name = "routeMonitor", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "routePlan", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<AlertInfo>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "RoutePlan" is used by two different parts of a schema. See: 
     * line 235 of file:/D:/NC_S100/Code/NC_S100/NC_S100-FC/src/main/resources/xsd/S100/5.2.0/S100PC/20240415/S100AlertCatalog.xsd
     * line 233 of file:/D:/NC_S100/Code/NC_S100/NC_S100-FC/src/main/resources/xsd/S100/5.2.0/S100PC/20240415/S100AlertCatalog.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AlertInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link AlertInfo }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AlertInfo>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<AlertInfo>>();
        }
        return this.rest;
    }

}
