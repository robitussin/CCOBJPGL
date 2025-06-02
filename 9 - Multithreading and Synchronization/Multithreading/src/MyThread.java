public class MyThread extends Thread {

    @Override
    public void run() {

        for (int index = 10; index > 0; index--) {
            System.out.println("Thread # 1: " + index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Thread # 1: is finished.");
    }  
}
