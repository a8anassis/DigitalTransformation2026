package gr.aueb.dt.ch5;

import java.util.Scanner;

/**
 * Calculate the power of an int with
 * a method that returns the base raised
 * int a power, base^power.
 *
 * In the main method the user inserts two ints,
 * the base and the power, then the power method
 * is invoked and then the user gets feedback.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Enter the number of factors you want to enter:");
        base = sc.nextInt();
        System.out.println("Enter the power you want to enter:");
        power = sc.nextInt();

        result = power(base, power);

        System.out.println("The factorial of " + base + " is " + result);
    }

    public static int power(int base, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * i;
        }

        return result;
    }


}
