  package unite9;
import java.util.Stack;

public class StackOperation {
	//for push operation
	static void stack_push(Stack<Integer> stack) {
		for(int i=0;i<5;i++) {
			stack.push(i);
		}
	}
	//for pop operation
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("POP Operation:");
		for (int i=0;i<5;i++) {
			Integer y=(Integer) stack.pop();//type casting
			System.out.println(y);
		}
	}
	//for peek
	static void stack_peek(Stack<Integer> stack) {
		Integer element=(Integer) stack.peek();
		System.out.println("Element on stack top "+element);
	}
	//for search element
	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos=(Integer) stack.search(element);
		if(pos==-1) {
			System.out.println("Element is not foune");
		}
		else {
		System.out.println("Search element is in position on "+ pos);
		}
	}
		
		
	

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack,2);
		stack_search(stack,5); 
		
		
		

	}

}
