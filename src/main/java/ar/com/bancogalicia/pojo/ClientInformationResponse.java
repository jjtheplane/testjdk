package ar.com.bancogalicia.pojo;

import ar.com.bancogalicia.exception.IncorrectClientRequestException;
import ar.com.bancogalicia.helpers.ErrorConstants;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.*;
import ar.com.bancogalicia.ws.webservices.globales.bgbatiposbase._3_0_0.Domicilio2Salida;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ar.com.bancogalicia.ws.webservices.consultacliente.obtenerclasificacionsegunmovimientosresponse._2_0_0.ObtenerClasificacionSegunMovimientosResponse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@JsonPropertyOrder({"id_host", "id_pom_persona", "go_user_number", "name", "lastname", "gender", "birth_date", "cuit",
                    "documents", "employee_BGBA_code", "address", "phones", "emails", "segment_code", "main_location",
                    "company_list", "id_adhesion", "IVA_condition_code"})
public class ClientInformationResponse implements Serializable {

    @JsonProperty("id_host")
    private String idHost;

    @JsonProperty("id_pom_persona")
    private String idPomPersona;

    @JsonProperty(value = "go_user_number")
    private String goUserNumber;

    @JsonProperty("name")
    private String name;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("cuit")
    private String cuit;

    @JsonProperty("documents")
    private List<ClientDocument> documents;

    @JsonProperty("employee_BGBA_code")
    private String employeeBgbaCode;

    @JsonProperty("address")
    private ClientAddress clientAddress;

    @JsonProperty("phones")
    private List<ClientPhoneInformation> phoneInformation;

    @JsonProperty("emails")
    private ArrayList<String> email = new ArrayList<>();

    @JsonProperty("segment_code")
    private String segmentCode;

    @JsonProperty("main_location")
    private MainLocation mainLocation;

    @JsonProperty(value = "company_list")
    private String[] companyList;

    @JsonProperty("id_adhesion")
    private String idAdhesion;

    @JsonProperty("IVA_condition_code")
    private String ivaConditionCode;

    public ClientInformationResponse() {
        /* Empty constructor for entity mapping */
    }

    private void setClientDocumentFromNvResponse(PersonaFisica personaFisica) throws IncorrectClientRequestException {
        List<ClientDocument> clientDocuments = new ArrayList<>();
        try {
            for (Documento doc: personaFisica.getBasicos().getDocumentos().getDocumento()) {
                clientDocuments.add(new ClientDocument(doc));
            }
        } catch (Exception e) {
            throw new IncorrectClientRequestException(ErrorConstants.CLIENT_WITH_NOT_DOCUMENTS);
        }
        if(clientDocuments.size() == 0) {
            throw new IncorrectClientRequestException(ErrorConstants.CLIENT_WITH_NOT_DOCUMENTS);
        }
        this.setDocuments(clientDocuments);
        this.setCuit(personaFisica.getBasicos().getIdentificacionTributariaNumero());
    }

    private void setClientPersonNameFromNvResponse(PersonaFisica personaFisica) {
        ClientPersonName clientPersonName;
        try {
            clientPersonName = new ClientPersonName(personaFisica.getBasicos().getNombrePersona(), personaFisica.getBasicos().getCodigoSexo());
        } catch (Exception e) {
            clientPersonName = new ClientPersonName(new NombrePersonaFisica(), "-");
        }
        this.setName(clientPersonName.getName());
        this.setLastname(clientPersonName.getLastname());
        this.setGender(clientPersonName.getGender());
    }

    private void setBirthDateFromNvResponse(PersonaFisica personaFisica) {
        try {
            this.setBirthDate(personaFisica.getBasicos().getDatosNacimiento().getFechaNacimiento().toString().split("T")[0]);
        } catch (NullPointerException e) {
            // The date has not been set
        }
    }

    private void setPhoneInformationFromNvResponse(PersonaFisica personaFisica) {
        List<ClientPhoneInformation> clientPhoneInformation= new ArrayList<>();
        try {
            for(TelefonoBasico tel : personaFisica.getTelefonos().getTelefono()){
                clientPhoneInformation.add(new ClientPhoneInformation(tel.getBasico()));
            }
        } catch (Exception e) {
            clientPhoneInformation.add(new ClientPhoneInformation());
        }
        this.setPhoneInformation(clientPhoneInformation);
    }

    private void setClientAddressFromNvResponse(PersonaFisica personaFisica) {
        ClientAddress clientAddress;
        try {

            clientAddress = new ClientAddress(personaFisica.getDomicilio().getDireccion());
        } catch (Exception e) {
            clientAddress = new ClientAddress(new Domicilio2Salida());
        }
        this.setClientAddress(clientAddress);
    }

    private void setEmployeeBgbaCodeFromNvResponse(PersonaFisica personaFisica) {
        String code;
        try {
            code = personaFisica.getBasicos().getCodigoEmpleadoBGBA();
        } catch (Exception e) {
            code = "-";
        }
        this.setEmployeeBgbaCode(code);
    }

