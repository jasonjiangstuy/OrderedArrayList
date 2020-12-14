public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
    int index = 0; 
    OrderedArrayList(){
        super();
    }
    OrderedArrayList(int startCapacity){
        super(startCapacity);
    }
    public boolean add(T e){
        int target = findSpot(e);
        if (target == super.size()){
            super.add(e);
            return true;
        }
        else{
            super.add(target, e);
            return true;
        }
    }

    public void add(int index, T e){
        add(e);
    }

    public T set(int index, T e){
       
        if (e == null){
            throw new IllegalArgumentException("cannot set null as a value");
        }
        T hold = super.remove(index);
        add(e);
        return hold;
    }
    private int findSpot(T element){ // return index to insert to
        if (element != null){
            int i = 0;
            for (i = 0; i < super.size(); i ++){
                if (element.compareTo(super.get(i)) < 0){
                    return i;
                }
            }
            return super.size();
        }
        else{
            return super.size();
        }
    }
}
