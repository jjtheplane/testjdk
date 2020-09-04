package ar.com.bancogalicia.pojo.ctg;

public class Data
{
    private String idHost;

    private String idAdhesion;

    private String statusAdhesion;

    public void setIdHost(String idHost){
        this.idHost = idHost;
    }
    public String getIdHost(){
        return this.idHost;
    }
    public void setIdAdhesion(String idAdhesion){
        this.idAdhesion = idAdhesion;
    }
    public String getIdAdhesion(){
        return this.idAdhesion;
    }
    public void setStatusAdhesion(String statusAdhesion){
        this.statusAdhesion = statusAdhesion;
    }
    public String getStatusAdhesion(){
        return this.statusAdhesion;
    }
}