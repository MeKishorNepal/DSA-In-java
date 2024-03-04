package javaCollections;

import java.util.ArrayDeque;

public class FIFOArrayDequeEx {

	public static void main(String[] args) {
		ArrayDeque<String> Name=new ArrayDeque<>();
		Name.add("Kishor");
		Name.add("Hari");
		Name.add("Shyam");
		for(String n:Name) {
			System.out.println(n);
		}
		
		System.out.println(Name);
		Name.removeLast();
		System.out.println(Name);
		int p=Name.hashCode();
		System.out.println(p);

	}

}
