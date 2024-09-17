package DealingCar;

import java.util.*;
import java.util.stream.Collectors;

import static DealingCar.Main.getInventory;

//import static DealingCar;

public class CarInventory {
    private List<DealingCar.Car> cars;
    private Set<String> carIds;
    private String carIdFormat = "^C\\d+$";

    public CarInventory() {
        cars = new ArrayList<>();
        carIds = new HashSet<>();
        initializerCars();
    }

    //delete car by ID
    public boolean deleteCarById(String carId) {
        Iterator<Car> iterator = cars.iterator();
        if (carId.matches(carIdFormat)) {
            while (iterator.hasNext()) {
                Car car = iterator.next();
                if (car.getCarId().equals(carId)) {
                    iterator.remove();  // remove the car from the list
                    carIds.remove(carId);  // remove the carId from the set
                    System.out.println("Car with ID " + carId + " has been removed.");
                    System.out.println("--------------------------------------");
                    return true;
                }
            }
            System.out.println("Error: No car found with ID " + carId);
            return false;
        }
        else {
            System.out.println("Invalid Car ID Format (" + carId + ")");
            System.out.println("Car added failed");
            System.out.println("--------------------------------------");
            return false;

        }
    }

    //initial cars
    private void   initializerCars() {
        // Create a new car instance
        addCar(new DealingCar.Car("C001", "Toyota", "Corolla", 2022, 10000, "Blue", true, 20000, "No issues"));
        addCar(new DealingCar.Car("C002", "Honda", "Civic", 2021, 5000, "Red", true, 22000, "Recently booked"));
        addCar(new DealingCar.Car("C003", "Nissan", "GTR Nismo", 2024, 0, "Black", true, 39999, "Brand new"));
        addCar(new DealingCar.Car("C004", "Ford", "Mustang", 2022, 5000, "Yellow", true, 35000, "No issues"));
        addCar(new DealingCar.Car("C005", "Chevrolet", "Camaro", 2021, 15000, "Green", true, 30000, "Minor scratches"));
        addCar(new DealingCar.Car("C006", "BMW", "X5", 2023, 3000, "White", true, 60000, "Excellent condition"));
        addCar(new DealingCar.Car("C007", "Mercedes-Benz", "C-Class", 2020, 20000, "Black", true, 40000, "Well maintained"));
        addCar(new DealingCar.Car("C008", "Audi", "A4", 2022, 7000, "Silver", true, 45000, "No issues"));
        addCar(new DealingCar.Car("C009", "Toyota", "Camry", 2021, 10000, "Blue", true, 35000, "Good condition"));
        addCar(new DealingCar.Car("C010", "Honda", "Accord", 2022, 2000, "Red", true, 28000, "Like new"));
        addCar(new DealingCar.Car("C011", "Hyundai", "Elantra", 2023, 5000, "Gray", true, 27000, "No issues"));
        addCar(new DealingCar.Car("C012", "Nissan", "Altima", 2021, 12000, "White", true, 32000, "Well maintained"));
        addCar(new DealingCar.Car("C013", "Kia", "Optima", 2022, 8000, "Blue", true, 29000, "Good condition"));
        addCar(new DealingCar.Car("C014", "Volkswagen", "Passat", 2020, 25000, "Silver", true, 26000, "Minor wear and tear"));
        addCar(new DealingCar.Car("C015", "Subaru", "Legacy", 2021, 18000, "Green", true, 31000, "Well maintained"));
        addCar(new DealingCar.Car("C016", "Mazda", "6", 2023, 4000, "Red", true, 32000, "Like new"));
        addCar(new DealingCar.Car("C017", "Land Rover", "Range Rover", 2022, 6000, "Black", true, 75000, "Excellent condition"));
        addCar(new DealingCar.Car("C018", "Porsche", "911", 2023, 3000, "Yellow", true, 95000, "No issues"));
        addCar(new DealingCar.Car("C019", "Jaguar", "F-Type", 2022, 4000, "Orange", true, 85000, "Excellent condition"));
        addCar(new DealingCar.Car("C020", "Lexus", "ES", 2021, 15000, "Blue", true, 40000, "Good condition"));
        addCar(new DealingCar.Car("C021", "Acura", "TLX", 2022, 10000, "White", true, 42000, "Well maintained"));
        addCar(new DealingCar.Car("C022", "Buick", "Enclave", 2021, 12000, "Gray", true, 45000, "Good condition"));
        addCar(new DealingCar.Car("C023", "Chrysler", "300", 2020, 20000, "Silver", true, 35000, "Minor wear and tear"));
        addCar(new DealingCar.Car("C024", "GMC", "Yukon", 2022, 8000, "Black", true, 55000, "Excellent condition"));
        addCar(new DealingCar.Car("C025", "Ford", "Explorer", 2021, 15000, "Red", true, 38000, "Well maintained"));
        addCar(new DealingCar.Car("C026", "Chevrolet", "Tahoe", 2022, 6000, "Blue", true, 60000, "No issues"));
        addCar(new DealingCar.Car("C027", "Toyota", "Highlander", 2023, 2000, "White", true, 35000, "Like new"));
        addCar(new DealingCar.Car("C028", "Honda", "Pilot", 2021, 18000, "Gray", true, 37000, "Good condition"));
        addCar(new DealingCar.Car("C029", "Nissan", "Rogue", 2022, 7000, "Silver", true, 34000, "Well maintained"));
        addCar(new DealingCar.Car("C030", "Hyundai", "Santa Fe", 2021, 13000, "Green", true, 29000, "Minor wear and tear"));
    }

