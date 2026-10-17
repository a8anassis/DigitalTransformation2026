package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * Allows user to repeatedly enter two integers in order
 * to perform a division. Should be aware of an
 * exit condition (for instance we exit when numerator is zero)
 * and also be aware that division by zero (if denominator is zero)
 * is not allowed.
 */
public class DivisionApp {

    public static void main(String[] args) {

        // Variables declaration and init
        Scanner sc = new Scanner(System.in);
        int numerator;
        int denominator;
        int result = 0;

        // Process with input, validation, process, output
        while (true) {
            System.out.print("Enter the numerator (0 for exit): ");
            numerator = sc.nextInt();

            if (numerator == 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter the denominator: ");
            denominator = sc.nextInt();

            if (denominator == 0) {
                System.out.println("Division by zero not allowed. Try again.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Your result is: " + result);
        }

        System.out.println("Thanks for playing!");
    }
}
