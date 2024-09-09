package DealingCar;
public class Main {
    public static void main(String[] args) {
        // Create the car inventory
        CarInventory inventory = new CarInventory();

        // Create a new car instance
        DealingCar.DealingCar.Car car1 = new DealingCar.DealingCar.Car("C001", "Toyota", "Corolla", 2022, 10000, "Blue", true, 20000, "No issues");
        DealingCar.DealingCar.Car car2 = new DealingCar.DealingCar.Car("C002", "Honda", "Civic", 2021, 5000, "Red", true, 22000, "Recently booked");

        // Add the cars to the CarInventory
        inventory.addCar(car1);
        inventory.addCar(car2);

        // Display all cars in the inventory
        inventory.displayCars();
    }
}
