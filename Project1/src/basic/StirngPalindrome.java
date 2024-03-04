package basic;
import java.util.*;
public class StirngPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String original,reverse="";
		original=sc.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
			
		}
		if(original.equals(reverse)) {
			System.out.println("Enter String is palindrom");
			
		}
		else {
			System.out.println("Enter String is not palindrome");
		}

	}

}
