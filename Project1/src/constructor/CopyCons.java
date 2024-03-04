package constructor;
class A{
	int a;String b;
	A(){
		a=10;b="Kishor";
		System.out.println(a+" "+b);
	}
	A(A ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
public class CopyCons {

	public static void main(String[] args) {
		A obj=new A();
		A obj2=new A(obj);
		

	}

}
