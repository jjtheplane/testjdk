package ar.com.bancogalicia.pojo.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"meta", "data", "errors"})
public class StandardRestResponse {

    @ApiModelProperty(notes = "The meta data of the response")
    @JsonProperty("meta")
    private Meta meta;

    @ApiModelProperty(notes = "The inner data if the response")
    @JsonProperty("data")
    private List<Object> data;

    @ApiModelProperty(notes = "The error list of the response")
    @JsonProperty("errors")
    private List<ApiError> apiErrors;


    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public List<ApiError> getApiErrors() {
        return apiErrors;
    }

    public void setApiErrors(List<ApiError> apiErrors) {
        this.apiErrors = apiErrors;
    }

}
