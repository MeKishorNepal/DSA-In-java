package multithreading;
class Z extends Thread{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
	}
}
public class SuspendAndResume  {

	public static void main(String[] args) {
		Z t1 =new Z();
		Z t2 =new Z();
		Z t3 =new Z();
		
		t1.setName("Kishor");
		t2.setName("Hari");
		t3.setName("Ram");
		
		t1.start();
		t2.start();
		t2.suspend(); //pause
		t3.start();
		t2.resume();//restart
		

	}

}
