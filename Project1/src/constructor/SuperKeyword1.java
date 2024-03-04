package constructor;
class E{
	int a=10;
	void show() {
		System.out.println("hello kishor");
	}
	//constructor
	E(int a){
		System.out.println(a);
	}
	
}
class R extends E{
	int a=20;
	void show() {
		super.show();
		System.out.println(super.a);
		System.out.println("Ok");
	}
	//constructor
	R(){
		super(100);
		System.out.println("Hello guys ");
	}
}
public class SuperKeyword1 {

	public static void main(String[] args) {
		R obj=new R();
		obj.show();
	
		
	}

}
