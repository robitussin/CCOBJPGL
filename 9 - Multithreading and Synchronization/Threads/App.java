public class App {
    public static void main(String[] args) throws InterruptedException {

        // Gets the active number of threads
        System.out.println(Thread.activeCount());

        // Change the name of the current thread
        Thread.currentThread().setName("MAIN");

        // Retrieve the name of the current thread
        System.out.println(Thread.currentThread().getName());

        // Set the priority level of a thread
        Thread.currentThread().setPriority(10);

        // Get the priority level of a thread
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());

        for (int i = 1; i > 0; i--) {
            if (i == 1) {
                System.out.print("Loading");
            }
            Thread.sleep(1000);
            System.out.print(".");
        }

        System.out.println(" Finished loading");

        // Create new thread
        MyThread thread2 = new MyThread();

        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());

        // Starts the second thread
        thread2.start();

        System.out.println(thread2.isAlive());

        thread2.setName("Second thread");

        System.out.println(thread2.getName());

        thread2.setPriority(1);

        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());
    }
}
