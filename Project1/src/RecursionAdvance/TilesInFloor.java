package RecursionAdvance;

public class TilesInFloor {
	public static int CountWays(int n, int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		
		
		//vertically
		int verticalplacement=CountWays(n-m,m);
		
		//horigently
		int horigentlPlacement=CountWays(n-1,m);
		
		return verticalplacement+horigentlPlacement;
	}

	public static void main(String[] args) {
		int n=100,m=2;
		int count=CountWays(n,m);
		System.out.println(count);

	}

}
