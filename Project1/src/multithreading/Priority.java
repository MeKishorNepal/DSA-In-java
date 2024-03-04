package multithreading;
class D extends Thread{
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class Priority {

	public static void main(String[] args) {
		D t1=new D();
		D t2=new D();
		D t3=new D();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Therad 3");
		
		t1.setPriority(2);
		t2.setPriority(1);
		t3.setPriority(8);
		
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
