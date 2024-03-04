package unite9;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryExample {

	public static void main(String[] args) {
		Dictionary<String , Integer> dic=new Hashtable<>();//because dictionary cant create object
		dic.put("Kishor", 25);   //dict.put(key object,object value)
		dic.put("Bale", 30);
		dic.put("subash", 35);
		
		System.out.println(dic.get("Kishor  "));//print it 25
		
		int oldValue=dic.put("subash",40);
		System.out.println(oldValue);//35
		
		dic.remove("Bale");
		System.out.println(dic.size());//return 2
		
		System.out.println(dic.get("subash"));
		
		//get the enumeration of 
		Enumeration<String> k=dic.keys();
		//Iterate over the elements using enumeration
		while(k.hasMoreElements()) {
			String key=k.nextElement();
			System.out.println("key: "+key+", value:"+dic.get(key));
		}
		

	}

}
