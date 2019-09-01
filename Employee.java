public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        if (monthlySalary <= 0) {
            monthlySalary = 0;
        }

    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary > 0 ) {
            this.monthlySalary = monthlySalary;
        }
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void printEmployee(String fName, String lName, double Ysalary){
      fName = this.firstName;
      lName = this.lastName;
      Ysalary = this.monthlySalary * 12;
      System.out.println(fName);
      System.out.println(lName);
      System.out.println(Ysalary);
    }


}
