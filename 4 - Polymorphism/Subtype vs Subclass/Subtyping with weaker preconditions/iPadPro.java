public class iPadPro extends iPad {

    // Weaker pre-condition
    void surfWeb(boolean wifi) {

        if (wifi == true) {
            System.out.println("Connected to the internet using public Wi-Fi!");
        } else {
            System.out.println("Unable to connected to the internet!");
        }
    }
}
