package learn.java.Day11.FileHandlingh;

import java.io.File;
import java.io.IOException;

public class Creating {
    public static void main(String[] args) {
        try {
            File file = new File("files/csit.txt");
            Boolean isFileCreated = file.createNewFile();

            if (isFileCreated) {
                System.out.println("File " + file.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }


        } catch (IOException exception) {
            System.out.println("An unexpected error occurred.");
            exception.printStackTrace();
        }
    }
}
