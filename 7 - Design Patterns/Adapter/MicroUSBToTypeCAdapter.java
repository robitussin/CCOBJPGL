// Adapter – adapts MicroUSB to Type-C
class MicroUSBToTypeCAdapter implements TypeCCharger {
    private MicroUSBCharger microUSBCharger;

    public MicroUSBToTypeCAdapter(MicroUSBCharger microUSBCharger) {
        this.microUSBCharger = microUSBCharger;
    }

    @Override
    public void connectWithTypeC() {
        System.out.println("Adapting Micro USB to Type-C...");
        microUSBCharger.connectWithMicroUSB();
    }
}