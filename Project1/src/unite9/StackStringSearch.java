package unite9;
import java.util.*;
public class StackStringSearch {
	
	//PUSH OPERATION
	
	static void stack_push(Stack<String> stack, List<String>arraylist) {
		System.out.println("Push operation start::");
		for(String item:arraylist) {
			stack.push(item);
		}
	}
	
	//POP OPERATION
	
	static void stack_pop(Stack<String> stack, int count) {
		System.out.println("POP items");
		//This is for popping the all item from the stack
		/*
		while(!stack.isEmpty()) {
			String list=stack.pop();
			System.out.println(list);
		}
		*/
		System.out.println("pop "+count+" items");
		for(int i=0;i<count && !stack.isEmpty();i++) {
			String item=stack.pop();
			System.out.println(item);
		}
	}
	
	//SEARCH OPERATION
	
	static int stack_search(Stack<String> stack, String element) {
		int index=0;
		Stack<String> tempstack=new Stack<>();
		//Search the element in tempstack
		while(!stack.isEmpty()) {
			String list=stack.pop();
			tempstack.push(list);
			//checks if the elements is found
			if(list.contains(element)) {
				//Restore the original stack
				while(!tempstack.isEmpty()) {
					stack.push(tempstack.pop());
				}
				return index ;
			}
			index++;
		}
		//Restore the original stack0....
		while(!stack.isEmpty()) {
			stack.push(tempstack.pop());
		}
		return -1;//if word is not found
	}
	


	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		
		List<String> StringsToAdd= Arrays.asList("Kishor","Nepal","Hello","Hi how are you");
		//it has fixed size of elements and can not add other so
		List<String> arraylist=new ArrayList<>(StringsToAdd);
		arraylist.add("First");
		arraylist.add("Second");
		
		stack_push(stack,arraylist);
		
		
		
		int position=stack_search(stack,"Second");
		if(position==-1) {
			System.out.println("The word is not found");
		}
			else {
				System.out.println("The word Second "+" position:: "+position);
			}
		
		int position2=stack_search(stack,"First");
		if(position2==-1) {
			System.out.println("The word is not found");
		}
			else {
				System.out.println("The word First "+" position:: "+position2);
			}
		stack_pop(stack,3);
		System.out.println("Is the stack is Empty? "+stack.isEmpty());
		System.out.println("Size of the stack: "+stack.size());
		System.out.println("Stack after popping the elements:"+stack);
		
		
		
		
		
	
		}

	
	}
		
	


  