import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        int weight, height;
        double bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weight = input.nextInt();
        System.out.print("Enter height in inches: ");
        height = input.nextInt();

        bmi = (weight * 703) / (height * height);
        System.out.printf("Your BMI is %.2f\n", bmi);

        if (bmi <= 18.5){
            System.out.println("You are in the under weight category based on the following chart:");
            System.out.println("Underweight: Less than 18.5");
            System.out.println("Normal: Between 18.5 and 24.9");
            System.out.println("Overweight: Between 25 and 29.9");
            System.out.println("Obese: 30 or greater");
        } else if (bmi > 18.5 && bmi < 25){
            System.out.println("You are in the normal weight category based on the following chart:");
            System.out.println("Underweight: Less than 18.5");
            System.out.println("Normal: Between 18.5 and 24.9");
            System.out.println("Overweight: Between 25 and 29.9");
            System.out.println("Obese: 30 or greater");
        } else if (bmi >= 25 && bmi < 30){
            System.out.println("You are in the over weight category based on the following chart:");
            System.out.println("Underweight: Less than 18.5");
            System.out.println("Normal: Between 18.5 and 24.9");
            System.out.println("Overweight: Between 25 and 29.9");
            System.out.println("Obese: 30 or greater");
        } else {
            System.out.println("You are in the obese weight category based on the following chart:");
            System.out.println("Underweight: Less than 18.5");
            System.out.println("Normal: Between 18.5 and 24.9");
            System.out.println("Overweight: Between 25 and 29.9");
            System.out.println("Obese: 30 or greater");
        }

        input.close();

    }
}
