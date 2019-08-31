
/*
 * Name: Richard Boyd
 * Date: 8/30/19 
 * Description: Exercise 3.12 Invoice Class
 */
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String partNumber;
		String partDescription;
		int quantity;
		double price;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a partnumber: ");
		partNumber = input.nextLine();
		System.out.print("Enter a part description: ");
		partDescription = input.nextLine();
		System.out.print("Enter a quantity: ");
		quantity = input.nextInt();
		System.out.print("Enter a price: ");
		price = input.nextDouble();

		Invoice invoice1 = new Invoice(partNumber, partDescription, quantity, price);

		System.out.printf("Invoice amount is: %.2f", invoice1.getInvoiceAmount());

		System.out.print("\nEnter a new quantity: ");
		quantity = input.nextInt();
		invoice1.setQuantity(quantity);

		System.out.printf("Invoice amount is: %.2f", invoice1.getInvoiceAmount());

		input.close();
	}

}
