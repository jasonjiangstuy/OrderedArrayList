import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
    public NoNullArrayList(){
        super();
    }
    public NoNullArrayList(int start){
        super(start);
    }
    
    
    public boolean add(T e){
        if (e != null){
            return super.add(e);
        }
        else{
            throw new IllegalArgumentException("cannot append null as a value");
        }
    }

    public void add(int index, T e){
        if (e != null){
            super.add(index, e);
        }
        else{
            throw new IllegalArgumentException("cannot insert null as a value");
        }
        
    }

    public T set(int index, T e){
        if (e != null){
            return super.set(index, e);
        }
        else{
            throw new IllegalArgumentException("cannot set null as a value");
        }
    }

    
}