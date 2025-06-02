public class App {
    public static void main(String[] args) throws Exception {
       
        // Create a new instance using the MyThread class
        MyThread thread1 = new MyThread();

        // Create a new instance using the MyThread class
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        // Start thread 1
        thread1.start();
        // Wait for thread 1 to finish for a maximum of 3000 milliseconds
        thread1.join(3000);
        // Start thread 2
        thread2.start();
    
    }
}