    // Add a car to the inventory
    public boolean addCar(DealingCar.Car car) {
        // Check if the carId is existed already
        if (car.getCarId().matches(carIdFormat)) {
            if (carIds.contains(car.getCarId())) {
                System.out.println("Error: Car with ID " + car.getCarId() + " already exists!!!!!");
                System.out.println("Car added failed");
                System.out.println("--------------------------------------");

                return false;
            }
            else {
                // Add the car to the inventory and the carId to the set
                cars.add(car);
                carIds.add(car.getCarId());
                System.out.println("Car added successfully: " + car.getCarId());
                System.out.println("--------------------------------------");
                return true;
            }
        }
        else {
            System.out.println("Invalid Car ID Format (" + car.getCarId() + ")");
            System.out.println("Car added failed");
            System.out.println("--------------------------------------");
            return false;
        }
    }

    // display all cars
    public void displayCars() {
        for (DealingCar.Car car : cars) {
            car.showCarDetails();
        }
    }

    // Search cases
    public List<DealingCar.Car> searchByBrand(String brand) {
        return cars.stream()
                .filter(car -> car.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public List<DealingCar.Car> searchByModel(String model) {
        return cars.stream()
                .filter(car -> car.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }

    public List<DealingCar.Car> searchById(String carId) {
        return cars.stream()
                .filter(car -> car.getCarId().equalsIgnoreCase(carId))
                .collect(Collectors.toList());
    }

    public List<DealingCar.Car> searchByColor(String color) {
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
                List<DealingCar.Car> brandCars = getInventory().searchByBrand(brand);
                displaySearchResults(brandCars);
                break;

            case "model":
                System.out.println("Search by Model: ");
                String model = scanner.nextLine().trim();
                List<DealingCar.Car> modelCars = getInventory().searchByModel(model);
                displaySearchResults(modelCars);
                break;

            case "color":
                System.out.println("Search by Color: ");
                String color = scanner.nextLine().trim();
                List<DealingCar.Car> colorCars = getInventory().searchByColor(color);
                displaySearchResults(colorCars);
                break;

            case "id":
                System.out.println("Search by ID: ");
                String id = scanner.nextLine().trim();
                List<DealingCar.Car> idCars = getInventory().searchById(id);
                displaySearchResults(idCars);
                break;

            default:
                System.out.println("Invalid search criterion. Please use (brand, model, color, ID).");
                break;
        }
    }

    //modify car
    public void updateCarById(String carId) {
        Car car = findCarById(carId);
        if (car == null) {
            System.out.println("Error: No car found with ID " + carId);
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 9) {
            System.out.println("Choose what information to modify:");
            System.out.println("1. Brand");
            System.out.println("2. Model");
            System.out.println("3. Year");
            System.out.println("4. Mileage");
            System.out.println("5. Color");
            System.out.println("6. Status");
            System.out.println("7. Price");
            System.out.println("8. Note");
            System.out.println("9. Finish");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    modifyAttribute("Brand", car.getBrand(), scanner, (newValue) -> car.setBrand(newValue));
                    break;
                case 2:
                    modifyAttribute("Model", car.getModel(), scanner, (newValue) -> car.setModel(newValue));
                    break;
                case 3:
                    modifyAttribute("Year", String.valueOf(car.getYear()), scanner, (newValue) -> car.setYear(Integer.parseInt(newValue)));
                    break;
                case 4:
                    modifyAttribute("Mileage", String.valueOf(car.getMileage()), scanner, (newValue) -> car.setMileage(Long.parseLong(newValue)));
                    break;
                case 5:
                    modifyAttribute("Color", car.getColor(), scanner, (newValue) -> car.setColor(newValue));
                    break;
                case 6:
                    modifyAttribute("Status (true for available, false for sold)", String.valueOf(car.isStatus()), scanner, (newValue) -> car.setStatus(Boolean.parseBoolean(newValue)));
                    break;
                case 7:
                    modifyAttribute("Price", String.valueOf(car.getPrice()), scanner, (newValue) -> car.setPrice(Double.parseDouble(newValue)));
                    break;
                case 8:
                    modifyAttribute("Note", car.getNotes(), scanner, car::setNotes);
                    break;
                case 9:
                    System.out.println("Update finished.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    // Helper method to modify an attribute with confirmation
    private void modifyAttribute(String attributeName, String currentValue, Scanner scanner, ModifyAttribute callback) {
        System.out.println("Current " + attributeName + ": " + currentValue);
        System.out.println("Enter new " + attributeName + ": ");
        String newValue = scanner.nextLine();

        System.out.println("Do you want to accept the change? (yes/no)");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            callback.update(newValue);
            System.out.println(attributeName + " has been updated to: " + newValue);
        } else {
            System.out.println(attributeName + " update canceled.");
        }
    }

    // Helper interface for modifying an attribute
    private interface ModifyAttribute {
        void update(String newValue);
    }

    // Find car by ID
    private Car findCarById(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equalsIgnoreCase(carId)) {
                return car;
            }
        }
        return null;
    }





    //search result
private static void displaySearchResults(List<DealingCar.Car> cars) {
    if (cars.isEmpty()) {
        System.out.println("No cars found matching the criteria.");
    } else {
        for (DealingCar.Car car : cars) {
            car.showCarDetails();
        }
    }
}
}
