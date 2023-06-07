package learn.java.Day7;

import java.util.List;

public class MainDay9 {

    public static void main(String[] args) {
        Student student = new Student("Sumit", 4.0f);

        student.addCourse(Course.STATISTICS);

        student.addCourse(List.of(Course.DSA, Course.FRONTEND));

        System.out.println(student.getCourses());
    }

}
