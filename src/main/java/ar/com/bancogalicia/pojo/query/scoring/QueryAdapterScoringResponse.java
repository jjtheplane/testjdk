package ar.com.bancogalicia.pojo.query.scoring;

import java.util.List;
import ar.com.bancogalicia.pojo.Response.ApiError;
import ar.com.bancogalicia.pojo.Response.Meta;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResponse.Datos;

public class QueryAdapterScoringResponse {

    private Meta meta;
    private List<Datos> data;
    private List<ApiError> errors;

    public void setMeta(Meta meta){
        this.meta = meta;
    }
    public Meta getMeta(){
        return this.meta;
    }
    public void setData(List<Datos> data){
        this.data = data;
    }
    public List<Datos> getData(){
        return this.data;
    }
    public void setErrors(List<ApiError> errors){
        this.errors = errors;
    }
    public List<ApiError> getErrors(){
        return this.errors;
    }
}
