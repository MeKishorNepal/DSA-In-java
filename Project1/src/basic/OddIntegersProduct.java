package basic;

public class OddIntegersProduct {
	
	public static void main(String[] args) {
        // Calculate the product of odd integers from 1 to 15
        long product = calculateOddIntegersProduct(1, 15);

        // Display the result
        System.out.println("Product of Odd Integers from 1 to 15: " + product);
    }

    private static long calculateOddIntegersProduct(int start, int end) {
        long product = 1;

        for (int i = start; i <= end; i += 2) {
            product *= i;
        }

        return product;
    }
    

}
