package ar.com.bancogalicia.pojo.ctg;

public class Meta
{
    private String method;

    private String operation;

    private String paging;

    public void setMethod(String method){
        this.method = method;
    }
    public String getMethod(){
        return this.method;
    }
    public void setOperation(String operation){
        this.operation = operation;
    }
    public String getOperation(){
        return this.operation;
    }
    public void setPaging(String paging){
        this.paging = paging;
    }
    public String getPaging(){
        return this.paging;
    }
}
