package DealingCar.DealingCar;

import java.util.List;
import java.util.Scanner;

public class Main {
    // Create the car inventory
    private static CarInventory inventory = new CarInventory();

    public static CarInventory getInventory() {
        return inventory;
    }

    // Add new car input
    public static void addNewCar(Scanner scanner) {
        System.out.print("Enter Car ID: ");
        String carId = scanner.nextLine().trim();

        System.out.print("Enter Car Brand: ");
        String brand = scanner.nextLine().trim();

        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Enter Car Year: ");
        int year = scanner.nextInt();

        System.out.print("Enter Car Mileage: ");
        long mileage = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter Car Color: ");
        String color = scanner.nextLine().trim();

        System.out.print("Is the car available (true/false): ");
        boolean status = scanner.nextBoolean();

        System.out.print("Enter Car Price (USD): ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Car Notes: ");
        String notes = scanner.nextLine().trim();


        // Create new car object
        Car newCar = new Car(carId, brand, model, year, mileage, color, status, price, notes);
        System.out.println("--------------------------------------");
        newCar.showCarDetails();
        inventory.addCar(newCar);
    }

    public static void main(String[] args) {

        // Create a new car instance
        DealingCar.DealingCar.Car car1 = new DealingCar.DealingCar.Car("C001", "Toyota", "Corolla", 2022, 10000, "Blue", true, 20000, "No issues");
        DealingCar.DealingCar.Car car3 = new DealingCar.DealingCar.Car("C002", "Honda", "Civic", 2021, 5000, "Red", true, 22000, "Recently booked");
        DealingCar.DealingCar.Car car2 = new DealingCar.DealingCar.Car("C003", "Nissan", "GTR Nismo", 2024, 0, "Black", true, 39999, "Brand new");
        DealingCar.DealingCar.Car car4 = new DealingCar.DealingCar.Car("C004", "Ford", "Mustang", 2022, 5000, "Yellow", true, 35000, "No issues");
        DealingCar.DealingCar.Car car5 = new DealingCar.DealingCar.Car("C005", "Chevrolet", "Camaro", 2021, 15000, "Green", true, 30000, "Minor scratches");
        DealingCar.DealingCar.Car car6 = new DealingCar.DealingCar.Car("C006", "BMW", "X5", 2023, 3000, "White", true, 60000, "Excellent condition");
        DealingCar.DealingCar.Car car7 = new DealingCar.DealingCar.Car("C007", "Mercedes-Benz", "C-Class", 2020, 20000, "Black", true, 40000, "Well maintained");
        DealingCar.DealingCar.Car car8 = new DealingCar.DealingCar.Car("C008", "Audi", "A4", 2022, 7000, "Silver", true, 45000, "No issues");
        DealingCar.DealingCar.Car car9 = new DealingCar.DealingCar.Car("C009", "Toyota", "Camry", 2021, 10000, "Blue", true, 35000, "Good condition");
        DealingCar.DealingCar.Car car10 = new DealingCar.DealingCar.Car("C010", "Honda", "Accord", 2022, 2000, "Red", true, 28000, "Like new");
        DealingCar.DealingCar.Car car11 = new DealingCar.DealingCar.Car("C011", "Hyundai", "Elantra", 2023, 5000, "Gray", true, 27000, "No issues");
        DealingCar.DealingCar.Car car12 = new DealingCar.DealingCar.Car("C012", "Nissan", "Altima", 2021, 12000, "White", true, 32000, "Well maintained");
        DealingCar.DealingCar.Car car13 = new DealingCar.DealingCar.Car("C013", "Kia", "Optima", 2022, 8000, "Blue", true, 29000, "Good condition");
        DealingCar.DealingCar.Car car14 = new DealingCar.DealingCar.Car("C014", "Volkswagen", "Passat", 2020, 25000, "Silver", true, 26000, "Minor wear and tear");
        DealingCar.DealingCar.Car car15 = new DealingCar.DealingCar.Car("C015", "Subaru", "Legacy", 2021, 18000, "Green", true, 31000, "Well maintained");
        DealingCar.DealingCar.Car car16 = new DealingCar.DealingCar.Car("C016", "Mazda", "6", 2023, 4000, "Red", true, 32000, "Like new");
        DealingCar.DealingCar.Car car17 = new DealingCar.DealingCar.Car("C017", "Land Rover", "Range Rover", 2022, 6000, "Black", true, 75000, "Excellent condition");
        DealingCar.DealingCar.Car car18 = new DealingCar.DealingCar.Car("C018", "Porsche", "911", 2023, 3000, "Yellow", true, 95000, "No issues");
        DealingCar.DealingCar.Car car19 = new DealingCar.DealingCar.Car("C019", "Jaguar", "F-Type", 2022, 4000, "Orange", true, 85000, "Excellent condition");
        DealingCar.DealingCar.Car car20 = new DealingCar.DealingCar.Car("C020", "Lexus", "ES", 2021, 15000, "Blue", true, 40000, "Good condition");
        DealingCar.DealingCar.Car car21 = new DealingCar.DealingCar.Car("C021", "Acura", "TLX", 2022, 10000, "White", true, 42000, "Well maintained");
        DealingCar.DealingCar.Car car22 = new DealingCar.DealingCar.Car("C022", "Buick", "Enclave", 2021, 12000, "Gray", true, 45000, "Good condition");
        DealingCar.DealingCar.Car car23 = new DealingCar.DealingCar.Car("C023", "Chrysler", "300", 2020, 20000, "Silver", true, 35000, "Minor wear and tear");
        DealingCar.DealingCar.Car car24 = new DealingCar.DealingCar.Car("C024", "GMC", "Yukon", 2022, 8000, "Black", true, 55000, "Excellent condition");
        DealingCar.DealingCar.Car car25 = new DealingCar.DealingCar.Car("C025", "Ford", "Explorer", 2021, 15000, "Red", true, 38000, "Well maintained");
        DealingCar.DealingCar.Car car26 = new DealingCar.DealingCar.Car("C026", "Chevrolet", "Tahoe", 2022, 6000, "Blue", true, 60000, "No issues");
        DealingCar.DealingCar.Car car27 = new DealingCar.DealingCar.Car("C027", "Toyota", "Highlander", 2023, 2000, "White", true, 35000, "Like new");
        DealingCar.DealingCar.Car car28 = new DealingCar.DealingCar.Car("C028", "Honda", "Pilot", 2021, 18000, "Gray", true, 37000, "Good condition");
        DealingCar.DealingCar.Car car29 = new DealingCar.DealingCar.Car("C029", "Nissan", "Rogue", 2022, 7000, "Silver", true, 34000, "Well maintained");
        DealingCar.DealingCar.Car car30 = new DealingCar.DealingCar.Car("C030", "Hyundai", "Santa Fe", 2021, 13000, "Green", true, 29000, "Minor wear and tear");


        // Add the cars to the CarInventory
        inventory.addCar(car1);inventory.addCar(car2);inventory.addCar(car3);inventory.addCar(car4);inventory.addCar(car5);inventory.addCar(car6);
        inventory.addCar(car7);inventory.addCar(car8);inventory.addCar(car9);inventory.addCar(car10);
        inventory.addCar(car11);inventory.addCar(car12);inventory.addCar(car13);inventory.addCar(car14);
        inventory.addCar(car15);inventory.addCar(car16);inventory.addCar(car17);inventory.addCar(car18);
        inventory.addCar(car19);inventory.addCar(car20);inventory.addCar(car21);inventory.addCar(car22);
        inventory.addCar(car23);inventory.addCar(car24);inventory.addCar(car25);inventory.addCar(car26);
        inventory.addCar(car27);inventory.addCar(car28);inventory.addCar(car29);inventory.addCar(car30);

        // Main UI
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Display all cars");
            System.out.println("2. Search for a car");
            System.out.println("3. Add a new car");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // display all cars
                    System.out.println("--------------------------------------");
                    System.out.println("Cars list:");
                    inventory.displayCars();
                    break;

                case 2:
                    // search car
                    System.out.println();
                    System.out.println("Search by (brand, model, color, ID): ");
                    String searchBy = scanner.nextLine().trim().toLowerCase();
                    CarInventory.searchCar(searchBy);
                    break;

                case 3:
                    // add new car input
                    addNewCar(scanner);
                    break;

                case 4:
                    //
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        scanner.close();
    }
}
