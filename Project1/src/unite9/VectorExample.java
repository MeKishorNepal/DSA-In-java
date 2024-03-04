package unite9;
import java.util.*;
import java.io.*;

public class VectorExample {

	public static void main(String[] args) {
		int n=5;
		//Declaration of vector
		//and initialize n
		Vector<Integer> v=new Vector <Integer>(n);
		//appending new elements at the
		//end of the vector
		for(int i=1;i<n;i++) {
			v.add(i);
		}
		//printing the elements
		System.out.println("Vector Elements "+v);
		
		//Removes the elements at index 3
		v.remove(3);
		//Display the vector 
		//after deletion
		System.out.println(v);
		//Iterating over vector elements 
		//using for loop
		for(int i =0;i<v.size();i++) {
			//Printing elements one by one
			System.out.println(v.get(i)+" ");
		}
		

	}

}
