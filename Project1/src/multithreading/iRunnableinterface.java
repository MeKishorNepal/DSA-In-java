package multithreading;
class B implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("my child Thread");
		}
		
	}
	
}

public class iRunnableinterface {

	public static void main(String[] args) {
		B r=new B();
		Thread t1=new Thread(r);
		t1.start();
	}

}
