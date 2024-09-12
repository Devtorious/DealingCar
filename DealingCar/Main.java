package DealingCar.DealingCar;

import java.util.List;
import java.util.Scanner;

public class Main {
 // Create the car inventory
     private static CarInventory inventory = new CarInventory();

     public static CarInventory getInventory() {
         return inventory;
     }

    public static void main(String[] args) {

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
                    Car.addNewCar();;
                    break;

                case 4:
                    // exit
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
                    System.out.println("--------------------------------------");

            }
        }
        scanner.close();
    }
}
