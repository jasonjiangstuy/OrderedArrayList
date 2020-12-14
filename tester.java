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

        // error
    }
}
