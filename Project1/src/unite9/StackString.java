package unite9;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackString {
	static void stack_push(Stack<String> stack,List<String> arraylist) {
		for(String elements: arraylist) {
		stack.push(elements);
		
			
		}
		
	}
	static void stack_pop(Stack<String> stack) {
		
		while(!stack.isEmpty()) {
			String item=stack.pop();
			System.out.println(item);
		}
				
	}
	static void stack_search(Stack<String> stack, String element) {
		//if search only in top the use peek.contians(target) otherwise
		Stack<String> tempstack=new Stack<>();
		while(!stack.isEmpty()) {
			String word=stack.pop();
			tempstack.push(word);
			if(tempstack.contains(element)) {
				System.out.println("The word is found");
				break;
			}
			
		}
		}
	
	//not remove directly so we do tempstack
	
	static void stack_remove(Stack<String> stack, char wordToRemove) {
	Stack<String> tempstack=new Stack<>();
	//pop elements from the original stack and push non-matching
	//elements into the temporary stack
	while(!stack.isEmpty()) {
		String item=stack.pop();
		String modifiedItem=item.replace(Character.toString(wordToRemove),"");
	tempstack.push(modifiedItem);
		/*
		if(!item.contains(wordToRemove)) {
			tempstack.push(item);
		}
		*/
	}
	//push  back the non-matching elements from the
	//temporary stack to the original stack
	while(!tempstack.isEmpty()) {
		stack.push(tempstack.pop());
	}
		
		
	}
	static void stack_peek(Stack<String> stack) {
		String peek= stack.peek();
		System.out.println("The top string of the stack is "+peek);
	}

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		
		//it creates a fixed-size List using the Arrays.asList() method.
		List<String> stringsToAdd= Arrays.asList("The world","Number one","Hello Kishor Nepal");
		
		 // Create a new resizable ArrayList and add the elements from the fixed-size list
		List<String> arraylist=new ArrayList<>(stringsToAdd);
		// NOw we can add more item
		arraylist.add("Hello everyone");
		arraylist.add("who are you");
		
		stack_push(stack,arraylist);
		stack_pop(stack);
		
		stack_push(stack,arraylist);
		
		stack_search(stack,"Kishor");
		stack_search(stack,"given");
		stack_peek(stack);
		
		String wordToRemove="T";
		stack_remove(stack,'T');
		
		stack_peek(stack);
		stack_pop(stack);
		
		
		

	}

}
