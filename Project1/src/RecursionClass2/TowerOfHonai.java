package RecursionClass2;

public class TowerOfHonai {
	public static void PrintTowerOfHonai(int n, String src, String helper, String dest) {
		
		if(n==1) {
			System.out.println("Transfer dist "+n+" From "+src +" to "+ dest);
			return;
		}
		
		PrintTowerOfHonai(n-1,src,dest,helper);
		System.out.println("Transfer dist "+n +"From "+src +" to "+ dest);
		PrintTowerOfHonai(n-1,helper,src,dest);
		
		
	}

	public static void main(String[] args) {
		int n=3;
		PrintTowerOfHonai(n,"S","H","D");
		
	}

}
