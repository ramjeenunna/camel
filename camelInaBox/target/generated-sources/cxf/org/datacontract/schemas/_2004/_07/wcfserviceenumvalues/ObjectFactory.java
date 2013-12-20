
package org.datacontract.schemas._2004._07.wcfserviceenumvalues;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcfserviceenumvalues package. 
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

    private final static QName _KundeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", "KundeType");
    private final static QName _CompositeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", "CompositeType");
    private final static QName _Kunde_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", "Kunde");
    private final static QName _CompositeTypeStringValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", "StringValue");
    private final static QName _KundeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", "Name");
    private final static QName _KundeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", "Id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfserviceenumvalues
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompositeType }
     * 
     */
    public CompositeType createCompositeType() {
        return new CompositeType();
    }

    /**
     * Create an instance of {@link Kunde }
     * 
     */
    public Kunde createKunde() {
        return new Kunde();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KundeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", name = "KundeType")
    public JAXBElement<KundeType> createKundeType(KundeType value) {
        return new JAXBElement<KundeType>(_KundeType_QNAME, KundeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", name = "CompositeType")
    public JAXBElement<CompositeType> createCompositeType(CompositeType value) {
        return new JAXBElement<CompositeType>(_CompositeType_QNAME, CompositeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kunde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", name = "Kunde")
    public JAXBElement<Kunde> createKunde(Kunde value) {
        return new JAXBElement<Kunde>(_Kunde_QNAME, Kunde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", name = "StringValue", scope = CompositeType.class)
    public JAXBElement<String> createCompositeTypeStringValue(String value) {
        return new JAXBElement<String>(_CompositeTypeStringValue_QNAME, String.class, CompositeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", name = "Name", scope = Kunde.class)
    public JAXBElement<String> createKundeName(String value) {
        return new JAXBElement<String>(_KundeName_QNAME, String.class, Kunde.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceenumvalues", name = "Id", scope = Kunde.class)
    public JAXBElement<String> createKundeId(String value) {
        return new JAXBElement<String>(_KundeId_QNAME, String.class, Kunde.class, value);
    }

}
