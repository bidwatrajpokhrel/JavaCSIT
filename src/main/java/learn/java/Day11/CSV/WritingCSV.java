package learn.java.Day11.CSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WritingCSV {
    public static void main(String[] args) {
        String fileName = "files/data.csv";

        Map<String, List<String>> dataMap = new HashMap<>();
        dataMap.put("1", List.of("Sumit", "4.0", "Mango"));
        dataMap.put("2", List.of("Prakash", "2.1", "Chicken"));
        dataMap.put("3", List.of("Bikram", "2.2", "Honey"));

        try {

            for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
                FileWriter fileWriter = new FileWriter(fileName, true);
                File file = new File(fileName);

                if (file.exists() && file.length() > 0) {
                    fileWriter.write(System.lineSeparator());
                }

                String data = entry.getKey() + "," +
                        entry.getValue().get(0) + "," +
                        entry.getValue().get(1) + "," +
                        entry.getValue().get(2) + ",";
                fileWriter.write(data);
                fileWriter.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Only add a newline if the file already exists and isn't empty
