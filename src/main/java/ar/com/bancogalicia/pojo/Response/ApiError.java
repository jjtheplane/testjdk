package ar.com.bancogalicia.pojo.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"code", "detail"})
public class ApiError {

    @ApiModelProperty(notes = "Represents the error code")
    @JsonProperty("code")
    public String code;

    @ApiModelProperty(notes = "Represents the description detail of the error")
    @JsonProperty("detail")
    public String detail;


    public ApiError() {
    }

    public ApiError(String code, String detail) {
        this.code = code;
        this.detail = detail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
