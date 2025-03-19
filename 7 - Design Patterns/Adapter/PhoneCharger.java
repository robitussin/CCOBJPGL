public class PhoneCharger implements Charger {
    Adaptor adaptor;

    @Override
    public void charge(String USBType, String deviceName) {

        // inbuilt support to play mp3 music files
        if (USBType.equalsIgnoreCase("USB")) {
            System.out.println("Charging device : " + deviceName);
        }

        // mediaAdapter is providing support to play other file formats
        else if (USBType.equalsIgnoreCase("USB Type-C") || USBType.equalsIgnoreCase("Micro USB")) {
            adaptor = new Adaptor(USBType);
            adaptor.charge(USBType, deviceName);
        }

        else {
            System.out.println("Invalid port. " + USBType + " port not supported");
        }
    }
}