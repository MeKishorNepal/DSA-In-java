package RecursionAdvance;

public class PermutationsOfString {
	public static void PrintPermutation(String str,String permutations) {
		if(str.length()==0) {
			System.out.println(permutations);
		}
		
		
		for(int i=0;i<str.length();i++) {
			char currentChar=str.charAt(i);
			// "abc"->"ac"
			String newString=str.substring(0,i)+str.substring(i+1);
			
			//rest of the work
			PrintPermutation(newString,permutations+currentChar);
		}
	}

	public static void main(String[] args) {
		PrintPermutation("abc"," ");
		

	}

}
