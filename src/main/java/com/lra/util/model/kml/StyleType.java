
package com.lra.util.model.kml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StyleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IconStyle" type="{http://www.opengis.net/kml/2.2}IconStyleType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleType", namespace = "http://www.opengis.net/kml/2.2", propOrder = {
    "iconStyle"
})
public class StyleType {

    @XmlElement(name = "IconStyle", namespace = "http://www.opengis.net/kml/2.2", required = true)
    protected IconStyleType iconStyle;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the iconStyle property.
     * 
     * @return
     *     possible object is
     *     {@link IconStyleType }
     *     
     */
    public IconStyleType getIconStyle() {
        return iconStyle;
    }

    /**
     * Sets the value of the iconStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconStyleType }
     *     
     */
    public void setIconStyle(IconStyleType value) {
        this.iconStyle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public String toString() {
        return "StyleType{" +
                "iconStyle=" + iconStyle +
                ", id='" + id + '\'' +
                '}';
    }
}
