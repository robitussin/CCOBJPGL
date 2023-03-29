public class App {
    public static void main(String[] args) throws Exception {

        // Polymorphism

        Person me = new Person();
        me.name = "Elizer";
        me.aboutMe();

        // Me in a form of a teacher
        me = new Teacher();
        me.aboutMe();

        // Me in a form of a student
        me = new Student();
        me.aboutMe();

        // Me in a form of a diver
        me = new Diver();
        me.aboutMe();

        // Me in a form of a gardener
        me = new Gardener();
        me.aboutMe();
    }
}
