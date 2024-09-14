package DealingCar;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class login {

    public static void main(String[] args) {
        try {
            File loginpassword = new File("password.txt");
            File loginusername = new File("usernamne.txt");
            if (loginpassword.createNewFile()&&loginusername.createNewFile()) {
                System.out.println("File created: " + loginpassword.getName());

            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String username = myObj.nextLine();
        String password = myObj.nextLine();


        Scanner myReader = new Scanner("filename.txt");
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

    public static void vertifylogin(String username,String password,String filepath){
        Scanner x;
        boolean found=false;
        String temusername="";
        String tempassword="";
        try{
            x=new Scanner(new File(filepath));
            x.useDelimiter(",\n");
            while(x.hasNext() && !found){

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    }
