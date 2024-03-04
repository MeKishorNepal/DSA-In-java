package RecursionClass2;
import java.util.*;
public class UniqueSubSequences {
	public static void printUnique(String str,int idx, String US, HashSet<String>set) {
		
		if(idx==str.length()){
			if(set.contains(US)) {
				return;
			}else {
				System.out.println(US);
				set.add(US);
				return;
			}
			
		}
		
		
		
		char currentChar=str.charAt(idx);
		//to come
		printUnique(str,idx+1,US+currentChar,set);
		
		//to not come
		printUnique(str,idx+1,US,set);
	}

	public static void main(String[] args) {
		String str="abca";
		HashSet<String> set=new HashSet<>();
		printUnique(str,0," ",set);
		
	}

}
