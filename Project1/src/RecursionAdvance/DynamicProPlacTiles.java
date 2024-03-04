package RecursionAdvance;

public class DynamicProPlacTiles {
	public static int dynamicCount(int n, int m) {
		int[]dp=new int[n+1];
		
		//initialize the base case\
	    dp[0]=1;
	    
	    
	    for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=m;j++) {
	    		if(i>=j) {
	    			dp[i] +=dp[i-j];
	    		}
	    	}
	    }
	    return dp[n];
		
	}

	public static void main(String[] args) {
		int n=100,m=2;
		int count=dynamicCount(n,m);
		System.out.println(count);

	}

}
