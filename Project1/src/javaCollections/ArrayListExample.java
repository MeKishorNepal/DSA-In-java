package javaCollections;
import  java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> Name=new ArrayList<>();
		Name.add("Kishor");
		Name.add("Ravi");
		Name.add("Ram");
		
		Name.forEach((n)->{System.out.println(n);});
		
	
		System.out.println(Name);
		Name.add(2,"Hari");
		System.out.println(Name);
		Name.remove(1);
		System.out.println(Name);
		Name.set(1, "Geta");
		System.out.println(Name);
		System.out.println(Name.get(1));
		Name.clear();
		System.out.println(Name);
	
		
	}

}
