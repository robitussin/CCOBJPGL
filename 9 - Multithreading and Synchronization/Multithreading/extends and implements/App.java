public class App {
    public static void main(String[] args) throws Exception {

        // Thread created using Thread class
        MyThread thread1 = new MyThread();

        // Thread created using Runnable Interface
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        // thread1.setDaemon(true);
        // thread2.setDaemon(true);

        thread1.start();

        // Will wait until thread1 dies
        // thread1.join();

        // Will wait until thread1 dies for a specified time in milliseconds
        thread1.join(3000);

        thread2.start();

        // System.out.println(1 / 0);
    }
}
