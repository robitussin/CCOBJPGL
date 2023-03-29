final class Car {

    // Composition
    private final Engine carEngine;

    // Constructor
    Car(Engine engineType) {

        // This keywords refers to same instance
        this.carEngine = engineType;
    }

    // Method
    public void start() {

        if (carEngine != null) {
            carEngine.start();
            System.out.println("Car is moving ");
        }
    }
}
