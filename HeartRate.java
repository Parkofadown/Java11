import java.util.Calendar;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthYear;
    private int birthDay;

    public HeartRate(String firstName, String lastName, int birthMonth, int birthYear, int birthDay){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.birthDay = birthDay;

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
    public void setBirthMonth(int birthMonth){
        this.birthMonth = birthMonth;
    }
    public int getBirthMonth(){
        return birthMonth;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }
    public int getBirthDay(){
        return birthDay;
    }

    //method that gets current age
    public int getAge(){

        int age;
        Calendar calendar = Calendar.getInstance();

        int calYear = calendar.get(Calendar.YEAR);
        int calDay = calendar.get(Calendar.DAY_OF_MONTH);
        int calMonth = calendar.get(Calendar.MONTH) + 1;

        if (birthMonth == calMonth && birthDay == calDay){
           age = calYear - birthYear;
        } else {
            age = calYear - 1 - birthYear;
        }

        return age;
    }
    public double maxHearthRate(){
        double heartRate = 220 - getAge();
        return heartRate;
    }

    public double minTargetHeartRate(){
        double minHeartRate = maxHearthRate() * 0.50;
        return minHeartRate;
    }
    public double maxTargetHeartRate(){
        double maxTargetHeartRate = maxHearthRate() * 0.85;
        return maxTargetHeartRate;
    }
    public void printInformation(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(birthMonth + "/" + birthDay + "/" + birthYear);
        System.out.printf("Age: %d\n", getAge());
        System.out.printf("Max Heart Rate: %.2f\n", maxHearthRate());
        System.out.printf("Min Target Heart Rate: %.2f\n", minTargetHeartRate());
        System.out.printf("Max Target Heart Rate: %.2f\n", maxTargetHeartRate());
    }

}
