package ar.com.bancogalicia.pojo.ctg;

import java.util.List;
public class Errors
{
    private String code;

    private String detail;

    private Source source;

    private List<String> meta;

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setDetail(String detail){
        this.detail = detail;
    }
    public String getDetail(){
        return this.detail;
    }
    public void setSource(Source source){
        this.source = source;
    }
    public Source getSource(){
        return this.source;
    }
    public void setMeta(List<String> meta){
        this.meta = meta;
    }
    public List<String> getMeta(){
        return this.meta;
    }
}
