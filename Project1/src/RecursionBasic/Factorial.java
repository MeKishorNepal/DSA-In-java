package RecursionBasic;

public class Factorial {
	public static void printfact(int n, int fact) {
		if(n==0) {
			return;
		}
		
		//kam;
		fact =n*fact;
		printfact(n-1,fact);
	}

	public static void main(String[] args) {
		int n=5;
		printfact(5,1);
	
	}

}
