package DealingCar;

import java.util.List;
import java.util.Scanner;

public class Main {
 // Create the car inventory
     private static DealingCar.CarInventory inventory = new DealingCar.CarInventory();

     public static DealingCar.CarInventory getInventory() {
         return inventory;
     }

    public static void main(String[] args) {
        System.out.println(" _____________________________________________");
        System.out.println("| COSC2081 GROUP ASSIGNMENT                   |");
        System.out.println("| AUTO168 CAR DEALERSHIP MANAGEMENT SYSTEM    |");
        System.out.println("| Instructor: Mr. Minh Vu & Mr. Dung Nguyen   |");
        System.out.println("| Group: Group Name                           |");
        System.out.println("| s3979209, Nguyen Huynh Gia Khang            |");
        System.out.println("| s3979760, Pham Hieu Dat                     |");
        System.out.println("| s3836276, Tran Quang Anh                    |");
        System.out.println(" _____________________________________________");

        Scanner scanner = new Scanner(System.in);


             // Main UI


      Scanner scan = new Scanner(System.in);
        int n = -1;

//         Vòng lặp while để người dùng có thể quay lại menu chính
        while (n != 0) {
            System.out.println("--------------------------------------");
            System.out.println("1: Admin");
            System.out.println("2: Sale");
            System.out.println("3: Customer");
            System.out.println("0: exit");
            System.out.print("Choose your role: ");
            n = scan.nextInt();
            switch (n) {
                case 1:
                    Login.main("DealingCar/manager.txt");
                    break;
                case 2:
                    Login.main("DealingCar/saleperson.txt");

                    break;
                case 3:
                    Login.main("DealingCar/mechanic.txt");

                    break;
                case 4:
                    Login.main("DealingCar/client.txt");
                    break;

            }

            // admin (manager) function
            switch (n) {
                case 1:
                    int admin = -1;
                    while (admin != 0) {
                        System.out.println("1: revenue base on month");
                        System.out.println("2: revenue base on day");
                        System.out.println("3: employee list");
                        System.out.println("4. Display all cars");
                        System.out.println("5. Search for a car");
                        System.out.println("6. Add a new car");
                        System.out.println("7. Delete car by ID");
                        System.out.println("8. Update cars' information");
                        System.out.println("0: return");
                        System.out.print("Choose an option: ");
                        admin = scan.nextInt();

                        switch (admin) {
                            case 1:
                                System.out.println(" moth revenue ");
                                System.out.println("Kết quả là: ");
                                break;
                            case 2:
                                System.out.println(" day revenue");
                                System.out.println("Kết quả là: ");
                                break;
                            case 3:
                                System.out.println(" view employee list ");
                                System.out.println("Kết quả là: ");
                                break;
                            case 4:
                            // display all cars
                            System.out.println("--------------------------------------");
                            System.out.println("Cars list:");
                            inventory.displayCars();
                            break;

                            case 5:
                                // search car
                                System.out.println();
                                System.out.println("Search by (brand, model, color, ID): ");
                                String searchBy = scanner.nextLine().trim().toLowerCase();
                                DealingCar.CarInventory.searchCar(searchBy);
                                break;
                            case 6:
                                // add new car input
                                DealingCar.Car.addNewCar();
                                break;
                            case 7:
                                //delete car by ID
                                System.out.println("Type the ID of the car that you want to delete:");
                                String deleteBy = scanner.nextLine().trim().toUpperCase();
                                inventory.deleteCarById(deleteBy);
                            case 8:
                                // Updating car information by ID
                                System.out.println("Enter the ID of the car you want to modify: ");
                                String carIdToUpdate = scanner.nextLine().trim().toUpperCase();
                                inventory.updateCarById(carIdToUpdate);
                                break;

                            case 0:
                                System.out.println("return...");
                                break;
                            default:
                                System.out.println("invalid input, please choose again .");
                        }
                    }
                    break;

                case 2:
                    int sale = -1;
                    while (sale != 0) {
                        System.out.println("1: create sale transaction");
                        System.out.println("2: view car list");
                        System.out.println("0: return");
                        sale = scan.nextInt();

                        switch (sale) {
                            case 1:
                                System.out.println(" create transaction...");
                                break;
                            case 2:
                                System.out.println("Cars list: ");
                                inventory.displayCars();
                                break;
                            case 0:
                                System.out.println("return...");
                                break;
                            default:
                                System.out.println("invalid input, please choose again .");
                        }
                    }
                    break;

                case 3:
                    int customer = -1;
                    while (customer != 0) {
                        System.out.println("1: Xem danh sách đã mua");
                        System.out.println("2: Xem danh sách xe");
                        System.out.println("0: return");
                        customer = scan.nextInt();

                        switch (customer) {
                            case 1:
                                System.out.println("Đang xem danh sách đã mua...");
                                break;
                            case 2:
                                System.out.println("Đang xem danh sách xe...");
                                break;
                            case 0:
                                System.out.println("return...");
                                break;
                            default:
                                System.out.println("invalid input, please choose again .");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("invalid input, please choose again .");
            }
        }
        scan.close();
    }
}
