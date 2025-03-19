import java.util.Random;

public class MyThread extends Thread {
    String name;
    int time;
    Random r = new Random();

    public MyThread(String x) {
        name = x;
        time = r.nextInt(999);
    }

    public void run() {
        try {
            System.out.printf("%s is loading for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
