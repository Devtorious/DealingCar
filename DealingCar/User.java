package DealingCar.DealingCar;

import java.util.Date;

public class User {
    protected String userID;
    private String username;
    private String userPassword;
    private String name;
    private Date userDOB;
    private String userEmail;
    private int userPhone;
    private String userAddress;
    protected char customerStatus;

    public User(String userID, String username, String userPassword, String name, Date userDOB, String userEmail, int userPhone, String userAddress, char customerStatus) {
        this.userID = userID;
        this.username = username;
        this.userPassword = userPassword;
        this.name = name;
        this.userDOB = userDOB;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.customerStatus = customerStatus;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(Date userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public char getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(char customerStatus) {
        this.customerStatus = customerStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", name='" + name + '\'' +
                ", userDOB=" + userDOB +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone=" + userPhone +
                ", userAddress='" + userAddress + '\'' +
                ", customerStatus=" + customerStatus +
                '}';
    }
}
