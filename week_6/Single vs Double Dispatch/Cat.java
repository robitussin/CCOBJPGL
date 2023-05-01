public class Cat implements Animal {

    public void makeSound() {
        System.out.println("Meow!");
    }

    public void makeSound(Dog d) {
        System.out.println("Cat meows while dog barks!");
    }

    public void makeSound(Cat c) {
        System.out.println("Two cats meow together!");
    }

    public void makeSound(Animal c) {
        System.out.println("Cat meow while an animal makes a sound!");
    }
}