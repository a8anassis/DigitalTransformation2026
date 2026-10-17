package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user enters an int and the program
 * calculates the factorial of n
 *
 * For example the factorial of 5 is denoted
 * be 5! = 1 * 2 * 3 * 4 * 5
 */
public class Factorial {

    public static void main(String[] args) {

        // Variable declaration and init
        Scanner sc = new Scanner(System.in);
        int inputNumber = 0;
        int facto = 1;
        int i = 1;

        // Get input
        System.out.println("Enter a number: ");
        inputNumber = sc.nextInt();

        // Process
        while(i <=  inputNumber){
            facto *= i;
            i++;
        }

        // Print the results
        System.out.println("Factorial is: " + facto);
    }
}
