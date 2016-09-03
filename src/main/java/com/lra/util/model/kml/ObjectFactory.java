
package com.lra.util.model.kml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lra.util.model.kml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Kml_QNAME = new QName("http://www.opengis.net/kml/2.2", "kml");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lra.util.model.kml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KmlType }
     * 
     */
    public KmlType createKmlType() {
        return new KmlType();
    }

    /**
     * Create an instance of {@link ExtendedDataType }
     * 
     */
    public ExtendedDataType createExtendedDataType() {
        return new ExtendedDataType();
    }

    /**
     * Create an instance of {@link IconStyleType }
     * 
     */
    public IconStyleType createIconStyleType() {
        return new IconStyleType();
    }

    /**
     * Create an instance of {@link StyleType }
     * 
     */
    public StyleType createStyleType() {
        return new StyleType();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link PlacemarkType }
     * 
     */
    public PlacemarkType createPlacemarkType() {
        return new PlacemarkType();
    }

    /**
     * Create an instance of {@link IconType }
     * 
     */
    public IconType createIconType() {
        return new IconType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KmlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/kml/2.2", name = "kml")
    public JAXBElement<KmlType> createKml(KmlType value) {
        return new JAXBElement<KmlType>(_Kml_QNAME, KmlType.class, null, value);
    }

}
