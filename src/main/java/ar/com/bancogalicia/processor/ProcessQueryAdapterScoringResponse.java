package ar.com.bancogalicia.processor;

import ar.com.bancogalicia.helpers.CamelConstants;
import ar.com.bancogalicia.pojo.query.scoring.QueryAdapterScoringResponse;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class ProcessQueryAdapterScoringResponse implements Processor  {
    @Override
    public void process(Exchange exchange) throws Exception {
        QueryAdapterScoringResponse response = exchange.getIn().getBody(QueryAdapterScoringResponse.class);
        ObtenerClasificacionSegunMovimientosResponse.Datos datos = response.getData().get(0);
        exchange.setProperty(CamelConstants.PROPERTY_SCORING_DATA, datos);
    }


}
