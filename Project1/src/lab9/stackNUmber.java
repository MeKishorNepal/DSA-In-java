package lab9;
import java.util.*;

public class stackNUmber {
	static void stack_push(Stack<Integer> stack) {
		System.out.println("We pushed the even number");
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				stack.push(i);
				
			}
			else {
				System.out.println("Odd number are not push");
			}

		}
		
	}
	static void stack_pop(Stack<Integer> stack) {
		Stack<Integer> tempstack=new Stack<>();
		int sum=0;
		while(!stack.isEmpty()) {
			int element=stack.pop();
			sum +=element;
			
		}
		System.out.println(sum);
			
			

	}
			

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		
		
		

	}

}
