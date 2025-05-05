// 	The singleton pattern restricts the initialization of a class to ensure that only one instance of the class can be created.

public class App {
    public static void main(String[] args) throws Exception {

        Database connection1 = Database.getInstance();

        Database connection2 = Database.getInstance();

        Database connection3 = Database.getInstance();

        // me, myself and I are not three separate objects.
        System.out.println(connection1);
        System.out.println(connection2);
        System.out.println(connection3);

    }
}
