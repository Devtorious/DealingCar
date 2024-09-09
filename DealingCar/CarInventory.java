package DealingCar;

import java.util.ArrayList;
import java.util.List;

public class CarInventory {
    private List<DealingCar.DealingCar.Car> cars;

    public CarInventory() {
        cars = new ArrayList<>();
    }

    // Method to add a car to the inventory
    public void addCar(DealingCar.DealingCar.Car car) {
        cars.add(car);
        System.out.println("Car added successfully: " + car.getCarId());
    }

    // Method to display all cars in inventory
    public void displayCars() {
        for (DealingCar.DealingCar.Car car : cars) {
            car.showCarDetails();
            System.out.println("----------------------");
        }
    }
}
