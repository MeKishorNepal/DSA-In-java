package basic;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		int i;
		int fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
