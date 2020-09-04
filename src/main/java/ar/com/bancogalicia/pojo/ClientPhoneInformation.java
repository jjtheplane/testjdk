package ar.com.bancogalicia.pojo;

import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.TelefonoBasicoRespuestaNV;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientPhoneInformation {

    private boolean mobile;
    @JsonProperty(value = "country_code")
    private String countryCode;
    @JsonProperty(value = "area_code",required = true)
    private String areaCode;
    private String number;

    public ClientPhoneInformation() {
    }

    @JsonCreator
    public ClientPhoneInformation(@JsonProperty(value = "mobile",required = true)boolean mobile,
                                  @JsonProperty(value = "country_code")String countryCode,
                                  @JsonProperty(value = "area_code",required = true)String areaCode,
                                  @JsonProperty(value = "number",required = true)String number) {
        this.mobile = mobile;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.number = number;
    }


    public ClientPhoneInformation(TelefonoBasicoRespuestaNV phoneInformation) {
        try {
            if (!phoneInformation.getCelular().equals("false")) {
                this.mobile = true;
                this.number = phoneInformation.getNumero();
            } else {
                this.number = phoneInformation.getNumero();
                this.mobile = false;
            }
            this.areaCode = phoneInformation.getCodigoArea();
            this.countryCode = phoneInformation.getCodigoPais();
        } catch (Exception e) {
            this.mobile = false;
            this.countryCode = "-";
            this.areaCode = "-";
            this.number = "-";
        }

    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
