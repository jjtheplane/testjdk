package ar.com.bancogalicia.pojo;

import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.NombrePersonaFisica;

public class ClientPersonName {

    private String name;
    private String lastname;
    private String gender;

    ClientPersonName() {
    }

    public ClientPersonName(NombrePersonaFisica nombrePersonaFisica, String codigoSexo) {
        this.gender = codigoSexo;
        this.lastname = nombrePersonaFisica.getApellido();
        this.name = nombrePersonaFisica.getNombre();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
