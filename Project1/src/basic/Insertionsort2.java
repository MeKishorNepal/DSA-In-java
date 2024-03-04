package basic;

import java.util.Arrays;
import java.util.Random;

public class Insertionsort2 {

	public static void main(String[] args) {
		int numbers[]=new int[10];
		Random random=new Random();
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=random.nextInt(500);
		}
		System.out.println("Befor:");
		printArray(numbers);
		
		insertionSort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}

	private static void printArray(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
	}

	private static void insertionSort(int[] numbers) {
		
		for(int i=1;i<numbers.length;i++) {
			int current=numbers[i];
			int j=i-1;
			while(j>=0 && numbers[j]>current) {
				numbers[j+1]=numbers[j];
				j--;
				
			}
			numbers[j+1]=current;
		}
		
	}

}
