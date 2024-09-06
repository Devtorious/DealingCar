package DealingCar;

import java.util.ArrayList;
import java.util.List;

public class CarInventory {
    private List<Car> cars;

    public CarInventory() {
        cars = new ArrayList<>();
    }

    // Method to add a car to the inventory
    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added successfully: " + car.getCarId());
    }

    // Optional: Display all cars in inventory
    public void displayCars() {
        for (Car car : cars) {
            car.showCarDetails();
            System.out.println("----------------------");
        }
    }
}
