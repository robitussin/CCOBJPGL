public class ipadpro extends ipad {

    void playGame(double s_size, String cpu) {

        int framerate = 0;

        if (cpu.equals("octa core")) {
            framerate = 60;
        }

        System.out.println(
                "I have played call of duty at " + framerate + " frames per second in a " +
                        s_size + " inch screen");

    }
}
