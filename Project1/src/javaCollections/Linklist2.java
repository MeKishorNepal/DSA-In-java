package javaCollections;
import java.util.LinkedList;
public class Linklist2 {
	public static void linkoperation(LinkedList<Integer> n) {
		n.add(3);
		n.add(4);
		n.add(6);
		n.forEach((i)->{System.out.println(i);});
		System.out.print(n);
		n.remove(2);
		n.add(1,7);
		n.removeLast();
		n.addFirst(10);
		System.out.println(n);
		
	}
	public static void remove(LinkedList<Integer> n) {
		n.removeFirst();
		System.out.println(n);
	}

	public static void main(String[] args) {
		LinkedList<Integer> books=new LinkedList<>();
		linkoperation(books);
		remove(books);
		
		
		
	}

}
