package Java.Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throws {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        Scanner scanner = new Scanner(file); 
        
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Attempting to read file...");
            readFile("test.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Error: The specified file was not found.");
        }
    }
}
