package ar.com.bancogalicia.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HostPomResponse {

    @JsonProperty("host")
    private String[] idHost;

    public HostPomResponse(String[] idHost) {
        this.idHost = idHost;
    }

    public HostPomResponse() {
    }

    public String[] getIdHost() {
        return idHost;
    }

    public void setIdHost(String[] idHost) {
        this.idHost = idHost;
    }
}
