public class App {
    public static void main(String[] args) throws Exception {

        Thread thread1 = new Thread(new MyThread("YouTube"));
        Thread thread2 = new Thread(new MyThread("Facebook"));
        Thread thread3 = new Thread(new MyThread("Instagram"));
        Thread thread4 = new Thread(new MyThread("TikTok"));

        // Start all threads at once
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
