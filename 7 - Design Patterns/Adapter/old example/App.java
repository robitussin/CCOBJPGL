public class App {
    public static void main(String[] args) {
        PhoneCharger mycharger = new PhoneCharger();

        mycharger.charge("USB", "Vivo V-15");
        mycharger.charge("USB Type-C", "Samsung Galaxy");
        mycharger.charge("Micro USB", "iPhone");
        mycharger.charge("Lightning", "iPad");
    }
}