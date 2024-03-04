package RecursionClass2;

public class MoveX {
	public static void moveX(String str,int idx,int count,String newString) {
		
		if(idx==str.length()) {
			for(int i=0;i<count;i++) {
				newString +='x';
			}
			System.out.println(newString);
			return;
		}
		
		 char currentchar=str.charAt(idx);
		 if(currentchar=='x') {
			 count++;
			 moveX(str,idx+1,count,newString); 
		 }else {
			 newString +=currentchar;   //newString= newString+currentChar;
			 moveX(str,idx+1,count,newString);
			 
		 }
		
		
	}

	public static void main(String[] args) {
		String str="axbcxxd";
		String newString=" ";
		
		moveX(str,0,0,newString);
		

	}

}
