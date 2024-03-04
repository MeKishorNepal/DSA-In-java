package RecursionClass2;

public class RemoveDuplicates {
	public static boolean[] map=new boolean[26];
	public static void removeDuplicates(String str,int idx,String newString) {
		
		if(idx==str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currentChar=str.charAt(idx);
		if(map[currentChar-'a']==true) {
			removeDuplicates(str,idx+1,newString);
			
		}else {
			newString +=currentChar;
			map[currentChar-'a']=true;
			removeDuplicates(str,idx+1,newString);
		}
	}

	public static void main(String[] args) {
		
		String str="abaccda";
		String newString=" ";
		removeDuplicates(str,0,newString);
		

	}

}
