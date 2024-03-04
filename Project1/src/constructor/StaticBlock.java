package constructor;
class c{
	static {
		System.out.println("Hello ");
	}
}
public class StaticBlock {
	static {
		System.out.println("Hello Kishor ");
	}

	public static void main(String[] args) {
		c obj=new c();
	}

}
