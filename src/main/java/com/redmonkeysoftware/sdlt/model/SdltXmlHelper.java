package com.redmonkeysoftware.sdlt.model;

import com.redmonkeysoftware.sdlt.model.request.api.GetAccountOTP;
import com.redmonkeysoftware.sdlt.model.request.api.GetDocumentsStatus;
import com.redmonkeysoftware.sdlt.model.request.api.GetDocumentsStatus.Filter;
import com.redmonkeysoftware.sdlt.model.request.api.GetPrintoutDocuments;
import com.redmonkeysoftware.sdlt.model.request.api.ImportDocuments;
import com.redmonkeysoftware.sdlt.model.request.api.Test;
import com.redmonkeysoftware.sdlt.model.request.sdlt.BooleanType;
import com.redmonkeysoftware.sdlt.model.request.sdlt.DateTimeType;
import com.redmonkeysoftware.sdlt.model.request.sdlt.DateType;
import com.redmonkeysoftware.sdlt.model.request.sdlt.SDLT;
import com.redmonkeysoftware.sdlt.model.request.sdlt.StringType;
import com.redmonkeysoftware.sdlt.model.request.sdltmessage.SDLTMessage;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.StringUtils;

public class SdltXmlHelper {

    private final static Logger logger = Logger.getLogger(SdltXmlHelper.class.getName());
    private static SdltXmlHelper instance;
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    private JAXBContext sdltRequestContext = JAXBContext.newInstance("com.redmonkeysoftware.sdlt.model.request.sdlt");
    private JAXBContext sdltMessageRequestContext = JAXBContext.newInstance("com.redmonkeysoftware.sdlt.model.request.sdltmessage");
    private JAXBContext apiRequestContext = JAXBContext.newInstance("com.redmonkeysoftware.sdlt.model.request.api");
    
    private com.redmonkeysoftware.sdlt.model.request.sdlt.ObjectFactory sdltObjectFactory = new com.redmonkeysoftware.sdlt.model.request.sdlt.ObjectFactory();
    private com.redmonkeysoftware.sdlt.model.request.sdltmessage.ObjectFactory sdltMessageObjectFactory = new com.redmonkeysoftware.sdlt.model.request.sdltmessage.ObjectFactory();
    private com.redmonkeysoftware.sdlt.model.request.api.ObjectFactory apiObjectFactory = new com.redmonkeysoftware.sdlt.model.request.api.ObjectFactory();
    
    private JAXBContext responseContext = JAXBContext.newInstance("com.redmonkeysoftware.sdlt.model.response");
    private com.redmonkeysoftware.sdlt.model.response.ObjectFactory responseObjectFactory = new com.redmonkeysoftware.sdlt.model.response.ObjectFactory();

    private SdltXmlHelper() throws JAXBException {

    }

