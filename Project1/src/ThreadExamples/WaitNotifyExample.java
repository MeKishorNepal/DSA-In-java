package ThreadExamples;

public class WaitNotifyExample {
	

	public static void main(String[] args) {
		//Thread Communication
		 Object lock = new Object();

	        Thread thread1 = new Thread(() -> {
	            synchronized (lock) {
	                System.out.println("Thread 1: Waiting...");
	                try {
	                    lock.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("Thread 1: Resumed!");
	            }
	        });

	        Thread thread2 = new Thread(()->{
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            synchronized (lock) {
	                System.out.println("Thread 2: Notifying...");
	                lock.notify();
	            }
	        });

	        thread1.start();
	        thread2.start();
	    }
	

	}


