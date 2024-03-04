package multithreading;
class y extends Thread{
	public void run() {
		try {
		for(int i=0;i<3;i++) {
			System.out.println("t1 thread is running");
			Thread.sleep(1000);}
		}catch(InterruptedException e) {}
	}
}
public class InterruptMethod {

	public static void main(String[] args) {
		
		y t1=new y();
		t1.start();
		t1.interrupt();
		

	}

}
