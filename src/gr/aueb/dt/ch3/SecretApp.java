package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user inserts int numbers in order
 * to guess the secret number.
 */
public class SecretApp {

    public static void main(String[] args) {

        // Declaration and initialization of the variables
        Scanner sc = new Scanner(System.in);
        final int SECRET = 17;
        int guess;

        // Input - Get the input
        System.out.println("Please enter your guess: ");
        guess = sc.nextInt();

        // Process the input data - validation
        if (guess == SECRET) {
            System.out.println("You guessed the secret!");
        } else  {
            System.out.println("You guessed the wrong guess!");
        }

        System.out.println("Thanks for playing!");
    }
}
