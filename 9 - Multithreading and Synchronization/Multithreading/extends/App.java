public class App {
    public static void main(String[] args) throws Exception {

        MyThread thread1 = new MyThread("YouTube");
        MyThread thread2 = new MyThread("Facebook");
        MyThread thread3 = new MyThread("Instagram");
        MyThread thread4 = new MyThread("TikTok");

        // Start all threads at once
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
