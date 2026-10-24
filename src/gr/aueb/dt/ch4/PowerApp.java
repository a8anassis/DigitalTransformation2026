package gr.aueb.dt.ch4;

import java.util.Scanner;

/**
 * The user inserts the base and power and the
 * program calculates and prints the pase^power.
 * For instance: 2^10 = 1024
 * Assume that the input is int.
 */
public class PowerApp {

    public static void main(String[] args) {

        // Declare and init the variables
        Scanner sc = new Scanner(System.in);
        int base;
        int power;
        int result = 1;

        // Get the input
        System.out.println("Enter the base and power: ");
        base = sc.nextInt();
        power = sc.nextInt();

        // Process
        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("%d^%d=%d\n", base, power, result);
    }
}
