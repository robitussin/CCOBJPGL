public class iPadProCellular extends iPad {

    void surfWeb(boolean cellularData, boolean wifi) {

        if (cellularData == true) {
            System.out.println("Connected to the internet using cellular data!");
        } else if (wifi == true) {
            System.out.println("Connected to the internet using public Wi-Fi!");
        } else {
            System.out.println("Unable to connected to the internet!");
        }
    }
}
