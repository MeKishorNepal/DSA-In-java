package basic;
import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		int numbers[]= {3,6,9,7,1,2,12};
		
		
		quicksort(numbers,0,numbers.length-1);
		printArray(numbers);
		
	}

	private static void quicksort(int[] numbers, int lowindex, int highindex) {
		if(lowindex>=highindex) {
			return;
		}
		int pivot=numbers[highindex];
		int leftpointer=lowindex;
		int rightpointer=highindex;
		
		while(leftpointer<rightpointer) {
		
			while(numbers[leftpointer]<=pivot && leftpointer<rightpointer) {
				leftpointer++;
			}
			while(numbers[rightpointer]>=pivot && leftpointer<rightpointer) {
				rightpointer--;
		} 
			swap(numbers,leftpointer,rightpointer);
		}
	        swap(numbers,leftpointer, highindex);
			quicksort(numbers,lowindex,leftpointer-1);
			quicksort(numbers,leftpointer+1,highindex);
}


	

	private static void swap(int[] numbers, int a, int b) {
		int temp=numbers[a];
		 numbers[a]=numbers[b];
		 numbers[b]=temp;
	}
		
	

	private static void printArray(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
	}

}
