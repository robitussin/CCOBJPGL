public class iPadMini extends iPadWithCamera {

    void playGame(double s_size, String cpu) {

        int framerate = 0;

        if (cpu.equals("dual core")) {
            framerate = 30;
        }

        System.out.println(
                "I have played call of duty at " + framerate + " frames per second in a " +
                        s_size + " inch screen");

    }

    void takePhoto() {
        System.out.println("Photo taken using 12 megapixel camera with one lens");
    }
}
