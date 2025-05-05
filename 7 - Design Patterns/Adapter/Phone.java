// Client – Phone that only accepts Type-C
class Phone {
    public void charge(TypeCCharger charger) {
        System.out.println("Phone expecting Type-C charger...");
        charger.connectWithTypeC();
        System.out.println("Charging started.");
    }
}
