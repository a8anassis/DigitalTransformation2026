package gr.aueb.dt.ch5;

import java.util.Scanner;

/**
 * Calculate the factorial n! with
 * a method.
 */
public class FactorialApp {

    public static void main(String[] args) {

        // Declare and init variables
        Scanner input = new Scanner(System.in);
        int n;
        int result;

        // Get the input data
        System.out.print("Enter a number: ");
        n = input.nextInt();

        // Process
        result = facto(n);

        // Print the results
        System.out.println("The factorial of " + n + " is " + result);
    }

    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;    // result = result * i
        }

        return result;
    }

}
