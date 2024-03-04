package lab9;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Dictionary;

public class DictionaryExample2 {

	public static void main(String[] args) {
		Dictionary<Integer,String> dict=new Hashtable<>();
		dict.put(8,"Kishor");
		dict.put(9,"Hari");
		dict.put(10,"Shyam");
		dict.put(11,"subash");
		dict.put(12,"Bale");
		
		//Enumeration for get all the keys
		Enumeration<Integer> k=dict.keys();
		while(k.hasMoreElements()) {
			Integer key=k.nextElement();
			if(key%2==0) {
				System.out.println("Name of Students whose roll number is even ::"+dict.get(key));
				
			}
		}
		
		

	}

}
