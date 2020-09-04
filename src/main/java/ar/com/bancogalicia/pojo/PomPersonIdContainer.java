package ar.com.bancogalicia.pojo;

import java.io.Serializable;

public class PomPersonIdContainer implements Serializable {

    private String pomPersonId;

    public PomPersonIdContainer(String pomPersonId) {
        this.pomPersonId = pomPersonId;
    }

    public String getPomPersonId() {
        return pomPersonId;
    }

    public void setPomPersonId(String pomPersonId) {
        this.pomPersonId = pomPersonId;
    }
}
