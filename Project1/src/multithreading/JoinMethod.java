package multithreading;
import java.io.*;
class X extends Thread{
	public void run() {
		String name=Thread.currentThread().getName();
	
			for(int i=0;i<3;i++) {
				System.out.println(name);
			}
		
		
	}
	
}
public class JoinMethod {

	public static void main(String[] args) {
		X t1=new X();
		X t2=new X();
		X t3=new X();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException i) {}
		t1.start();
		t3.start();

	}

}
