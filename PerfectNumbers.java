
/*
 * Richard Boyd
 * 9/13/19
 * Finds the perfect numbers between 2 and 1000
 * 
 */

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 1000; i++) {
			String result = isPerfect(i);

			if (result != null) {
				System.out.printf("%d is a perfect number%n", i);
				System.out.printf("Factors are %s%n", result);
			}
		}

	}

	public static String isPerfect(int number) {

		int sum = 1;
		String factors = "1 ";

		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				sum = sum + j;
				factors = factors + j + " ";
			}

		}
		// check to see if perfect
		if (sum == number) {
			return factors;
		} else {
			return null;
		}
	}

}
