package multithreading;
class thread1 extends Thread{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
			Thread.yield();
		}
	}
	
}
class thread2 extends Thread{
	public void run(){
		String name=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
		
	}
}
public class YieldMethod {

	public static void main(String[] args) {
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		
		t1.start();
		
		t2.start();
		
		
		System.out.println(t2.isAlive());
		

	}

}
