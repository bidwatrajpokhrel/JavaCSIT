package learn.java.Day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome tp Bajar");
        System.out.println("Here are your options: \n"
                + "1. Buy Item \n"
                + "2. Sell Item \n"
                + "3. Edit Profile");
        System.out.print("Please choose an option: ");

        Integer itemNumber = scanner.nextInt();

        switch (itemNumber) {
            case 1:
                System.out.println("You have chose to buy an item.");
                break;
            case 2:
                System.out.println("You have chose to sell an item.");
                break;
            case 3:
            System.out.println("You have chose to edit your profile.");
            default:
                System.out.println("Number invalid.");

        }

//        if (itemNumber == 1) {
//            System.out.println("You have chose to buy an item.");
//        }
//        else if (itemNumber == 2) {
//            System.out.println("You have chose to sell an item.");
//        }
//        else if (itemNumber == 3) {
//            System.out.println("You have chose to edit your profile.");
//        }
//        else {
//            System.out.println("Number invalid.");
//        }


    }
}