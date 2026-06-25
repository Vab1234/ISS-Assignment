package Java.File_Handling;

import java.io.*;

public class Folder {
    public static void main(String args[]){
        File folder = new File("TestFolder2");

        if(folder.mkdir()){
            System.out.println("Folder created successfully");
        } else{
            System.out.println("Something went wrong");
        }
    }
}
