package ar.com.bancogalicia.pojo;

import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.Documento;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDocument {

    @JsonProperty(value = "document_number",required = true)
    private String documentNumber;
    private String type;
    private String provider;

    public ClientDocument(Documento documento) {
        this.documentNumber = documento.getNumero();
        this.type = documento.getTipo();
        this.provider = documento.getEmisor();
    }

    @JsonCreator
    public ClientDocument(@JsonProperty(value = "document_number",required = true)String documentNumber,
                          @JsonProperty(value = "type",required = true)String type,
                          @JsonProperty(value = "provider")String provider) {
        this.documentNumber = documentNumber;
        this.type = type;
        this.provider = provider;
    }

    public ClientDocument() {
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
