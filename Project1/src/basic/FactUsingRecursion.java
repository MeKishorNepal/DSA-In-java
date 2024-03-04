package basic;

public class FactUsingRecursion {
	static int fact(int n) {
		if(n==0) 
			return 1;
		
		else 
			return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		int factorial=1;
		int number=4;
		factorial=fact(number);
		System.out.println(factorial);
		

	}

}
