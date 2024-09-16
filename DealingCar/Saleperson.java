package DealingCar;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Saleperson extends Employee {

    public Saleperson(String userID, String username, String userPassword, String name, Date userDOB, String userEmail, int userPhone, String userAddress, char customerStatus, int salary, int revenue) {
        super(userID, username, userPassword, name, userDOB, userEmail, userPhone, userAddress, customerStatus, salary, revenue);
    }

    public void createTransaction() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter transaction ID: ");
        String id = scanner.nextLine();

        Date transactionDate = new Date();

        System.out.print("Enter client ID: ");
        String clientId = scanner.nextLine();

        System.out.print("Enter service type: ");
        String serviceType = scanner.nextLine();

        System.out.print("Enter discount: ");
        int discount = scanner.nextInt();

        System.out.print("Enter total amount: ");
        int totalAmount = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter additional note: ");
        String additionalNote = scanner.nextLine();

        // Tạo danh sách các mặt hàng đã mua
        ArrayList<String> purchasedItems = new ArrayList<>();
        String item;
        System.out.println("Enter purchased items (type 'done' to finish): ");
        while (!(item = scanner.nextLine()).equalsIgnoreCase("done")) {
            purchasedItems.add(item);
        }


        SaleTransaction transaction = new SaleTransaction(
                id,
                transactionDate,
                clientId,
                this.getUserID(), // Sử dụng UserID
                serviceType,
                purchasedItems,
                discount,
                totalAmount,
                additionalNote
        );

        System.out.println("Sale transaction created: " + transaction);

    }
}
