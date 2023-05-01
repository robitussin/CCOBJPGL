public class Dog implements Animal {

    public void makeSound() {
        System.out.println("Wooof!");
    }

    public void makeSound(Cat c) {
        System.out.println("Dog barks while cat meows!");
    }

    public void makeSound(Dog d) {
        System.out.println("Two Dog bark together!");
    }

    public void makeSound(Animal c) {
        System.out.println("Dog barks while an makes sound!");
    }
}
