package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.helpers.SwaggerInfoConstants;
import ar.com.bancogalicia.model.PersonType;
import ar.com.bancogalicia.service.TransitionService;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SetFirstHostTests extends CamelTestSupport {

	@InjectMocks
    private SetFirstHost setFirstHost;
    
    @Mock
    TransitionService transitionService;

    @Test
    public void givenIdPomNotCorporate_whenProcessInSetFirstHost_thenReceivedIsNotCorporatePerson() throws Exception {
        String expectedHosts = "1400";
        String expectedPom = "00003149500M20190827181312011";
        String expectedIdChannel = "onb";
        Exchange exchange = new DefaultExchange(context);
        exchange.getIn().setHeader(CamelConstants.PROPERTY_ID_POM_PERSON, expectedPom);

        exchange.getIn().setHeader(SwaggerInfoConstants.PARAM_HEADER_CHANNEL, expectedIdChannel);
        exchange.getIn().setBody(expectedHosts);
        Mockito.when(transitionService.getPersonTypeByIdPom(Mockito.any())).thenReturn(PersonType.F);
        setFirstHost.process(exchange);

        boolean receivedIsCorporate = exchange.getProperty(CamelConstants.PROPERTY_IS_CORPORATE, Boolean.class);
        Assert.assertFalse(receivedIsCorporate);
    }

    @Test
    public void givenIdPomCorporate_whenProcessInSetFirstHost_thenReceivedIsCorporatePerson() throws Exception {
        String expectedHosts = "1400";
        String expectedPom = "00003149500J20190827181312011";
        String expectedIdChannel = "onb";
        Exchange exchange = new DefaultExchange(context);
        exchange.getIn().setHeader(CamelConstants.PROPERTY_ID_POM_PERSON, expectedPom);

        exchange.getIn().setHeader(SwaggerInfoConstants.PARAM_HEADER_CHANNEL, expectedIdChannel);
        exchange.getIn().setBody(expectedHosts);
        Mockito.when(transitionService.getPersonTypeByIdPom(Mockito.any())).thenReturn(PersonType.J);
        setFirstHost.process(exchange);

        boolean receivedIsCorporate = exchange.getProperty(CamelConstants.PROPERTY_IS_CORPORATE, Boolean.class);
        Assert.assertTrue(receivedIsCorporate);
    }

    @Test
    public void givenIdPomNotCorporate_whenProcessInSetFirstHost_thenReceivedIsNotCorporatePersonWithIdPomV3() throws Exception {
        String expectedHosts = "1400";
        String expectedPom = "615";
        String expectedIdChannel = "onb";
        Exchange exchange = new DefaultExchange(context);
        exchange.getIn().setHeader(CamelConstants.PROPERTY_ID_POM_PERSON, expectedPom);

        exchange.getIn().setHeader(SwaggerInfoConstants.PARAM_HEADER_CHANNEL, expectedIdChannel);
        exchange.getIn().setBody(expectedHosts);
        Mockito.when(transitionService.getPersonTypeByIdPom(Mockito.any())).thenReturn(PersonType.F);
        setFirstHost.process(exchange);

        boolean receivedIsCorporate = exchange.getProperty(CamelConstants.PROPERTY_IS_CORPORATE, Boolean.class);
        Assert.assertFalse(receivedIsCorporate);
    }

    @Test
    public void givenIdPomCorporate_whenProcessInSetFirstHost_thenReceivedIsCorporatePersonWithIdPomV3() throws Exception {
        String expectedHosts = "1400";
        String expectedPom = "614";
        String expectedIdChannel = "onb";
        Exchange exchange = new DefaultExchange(context);
        exchange.getIn().setHeader(CamelConstants.PROPERTY_ID_POM_PERSON, expectedPom);

        exchange.getIn().setHeader(SwaggerInfoConstants.PARAM_HEADER_CHANNEL, expectedIdChannel);
        exchange.getIn().setBody(expectedHosts);
        Mockito.when(transitionService.getPersonTypeByIdPom(Mockito.any())).thenReturn(PersonType.J);
        setFirstHost.process(exchange);

        boolean receivedIsCorporate = exchange.getProperty(CamelConstants.PROPERTY_IS_CORPORATE, Boolean.class);
        Assert.assertTrue(receivedIsCorporate);
    }
}
