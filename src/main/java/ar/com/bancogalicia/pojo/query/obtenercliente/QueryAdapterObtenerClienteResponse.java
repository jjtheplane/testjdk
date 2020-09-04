package ar.com.bancogalicia.pojo.query.obtenercliente;

import ar.com.bancogalicia.pojo.Response.ApiError;
import ar.com.bancogalicia.pojo.Response.Meta;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@lombok.Data
public class QueryAdapterObtenerClienteResponse
{
    @ApiModelProperty(notes = "The meta data of the response")
    @JsonProperty("meta")
    private Meta meta;

    @ApiModelProperty(notes = "The inner data of the response")
    @JsonProperty("data")
    private List<Data> data;

    @ApiModelProperty(notes = "The error list of the response")
    @JsonProperty("errors")
    private List<ApiError> errors;

}
