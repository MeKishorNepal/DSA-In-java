package multithreading;
class Table{
	public synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}
}
class thread11 extends Thread{
	Table t; //reference 
	thread11(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
		
	}
}
class thread22 extends Thread{
	Table t;
	thread22(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(7);
	}
}
public class MethodLevelSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		thread11 t1=new thread11(obj);
		thread22 t2=new thread22(obj);
		
		t1.start();
		
		t2.start();
	
		

	}

}
