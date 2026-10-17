package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * Counts the number of digits of an int that the user provides.
 * For instance, if the number was 123, then the output should be 3.
 *
 * Test cases:
 * 1. Input: 123 -> Output: 3
 * 2. Input: 45678 -> Output: 5
 *
 * Design of the solution:
 * 1. Read the int from the user and keep a working copy of it,
 *    so the original input is available for the final message.
 * 2. Start with a digits counter equal to 0.
 * 3. Repeat: remove the last digit of the working copy by integer
 *    division by 10 and increase the counter by 1.
 * 4. Stop when the working copy becomes 0, which means that all the
 *    digits have been removed.
 * 5. Print the counter.
 *
 * Trace for 123: 123 -> 12 (count 1) -> 1 (count 2) -> 0 (count 3).
 */
public class DigitsCount {

    public static void main(String[] args) {
        // 1. Declaration and initialization of variables
        Scanner in = new Scanner(System.in);
        int inputNumber = 0;
        int number = 0;
        int digitsCount = 0;

        // 2. Prompt the user and get the input
        System.out.print("Please insert an integer: ");
        inputNumber = in.nextInt();

        // 3. Process the data (iterative solution)
        number = inputNumber;
        do {
            number /= 10;
            digitsCount++;
        } while (number != 0);

        // 4. Print the result
        System.out.printf("The number %d has %d digits", inputNumber, digitsCount);
    }
}
