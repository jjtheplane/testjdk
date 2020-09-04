package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.ClientInformationResponse;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class MergeInfoFromQueryAdapter implements Processor {


    @Override
    public void process(Exchange exchange) throws Exception {
        ObtenerClasificacionSegunMovimientosResponse.Datos scoringData =
                exchange.getProperty(CamelConstants.PROPERTY_SCORING_DATA,
                        ObtenerClasificacionSegunMovimientosResponse.Datos.class);
        ClientInformationResponse clientInformation = exchange.getProperty(CamelConstants.PROPERTY_BODY_CLIENT_INFO,
                ClientInformationResponse.class);

        clientInformation.setCodigoSucursal(scoringData);
        clientInformation.setSegmentCode(scoringData);
        exchange.getIn().setBody(clientInformation);
    }
}
