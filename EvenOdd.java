
/*
 * Name: Richard Boyd
 * Date: 8/30/19
 * Description: Reads int and determines if odd or even.
 * 
 */
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number is even!");
		} else {
			System.out.println("The number is odd!");
		}

		input.close();
	}

}
