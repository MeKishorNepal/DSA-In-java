public class SumOfSquaresAndSquareRoots {

    public static void main(String[] args) {
        // Calculate sum of squares
        int sumOfSquares = calculateSumOfSquares(10);

        // Calculate sum of square roots
        double sumOfSquareRoots = calculateSumOfSquareRoots(10);

        // Display the results
        System.out.println("Sum of Squares: " + sumOfSquares);
        System.out.println("Sum of Square Roots: " + sumOfSquareRoots);    
    }

    private static int calculateSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    private static double calculateSumOfSquareRoots(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.sqrt(i);
        }
        return sum;
    }
}


	
	


		
	

	
		
	
