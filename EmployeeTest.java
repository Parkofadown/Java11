
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        double monthlySalary;
        String firstName1;
        String lastName1;
        double monthlySalary1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee one first name: ");
        firstName = input.nextLine();
        System.out.print("Enter employee one last name: ");
        lastName = input.nextLine();
        System.out.print("Enter employee two first name: ");
        firstName1 = input.nextLine();
        System.out.print("Enter employee two last name: ");
        lastName1 = input.nextLine();
        System.out.print("Enter employee one monthly salary: ");
        monthlySalary = input.nextDouble();
        System.out.print("Enter employee two monthly salary: ");
        monthlySalary1 = input.nextDouble();

        Employee empOne = new Employee(firstName,lastName,monthlySalary);
        Employee empTwo = new Employee(firstName1, lastName1, monthlySalary1);

       empOne.printEmployee(firstName,lastName,monthlySalary);
       empTwo.printEmployee(firstName1,lastName1,monthlySalary1);

       monthlySalary = monthlySalary + monthlySalary * 0.10 ;
       empOne.setMonthlySalary(monthlySalary);
       monthlySalary1 = monthlySalary1 + monthlySalary1 * 0.10;
       empTwo.setMonthlySalary(monthlySalary1);

       empOne.printEmployee(firstName,lastName,monthlySalary);
       empTwo.printEmployee(firstName1,lastName1,monthlySalary1);
        input.close();
    }

}
