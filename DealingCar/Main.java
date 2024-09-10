package DealingCar.DealingCar;
public class Main {
    public static void main(String[] args) {
        // Create the car inventory
        CarInventory inventory = new CarInventory();

        // Create a new car instance
        DealingCar.DealingCar.Car car1 = new DealingCar.DealingCar.Car("2001", "Toyota", "Corolla", 2022, 10000, "Blue", true, 20000, "No issues");
        DealingCar.DealingCar.Car car3 = new DealingCar.DealingCar.Car("C002", "Honda", "Civic", 2021, 5000, "Red", true, 22000, "Recently booked");
        DealingCar.DealingCar.Car car2 = new DealingCar.DealingCar.Car("C002", "Nissan", "GTR Nismo", 2024, 0, "Black", true, 39999, "Brand new");

        // Add the cars to the CarInventory
        inventory.addCar(car1);
        inventory.addCar(car2);
        inventory.addCar(car3);

        // Display all cars in the inventory
        System.out.println("--------------------------------------");
        System.out.println("Cars list:");
        inventory.displayCars();


    }
}
