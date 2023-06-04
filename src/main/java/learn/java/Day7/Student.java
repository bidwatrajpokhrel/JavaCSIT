package learn.java.Day7;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static Integer studentCount = 0;

    Student(String name, Float gpa) {
        this.setName(name);
        this.setGpa(gpa);
        this.id = ++studentCount;
    }

    private Float gpa;

    private String name;

    private Integer id;

    private Boolean passing;

    private List<Course> courses = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getGpa() {
        return this.gpa;
    }

    public void setGpa(Float gpa) {
        if(gpa > 4.0 || gpa < 0.0) {
            System.out.println("Invalid GPA");
        }
        this.gpa = gpa;
        this.passing = this.gpa > Constants.PASSING_GPA;
    }

    public Boolean getPassing() {
        return this.passing;
    }

    public Integer getId() {
        return this.id;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void addMultipleCourses(List<Course> courses) {
        this.courses.addAll(courses);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void printDetails() {
        String details = "ID: " + this.id + "\n"
                + "Name: " + this.name + "\n"
                + "GPA: " + this.gpa + "\n"
                + "Passing: " + this.passing + "\n"
                + "Courses: " + this.courses;

        System.out.println(details);
    }

    public static Integer getStudentCount() {
        return studentCount;
    }
}
