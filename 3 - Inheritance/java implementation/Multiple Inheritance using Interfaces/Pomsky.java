class Pomsky implements Husky, Pomeranian {

    // Implementing the interface methods
    @Override
    public void bark() {
        System.out.println("Woof! Woof!");
    }

    // Implementing the interface methods from Pomeranian 
    @Override
    public void play() {
        System.out.println("Pomsky is playing!");
    }

    // Implementing the interface methods from Husky
    @Override
    public void dig() {
        System.out.println("Pomsky is digging!");
    }
}
