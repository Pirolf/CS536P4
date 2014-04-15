import java.util.*;
class Sym {
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

 class SymFunc extends Sym{
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
    public List<Sym> getParams(){
        return params;
    }

    /*This should be used for debugging ONLY*/
    public String toString(){
        String retContent = "";
        retContent += "Type: function\n " + "Return Type: " + retType + "\n";
        String paramList = "";
        Iterator<Sym> it = params.Iterator();
        while(it.hasNext()){
            paramList += it.next().getType() +", ";
        } 
        retContent += "Number of params: " + params.size() + "\n" + "ParamList: " + paramList;
        return retContent; 
    }

}
