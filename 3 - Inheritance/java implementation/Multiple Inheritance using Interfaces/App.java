public class App {
    public static void main(String[] args) throws Exception {

        Pomsky myPomsky = new Pomsky();

        myPomsky.bark(); // Output: Woof! Woof!
        myPomsky.play(); // Output: Pomsky is playing!
        myPomsky.dig(); // Output: Pomsky is digging!
        System.out.println("My pomsky has " + myPomsky.eyeColor + " eyes.");
        System.out.println("My pomsky is " + myPomsky.height + " tall.");
    }
}
