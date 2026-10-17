package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user repeatedly tries to find the secret.
 * The loop stops when finally the user finds the secret.
 */
public class SecretWithWhile {

    public static void main(String[] args) {

        // Declare and init the variables
        Scanner sc = new Scanner(System.in);
        final int SECRET = 12;
        int guess;

        //
        while (true) {
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();

            if (guess != SECRET) {
                System.out.println("Wrong guess, try again");
                continue;
            }

            System.out.println("Congratulations, you guessed it!");
            break;
        }
        System.out.println("Thanks for playing!");
    }
}
