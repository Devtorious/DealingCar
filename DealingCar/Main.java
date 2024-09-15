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
                    DealingCar.CarInventory.searchCar(searchBy);
                    break;

                case 3:
                    // add new car input
                    DealingCar.Car.addNewCar();;
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
     // Scanner scan = new Scanner(System.in);
//        int n = -1;
//
//        // Vòng lặp while để người dùng có thể quay lại menu chính
//        while (n != 0) {
//            System.out.println("Chọn vai trò của bạn:");
//            System.out.println("1: Admin");
//            System.out.println("2: Sale");
//            System.out.println("3: Customer");
//            System.out.println("0: Thoát");
//            n = scan.nextInt();
//
//            switch (n) {
//                case 1:
//                    int admin = -1;
//                    while (admin != 0) {
//                        System.out.println("1: Xem doanh thu theo tháng");
//                        System.out.println("2: Xem doanh thu theo ngày");
//                        System.out.println("3: Xem danh sách nhân viên");
//                        System.out.println("0: Quay lại menu chính");
//                        admin = scan.nextInt();
//
//                        switch (admin) {
//                            case 1:
//                                System.out.println("Đang chạy chương trình doanh thu theo tháng");
//                                System.out.println("Kết quả là: ");
//                                break;
//                            case 2:
//                                System.out.println("Đang chạy chương trình doanh thu theo ngày");
//                                System.out.println("Kết quả là: ");
//                                break;
//                            case 3:
//                                System.out.println("Đang chạy chương trình danh sách nhân viên");
//                                System.out.println("Kết quả là: ");
//                                break;
//                            case 0:
//                                System.out.println("Quay lại menu chính...");
//                                break;
//                            default:
//                                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
//                        }
//                    }
//                    break;
//
//                case 2:
//                    int sale = -1;
//                    while (sale != 0) {
//                        System.out.println("1: Tạo hoá đơn giao dịch");
//                        System.out.println("2: Xem danh sách xe");
//                        System.out.println("0: Quay lại menu chính");
//                        sale = scan.nextInt();
//
//                        switch (sale) {
//                            case 1:
//                                System.out.println("Đang tạo hóa đơn giao dịch...");
//                                break;
//                            case 2:
//                                System.out.println("Đang xem danh sách xe...");
//                                break;
//                            case 0:
//                                System.out.println("Quay lại menu chính...");
//                                break;
//                            default:
//                                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
//                        }
//                    }
//                    break;
//
//                case 3:
//                    int customer = -1;
//                    while (customer != 0) {
//                        System.out.println("1: Xem danh sách đã mua");
//                        System.out.println("2: Xem danh sách xe");
//                        System.out.println("0: Quay lại menu chính");
//                        customer = scan.nextInt();
//
//                        switch (customer) {
//                            case 1:
//                                System.out.println("Đang xem danh sách đã mua...");
//                                break;
//                            case 2:
//                                System.out.println("Đang xem danh sách xe...");
//                                break;
//                            case 0:
//                                System.out.println("Quay lại menu chính...");
//                                break;
//                            default:
//                                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
//                        }
//                    }
//                    break;
//
//                case 0:
//                    System.out.println("Thoát chương trình...");
//                    break;
//
//                default:
//                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
//            }
//        }
//
//        scan.close();
    }
}
