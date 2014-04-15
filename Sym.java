public class Sym {
    private String type;
    private Object myObj;

    public Sym(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        return type;
    }
    
    public void setData(Object o) {
      myObj = o;
    }

    public Object getData() {
      return myObj;
    }
}
