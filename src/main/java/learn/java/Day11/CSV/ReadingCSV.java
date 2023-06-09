package learn.java.Day11.CSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReadingCSV {
    public static void main(String[] args) {
        try {
            File file = new File("files/data.csv");
            Scanner dataReader = new Scanner(file);

            Map<String, List<String>> dataMap = new HashMap<>();
            while (dataReader.hasNextLine()) {
                String line = dataReader.nextLine();
                if (!line.trim().isEmpty()) {
                    String[] data = line.split(",");
                    String id = data[0];
                    List<String> list = List.of(data[1], data[2], data[3]);

                    dataMap.put(id, list);

//                dataMap.put(data[0], List.of(data[1], data[2], data[3]));
                }
            }

            for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            dataReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("error occurred!");
            exception.printStackTrace();
        }
    }
}




