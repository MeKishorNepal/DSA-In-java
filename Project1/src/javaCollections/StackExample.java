package javaCollections;
import java.util.Stack;
public class StackExample {
	public static void stack_push(Stack<String> Name) {
		System.out.println("The stack values are:");
		Name.push("Kishor");
		Name.push("shyam");
		for(String n:Name) {
			
			System.out.println("push->" +n);
		}
		
	}
	public static void stack_pop(Stack<String> Name) {
		Name.forEach((n)->{System.out.println(n);});
	}
	

	public static void main(String[] args) {
		Stack<String>Name=new Stack<>();
		stack_push(Name);
		stack_pop(Name);
		
		
		
				
		

	}

}
