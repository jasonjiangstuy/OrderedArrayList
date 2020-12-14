public class tester {
    public static void main(String[] args) {
        // testing add();
        NoNullArrayList<String> jason = new NoNullArrayList<String>();
        jason.add("test");
        jason.add("good");
        System.out.println(jason);
        try{
            jason.add(null);
        }
        catch (IllegalArgumentException e){
            System.out.println("good" + jason);
        }

        // test insert
        jason.add(0, "this was added");
        try{
            jason.add(0, null);// error
        }
        catch (IllegalArgumentException e){
            System.out.println("good" + jason);
        }

        // test set

        jason.set(0, "i dont think i was here before");
        try{
            jason.set(0, null);// error
        }
        catch (IllegalArgumentException e){
            System.out.println("good" + jason);
        }    

        // test starting capacity
        NoNullArrayList<String> notjason = new NoNullArrayList<String>(5);
        
    }
}
