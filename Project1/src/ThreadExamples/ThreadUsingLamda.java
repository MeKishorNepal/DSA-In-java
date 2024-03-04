package ThreadExamples;

public class ThreadUsingLamda {

	public static void main(String[] args)throws Exception {
		Thread t1=new Thread(() ->
			 {
				for(int i=0;i<5;i++) {
					System.out.println("Kishor "+Thread.currentThread().getPriority());
				try {Thread.sleep(500);}catch(Exception e) {}
			}
			 }
	,"Kishor Thread");
		Thread t2=new Thread(() -> 
			 {
				for(int i=0;i<5;i++) {
					System.out.println("Nepal "+Thread.currentThread().getPriority());
				try {Thread.sleep(500);}catch(Exception e) {}
			}
			 }
		,"Nepal Thread");
		//t1.setName("Kishor Thread");
		//t2.setName("Nepal Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		//set the priority
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		//get the thread priority
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		//first the wait to finish the t1 and t2 task
		t1.join();
		t2.join();
		System.out.println("Ok");
	}

}
