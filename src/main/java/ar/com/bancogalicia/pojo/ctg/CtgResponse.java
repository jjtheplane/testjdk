package ar.com.bancogalicia.pojo.ctg;

import java.util.List;
public class CtgResponse
{
    private Meta meta;

    private List<Data> data;

    private List<Errors> errors;

    public void setMeta(Meta meta){
        this.meta = meta;
    }
    public Meta getMeta(){
        return this.meta;
    }
    public void setData(List<Data> data){
        this.data = data;
    }
    public List<Data> getData(){
        return this.data;
    }
    public void setErrors(List<Errors> errors){
        this.errors = errors;
    }
    public List<Errors> getErrors(){
        return this.errors;
    }
}
