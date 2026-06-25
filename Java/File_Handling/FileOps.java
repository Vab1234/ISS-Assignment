package Java.File_Handling;

import java.io.*;
import java.util.Scanner;

public class FileOps{
    public static void main(String args[]){
        String path = "C:/Users/varun/OneDrive/Desktop/ISS Assignment/Java/File_Handling/Test.txt";
        String content = "Iss pre joining assignment";
        File f0 = new File(path);

        // Creating a new file
        try{
            
            if(f0.createNewFile()){
                System.out.println("File " + f0.getName() + " is successfully created");
            } else{
                System.out.println("Something went wrong");
            }
        } catch(IOException e){
            System.out.println("An exception occured while creating the file: " + e.getMessage());
        }

        // Ops on created file
        if(f0.exists()){
            System.out.println(f0.getName());
            System.out.println(f0.getAbsolutePath());
            System.out.println(f0.getAbsolutePath());
            System.out.println(f0.canRead());
            System.out.println(f0.canWrite());
            System.out.println("The size of the file is : " + f0.length() + " bytes");
        }

        // writing to a file
        try{
            FileWriter writer = new FileWriter(path);
            writer.write(content);
            writer.close();
            System.out.println("Writing to file successful");

        } catch(IOException e){
            System.out.println("Error writing in file");
        }
        
        // Reading from a file
        try{
            Scanner sc = new Scanner(f0);
            while(sc.hasNextLine()){
                String text = sc.nextLine();
                System.out.println(text);
            }
            sc.close();
        } catch(FileNotFoundException e){
            System.out.println("Error finding the file");
        }

        // Deleting a file
        // if(f0.delete()){
        //     System.out.println("File successfully deleted");
        // } else{
        //     System.out.println("Something went wrong");
        // }

    }
}