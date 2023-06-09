package learn.java.Day11.FileHandlingh;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Appending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the contents of the file in the next line");
        String content = scanner.nextLine();

        String fileName = "files/csit.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);

            fileWriter.write(System.lineSeparator());
            fileWriter.write(content);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


