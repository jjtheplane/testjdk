package ar.com.bancogalicia.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class MainLocation {

    private BigInteger number;
    private String code;

    public MainLocation() {
    }

    @JsonCreator
    public MainLocation(@JsonProperty(value = "number",required = true)BigInteger number,
                        @JsonProperty(value = "code",required = true)String codigo) {
        this.number = number;
        this.code = codigo;
    }

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String codigo) {
        this.code = codigo;
    }

}
