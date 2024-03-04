package RecursionBasic;

public class PrintXPower {
	public static int printPower(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		
		int xPowernm1=printPower(x,n-1);
		int xPower=x*xPowernm1;
		return xPower;
	}

	public static void main(String[] args) {
		int x=2;
		int n=5;
		System.out.println(printPower(x,n));
		

	}

}
