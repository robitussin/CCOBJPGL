public class Adaptor implements Charger {

    ChargerHub Hub;

    public Adaptor(String USBType) {

        if (USBType.equalsIgnoreCase("Micro USB")) {
            Hub = new MicroUSBCharger();

        } else if (USBType.equalsIgnoreCase("USB Type-C")) {
            Hub = new USBTypeCCharger();
        }
    }

    @Override
    public void charge(String USBType, String deviceName) {

        if (USBType.equalsIgnoreCase("Micro USB")) {
            Hub.chargeMicroUSB(deviceName);
        } else if (USBType.equalsIgnoreCase("USB Type-C")) {
            Hub.chargeUSBTypeC(deviceName);
        }
    }
}