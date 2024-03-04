package RecursionClass2;

public class SubsequencesOfString {
	public static void printSubSequences(String str, int idx, String Subsequences) {
		
		if(idx==str.length()) {
			System.out.println(Subsequences);
			return;
		}
		
		char currentChar=str.charAt(idx);
		
		//to come 
		printSubSequences(str,idx+1,Subsequences+currentChar);
		
		//to not come
		printSubSequences(str,idx+1,Subsequences);
	}

	public static void main(String[] args) {
		
		String str="abcd";
		printSubSequences(str,0," ");

	}

}
