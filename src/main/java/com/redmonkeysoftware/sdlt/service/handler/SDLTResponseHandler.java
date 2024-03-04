package com.redmonkeysoftware.sdlt.service.handler;

import com.redmonkeysoftware.sdlt.model.SdltXmlHelper;
import com.redmonkeysoftware.sdlt.model.response.SDLTResponse;
import jakarta.xml.bind.JAXBException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SDLTResponseHandler<T> implements ResponseHandler<T> {

    private static final Logger LOGGER = Logger.getLogger(SDLTResponseHandler.class.getName());

    @Override
    public T handleResponse(HttpResponse response) throws IOException {
        int status = response.getStatusLine().getStatusCode();
        if ((status >= 200) && (status < 300)) {
            try {
                ContentType contentType = ContentType.getOrDefault(response.getEntity());
                Charset charset = contentType.getCharset();
                String responseContent = EntityUtils.toString(response.getEntity(), charset);
                LOGGER.log(Level.INFO, "Received: {0}", responseContent);
                SDLTResponse sdltResponse = SdltXmlHelper.getInstance().unmarshalResponseXml(IOUtils.toInputStream(responseContent, charset), SDLTResponse.class);
                for (Object obj : sdltResponse.getBody().getAny()) {
                    LOGGER.log(Level.INFO, "Received: {0}", obj.getClass().getName());
                    try {
                        return (T) obj;
                    } catch (Throwable t) {
                        //Ignore as may not be convertable into required type
                    }
                }
                return null;
            } catch (JAXBException jaxbe) {
                throw new ClientProtocolException("Could not unmarshal XML: " + jaxbe.getMessage());
            }
        } else {
            throw new ClientProtocolException("Sdlt Request was not successful: " + status + ":" + response.getStatusLine().getReasonPhrase());
        }
    }
}
