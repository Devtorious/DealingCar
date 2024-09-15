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
    //        Calendar cal = Calendar.getInstance();
//        Calendar now= Calendar.getInstance();
//        cal.set(Calendar.DAY_OF_MONTH, 1);
//        Date firstDay = cal.getTime();
//        Date current= now.getTime();
//        System.out.println(firstDay);
//        System.out.println(current);
}
