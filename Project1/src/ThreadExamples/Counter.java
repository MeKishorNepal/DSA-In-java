package ThreadExamples;

public class Counter {
	private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }
	

	public static void main(String[] args) {
		   Counter counter = new Counter();

	        Runnable task = () -> {
	            for (int i = 0; i < 1000; i++) {
	                counter.increment();
	            }
	        };

	        Thread thread1 = new Thread(task);
	        Thread thread2 = new Thread(task);
	        Thread thread3=new Thread(task);

	        thread1.start();
	        thread2.start();
	        thread3.start();

	        try {
	            thread1.join();
	            thread2.join();
	            thread3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final count: " + counter.count);
	    }
	
		
		

	}


