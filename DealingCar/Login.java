package DealingCar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static boolean main(String filepath) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (authenticateUser(username, password,filepath)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        return loggedIn;
    }

    private static boolean authenticateUser(String username, String password,String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials[1].equals(username) && credentials[2].equals(password)) {
                    reader.close();
                    return true;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}