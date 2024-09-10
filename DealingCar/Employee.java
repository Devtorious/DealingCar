package DealingCar;

import java.util.Date;
public class Employee extends User {
    private int salary;
    private int revenue;



    public Employee(String userID, String username, String userPassword, String name, Date userDOB, String userEmail, int userPhone, String userAddress, char customerStatus, int salary, int revenue) {
        super(userID, username, userPassword, name, userDOB, userEmail, userPhone, userAddress, customerStatus);
        this.salary = salary;
        this.revenue = revenue;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }




    @Override
    public String toString() {
        return super.toString() + " Employee{" +
                "salary=" + salary +
                ", revenue=" + revenue +
                '}';
    }
}
