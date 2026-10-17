package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user enters two integers, assume base, power
 * and the program calculates the power of
 * base ^ power
 */
public class PowerApp {

    public static void main(String[] args) {

        // Declare and initialize the variables
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Get the input and bind the input to variables
        System.out.print("Please enter base and power: ");
        base = sc.nextInt();
        power = sc.nextInt();

        // Process the input with expression or iterative work
        while (i <= power) {
            result *= base;     // result = result * base
            i++;
        }

        // Provide the output
        System.out.println("Result is: " + result);
    }

}
