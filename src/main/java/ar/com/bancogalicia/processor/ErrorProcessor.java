package ar.com.bancogalicia.processor;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.Response.ApiError;
import ar.com.bancogalicia.pojo.Response.Meta;
import ar.com.bancogalicia.pojo.Response.StandardRestResponse;

@Component
public class ErrorProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String path = exchange.getProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH, String.class);
        String message = exchange.getProperty(CamelConstants.PROPERTY_MESSAGE, String.class);
        String code = exchange.getProperty(CamelConstants.PROPERTY_RESPONSE_ERROR_CODE, String.class);
        StandardRestResponse standardRestResponse = new StandardRestResponse();
        String method = exchange.getProperty(CamelConstants.PROPERTY_RESPONSE_META_METHOD, String.class);
        Meta meta = new Meta(method, path, null);
        ArrayList<ApiError> error = new ArrayList<>();
        ApiError e = new ApiError(code, message);
        error.add(e);
        standardRestResponse.setMeta(meta);
        standardRestResponse.setData(new ArrayList<>());
        standardRestResponse.setApiErrors(error);
        exchange.getIn().setBody(standardRestResponse);
    }
}