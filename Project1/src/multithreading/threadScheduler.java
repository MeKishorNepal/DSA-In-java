package multithreading;
class C extends Thread{
	public void run() {
		String n=Thread.currentThread().getName();
		try {
		for(int i=0;i<3;i++) {
			System.out.println(n);
			Thread.sleep(1000);}
		}catch(InterruptedException e) {}
			
		}
		
	}

public class threadScheduler {

	public static void main(String[] args) {
		C t1=new C();
		C t2=new C();
		C t3=new C();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
