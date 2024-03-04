package RecursionAdvance;

public class TotalPathsMaze {
	public static int countPath(int i, int j, int n, int m) {
		if(i==n || j==m) {
			return 0;
		}
		if(i==n-1 && j==m-1) {
			return 1;
		}
		
		
		//for downward
		int downward=countPath(i+1,j,n,m);
		
		//for rightward
		int rightway=countPath(i,j+1,n,m);
		//total path
		return downward+rightway;
	}

	public static void main(String[] args) {
		int n=3,m=3;
		int path=countPath(0,0,n,m);
		System.out.println(path);

	}

}
