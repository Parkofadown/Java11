
/*
 * Name: Richard Boyd
 * Date: 8/30/19
 * Description: Circle Program
 */

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius, diameter, circumference, area;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a radius: ");
		radius = input.nextDouble();
		if (radius < 0) {
			System.out.println("Error! Radius must be positive");

		} else {
			diameter = radius * 2;
			circumference = 2 * Math.PI * radius;
			area = Math.PI * Math.pow(radius, 2);

			System.out.printf("Diameter is %.2f\nCircumference is %.2f\nArea is %.2f", diameter, circumference, area);
		}

		input.close();
	}

}
