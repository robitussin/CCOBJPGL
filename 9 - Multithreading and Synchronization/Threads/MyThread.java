public class MyThread extends Thread {

    public void run() {

        if (this.isDaemon()) {
            System.out.println("This daemon thread is running");
        } else {
            System.out.println("This user thread is running");
        }
    }
}
