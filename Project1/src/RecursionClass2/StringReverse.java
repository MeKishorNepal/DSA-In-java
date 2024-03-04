package RecursionClass2;

public class StringReverse {
	public static void StrigReverse(String str, int idx) {
		if(idx==0) {
			System.out.println(str.charAt(idx));
			return;
		}
		
		System.out.print(str.charAt(idx));
		StrigReverse(str, idx-1);
	}
	
	public static void main(String[] args) {
		String str="abcd";
		StrigReverse(str,str.length()-1);
		

	}

	
	}


