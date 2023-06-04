package learn.java.Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        addStudent("Sumit", 4.0f, List.of(Course.ARCHITECTURE, Course.DSA), students);
        addStudent("Arjun", 3.9f, List.of(Course.JAVA, Course.STATISTICS, Course.GRAPHICS), students);
        addStudent("Student1", 3.9f, List.of(Course.STATISTICS, Course.JAVA), students);
        addStudent("Student2", 3.5f, List.of(Course.ARCHITECTURE, Course.DSA), students);
        addStudent("Student3", 3.2f, List.of(Course.GRAPHICS, Course.FRONTEND), students);
        addStudent("Student4", 3.6f, List.of(Course.STATISTICS, Course.JAVA), students);
        addStudent("Student5", 2.9f, List.of(Course.DSA, Course.ARCHITECTURE), students);
        addStudent("Student6", 3.1f, List.of(Course.GRAPHICS, Course.FRONTEND), students);


        Student studentInSecondIndex = students.get(1);
        studentInSecondIndex.printDetails();
    }

    public static void addStudent(String name, Float gpa, List<Course> courses, List<Student> students) {
        Student student = new Student(name, gpa);
        student.addMultipleCourses(courses);

        students.add(student);
    }
}


