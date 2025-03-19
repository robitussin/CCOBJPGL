public class App {
    public static void main(String[] args) throws Exception {

        // ipadmini is a subtype of iPad and iPadWithCamera
        iPadWithCamera myIpad = new iPadMini();

        myIpad.playGame();
        myIpad.takePhoto();

        // ipadpro is a subtype of iPad and iPadWithCamera
        iPadWithCamera mysecondIpad = new iPadPro();

        mysecondIpad.playGame();
        myIpad.takePhoto();

        // ipadclassic is a subtype of ipad and iPadWithNoCamera
        iPadWithNoCamera mythirdIpad = new iPadClassic();
        mythirdIpad.playGame();

    }
}
