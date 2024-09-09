package DealingCar.DealingCar;

import java.security.Provider;
import java.util.List;

public class Car {
    private String carId;      // Unique ID of each car
    private String brand;       // Car brand
    private String model;      // Model of the car
    private int year;          // Year of manufacture
    private long mileage;      // Mileage in kilometers
    private String color;      // Car color
    private boolean status;    // true for available, false for sold
    private double price;      // Price of the car
    private String notes;      // Additional information (e.g., service history)

    private List<Provider.Service> serviceHistory;  // List to track service history


    public Car(String carId, String brand, String model, int year, long mileage, String color, boolean status, double price, String notes) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.status = status;
        this.price = price;
        this.notes = notes;
    }

    protected String getCarId() {
        return carId;
    }

    protected  void setCarId(String carId) {
        this.carId = carId;
    }

    protected String getbrand() {
        return brand;
    }

    protected void setbrand(String brand) {
        this.brand = brand;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected int getYear() {
        return year;
    }

    protected void setYear(int year) {
        this.year = year;
    }

    protected long getMileage() {
        return mileage;
    }

    protected void setMileage(long mileage) {
        this.mileage = mileage;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected boolean isStatus() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected String getNotes() {
        return notes;
    }

    protected void setNotes(String notes) {
        this.notes = notes;
    }

    protected List<Provider.Service> getServiceHistory() {
        return serviceHistory;
    }

    protected void setServiceHistory(List<Provider.Service> serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    //Function
    // Add a service record to the service history
    public void addService(Provider.Service service) {
        this.serviceHistory.add(service);
    }

    // Display car details
    public void showCarDetails() {
        System.out.println("Car ID: " + carId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Color: " + color);
        System.out.println("Status: " + (status ? "Available" : "Sold"));
        System.out.println("Price: " + price);
        System.out.println("Notes: " + notes);
    }
}


