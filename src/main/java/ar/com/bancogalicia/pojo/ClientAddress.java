package ar.com.bancogalicia.pojo;

import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Domicilio2Salida;

public class ClientAddress {

    private String street;
    private String number;
    private String floor;
    private String apartment;
    private Integer zipCode;
    private String cpa;
    private String townName;
    private String cityName;
    private String provinceCode;
    private String provinceDescription;
    private String countryCode;
    private String countryDescription;

    public ClientAddress() {
    }

    public ClientAddress(Domicilio2Salida domicilio) {
        this.street = domicilio.getCalle();
        this.apartment = domicilio.getDepartamento();
        this.floor = domicilio.getPiso();
        this.number = domicilio.getNumeroPuerta();
        this.zipCode = domicilio.getCodigoPostal();
        this.cpa = domicilio.getCPA();
        this.townName = domicilio.getNombrePartido();
        this.cityName = domicilio.getNombreLocalidad();
        this.provinceCode = domicilio.getCodigoProvincia();
        this.provinceDescription = domicilio.getDescripcionProvincia();
        this.countryCode = domicilio.getCodigoPais();
        this.countryDescription = domicilio.getDescripcionPais();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCpa() {
        return cpa;
    }

    public void setCpa(String cpa) {
        this.cpa = cpa;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceDescription() {
        return provinceDescription;
    }

    public void setProvinceDescription(String provinceDescription) {
        this.provinceDescription = provinceDescription;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryDescription() {
        return countryDescription;
    }

    public void setCountryDescription(String countryDescription) {
        this.countryDescription = countryDescription;
    }
}
