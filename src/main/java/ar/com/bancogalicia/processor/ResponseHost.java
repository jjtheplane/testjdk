package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.HostPomResponse;
import ar.com.bancogalicia.pojo.Response.ApiError;
import ar.com.bancogalicia.pojo.Response.Meta;
import ar.com.bancogalicia.pojo.Response.Paging;
import ar.com.bancogalicia.pojo.Response.StandardRestResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponseHost implements Processor  {
    @Override
    public void process(Exchange exchange) throws Exception {
        String host = exchange.getIn().getBody(String.class);
        HostPomResponse hostPomResponse = new HostPomResponse(host.split(","));
        StandardRestResponse standardRestResponse = new StandardRestResponse();
        ArrayList<ApiError> error = new ArrayList<>();
        List<Object> data = new ArrayList<>();
        data.add(hostPomResponse);

        String path = exchange.getProperty(CamelConstants.PROPERTY_RESPONSE_META_PATH).toString();
        String method = exchange.getProperty(CamelConstants.PROPERTY_RESPONSE_META_METHOD).toString();

        Meta meta = new Meta(method, path, new Paging());
        standardRestResponse.setMeta(meta);
        standardRestResponse.setData(data);
        standardRestResponse.setApiErrors(error);
        exchange.getOut().setBody(standardRestResponse);

    }
}
