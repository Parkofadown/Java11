/*
Name: Richard Boyd
Date: 8/31/19
Description: Write an application that inputs three ints from the user and displays the sum, avg, product, smallest and largest number
 */
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {

        int num1, num2, num3;
        int sum,average,product;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number one: ");
        num1 = input.nextInt();
        System.out.print("Enter number two: ");
        num2 = input.nextInt();
        System.out.print("Enter number three: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        System.out.printf("The sum is %d\n", sum);
        average = (num1 + num2 + num3) / 3 ;
        System.out.printf("The average is %d\n", average);
        product = (num1 * num2 * num3);
        System.out.printf("The product is %d\n", product);

        if (num1 <= num2 && num1 <= num3 ){
            System.out.printf("%d is the smallest number\n",num1);
        } else if ( num2 <= num1 && num2 <= num3 ){
            System.out.printf("%d is the smallest number\n", num2);
        } else {
            System.out.printf("%d is the smallest number\n", num3);
        }

        if (num1 >= num2 && num1 >= num3 ){
            System.out.printf("%d is the greatest number\n", num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.printf("%d is the greatest number\n", num2);
        } else {
            System.out.printf("%d is the greatest number\n",num3);
        }


        input.close();
    }
}
