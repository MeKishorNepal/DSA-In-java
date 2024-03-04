package RecursionClass2;

public class ArraySorted {
	public static boolean checkArraySorted(int arr[],int idx) {
		
		if(idx==arr.length-1) {
			return true;
		}
		
		if(arr[idx]>=arr[idx+1]) {
			//Array is unsorted till now
			return false;
		}
		else {
			return checkArraySorted(arr,idx+1);
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		System.out.println(checkArraySorted(arr,0));
		
		
	}

}
