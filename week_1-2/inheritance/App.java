public class App {
    public static void main(String[] args) throws Exception {

        // Son object
        Son me = new Son();
        me.name = "Elizer";

        // The Son class inherited the surname variable and the getSurname() method
        String surname = me.getSurname();

        System.out.println("My name is " + me.name + " and my surname is " + surname);

        // Daughter object
        Daughter mySister = new Daughter();
        mySister.name = "Pamela";

        // The Daughter class also inherited the surname variable and the getSurname()
        // method
        surname = mySister.getSurname();

        System.out.println("My sister's name is " + mySister.name + " and her surname is also " + surname);
    }
}
