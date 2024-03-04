package multithreading;
class msg{
	public void show(String name) {
		
		synchronized(this){
			for(int i=0;i<3;i++) {
				System.out.println("How are you "+name);
			}
			
		}
		
	}
}
class ourThread extends Thread{
	msg m;
	String name;
	ourThread(msg m, String name){
		this.m=m;
		this.name=name;
	}
	public void run() {
		m.show(name);
	}
}
public class BlockLevelSyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		msg m=new msg();
		ourThread t1= new ourThread(m,"Kishor");
		ourThread t2=new ourThread(m,"Ram");
		t1.start(); t2.start();

	}

}
