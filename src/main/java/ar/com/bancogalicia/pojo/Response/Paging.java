package ar.com.bancogalicia.pojo.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"size", "offset", "total"})
public class Paging {

    @ApiModelProperty(notes = "The size of the page")
    @JsonProperty("size")
    public String size;

    @ApiModelProperty(notes = "The offset parameter")
    @JsonProperty("offset")
    public String offset;

    @ApiModelProperty(notes = "The total number of pages")
    @JsonProperty("total")
    public String total;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
