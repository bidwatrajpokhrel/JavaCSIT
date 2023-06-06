package learn.java.Day7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        addStudent("                    Sumit Shrestha      ", 4.0f, List.of(Course.ARCHITECTURE, Course.DSA), students);
        addStudent("Arjun", 3.9f, List.of(Course.JAVA, Course.STATISTICS, Course.GRAPHICS), students);
        addStudent("Student1", 3.9f, List.of(Course.STATISTICS, Course.JAVA), students);
        addStudent("Student2", 3.5f, List.of(Course.ARCHITECTURE, Course.DSA), students);
        addStudent("Student3", 2.0f, List.of(Course.GRAPHICS, Course.FRONTEND), students);
        addStudent("Student4", 3.6f, List.of(Course.STATISTICS, Course.JAVA), students);
        addStudent("Student5", 1.8f, List.of(Course.DSA, Course.ARCHITECTURE), students);
        addStudent("Student6", 4.0f, List.of(Course.GRAPHICS, Course.FRONTEND), students);

//        System.out.println(Student.getStudentCount());
        searchStudent(1, students);

        HashSet<Course> coursesTakenByAllStudents = new HashSet<>();
        for (Student student : students) {
            List<Course> coursesTakenByOneStudent = student.getCourses();
            coursesTakenByAllStudents.addAll(coursesTakenByOneStudent);
        }

        System.out.println(coursesTakenByAllStudents);

        
        
    }

    public static void addStudent(String name, Float gpa, List<Course> courses, List<Student> students) {
        Student student = new Student(name, gpa);
        student.addMultipleCourses(courses);

        students.add(student);
    }
    
    public static Student searchStudent(Integer id, List<Student> students) {
        //        HashMap<Integer, Student> studentSearch = (HashMap) students.stream().collect(Collectors.toMap(student -> student.getId(), student -> student));

        HashMap<Integer, Student> studentSearch = new HashMap<>();
        for(Student student: students) {
            studentSearch.put(student.getId(), student);
        }

        Student studentWithId = studentSearch.get(id);
        studentWithId.printDetails();
        
        return studentWithId;
    }
}


