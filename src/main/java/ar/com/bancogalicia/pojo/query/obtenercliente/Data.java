package ar.com.bancogalicia.pojo.query.obtenercliente;

import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.persona._1_0_0.Persona;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.PersonaFisica;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.PersonaJuridica;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"persona", "persona_fisica", "persona_juridica"})
public class Data {
    @ApiModelProperty
    @JsonProperty("persona")
    private Persona persona;

    @ApiModelProperty
    @JsonProperty("persona_fisica")
    private PersonaFisica personaFisica;

    @ApiModelProperty
    @JsonProperty("persona_juridica")
    private PersonaJuridica personaJuridica;


    public Data() {
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public PersonaFisica getPersonaFisica() {
        return personaFisica;
    }

    public void setPersonaFisica(PersonaFisica personaFisica) {
        this.personaFisica = personaFisica;
    }

    public PersonaJuridica getPersonaJuridica() {
        return personaJuridica;
    }

    public void setPersonaJuridica(PersonaJuridica personaJuridica) {
        this.personaJuridica = personaJuridica;
    }
}
