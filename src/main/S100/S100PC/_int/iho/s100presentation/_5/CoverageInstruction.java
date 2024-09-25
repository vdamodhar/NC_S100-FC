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
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100symboldefinition._5.CoverageFill;


/**
 * A drawing instruction for depicting coverages of data
 * 
 * <p>Java class for CoverageInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageInstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100Presentation/5.2}DrawingInstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coverageFill" type="{http://www.iho.int/S100SymbolDefinition/5.2}CoverageFill"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageInstruction", propOrder = {
    "coverageFill"
})
public class CoverageInstruction
    extends DrawingInstruction
{

    @XmlElement(required = true)
    protected CoverageFill coverageFill;

    /**
     * Gets the value of the coverageFill property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageFill }
     *     
     */
    public CoverageFill getCoverageFill() {
        return coverageFill;
    }

    /**
     * Sets the value of the coverageFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageFill }
     *     
     */
    public void setCoverageFill(CoverageFill value) {
        this.coverageFill = value;
    }

}
