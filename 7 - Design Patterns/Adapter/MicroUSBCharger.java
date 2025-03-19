public class MicroUSBCharger implements ChargerHub {

    @Override
    public void chargeUSBTypeC(String deviceName) {
        // do nothing
    }

    @Override
    public void chargeMicroUSB(String deviceName) {
        System.out.println("Charging device: " + deviceName + " through micro USB");
    }
}