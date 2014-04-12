import java.util.*;
public class Sym {
    private String type;
    public Sym(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        return type;
    }
}

public class SymFunc extends Sym{
    private String retType;
    private List<Sym> params;
    public SymFunc(String retType, LinkedList<Sym> params){
        super("function");
        this.retType = retType;
        this.params = params;
    }
    //getters
    public String getRetType(){
        return retType;
    }
    public LinkedList<Sym> getParams(){
        return params;
    }
}
