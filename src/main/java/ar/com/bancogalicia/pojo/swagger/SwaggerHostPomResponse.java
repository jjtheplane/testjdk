package ar.com.bancogalicia.pojo.swagger;

import ar.com.bancogalicia.pojo.HostPomResponse;
import ar.com.bancogalicia.pojo.Response.ApiError;
import ar.com.bancogalicia.pojo.Response.Meta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"meta", "data", "errors"})
public class SwaggerHostPomResponse {

    @ApiModelProperty(notes = "The meta data of the response")
    @JsonProperty("meta")
    private Meta meta;

    @ApiModelProperty(notes = "The inner data of the response")
    @JsonProperty("data")
    private List<HostPomResponse> data;

    @ApiModelProperty(notes = "The error list of the response")
    @JsonProperty("errors")
    private List<ApiError> apiErrors;

}