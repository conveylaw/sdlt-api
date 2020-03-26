//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.26 at 12:23:10 PM GMT 
//


package com.redmonkeysoftware.sdlt.model.request.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redmonkeysoftware.sdlt.model.request.api package. 
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

    private final static QName _GetDocumentsStatusFilterCreateDateFrom_QNAME = new QName("http://sdlt.co.uk/API", "CreateDateFrom");
    private final static QName _GetDocumentsStatusFilterCreateDateTo_QNAME = new QName("http://sdlt.co.uk/API", "CreateDateTo");
    private final static QName _GetDocumentsStatusFilterDocumentID_QNAME = new QName("http://sdlt.co.uk/API", "DocumentID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redmonkeysoftware.sdlt.model.request.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocumentsStatus }
     * 
     */
    public GetDocumentsStatus createGetDocumentsStatus() {
        return new GetDocumentsStatus();
    }

    /**
     * Create an instance of {@link GetPrintoutDocuments }
     * 
     */
    public GetPrintoutDocuments createGetPrintoutDocuments() {
        return new GetPrintoutDocuments();
    }

    /**
     * Create an instance of {@link GetAccountOTP }
     * 
     */
    public GetAccountOTP createGetAccountOTP() {
        return new GetAccountOTP();
    }

    /**
     * Create an instance of {@link GetDocumentsStatus.Filter }
     * 
     */
    public GetDocumentsStatus.Filter createGetDocumentsStatusFilter() {
        return new GetDocumentsStatus.Filter();
    }

    /**
     * Create an instance of {@link GetPrintoutDocuments.Document }
     * 
     */
    public GetPrintoutDocuments.Document createGetPrintoutDocumentsDocument() {
        return new GetPrintoutDocuments.Document();
    }

    /**
     * Create an instance of {@link ImportDocuments }
     * 
     */
    public ImportDocuments createImportDocuments() {
        return new ImportDocuments();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sdlt.co.uk/API", name = "CreateDateFrom", scope = GetDocumentsStatus.Filter.class)
    public JAXBElement<XMLGregorianCalendar> createGetDocumentsStatusFilterCreateDateFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetDocumentsStatusFilterCreateDateFrom_QNAME, XMLGregorianCalendar.class, GetDocumentsStatus.Filter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sdlt.co.uk/API", name = "CreateDateTo", scope = GetDocumentsStatus.Filter.class)
    public JAXBElement<XMLGregorianCalendar> createGetDocumentsStatusFilterCreateDateTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetDocumentsStatusFilterCreateDateTo_QNAME, XMLGregorianCalendar.class, GetDocumentsStatus.Filter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sdlt.co.uk/API", name = "DocumentID", scope = GetDocumentsStatus.Filter.class)
    public JAXBElement<String> createGetDocumentsStatusFilterDocumentID(String value) {
        return new JAXBElement<String>(_GetDocumentsStatusFilterDocumentID_QNAME, String.class, GetDocumentsStatus.Filter.class, value);
    }

}
