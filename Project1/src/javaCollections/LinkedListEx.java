package javaCollections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> Name=new LinkedList<String>();
		Name.add("Kishor");
		Name.add("Ram");
		Name.add("Shyam");
		
		//printing using foreach loop
		for(String n:Name) {
			System.out.println(n);
		}
		
		//printing using lamba expresssion 
		Name.forEach((n)->{System.out.println(n);});
		
		
		Name.addFirst("Hari");
		Name.addLast("Amir");
		System.out.println(Name);
		Name.add(2,"subash");
		System.out.println(Name);
		Name.remove();
		System.out.println(Name);
		Name.removeLast();
		Name.removeFirst();
		
		

	}

}
