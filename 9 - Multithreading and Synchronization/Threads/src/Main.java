public class Main{
  
    public static void main(String[] args) throws InterruptedException{  

    	// Check how many threads are active
    	System.out.println(Thread.activeCount());
    	
		// Check the name of the current thread that is running
		System.out.println(Thread.currentThread().getName());
    	
		// Change the name of the current thread
    	Thread.currentThread().setName("First Thread");

		System.out.println(Thread.currentThread().getName());
    	
		// Check the priority of the current thread
		System.out.println("The thread priority is " + Thread.currentThread().getPriority());

		// Change the priority of the current thread
		// Scale between 1 and 10
		// 1 is the lowest priority and 10 is the highest priority
    	Thread.currentThread().setPriority(2);

		System.out.println(Thread.currentThread().getPriority());	
    	
    	// Check if the thread is alive
    	System.out.println(Thread.currentThread().isAlive());

    	// We can use the sleep() method to pause the execution of the current thread
    	for(int i =3;i>0;i--) {
    		System.out.println(i);
    		Thread.sleep(1000);
    	}
    	
    	// Create a new thread object
    	MyThread thread2 = new MyThread();
		
		// Check if the thread is alive
		System.out.println(thread2.isAlive());

		// We can use the start() method to start a thread
		thread2.start();

		// Change the name of the current thread
    	Thread.currentThread().setName("Second Thread");

		System.out.println(Thread.currentThread().getName());

		System.out.println(Thread.currentThread().getPriority());

		System.out.println("Number of active threads is " + Thread.activeCount());
    	
		MyThread thread3 = new MyThread();

		// Check if the thread is a daemon thread
		System.out.println(thread3.isDaemon()); 

    	thread3.setDaemon(true);
    	System.out.println(thread2.isDaemon());
    	
    	thread3.start();
    	
    	System.out.println(thread3.isAlive());
    	
    	thread3.setName("3rd thread");
    	System.out.println(thread3.getName());
    	
    	thread3.setPriority(1);
    	System.out.println(thread3.getPriority());
    	
    	System.out.println(Thread.activeCount());
    } 
}

