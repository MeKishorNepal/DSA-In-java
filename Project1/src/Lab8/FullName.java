package Lab8;
import java.util.*;

public class FullName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fname=sc.nextLine();
		String lname=sc.nextLine();
		try {
		String fullName=fname.concat(lname);
		System.out.println(fullName.toUpperCase());
		}
		catch(Exception e) {
			System.out.println("Exception is handle");
		}
		finally {
			System.out.println("Your Full Name is in uppercase ");
		}
		
		

	}

}
