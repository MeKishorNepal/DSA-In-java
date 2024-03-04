package unite9;

import java.util.Stack;


public class StackStringRemove {
	
	static void stack_remove(Stack<String>stack,String target, String replacement) {
		Stack<String> tempstack=new Stack<>();
		while(!stack.isEmpty()) {
			String item=stack.pop();
			if(item.equals(target)) {
				item = replacement;
			
			}
			tempstack.push(item);
		
		}
		//restore the stack
		while(!tempstack.isEmpty()) {
			stack.push(tempstack.pop());
		}
		
	}

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("Hello");
		stack.push("hi");
		stack.push("Kishor Nepal");
		
		String target="hi";
		String replacement="Hello";
		stack_remove(stack,target,replacement);
		System.out.println(stack); 
		

	}

}
 