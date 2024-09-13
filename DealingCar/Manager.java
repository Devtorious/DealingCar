package DealingCar;

import java.util.Date;

public class Manager extends User {

    public Manager(String userID, String username, String userPassword, String name, Date userDOB, String userEmail, int userPhone, String userAddress, char customerStatus) {
        super(userID, username, userPassword, name, userDOB, userEmail, userPhone, userAddress, customerStatus);
    }

    @Override
    public boolean isManager() {
        return true;
    }

    @Override
    public boolean isEmployee() {
        return false;
    }
}