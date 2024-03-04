package basic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BinarySearch {
	public static int SearchProcess(int[] a,int item) {
		int beg=0;
		int end=a.length-1;
		
		while(beg<=end ) {
			int mid=(beg+end)/2;
			if(a[mid]==item) {
				//Item found , return the original index of item
			
				return mid;
			}
			
				else if(item<a[mid]) {
				end= mid-1;
			}
			
			else {
			beg=mid+1;
		}
	}
	return -1; //if item is not found
			
		
	}

	public static void main(String[] args) {
		int a[]= {2,4,56,7,8,5,3,9,4345,6565,7667,454,434,545,55466,56,343,2343434,3333334,454545};
		
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
		int item=454;
		int loc = SearchProcess(a,item);
		if(loc!=-1) {
			System.out.println("Item found at position "+loc);
		}
		else {
			System.out.println("Searching is unsuccessful");
		}
		

	}

}
