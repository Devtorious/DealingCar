import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {

    public static void main(String[] args) {
        try {
            File myObj = new File("src/filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());

            }else {
                System.out.print("file exist");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

          // Read user input

        Scanner myReader = new Scanner("src/filename.txt");
        int n=0;
        while (n==0){
            n= myObj.nextInt();
            switch (n){
                case 1:
                    System.out.print("option1");
                    break;
                case 2:
                    System.out.print("option2");
                    break;
                case 3:
                    System.out.print("option3");
                    break;
                case 4:
                    System.out.print("option4");
                    break;
                default:
                    System.out.print("choose again");
            }
        }
        }
    }
