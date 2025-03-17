public class App {
    public static void main(String[] args) throws Exception {

        iPad myFirstIpad = new iPadPro();
        myFirstIpad.price = 55990;
        // Weaker pre-condition
        myFirstIpad.surfWeb(false, true);

        iPad mySecondIpad = new iPadProCellular();
        mySecondIpad.price = 65990;
        myFirstIpad.surfWeb(true, true);

    }
}
