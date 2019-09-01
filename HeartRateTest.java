import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int birthMonth;
        int birthDay;
        int birthYear;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = input.nextLine();
        System.out.print("Enter last name: ");
        lastName = input.nextLine();
        System.out.print("Enter month of birth 1-12: ");
        birthMonth = input.nextInt();
        System.out.print("Enter day of birth: ");
        birthDay = input.nextInt();
        System.out.print("Enter year of birth: ");
        birthYear = input.nextInt();

        HeartRate heart = new HeartRate(firstName, lastName,birthMonth,birthYear,birthDay);
        heart.printInformation();

        input.close();

    }
}
