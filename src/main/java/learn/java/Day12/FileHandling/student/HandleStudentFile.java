package learn.java.Day12.FileHandling.student;

import learn.java.Day12.Library.Book;
import learn.java.Day12.Library.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class HandleStudentFile {

    public static HashMap<Integer, Student> read() {
        HashMap<Integer, Student> studentHashmap = new HashMap<>();

        try {
            File file = new File("files/student.csv");
            Scanner dataReader = new Scanner(file);

            while (dataReader.hasNextLine()) {
                String line = dataReader.nextLine();
                if (!line.trim().isEmpty()) {
                    String[] studentInfo = line.split(",");
                    Integer id = Integer.parseInt(studentInfo[0]);
                    String name = studentInfo[1];

                    Student student = new Student(id, name);

                    studentHashmap.put(student.getId(), student);
                }
            }
            dataReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("error occurred! Cannot read student.csv ");
            e.printStackTrace();
        }

        return studentHashmap;
    }

    public static void append(Student student) {
        String fileName = "files/student.csv";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            File file = new File(fileName);

            if (file.exists() && file.length() > 0) {
                fileWriter.write(System.lineSeparator());
            }

            String data = student.getId() + "," +
                    student.getName();

            fileWriter.write(data);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error while creating student. Please try again.");
            e.printStackTrace();
        }
    }
}
