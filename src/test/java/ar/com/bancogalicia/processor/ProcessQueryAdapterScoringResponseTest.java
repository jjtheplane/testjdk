package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helper.TestUtilities;
import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.pojo.Response.StandardRestResponse;
import ar.com.bancogalicia.pojo.query.scoring.QueryAdapterScoringResponse;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResponse;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class ProcessQueryAdapterScoringResponseTest extends CamelTestSupport {

    private static final ProcessQueryAdapterScoringResponse processQueryAdapterScoringResponse =
            new ProcessQueryAdapterScoringResponse();

    @Test
    public void givenQueryAdapterResponse_whenProcess_thenCheckProperty() throws Exception {
        Exchange exchange = new DefaultExchange(context);

        QueryAdapterScoringResponse queryAdapterScoringResponse = new QueryAdapterScoringResponse();
        ObtenerClasificacionSegunMovimientosResponse.Datos datos = new ObtenerClasificacionSegunMovimientosResponse.Datos();
        queryAdapterScoringResponse.setData(Arrays.asList(datos));
        exchange.getIn().setBody(queryAdapterScoringResponse);

        processQueryAdapterScoringResponse.process(exchange);
        ObtenerClasificacionSegunMovimientosResponse.Datos receivedDatos =
                exchange.getProperty(CamelConstants.PROPERTY_SCORING_DATA,
                        ObtenerClasificacionSegunMovimientosResponse.Datos.class);

        Assert.assertNotNull(receivedDatos);
    }

}
