public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pomsky myPomsky = new Pomsky();

        myPomsky.bark();
        System.out.println("My pomsky has " + myPomsky.eyeColor + " eyes.");
        System.out.println("My pomsky is " + myPomsky.height + " tall.");
    }
}
