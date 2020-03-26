//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.26 at 12:23:10 PM GMT 
//


package com.redmonkeysoftware.sdlt.model.response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redmonkeysoftware.sdlt.model.response package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redmonkeysoftware.sdlt.model.response
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
     * Create an instance of {@link ImportDocuments }
     * 
     */
    public ImportDocuments createImportDocuments() {
        return new ImportDocuments();
    }

    /**
     * Create an instance of {@link SDLTResponse }
     * 
     */
    public SDLTResponse createSDLTResponse() {
        return new SDLTResponse();
    }

    /**
     * Create an instance of {@link SDLTResponse.Header }
     * 
     */
    public SDLTResponse.Header createSDLTResponseHeader() {
        return new SDLTResponse.Header();
    }

    /**
     * Create an instance of {@link SDLTResponse.Header.Status }
     * 
     */
    public SDLTResponse.Header.Status createSDLTResponseHeaderStatus() {
        return new SDLTResponse.Header.Status();
    }

    /**
     * Create an instance of {@link ImportDocuments.Document }
     * 
     */
    public ImportDocuments.Document createImportDocumentsDocument() {
        return new ImportDocuments.Document();
    }

    /**
     * Create an instance of {@link GetPrintoutDocuments.Document }
     * 
     */
    public GetPrintoutDocuments.Document createGetPrintoutDocumentsDocument() {
        return new GetPrintoutDocuments.Document();
    }

    /**
     * Create an instance of {@link GetAccountOTP }
     * 
     */
    public GetAccountOTP createGetAccountOTP() {
        return new GetAccountOTP();
    }

    /**
     * Create an instance of {@link GetDocumentsStatus.Document }
     * 
     */
    public GetDocumentsStatus.Document createGetDocumentsStatusDocument() {
        return new GetDocumentsStatus.Document();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link SDLTResponse.Body }
     * 
     */
    public SDLTResponse.Body createSDLTResponseBody() {
        return new SDLTResponse.Body();
    }

    /**
     * Create an instance of {@link SDLTResponse.Header.Status.Error }
     * 
     */
    public SDLTResponse.Header.Status.Error createSDLTResponseHeaderStatusError() {
        return new SDLTResponse.Header.Status.Error();
    }

    /**
     * Create an instance of {@link ImportDocuments.Document.Error }
     * 
     */
    public ImportDocuments.Document.Error createImportDocumentsDocumentError() {
        return new ImportDocuments.Document.Error();
    }

    /**
     * Create an instance of {@link GetPrintoutDocuments.Document.PrintoutDocument }
     * 
     */
    public GetPrintoutDocuments.Document.PrintoutDocument createGetPrintoutDocumentsDocumentPrintoutDocument() {
        return new GetPrintoutDocuments.Document.PrintoutDocument();
    }

    /**
     * Create an instance of {@link GetPrintoutDocuments.Document.Error }
     * 
     */
    public GetPrintoutDocuments.Document.Error createGetPrintoutDocumentsDocumentError() {
        return new GetPrintoutDocuments.Document.Error();
    }

}
