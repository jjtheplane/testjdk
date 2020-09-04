package ar.com.bancogalicia.pojo;

import java.time.LocalDateTime;

public class ClientPomPersonId {

    private String idPomPerson;

    public ClientPomPersonId(String document, String gender) {
        String timestamp = LocalDateTime.now().toString(); //GET TIMESTAMP AND REPLACE T,:,. WITH NOTHING
        String timestampParsed = timestamp.replace("-", "")
                .replace("T", "")
                .replace(":", "")
                .replace(".", "");

        this.idPomPerson = document.concat(gender).concat(timestampParsed);
    }

    public ClientPomPersonId() {
    }

    public String getIdPomPerson() {
        return idPomPerson;
    }


    public void setIdPomPerson(String idPomPerson) {
        this.idPomPerson = idPomPerson;
    }
}
