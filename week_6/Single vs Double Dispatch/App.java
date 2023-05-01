import java.util.ArrayList;
import java.util.List;

/* 
Single Dispatch vs Double Dispatch
*/

public class App {
    public static void main(String[] args) throws Exception {

        Animal dog = new Dog();
        Animal cat = new Cat();

        List<Animal> myAnimals = new ArrayList<Animal>();

        // Even if the cat and dog are very different classes, they share the same
        // "Animal" superclass and therefore can be inserted in a single array. This is
        // the advantage of polymorphism

        myAnimals.add(dog);
        myAnimals.add(cat);

        for (Animal animal : myAnimals) {
            animal.makeSound();
        }

        // Even if the dog and cat objects were both declared as type Animal,
        // Single dispatch dynamically chose the correct method to invoke at runtime.
        dog.makeSound();
        cat.makeSound();

        // This will result in an error if there is no makeSound() method that accepts
        // an object of type Animal
        // Java does not recognize which type of animal was passed
        dog.makeSound(cat);
        cat.makeSound(dog);
    }
}
