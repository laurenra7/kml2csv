
package com.lra.util.model.kml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for kmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://www.opengis.net/kml/2.2}DocumentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "kml", namespace = "http://www.opengis.net/kml/2.2")
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "kml", namespace = "http://www.opengis.net/kml/2.2", propOrder = {
//    "document"
//})
public class KmlType {

    @XmlElement(name= "Document", namespace= "http://www.opengis.net/kml/2.2", required= true)
    protected DocumentType document;

//    @XmlAttribute
//    protected String xmlns;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

    @Override
    public String toString() {
        return "KmlType{" +
                "document=" + document +
                '}';
    }
}
