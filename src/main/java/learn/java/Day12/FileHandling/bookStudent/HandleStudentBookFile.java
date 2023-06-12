package learn.java.Day12.FileHandling.bookStudent;

import learn.java.Day12.Library.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HandleStudentBookFile {

    public static List<List<Integer>> read() {
        List<List<Integer>> studentBooks = new ArrayList<>();

        try {
            File file = new File("files/student_book.csv");
            Scanner dataReader = new Scanner(file);

            while (dataReader.hasNextLine()) {
                String line = dataReader.nextLine();
                if (!line.trim().isEmpty()) {
                    String[] studentInfo = line.split(",");
                    Integer studentId = Integer.parseInt(studentInfo[0]);
                    Integer bookId = Integer.parseInt(studentInfo[1]);

                    List<Integer> list = List.of(studentId, bookId);

                    studentBooks.add(list);
                }
            }
            dataReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("error occurred! Cannot read student_book.csv ");
            e.printStackTrace();
        }

        return studentBooks;
    }

    public static void append(Integer studentId, Integer bookId) {
        String fileName = "files/student_book.csv";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            File file = new File(fileName);

            if (file.exists() && file.length() > 0) {
                fileWriter.write(System.lineSeparator());
            }

            String data = studentId + "," +
                    bookId;

            fileWriter.write(data);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error while student borrowed the book. Please try again.");
            e.printStackTrace();
        }
    }

    public static void write(List<List<Integer>> studentBookList) {
        String fileName = "files/student_book.csv";

        String data = "";

        for (List<Integer> studentBookId: studentBookList) {
            Integer index = studentBookList.indexOf(studentBookId);
            data = data +
                    studentBookId.get(0)+","
                    +studentBookId.get(1);
            if(!index.equals(studentBookList.size() - 1)) {
                data += System.lineSeparator();
            }
        }


        try {
            FileWriter fwrite = new FileWriter(fileName);
            fwrite.write(data);

            fwrite.close();
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
}
