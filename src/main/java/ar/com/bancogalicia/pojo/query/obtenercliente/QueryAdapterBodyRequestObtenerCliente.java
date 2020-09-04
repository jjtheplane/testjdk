package ar.com.bancogalicia.pojo.query.obtenercliente;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryAdapterBodyRequestObtenerCliente {

    @JsonProperty("id_host")
    private String idHost;

    public QueryAdapterBodyRequestObtenerCliente(String idHost) {
        this.idHost = idHost;
    }

    public String getIdHost() {
        return idHost;
    }

    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }
}
