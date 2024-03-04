package constructor;
class B{
	int a;double b; String c;
	private B(){
		a=10;b=10.56;c="Kishor";
		System.out.println(a+" "+b+" "+ c);
	}
public static void main(String[] args) {
		
		B obj=new B();  //not visible

	
}}
public class PrivateCon {

	public static void main(String[] args) {
		
		B obj=new B();  //not visible

	}

}
