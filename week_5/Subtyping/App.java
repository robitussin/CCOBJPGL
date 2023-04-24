public class App {
    public static void main(String[] args) throws Exception {

        // ipadmini is a subtype of ipad
        ipad myIpad = new ipadmini();

        myIpad.playGame(8.9, "dual core");

        // ipadpro is a subtype of ipad
        ipad mysecondIpad = new ipadpro();

        mysecondIpad.playGame(12.9, "octa core");
    }
}
