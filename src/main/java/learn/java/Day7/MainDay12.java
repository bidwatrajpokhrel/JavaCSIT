package learn.java.Day7;

import java.util.Scanner;

public class MainDay12 {
    public static void main(String[] args) {
        student();
    }

    public static void student() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's GPA: ");
        Float gpa = scanner.nextFloat();


        try {
            Student student = new Student(name, gpa);
            student.printDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Please try again.");
            student();
        }
    }
}