    private Marshaller createMarshaller(JAXBContext context, String schemaLocation) throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        if (StringUtils.isNotBlank(schemaLocation)) {
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, schemaLocation);
        }
        return marshaller;
    }

    private Unmarshaller createUnmarshaller(JAXBContext context) throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return unmarshaller;
    }

    public static synchronized SdltXmlHelper getInstance() throws JAXBException {
        if (instance == null) {
            instance = new SdltXmlHelper();
        }
        return instance;
    }

    protected JAXBElement createStringType(String name, String value) {
        StringType st = new StringType();
        st.setValue(value);
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/SDLT", name), StringType.class, st);
        return jaxbe;
    }

    protected JAXBElement createBooleanType(String name, Boolean value) {
        BooleanType st = new BooleanType();
        st.setValue(Objects.equals(Boolean.TRUE, value) ? "true" : "false");
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/SDLT", name), BooleanType.class, st);
        return jaxbe;
    }

    protected JAXBElement createDateType(String name, LocalDate value) {
        DateType st = new DateType();
        st.setValue(value != null ? dateFormatter.format(value) : null);
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/SDLT", name), DateType.class, st);
        return jaxbe;
    }

    protected JAXBElement createDateTimeType(String name, LocalDateTime value) {
        DateTimeType st = new DateTimeType();
        st.setValue(value != null ? dateTimeFormatter.format(value) : null);
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/SDLT", name), DateTimeType.class, st);
        return jaxbe;
    }

    protected JAXBElement<XMLGregorianCalendar> createXmlGregorianCalendarType(String name, LocalDate value) {
        StringType st = new StringType();
        st.setValue(value != null ? dateFormatter.format(value) : null);
        JAXBElement jaxbe = new JAXBElement(new QName("http://sdlt.co.uk/API", name), XMLGregorianCalendar.class, st);
        return jaxbe;
    }

    public Test convertToTest(String testValue) {
        Test request = apiObjectFactory.createTest();
        request.setData(testValue);
        return request;
    }

    public GetAccountOTP convertToGetAccountOTP(Integer documentId) {
        GetAccountOTP request = apiObjectFactory.createGetAccountOTP();
        if (documentId != null) {
            request.setDocumentID(documentId);
        }
        return request;
    }

    public GetDocumentsStatus convertToGetDocumentsStatus(String documentId) {
        GetDocumentsStatus status = apiObjectFactory.createGetDocumentsStatus();
        Filter filter = apiObjectFactory.createGetDocumentsStatusFilter();
        if (StringUtils.isNotBlank(documentId)) {
            filter.getCreateDateFromOrCreateDateToOrDocumentID().add(apiObjectFactory.createGetDocumentsStatusFilterDocumentID(documentId));
        }
//        if (from != null) {
//            filter.getCreateDateFromOrCreateDateTo().add(createXmlGregorianCalendarType("CreateDateFrom", from));
//        }
//        if (to != null) {
//            filter.getCreateDateFromOrCreateDateTo().add(createXmlGregorianCalendarType("CreateDateTo", to));
//        }
        status.setFilter(filter);
        return status;
    }

    public GetPrintoutDocuments convertToPrintoutDocuments(String documentId) {
        GetPrintoutDocuments request = apiObjectFactory.createGetPrintoutDocuments();
        if (StringUtils.isNotBlank(documentId)) {
            GetPrintoutDocuments.Document document = apiObjectFactory.createGetPrintoutDocumentsDocument();
            document.setDocumentID(documentId);
            request.getDocument().add(document);
        }
        return request;
    }

    protected String createApiXml(Object requestObject, String url) throws JAXBException {
        String responseXml = marshalApiRequestObject(requestObject, "http://sdlt.co.uk/API https://online.sdlt.co.uk/schema/v1-0/" + url + ".xsd");
        return responseXml;
    }
    
    protected String createSdltXml(Object requestObject) throws JAXBException {
        String responseXml = marshalSdltRequestObject(requestObject, "http://sdlt.co.uk/SDLT https://online.sdlt.co.uk/schema/v1-0/SDLT.xsd");
        return responseXml;
    }
    
//    protected String createSdltMessage(Object requestObject, String url) throws JAXBException {
//        SDLTMessage message = sdltMessageObjectFactory.createSDLTMessage();
//        SDLTMessage.Body body = sdltMessageObjectFactory.createSDLTMessageBody();
//        body.getAny().add(requestObject);
//        message.setBody(body);
//        message.setVersion("1.0");
//        SDLTMessage.Header header = sdltMessageObjectFactory.createSDLTMessageHeader();
//        message.setHeader(header);
//        String responseXml = marshalSdltMessageRequestObject(message, "http://sdlt.co.uk/Header https://online.sdlt.co.uk/schema/v1-0/SDLTMessage.xsd http://sdlt.co.uk/API https://online.sdlt.co.uk/schema/v1-0/" + url + ".xsd");
//        return responseXml;
//    }

