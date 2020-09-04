package ar.com.bancogalicia.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CtgAccessionBodyRequest {

    @JsonProperty("id_host")
    private String idHost;

    public CtgAccessionBodyRequest(String idHost) {
        this.idHost = idHost;
    }

    public String getIdHost() {
        return idHost;
    }

    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }
}
