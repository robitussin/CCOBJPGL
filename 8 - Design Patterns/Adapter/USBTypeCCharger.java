public class USBTypeCCharger implements ChargerHub {

    @Override
    public void chargeUSBTypeC(String deviceName) {
        System.out.println("Charging device: " + deviceName + " through USB Type-C");
    }

    @Override
    public void chargeMicroUSB(String fildeviceNameeName) {
        // do nothing
    }
}