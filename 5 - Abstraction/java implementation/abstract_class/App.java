public class App {
    public static void main(String[] args) throws Exception {

        // Only objects from subclasses can be created. Creating objects from
        // superclasses are not permitted.
        Dog dalmatian = new Dog();

        dalmatian.eat();
    }
}
