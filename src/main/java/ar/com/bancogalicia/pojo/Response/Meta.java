package ar.com.bancogalicia.pojo.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"method", "operation", "paging"})
@lombok.Data
public class Meta {

    @ApiModelProperty(notes = "The executed method name")
    @JsonProperty("method")
    public String method;

    @ApiModelProperty(notes = "The executed operation")
    @JsonProperty("operation")
    public String operation;

    @ApiModelProperty(notes = "Paging attributes")
    @JsonProperty("paging")
    public Paging paging;

    public Meta(String method, String operation, Paging paging) {
        this.method = method;
        this.operation = operation;
        this.paging = paging;
    }
    
    public Meta() {
    	
    }
}