//    protected String createImportDocumentsMessage(SDLT sdlt) throws JAXBException {
//        String responseXml = createApiXml(apiObjectFactory.createImportDocuments(), "ImportDocuments");
//        String sdltXml = marshalSdltRequestObject(sdlt, "http://sdlt.co.uk/API https://online.sdlt.co.uk/schema/v1-0/SDLT.xsd");
//        sdltXml = StringUtils.removeStartIgnoreCase(sdltXml, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
//
//        //Need to manually put the SDLT node in the middle of the ImportDocuments node
//        responseXml = StringUtils.replace(responseXml, "ImportDocuments.xsd", "ImportXsdDocuments");
//        String before = StringUtils.substringBefore(responseXml, "ImportDocuments");
//        String namespace = StringUtils.substringAfterLast(before, "<");
//        String attributes = StringUtils.substringBefore(StringUtils.substringAfter(responseXml, "ImportDocuments"), ">");
//        String after = StringUtils.substringAfterLast(responseXml, "ImportDocuments");
//        responseXml = before + "ImportDocuments" + StringUtils.removeStart(StringUtils.trim(attributes), "/") + ">" + sdltXml + "</" + namespace + "ImportDocuments>" + StringUtils.removeStart(StringUtils.trim(after), "/>");
//        responseXml = StringUtils.replace(responseXml, "ImportXsdDocuments", "ImportDocuments.xsd");
//        //responseXml = responseXml.replaceAll("(?<=[:<]ImportDocuments>)[^<]*(?=</(\\w+:)?ImportDocuments>)", sdltXml);
//        //responseXml = StringUtils.replace(responseXml, "<ns3:ImportDocuments/>", "<ns3:ImportDocuments>" + sdltXml + "</ns3:ImportDocuments>");
//        //responseXml = StringUtils.replace(responseXml, "<ns2:ImportDocuments/>", "<ns2:ImportDocuments>" + sdltXml + "</ns2:ImportDocuments>");
//        //responseXml = StringUtils.replace(responseXml, "<ImportDocuments/>", "<ImportDocuments>" + sdltXml + "</ImportDocuments>");
//        return responseXml;
//    }

    protected String marshalApiRequestObject(Object requestObject, String schemaLocation) throws JAXBException {
        Marshaller marshaller = createMarshaller(apiRequestContext, schemaLocation);
        StringWriter swriter = new StringWriter();
        marshaller.marshal(requestObject, swriter);
        return swriter.toString();
    }
    protected String marshalSdltRequestObject(Object requestObject, String schemaLocation) throws JAXBException {
        Marshaller marshaller = createMarshaller(sdltRequestContext, schemaLocation);
        StringWriter swriter = new StringWriter();
        marshaller.marshal(requestObject, swriter);
        return swriter.toString();
    }
    protected String marshalSdltMessageRequestObject(Object requestObject, String schemaLocation) throws JAXBException {
        Marshaller marshaller = createMarshaller(sdltMessageRequestContext, schemaLocation);
        StringWriter swriter = new StringWriter();
        marshaller.marshal(requestObject, swriter);
        return swriter.toString();
    }

     public String generateRequestXml(String url, Object apiRequest) throws JAXBException {
        String apiRequestXml = null;
        if (apiRequest instanceof SDLT) {
            String sdltXml = createSdltXml(apiRequest);
            sdltXml = StringUtils.removeStartIgnoreCase(sdltXml, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
            apiRequestXml = "<ImportDocuments xmlns=\"http://sdlt.co.uk/API\" xsi:schemaLocation=\"http://sdlt.co.uk/API https://online.sdlt.co.uk/schema/v1-0/ImportDocuments.xsd\">\n"
                    + sdltXml
                    + "\n</ImportDocuments>";
        } else {
            apiRequestXml = createApiXml(apiRequest, url);
        }
        String xml = StringUtils.removeStartIgnoreCase(apiRequestXml, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
        xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<SDLTMessage xmlns=\"http://sdlt.co.uk/Header\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://sdlt.co.uk/Header https://online.sdlt.co.uk/schema/v1-0/SDLTMessage.xsd\">\n"
                + "   <Version>1.0</Version>\n"
                + "   <Header />\n"
                + "   <Body>\n"
                + xml
                + "\n    </Body>\n"
                + "</SDLTMessage>";
//        String requestString = SdltXmlHelper.getInstance().createSdltMessage(requestObject, url);
        logger.log(Level.INFO, String.format("Sending request: %s", xml));
        return xml;
    }
    
    public SDLT convertToSDLT(SdltImportRequest request) {
        SDLT sdlt = sdltObjectFactory.createSDLT();
        try {
            for (Field field : request.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(SdltXmlValue.class)) {
                    SdltXmlValue xmlValue = field.getAnnotation(SdltXmlValue.class);
                    field.setAccessible(true);
                    Object value = field.get(request);
                    if (value instanceof String) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createStringType(xmlValue.value(), (String) value));
                    } else if (value instanceof Boolean) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createBooleanType(xmlValue.value(), (Boolean) value));
                    } else if (value instanceof Integer) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createStringType(xmlValue.value(), ((Integer) value).toString()));
                    } else if (value instanceof BigDecimal) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createStringType(xmlValue.value(), ((BigDecimal) value).setScale(0, RoundingMode.FLOOR).toPlainString()));
                    } else if (value instanceof LocalDate) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createDateType(xmlValue.value(), (LocalDate) value));
                    } else if (value instanceof LocalDateTime) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createDateTimeType(xmlValue.value(), (LocalDateTime) value));
                    } else if (value instanceof BaseEnumType) {
                        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(createStringType(xmlValue.value(), ((BaseEnumType) value).getCode()));
                    } else if (value != null) {
                        logger.log(Level.WARNING, "Not sure how to map field of type: " + field.getClass().getName());
                    }
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Error generating SDLT", e);
        }
        return sdlt;
    }

    public SDLT generateTestSdlt() throws JAXBException {
//        SDLT sdlt2 = sdltObjectFactory.createSDLT();
//        String sdltXml = marshalSdltRequestObject(sdlt2, "http://sdlt.co.uk/SDLT https://online.sdlt.co.uk/schema/v1-0/SDLT.xsd");
//        
//        System.out.println(sdltXml);
//        ImportDocuments id2 = apiObjectFactory.createImportDocuments();
//        String idXml = marshalApiRequestObject(id2, "http://sdlt.co.uk/API https://online.sdlt.co.uk/schema/v1-0/ImportDocuments.xsd");
//        System.out.println(idXml);
//        SDLTMessage message = sdltMessageObjectFactory.createSDLTMessage();
//        SDLTMessage.Body body = sdltMessageObjectFactory.createSDLTMessageBody();
//        message.setBody(body);
//        message.setVersion("1.0");
//        SDLTMessage.Header header = sdltMessageObjectFactory.createSDLTMessageHeader();
//        message.setHeader(header);
//        System.out.println(marshalSdltMessageRequestObject(message, "http://sdlt.co.uk/Header https://online.sdlt.co.uk/schema/v1-0/SDLTMessage.xsd"));
        
        //ImportDocuments importDocuments = apiObjectFactory.createImportDocuments();
        SDLT sdlt = sdltObjectFactory.createSDLT();

        StringType id = sdltObjectFactory.createStringType();
        id.setValue("test");
        sdlt.getFIDOrFDateCreatedOrFUserNotes().add(sdltObjectFactory.createSDLTFID(id));
        //importDocuments.getAny().add(sdlt);
        //return createImportDocumentsMessage(sdlt);
        return sdlt;
    }

    public <T extends Object> T unmarshalResponseXml(InputStream xml, Class<T> type) throws JAXBException {
        Unmarshaller responseUnmarshaller = createUnmarshaller(responseContext);
        Object unmarshalled = responseUnmarshaller.unmarshal(xml);
        try {
            return (T) unmarshalled;
        } catch (Throwable te) {
            logger.log(Level.SEVERE, "Unmarshalled class from xml is not of the correct type", te);
        }
        return null;
    }
}
