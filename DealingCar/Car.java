package DealingCar.DealingCar;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    private String carId;
    private String brand;
    private String model;
    private int year;
    private long mileage;
    private String color;
    private boolean status;    // true for available, false for sold
    private double price;
    private String notes;

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
        this.serviceHistory = new ArrayList<>();
    }



    public String getCarId() {
        return carId;
    }

    protected  void setCarId(String carId) {
        this.carId = carId;
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
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
        if (this.serviceHistory == null) {
            this.serviceHistory = new ArrayList<>();
        }
        this.serviceHistory.add(service);
    }

    // Display car details
    public void showCarDetails() {
        System.out.println("Car ID: " + carId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " mi");
        System.out.println("Color: " + color);
        System.out.println("Status: " + (status ? "Available" : "Sold"));
        System.out.println("Price: " + price + " $");
        System.out.println("Notes: " + notes);
        System.out.println("--------------------------------------");

    }
    public static void addNewCar() {
        Scanner scanner = new Scanner(System.in);
        String carId, brand, model, color, notes;
        int year = 0;
        long mileage = 0;
        boolean status = false;
        double price = 0.0;

        try {
            System.out.print("Enter Car ID: ");
            carId = scanner.nextLine().trim();

            System.out.print("Enter Car Brand: ");
            brand = scanner.nextLine().trim();

            System.out.print("Enter Car Model: ");
            model = scanner.nextLine().trim();

            System.out.print("Enter Car Year: ");
            year = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter Car Mileage: ");
            mileage = Long.parseLong(scanner.nextLine().trim());

            System.out.print("Enter Car Color: ");
            color = scanner.nextLine().trim();

            System.out.print("Is the car available (true/false): ");
            status = Boolean.parseBoolean(scanner.nextLine().trim());

            System.out.print("Enter Car Price (USD): ");
            price = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("Enter Car Notes: ");
            notes = scanner.nextLine().trim();
            System.out.println("--------------------------------------");

            // Create new car object
            Car newCar = new Car(carId, brand, model, year, mileage, color, status, price, notes);
            System.out.println("--------------------------------------");
            if (Main.getInventory().addCar(newCar)) {
                newCar.showCarDetails();
            }
        } catch (NumberFormatException e) {
            System.out.println("--------------------------------------");
            System.out.println("Invalid input. Please enter correct numbers.");
            System.out.println("--------------------------------------");

        }

    }



}


