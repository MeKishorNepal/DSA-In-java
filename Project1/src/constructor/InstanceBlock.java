package constructor;

public class InstanceBlock {
	InstanceBlock(){
		System.out.println("default Constuctor");
	}
	//instance block
	 static{
		System.out.println("How are you man");
	}
	 {
		 System.out.println("Ok");
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlock obj=new InstanceBlock();
		

	}

}
