
// Main demo
public class App {
    public static void main(String[] args) {
        // Old Micro USB charger
        MicroUSBCharger oldCharger = new MicroUSBCharger();

        // Adapter to make it compatible with Type-C port
        TypeCCharger adapter = new MicroUSBToTypeCAdapter(oldCharger);

        // Phone uses adapter as if it's a Type-C charger
        Phone phone = new Phone();
        phone.charge(adapter);
    }
}
