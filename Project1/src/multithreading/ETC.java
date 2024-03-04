package multithreading;
class A extends Thread{
	public void run() {
		try {
		for(int i=0;i<5;i++) {
			System.out.println("Kishor");
			Thread.sleep(1000);}
		}catch(Exception e) {}
		}
	}
	

public class ETC {

	public static void main(String[] args) throws Exception{
		A t=new A();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Nepal");
			Thread.sleep(1000);
		}
		
		
	}

}
