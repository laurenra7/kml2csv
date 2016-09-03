
package com.lra.util.model.kml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Placemark" type="{http://www.opengis.net/kml/2.2}PlacemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://www.opengis.net/kml/2.2}StyleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", namespace = "http://www.opengis.net/kml/2.2", propOrder = {
    "name",
    "placemark",
    "style"
})
public class DocumentType {

    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", required = true)
    protected String name;
    @XmlElement(name = "Placemark", namespace = "http://www.opengis.net/kml/2.2")
    protected List<PlacemarkType> placemark;
    @XmlElement(name = "Style", namespace = "http://www.opengis.net/kml/2.2")
    protected List<StyleType> style;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the placemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacemarkType }
     * 
     * 
     */
    public List<PlacemarkType> getPlacemark() {
        if (placemark == null) {
            placemark = new ArrayList<PlacemarkType>();
        }
        return this.placemark;
    }

    /**
     * Gets the value of the style property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the style property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StyleType }
     * 
     * 
     */
    public List<StyleType> getStyle() {
        if (style == null) {
            style = new ArrayList<StyleType>();
        }
        return this.style;
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "name='" + name + '\'' +
                ", placemark=" + placemark +
                ", style=" + style +
                '}';
    }
}
