package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.ctg.CtgResponse;
import ar.com.bancogalicia.pojo.ctg.Data;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ProcessCtgAccessionResponseTest extends CamelTestSupport {

    private static final ProcessCtgAccessionResponse processCtgAccessionResponse = new ProcessCtgAccessionResponse();

    @Test
    public void givenCtgResponseWhitNoData_whenProcess_thenCheckBodyIdAdhesionNull() throws Exception {
        CtgResponse ctgResponse = new CtgResponse();
        ArrayList<Data> data = new ArrayList<>();
        ctgResponse.setData(data);

        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();
        Exchange exchange = new DefaultExchange(context);

        exchange.getIn().setBody(ctgResponse);
        exchange.setProperty(CamelConstants.PROPERTY_TEMP_CLIENT_INFO, clientInformationResponse);
        processCtgAccessionResponse.process(exchange);

        ClientInformationResponse receivedClientInfo = exchange.getIn().getBody(ClientInformationResponse.class);
        Assert.assertNull(receivedClientInfo.getIdAdhesion());
    }

    @Test
    public void givenCtgResponseWhitData_whenProcess_thenCheckBodyIdAdhesion() throws Exception {
        String expectedHost = "02";
        String expectedAdhesion = "04";
        String statusAdhesion = "OK";
        CtgResponse ctgResponse = new CtgResponse();
        Data data = new Data();
        data.setStatusAdhesion(statusAdhesion);
        data.setIdHost(expectedHost);
        data.setIdAdhesion(expectedAdhesion);
        ctgResponse.setData(Arrays.asList(data));

        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();
        Exchange exchange = new DefaultExchange(context);

        exchange.getIn().setBody(ctgResponse);
        exchange.setProperty(CamelConstants.PROPERTY_TEMP_CLIENT_INFO, clientInformationResponse);
        processCtgAccessionResponse.process(exchange);

        ClientInformationResponse receivedClientInfo = exchange.getIn().getBody(ClientInformationResponse.class);
        Assert.assertEquals(data.getIdAdhesion(), receivedClientInfo.getIdAdhesion());
    }

}
