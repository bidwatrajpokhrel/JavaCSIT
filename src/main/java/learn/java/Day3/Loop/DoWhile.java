package learn.java.Day3.Loop;

import learn.java.Day4.Teacher;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number;
        do {
            System.out.print("Enter a number between 0 and 10: ");
            number = scanner.nextInt();

        } while (number < 1 || number > 9);
        System.out.println("Thanks :)");

        // INFINITE LOOP
//        do {
//            System.out.print("Enter a number ");
//            Integer number = scanner.nextInt();
//        } while (true);
    }
}
