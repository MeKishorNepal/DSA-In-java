package unite9;
import java.nio.file.FileSystemLoopException;
import java.util.*;
public class SquareOfNumber {
	static int square(int n ) {
		if(n==1) {
			return 1;
		}
		else {
			return n*n;
		}
	}
	
	
	
	public static void main(String[]args) {
		
		System.out.println(square(5));
		Scanner sc= new Scanner(System.in);
		double nums=sc.nextDouble();
		double numss=Math.pow(nums,2);
		
		System.out.println(numss);
		System.out.println("ToString "+Double.toString(nums));
		
	}

}

