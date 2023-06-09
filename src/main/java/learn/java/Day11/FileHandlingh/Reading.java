package learn.java.Day11.FileHandlingh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        try {
            File file = new File("files/csit.txt");
            Scanner dataReader = new Scanner(file);


            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }


            dataReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("error occurred!");
            exception.printStackTrace();
        }
    }
}