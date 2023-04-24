public class App {
    public static void main(String[] args) throws Exception {

        // ipadmini is a subtype of iPad and iPadWithCamera
        iPadWithCamera myIpad = new iPadMini();

        myIpad.playGame(8.9, "dual core");
        myIpad.takePhoto();

        // ipadpro is a subtype of iPad and iPadWithCamera
        iPadWithCamera mysecondIpad = new iPadPro();

        mysecondIpad.playGame(12.9, "octa core");
        myIpad.takePhoto();

        // ipadclassic is a subtype of ipad and iPadWithNoCamera
        iPadWithNoCamera mythirdIpad = new iPadClassic();

        mythirdIpad.playGame(8.9, "dual core");
        myIpad.takePhoto();

    }
}
