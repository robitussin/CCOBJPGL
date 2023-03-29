class App {
    public static void main(String[] args) {

        // Make an engine by creating an instance of Engine class.
        Engine electricEngine = new Engine();

        // Make a car with an engine by creating an instance of Car class and passing a
        // engine instance as argument.
        Car electricCar = new Car(electricEngine);

        // Start the car
        electricCar.start();
    }
}