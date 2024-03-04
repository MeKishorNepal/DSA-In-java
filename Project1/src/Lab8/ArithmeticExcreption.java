package Lab8;

public class ArithmeticExcreption {

	public static void main(String[] args) {
		int a=10;
		try {
			a=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		finally {
			System.out.println("Exception Haldle");
		}
		System.out.println("Others code");

	}

}
