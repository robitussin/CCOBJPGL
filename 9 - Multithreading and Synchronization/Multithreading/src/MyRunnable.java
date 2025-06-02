public class MyRunnable implements Runnable{

    @Override
    public void run() {

        for (int index = 0; index < 10; index++) {
            System.out.println("Thread # 2: " + index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Thread # 2: is finished.");
    }  
}
