
package com.lra.util.model.kml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="styleUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtendedData" type="{http://www.opengis.net/kml/2.2}ExtendedDataType"/>
 *         &lt;element name="Point" type="{http://www.opengis.net/kml/2.2}PointType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacemarkType", namespace = "http://www.opengis.net/kml/2.2", propOrder = {
    "name",
    "description",
    "styleUrl",
    "extendedData",
    "point"
})
public class PlacemarkType {

    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", required = true)
    protected String description;
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", required = true)
    protected String styleUrl;
    @XmlElement(name = "ExtendedData", namespace = "http://www.opengis.net/kml/2.2", required = true)
    protected ExtendedDataType extendedData;
    @XmlElement(name = "Point", namespace = "http://www.opengis.net/kml/2.2", required = true)
    protected PointType point;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the styleUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleUrl() {
        return styleUrl;
    }

    /**
     * Sets the value of the styleUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleUrl(String value) {
        this.styleUrl = value;
    }

    /**
     * Gets the value of the extendedData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedDataType }
     *     
     */
    public ExtendedDataType getExtendedData() {
        return extendedData;
    }

    /**
     * Sets the value of the extendedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedDataType }
     *     
     */
    public void setExtendedData(ExtendedDataType value) {
        this.extendedData = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setPoint(PointType value) {
        this.point = value;
    }

    @Override
    public String toString() {
        return "PlacemarkType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", styleUrl='" + styleUrl + '\'' +
                ", extendedData=" + extendedData +
                ", point=" + point +
                '}';
    }
}
