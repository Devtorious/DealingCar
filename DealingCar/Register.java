package DealingCar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Register {

    // Function to format Date from String
    public static Date format(String dob) {
        SimpleDateFormat formator = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formator.parse(dob);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    // Function to check if username already exists
    public static boolean isUsernameTaken(String filename,String username) {
        Set<String> existingUsernames = new HashSet<>();

        // Read the file to get all existing usernames
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] managerData = line.split(",");
                String existingUsername = managerData[1]; // Assuming the username is the second field in each line
                existingUsernames.add(existingUsername);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file.");
            e.printStackTrace();
        }

        // Check if username is already in the set of existing usernames
        return existingUsernames.contains(username);
    }

    // Function to generate a unique Manager ID
    public static String generateUniqueID(String filename,String word) {
        int maxID = 0;

        // Read the file to find the highest existing ID
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] managerData = line.split(",");
                String id = managerData[0]; // Assuming ID is the first field in each line
                if (id.startsWith(word)) {
                    try {
                        int numericID = Integer.parseInt(id.substring(1));
                        if (numericID > maxID) {
                            maxID = numericID;
                        }
                    } catch (NumberFormatException e) {
                        // Ignore invalid IDs
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file.");
            e.printStackTrace();
        }

        // Generate new ID
        maxID++;
        return String.format("%s%04d", word, maxID);
    }

    // Function to register a new Manager
    public static void registerManager() {
        Scanner scanner = new Scanner(System.in);

        // Generate a unique Manager ID
        String userID = generateUniqueID("manager.txt","M");

        System.out.println("Generated Manager ID: " + userID);

        // Collect input from user
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        // Check if the username already exists
        if (isUsernameTaken("manager.txt",username)) {
            System.out.println("Username already exists! Please choose a different one.");
            return;
        }

        System.out.println("Enter Password: ");
        String userPassword = scanner.nextLine();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Date of Birth (dd/MM/yyyy): ");
        String DOB = scanner.nextLine();
        Date userDOB = format(DOB);


        System.out.println("Enter Email: ");
        String userEmail = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        int userPhone = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.println("Enter Address: ");
        String userAddress = scanner.nextLine();

        System.out.println("Enter Customer Status (e.g., 'A' or 'B'): ");
        char customerStatus = scanner.next().charAt(0);

        // Create new Manager object
        Manager newManager = new Manager(userID, username,
                userPassword, name, userDOB, userEmail, userPhone, userAddress, customerStatus);


        // Write Manager details to file
        saveManagerToFile(newManager);

        System.out.println("Manager registered successfully!");
    }

    public static void registerSaleperson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Salesperson ID: ");
        String userID = generateUniqueID("saleperson.txt","S");

        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        // Check if the username already exists

        if (isUsernameTaken("saleperson.txt",username)) {
            System.out.println("Username already exists! Please choose a different one.");
            return;
        }

        System.out.println("Enter Password: ");
        String userPassword = scanner.nextLine();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Date of Birth (dd/MM/yyyy): ");
        String DOB = scanner.nextLine();
        Date userDOB = format(DOB);

        System.out.println("Enter Email: ");
        String userEmail = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        int userPhone = scanner.nextInt();


        System.out.println("Enter Address: ");
        String userAddress = scanner.nextLine();

        System.out.println("Enter Customer Status (e.g., 'A' or 'B'): ");
        char customerStatus = scanner.next().charAt(0);

        System.out.println("Enter Salary: ");
        int salary = scanner.nextInt();

        System.out.println("Enter Revenue: ");
        int revenue = scanner.nextInt();

        Saleperson newSaleperson = new Saleperson(userID, username,
                userPassword, name, userDOB, userEmail, userPhone, userAddress, customerStatus, salary, revenue);

        saveSalepersonToFile(newSaleperson);

        System.out.println("Salesperson registered successfully!");
    }

    public static void registerMechanic() {
        Scanner scanner = new Scanner(System.in);

        // Generate a unique Mechanic ID
        String userID = generateUniqueID("mechanic.txt","m");

        System.out.println("Generated Mechanic ID: " + userID);

        // Collect input from user
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        // Check if the username already exists
        if (isUsernameTaken("mechanic.txt", username)) {
            System.out.println("Username already exists! Please choose a different one.");
            return;
        }

        System.out.println("Enter Password: ");
        String userPassword = scanner.nextLine();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Date of Birth (dd/MM/yyyy): ");
        String DOB = scanner.nextLine();
        Date userDOB = format(DOB);

        System.out.println("Enter Email: ");
        String userEmail = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        int userPhone = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.println("Enter Address: ");
        String userAddress = scanner.nextLine();

        System.out.println("Enter Customer Status (e.g., 'A' or 'B'): ");
        char customerStatus = scanner.next().charAt(0);

        System.out.println("Enter Salary: ");
        int salary = scanner.nextInt();

        System.out.println("Enter Revenue: ");
        int revenue = scanner.nextInt();

        // Create new Mechanic object
        Mechanic newMechanic = new Mechanic(userID, username, userPassword, name, userDOB, userEmail, userPhone, userAddress, customerStatus, salary, revenue);

        // Write Mechanic details to file
        saveMechanicToFile(newMechanic);

        System.out.println("Mechanic registered successfully!");
    }

    private static void saveMechanicToFile(Mechanic mechanic) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mechanic.txt", true))) {
            writer.write(mechanic.getUserID() + "," +
                    mechanic.getUsername() + "," +
                    mechanic.getUserPassword() + "," +
                    mechanic.getName() + "," +
                    mechanic.getUserDOB() + "," +
                    mechanic.getUserEmail() + "," +
                    mechanic.getUserPhone() + "," +
                    mechanic.getUserAddress() + "," +
                    mechanic.getCustomerStatus() + "," +
                    mechanic.getSalary() + "," +
                    mechanic.getRevenue() + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }


    private static void saveSalepersonToFile(Saleperson saleperson) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("saleperson.txt", true))) {
            writer.write(saleperson.getUserID() + "," +
                    saleperson.getUsername() + "," +
                    saleperson.getUserPassword() + "," +
                    saleperson.getName() + "," +
                    saleperson.getUserDOB() + "," +
                    saleperson.getUserEmail() + "," +
                    saleperson.getUserPhone() + "," +
                    saleperson.getUserAddress() + "," +
                    saleperson.getCustomerStatus() + "," +
                    saleperson.getSalary() + "," +
                    saleperson.getRevenue() + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }

    // Function to save Manager details to file
    public static void saveManagerToFile(Manager manager) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("manager.txt", true))) {
            // Writing data separated by commas
            writer.write(manager.getUserID() + "," +
                    manager.getUsername() + "," +
                    manager.getUserPassword() + "," +
                    manager.getName() + "," +
                    manager.getUserDOB() + "," +
                    manager.getUserEmail() + "," +
                    manager.getUserPhone() + "," +
                    manager.getUserAddress() + "," +
                    manager.getCustomerStatus() + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        registerSaleperson();
    }
}
