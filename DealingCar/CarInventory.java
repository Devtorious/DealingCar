package DealingCar.DealingCar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarInventory {
    private List<Car> cars;
    private Set<String> carIds;
    private String carIdFormat = "^C\\d+$";

    public CarInventory() {
        cars = new ArrayList<>();
        carIds = new HashSet<>();     // Initialize the set to store car IDs

    }

    // Add a car to the inventory
    public boolean addCar(Car car) {
        // Check if the carId is existed already
        if (car.getCarId().matches(carIdFormat)) {
            if (carIds.contains(car.getCarId())) {
                System.out.println("Error: Car with ID " + car.getCarId() + " already exists!!!!!");
                return false;
            }
            else {
                // Add the car to the inventory and the carId to the set
                cars.add(car);
                carIds.add(car.getCarId());
                System.out.println("Car added successfully: " + car.getCarId());
                return true;
            }
        }
        else {
            System.out.println("Invalid Car ID Format (" + car.getCarId() + ")");
            return false;
        }
    }

    // display all cars
    public void displayCars() {
        for (Car car : cars) {
            car.showCarDetails();
            System.out.println("--------------------------------------");
        }
    }
}
