public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person();

        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        Me.setName("Elizer");

        String myName = Me.getName();

        System.out.println("My name is " + myName);
    }
}
