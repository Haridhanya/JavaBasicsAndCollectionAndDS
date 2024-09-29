package fileAndexceptionHandling;

public class MultiThreading {

	
	    private int count = 0;

	    // Synchronized method to ensure only one thread can modify the count at a time
	    public synchronized void increment() {
	        count++;
	    }

	    public int getCount() {
	        return count;
	    }
	

	
	    public static void main(String[] args) throws InterruptedException {
	    	MultiThreading counter = new MultiThreading();

	        // Create two threads that increment the counter
	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                counter.increment();
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                counter.increment();
	            }
	        });

	        // Start the threads
	        t1.start();
	        t2.start();

	        // Wait for both threads to finish
	        t1.join();
        t2.join();

	        // Print the final count
	        System.out.println("Final Count: " + counter.getCount());
	    }
	}

	
	
	

