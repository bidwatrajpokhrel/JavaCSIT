package learn.java.Day3.Loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10");
        Integer number = scanner.nextInt();

        while (true) {
            if(number > 0 && number < 10){
                break;
            }

            System.out.print("Enter a number between 0 and 10.");

            number = scanner.nextInt();
        }
//        while (number < 1 || number > 9) {
//            System.out.print("Enter a number between 0 and 10.");
//
//            number = scanner.nextInt();
//        }
        System.out.println("Thanks :)");
    }
}
