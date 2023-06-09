package learn.java.Day11.FileHandlingh;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writing {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Write the contents of the file in the next line");
            String content = scanner.nextLine();

            FileWriter fwrite = new FileWriter("files/csit.txt");
            fwrite.write("Monu is talkative but good in heart.");

            fwrite.close();
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
}

