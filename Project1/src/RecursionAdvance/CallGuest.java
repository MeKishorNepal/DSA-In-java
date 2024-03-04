package RecursionAdvance;

public class CallGuest {
	
	public static int callGuest(int n) {
		
		if(n<=1) {
			return 1;
		}
		
		//single
		int single=callGuest(n-1);
		//pairs
		int pairs=(n-1)*callGuest(n-2);
		
		return single+pairs;
	}

	public static void main(String[] args) {
		
		int TotalWay=callGuest(3);
		System.out.println(TotalWay);
		

	}

}
