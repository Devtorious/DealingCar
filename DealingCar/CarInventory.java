package DealingCar.DealingCar;

import java.util.*;
import java.util.stream.Collectors;

import static DealingCar.DealingCar.Main.getInventory;

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

    // Search cases
    public List<Car> searchByBrand(String brand) {
        return cars.stream()
                .filter(car -> car.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public List<Car> searchByModel(String model) {
        return cars.stream()
                .filter(car -> car.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }

    public List<Car> searchById(String carId) {
        return cars.stream()
                .filter(car -> car.getCarId().equalsIgnoreCase(carId))
                .collect(Collectors.toList());
    }

    public List<Car> searchByColor(String color) {
        return cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    // Search method
    public static void searchCar(String searchBy) {
        Scanner scanner = new Scanner(System.in);

        switch (searchBy) {
            case "brand":
                System.out.println("Search by Brand: ");
                String brand = scanner.nextLine().trim();
                List<Car> brandCars = getInventory().searchByBrand(brand);
                displaySearchResults(brandCars);
                break;

            case "model":
                System.out.println("Search by Model: ");
                String model = scanner.nextLine().trim();
                List<Car> modelCars = getInventory().searchByModel(model);
                displaySearchResults(modelCars);
                break;

            case "color":
                System.out.println("Search by Color: ");
                String color = scanner.nextLine().trim();
                List<Car> colorCars = getInventory().searchByColor(color);
                displaySearchResults(colorCars);
                break;

            case "id":
                System.out.println("Search by ID: ");
                String id = scanner.nextLine().trim();
                List<Car> idCars = getInventory().searchById(id);
                displaySearchResults(idCars);
                break;

            default:
                System.out.println("Invalid search criterion. Please use (brand, model, color, ID).");
                break;
        }
    }

private static void displaySearchResults(List<Car> cars) {
    if (cars.isEmpty()) {
        System.out.println("No cars found matching the criteria.");
    } else {
        for (Car car : cars) {
            car.showCarDetails();
            System.out.println("--------------------------------------");
        }
    }
}

}
