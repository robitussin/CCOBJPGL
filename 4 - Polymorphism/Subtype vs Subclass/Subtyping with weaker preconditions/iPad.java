public class iPad {

    String screenSize;
    String processor;
    String camera;
    int price;

    void playGame() {
        System.out.println("Running game!");
    }

    void takePhoto() {
        System.out.println("Photo taken!");
    }

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
