package ar.com.bancogalicia.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OfficeData {

    @JsonProperty("id_host")
    private String idHost;

    @JsonProperty(value = "id_pom_persona")
    private String idPomPersona;
    @JsonProperty(value = "go_user_number",required = true)
    private String goUserNumber;
    private String name;
    @JsonProperty(value = "lastname",required = true)
    private String lastName;
    private String gender;
    private ClientDocument document;
    @JsonProperty(value = "employee_BGBA_code")
    private String employeeBGBACode;
    private ClientAddress address;
    @JsonProperty(value = "phones")
    private List<ClientPhoneInformation> phoneInformation;
    private String[] emails;
    @JsonProperty(value = "segment_code",required = true)
    private String segmentCode;
    @JsonProperty(value = "main_location",required = true)
    private MainLocation mainLocation;
    @JsonProperty(value = "company_list",required = true)
    private String[] companyList;

    public OfficeData() {
    }

    @JsonCreator
    public OfficeData(@JsonProperty(value = "id_host")String idHost,
                      @JsonProperty(value = "id_pom_persona")String idPomPersona,
                      @JsonProperty(value = "go_user_number",required = true)String goUserNumber,
                      @JsonProperty(value = "name",required = true)String name,
                      @JsonProperty(value = "lastname",required = true)String lastname,
                      @JsonProperty(value = "gender",required = true)String gender,
                      @JsonProperty(value = "document",required = true)ClientDocument document,
                      @JsonProperty(value = "employee_BGBA_code",required = true)String employeeBGBACode,
                      @JsonProperty(value = "address",required = true)ClientAddress address,
                      @JsonProperty(value = "phones",required = true)List<ClientPhoneInformation> phoneInformation,
                      @JsonProperty(value = "emails",required = true)String[] emails,
                      @JsonProperty(value = "segment_code",required = true)String segmentCode,
                      @JsonProperty(value = "main_location",required = true)MainLocation mainLocation,
                      @JsonProperty(value = "company_list",required = true)String[] companyList) {

        this.idHost = idHost;
        this.idPomPersona = idPomPersona;
        this.goUserNumber = goUserNumber;
        this.name = name;
        this.lastName = lastname;
        this.gender = gender;
        this.document = document;
        this.employeeBGBACode = employeeBGBACode;
        this.address = address;
        this.phoneInformation = phoneInformation;
        this.emails = emails;
        this.segmentCode = segmentCode;
        this.mainLocation = mainLocation;
        this.companyList = companyList;
    }

    public String getIdPomPersona() {
        return idPomPersona;
    }

    public void setIdPomPersona(String idPomPersona) {
        this.idPomPersona = idPomPersona;
    }

    public String getGoUserNumber() {
        return goUserNumber;
    }

    public void setGoUserNumber(String goUserNumber) {
        this.goUserNumber = goUserNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ClientDocument getDocument() {
        return document;
    }

    public void setDocument(ClientDocument document) {
        this.document = document;
    }

    public String getemployeeBGBACode() {
        return employeeBGBACode;
    }

    public void setemployeeBGBACode(String employeeBgbaCode) {
        this.employeeBGBACode = employeeBGBACode;
    }

    public ClientAddress getAddress() {
        return address;
    }

    public void setAddress(ClientAddress address) {
        this.address = address;
    }

    public List<ClientPhoneInformation> getPhoneInformation() {
        return phoneInformation;
    }

    public void setPhoneInformation(List<ClientPhoneInformation> phoneInformation) {
        this.phoneInformation = phoneInformation;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public String getSegmentCode() {
        return segmentCode;
    }

    public void setSegmentCode(String segmentCode) {
        this.segmentCode = segmentCode;
    }

    public MainLocation getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(MainLocation mainLocation) {
        this.mainLocation = mainLocation;
    }

    public String[] getCompanyList() {
        return companyList;
    }

    public void setCompanyList(String[] companyList) {
        this.companyList = companyList;
    }

    public String getIdHost() {
        return idHost;
    }

    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }
}
