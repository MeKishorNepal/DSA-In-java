package constructor;
class S{
	int a;
	S(int a){
		this.a=a;
		System.out.println(a);
	}
	
}
public class This2keyword {

	public static void main(String[] args) {
		S obj=new S(3);
		

	}

}
