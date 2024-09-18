package DealingCar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mechanic extends Employee{

    private final List<ServiceRecord> serviceHistory; // Keeps track of services performed by the mechanic

    public Mechanic(String userID, String username, String userPassword, String name, Date userDOB, String userEmail, int userPhone, String userAddress, char customerStatus, int salary, int revenue) {
        super(userID, username, userPassword, name, userDOB, userEmail, userPhone, userAddress, customerStatus, salary, revenue);
        this.serviceHistory = new ArrayList<>(); // Initialize an empty service history
    }

    //THIS IS CRUDE, BASED ON A SAMPLE, NOT PROPERLY IMPLEMENTED
//// Class to store each service record
    private static class ServiceRecord {
        private final String serviceID;
        private final String carID;
        private final Date serviceDate;
        private final List<String> replacedParts;
        private final double serviceCost;

        public ServiceRecord(String serviceID, String carID, Date serviceDate, List<String> replacedParts, double serviceCost) {
            this.serviceID = serviceID;
            this.carID = carID;
            this.serviceDate = serviceDate;
            this.replacedParts = replacedParts;
            this.serviceCost = serviceCost;
        }

        @Override
        public String toString() {
            return "ServiceRecord{" +
                    "serviceID='" + serviceID + '\'' +
                    ", carID='" + carID + '\'' +
                    ", serviceDate=" + serviceDate +
                    ", replacedParts=" + replacedParts +
                    ", serviceCost=" + serviceCost +
                    '}';
        }
    }

//    // Mechanic performs a service on a car
    public void performService(String serviceID, String carID, List<String> replacedParts, double serviceCost) {
        ServiceRecord newService = new ServiceRecord(serviceID, carID, new Date(), replacedParts, serviceCost);
        serviceHistory.add(newService);  // Add the service to the history
        logCRUDAction("Service", "Performed", serviceID);
        logUserAction("Performed service on Car with ID: " + carID + ". Replaced parts: " + replacedParts.toString() + ". Service cost: " + serviceCost);
    }

    private void logCRUDAction(String service, String performed, String serviceID) {

    }

    //    // Mechanic can view their own service history
    public void viewServiceHistory() {
        System.out.println("Service History for Mechanic " + getUsername() + ": ");
        for (ServiceRecord serviceRecord : serviceHistory) {
            System.out.println(serviceRecord);
        }
        logUserAction("Viewed service history");
    }

    private void logUserAction(String viewedServiceHistory) {
        
    }

    // Get the revenue generated by services performed by this mechanic
    public double calculateServiceRevenue() {
        double totalRevenue = 0;
        for (ServiceRecord serviceRecord : serviceHistory) {
            totalRevenue += serviceRecord.serviceCost;
        }
        logUserAction("Calculated total revenue from services: " + totalRevenue);
        return totalRevenue;
    }

    @Override
    public boolean isManager() {
        return false;
    }

    @Override
    public boolean isEmployee() {
        return true;
    }
}
