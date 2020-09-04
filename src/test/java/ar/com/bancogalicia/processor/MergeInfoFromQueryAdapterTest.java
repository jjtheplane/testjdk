package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ClasificacionCliente;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResponse;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.SucursalMadre;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigo;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Codigov2;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigInteger;

@RunWith(MockitoJUnitRunner.class)
public class MergeInfoFromQueryAdapterTest extends CamelTestSupport {

    private static final MergeInfoFromQueryAdapter mergeInfoFromQueryAdapter =
            new MergeInfoFromQueryAdapter();

    @Test
    public void givenPompersonIdContainer_whenProcessInPomPersonKeyToHeader_thenHeaderIdPomIsCorrect() throws Exception {
        String expectedSegmentCode = "test codigov2";
        String expectedSucursalMadre = "test value";
        Exchange exchange = new DefaultExchange(context);
        ObtenerClasificacionSegunMovimientosResponse.Datos datos =
                new ObtenerClasificacionSegunMovimientosResponse.Datos();

        ClasificacionCliente clasificacionCliente = new ClasificacionCliente();
        SucursalMadre sucursalMadre = new SucursalMadre();
        Codigo codigo = new Codigo();
        codigo.setValue(expectedSucursalMadre);
        sucursalMadre.setNumero(BigInteger.valueOf(99));
        sucursalMadre.setCodigoRol(codigo);
        clasificacionCliente.setSucursalMadre(sucursalMadre);
        ClasificacionCliente.Segmento segmento = new ClasificacionCliente.Segmento();
        Codigov2 codigov2 = new Codigov2();
        codigov2.setValue(expectedSegmentCode);
        segmento.setCodigo(codigov2);
        clasificacionCliente.setSegmento(segmento);
        datos.setClasificacionCliente(clasificacionCliente);
        ClientInformationResponse clientInformationResponse = new ClientInformationResponse();
        exchange.setProperty(CamelConstants.PROPERTY_BODY_CLIENT_INFO, clientInformationResponse);
        exchange.setProperty(CamelConstants.PROPERTY_SCORING_DATA, datos);

        mergeInfoFromQueryAdapter.process(exchange);
        ClientInformationResponse receivedBody = exchange.getIn().getBody(ClientInformationResponse.class);
        Assert.assertEquals(expectedSegmentCode, receivedBody.getSegmentCode());
        Assert.assertEquals(expectedSucursalMadre, receivedBody.getMainLocation().getCode());

    }
}
