package DealingCar;

import java.util.Date;

public class User {
    protected String customerID;
    private String customerUserName;
    private String customerPassword;
    private String customerName;
    private Date customerDoB;
    private String customerEmail;
    private int customerPhone;
    private String customerAddress;
    protected String customerStatus;

    public User(String customerID, String customerUserName, String customerPassword, String customerName, Date customerDoB, String customerEmail, int customerPhone, String customerAddress, String customerStatus) {
        this.customerID = customerID;
        this.customerUserName = customerUserName;
        this.customerPassword = customerPassword;
        this.customerName = customerName;
        this.customerDoB = customerDoB;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.customerStatus = customerStatus;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerDoB() {
        return customerDoB;
    }

    public void setCustomerDoB(Date customerDoB) {
        this.customerDoB = customerDoB;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "customerID='" + customerID + '\'' +
                ", customerUserName='" + customerUserName + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerDoB=" + customerDoB +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone=" + customerPhone +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerStatus='" + customerStatus + '\'' +
                '}';
    }
}
