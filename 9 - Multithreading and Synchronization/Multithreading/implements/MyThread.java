import java.util.Random;

import java.util.*;

public class MyThread implements Runnable {

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
