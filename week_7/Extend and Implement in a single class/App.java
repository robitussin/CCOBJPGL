public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pomsky myPet = new Pomsky();

        myPet.bark();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.height);
    }
}
