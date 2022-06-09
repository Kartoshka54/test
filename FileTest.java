package LabExam3;

import java.io.File;
import java.util.Scanner;
import java.nio.file.Paths;
public class FileTest {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired file name");
        String fileName = sc.next();
        fileName = fileName + ".txt";

        File file = new File(fileName);



    }




    //Recursion: Uses his self as a Method
    //Emre is gay kubi likes cuckhold
    //juniora back adamda yarrak var yarrak
    //kubi has a 34 inch dick
     int n= 5;
    // using the method inside the defeniton of the method
    static int factorial (int n){


        if (n != 0) {
            return n * factorial(n-1);
        }
        else
            return 1;

    }




}
