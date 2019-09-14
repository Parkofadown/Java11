import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double length;
		double width;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of rectangle: ");
		length = input.nextDouble();
		System.out.print("Enter width of rectangle: ");
		width = input.nextDouble();

		Rectangle rectangle1 = new Rectangle(length, width);
		Rectangle rectangle2 = new Rectangle(length);

		System.out.println("Rectangle 1");
		rectangle1.printRectangle();
		System.out.println("Rectangle 2");
		rectangle2.printRectangle();

		input.close();

	}

}
