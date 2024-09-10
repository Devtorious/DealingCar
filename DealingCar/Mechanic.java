package DealingCar;

import java.util.Date;

public class Mechanic extends Employee{
    public Mechanic(String userID, String username, String userPassword, String name, Date userDOB, String userEmail, int userPhone, String userAddress, char customerStatus, int salary, int revenue) {
        super("M" + userID, username, userPassword, name, userDOB, userEmail, userPhone, userAddress, customerStatus, salary, revenue);
    }
}
