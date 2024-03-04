//sum of squares and square s root first ten natural numbers 
package lab9;

public class SumSauares {

	public static void main(String[] args) {
		int start=0;
		int end=10;
		int sumsquare =0;
		double sumsquareroot=0;
		for(int i=start;i<=end;i++) {
			//for square of ten natural numbers
		sumsquare +=Math.pow(i,2);
		System.out.println(sumsquare);
		//for sum of square root of ten natural number
		sumsquareroot += Math.sqrt(i);
		System.out.println(sumsquareroot);
		
		}
		
		

	}

}
