import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
    public NoNullArrayList(){
        super();
    }
    
    public boolean add(T e){
        if (e != null){
            super.add(e);
        }
        else{
            throw new IllegalArgumentException("cannot append null as a value");
        }
        return true;
    }
    
}