    private void setIvaConditionCodeFronPersonaFisica(PersonaFisica personaFisica) {
        String code;
        try {
            code = personaFisica.getBasicos().getCodigoCondicionImpositivaIVA();
        } catch (Exception e) {
            code = "-";
        }
        this.setIvaConditionCode(code);
    }

    public void setSegmentCode(ObtenerClasificacionSegunMovimientosResponse.Datos datos) {
        String code;
        try {
            code = datos.getClasificacionCliente().getSegmento().getCodigo().getValue();
        } catch (NullPointerException e) {
            code = "-";
        }
        this.setSegmentCode(code);
    }
/*
    private void setClientPomPersonIdFromNvResponse() {
        ClientPomPersonId clientPomPersonId;
        try {
            // si tiene documents de tipo DU con el primero arma el ID_POM
            // sino elije el primero que venga en la lista de documents

            Optional<ClientDocument> optionalDocumentDU = documents
                                                                .stream()
                                                                .filter(document -> document.getType().equals("DU"))
                                                                .findFirst();
            ClientDocument document = optionalDocumentDU.orElse(documents.get(0));
            clientPomPersonId = new ClientPomPersonId(document.getDocumentNumber(), getGender());

        } catch (Exception e) {
            clientPomPersonId = new ClientPomPersonId();
        }
        this.setIdPomPersona(clientPomPersonId.getIdPomPerson());
    }
*/
    public void setPersonFisica(PersonaFisica personaFisica) throws IncorrectClientRequestException {
        this.setClientDocumentFromNvResponse(personaFisica);
        this.setClientPersonNameFromNvResponse(personaFisica);
        this.setBirthDateFromNvResponse(personaFisica);
        this.setPhoneInformationFromNvResponse(personaFisica);
        this.setEmployeeBgbaCodeFromNvResponse(personaFisica);
//        this.setClientPomPersonIdFromNvResponse();
        this.setClientAddressFromNvResponse(personaFisica);
        this.setIvaConditionCodeFronPersonaFisica(personaFisica);

        if(personaFisica.getEmail() != null) {
            this.getEmail().add(personaFisica.getEmail());
        }

    }

    public void setCodigoSucursal(ObtenerClasificacionSegunMovimientosResponse.Datos datos) {
        MainLocation mainLocation = new MainLocation();
        try {
            mainLocation.setNumber(datos.getClasificacionCliente().getSucursalMadre().getNumero());
            mainLocation.setCode(datos.getClasificacionCliente().getSucursalMadre().getCodigoRol().getValue());
        } catch (Exception e) {
            mainLocation= null;
        }
        this.setMainLocation(mainLocation);
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public List<ClientDocument> getDocuments() {
        return documents;
    }

    private void setDocuments(List<ClientDocument> documents) {
        this.documents = documents;
    }

    public List<ClientPhoneInformation> getPhoneInformation() {
        return phoneInformation;
    }

    private void setPhoneInformation(List<ClientPhoneInformation> phoneInformation) {
        this.phoneInformation = phoneInformation;
    }

    public String getEmployeeBgbaCode() {
        return employeeBgbaCode;
    }

    private void setEmployeeBgbaCode(String employeeBgbaCode) {
        this.employeeBgbaCode = employeeBgbaCode;
    }

    public ClientAddress getClientAddress() {
        return clientAddress;
    }

    private void setClientAddress(ClientAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    private void setEmail(ArrayList<String> email) {
        this.email = email;
    }

    public String getSegmentCode() {
        return segmentCode;
    }

    private void setSegmentCode(String segmentCode) {
        this.segmentCode = segmentCode;
    }

    public String getIdPomPersona() {
        return idPomPersona;
    }

    public void setIdPomPersona(String id_pom_persona) {
        this.idPomPersona = id_pom_persona;
    }

    public MainLocation getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(MainLocation mainLocation) {
        this.mainLocation = mainLocation;
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

    public String[] getCompanyList() {
        return companyList;
    }

    public void setCompanyList(String[] companyList) {
        this.companyList = companyList;
    }

    public String getGoUserNumber() {
        return goUserNumber;
    }

    public void setGoUserNumber(String goUserNumber) {
        this.goUserNumber = goUserNumber;
    }

    public String getIdHost() {
        return idHost;
    }

    public void setIdHost(String idHost) {
        this.idHost = idHost;
    }

    public String getIdAdhesion() {
        return idAdhesion;
    }

    public void setIdAdhesion(String idAdhesion) {
        this.idAdhesion = idAdhesion;
    }

    public String getIvaConditionCode() {
        return ivaConditionCode;
    }

    public void setIvaConditionCode(final String ivaConditionCode) {
        this.ivaConditionCode = ivaConditionCode;
    }
}
