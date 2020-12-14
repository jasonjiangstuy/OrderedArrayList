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
        
        // test starting capacity
        OrderedArrayList<Integer> notjason2 = new OrderedArrayList<Integer>(5);
        OrderedArrayList<Integer> notjason21 = new OrderedArrayList<Integer>();

        // test add
        notjason2.add(1);
        notjason2.add(2);
        notjason2.add(0);
        System.out.println(notjason2);

        // test other add
        notjason21.add(3, 1);
        notjason21.add(1, 2);
        notjason21.add(0, 0);
        System.out.println(notjason21);

        // test set
        notjason21.set(0, 0);
        System.out.println(notjason21);// same
        notjason2.set(1, -4);
        System.out.println(notjason2);// diffrent




    }
}
