package RecursionBasic;

public class PrintXPowerNinLognHeight {
	public static int printPower(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(n%2==0) {
			return printPower(x,n/2)*printPower(x,n/2);
		}
		else {
			return printPower(x,n/2)*printPower(x,n/2)*x;
		}
		
	}

	public static void main(String[] args) {
		int x=2;
		int n=5;
		System.out.println(printPower(x,n));
		
	}

}
