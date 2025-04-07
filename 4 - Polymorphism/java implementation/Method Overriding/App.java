class Animal{

    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{

    void makeSound(){
        System.out.println("Dog barks");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks
    }
}
