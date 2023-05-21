// 	The singleton pattern restricts the initialization of a class to ensure that only one instance of the class can be created.

public class App {
    public static void main(String[] args) throws Exception {

        Person me = Person.getInstance();

        Person myself = Person.getInstance();

        Person I = Person.getInstance();

        // me, myself and I are not three separate objects.
        System.out.println(me);
        System.out.println(myself);
        System.out.println(I);

    }
}
