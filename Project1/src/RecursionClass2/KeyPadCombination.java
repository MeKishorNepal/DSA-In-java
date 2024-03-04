package RecursionClass2;

public class KeyPadCombination {
	public static String[] keypad= {".","abc ","def ","ghi ","jkl ","mno ","pars ","tu ","vwx","yz"};
	public static void printcombination(String str,int idx,String combination) {
		if(idx==str.length()) {
			System.out.println(combination);
			return;
		}
		
		
		
		char currentChar=str.charAt(idx);
		String mapping=keypad[currentChar-'0'];
		
		for(int i=0;i<mapping.length();i++) {
			
			printcombination(str,idx+1,combination+mapping.charAt(i));
			
			}
		}
	
	

	public static void main(String[] args) {
		String str="12";
		printcombination(str,0,"");
		

	}

}
