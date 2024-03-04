package basic;
class outer{
	int x=7;
	 static class inner{
		public int innerMethod() {
			return 10;
		}
	}
}
public class Appletprog {

	public static void main(String[] args) {
		outer.inner in=new outer.inner();
		
		System.out.println(in.innerMethod());
	

	}

}
