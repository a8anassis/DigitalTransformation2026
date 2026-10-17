package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * Counts the number of digits of an int that the user provides.
 * It also provides the sum of the digits, computed in the same loop.
 * For instance, if the number was 123, then the digits count should be 3
 * and the sum of the digits should be 6.
 *
 * Test cases:
 * 1. Input: 123 -> Output: 3 digits, sum 6
 * 2. Input: 45678 -> Output: 5 digits, sum 30
 *
 * Design of the solution:
 * 1. Read the int from the user and keep a working copy of it,
 *    so the original input is available for the final message.
 * 2. Start with a digits counter and a digits sum, both equal to 0.
 * 3. Repeat: take the last digit of the working copy (remainder of the
 *    division by 10) and add it to the sum, remove that digit from the
 *    working copy by integer division by 10 and increase the counter by 1.
 * 4. Stop when the working copy becomes 0, which means that all the
 *    digits have been removed.
 * 5. Print the counter and the sum.
 *
 * Trace for 123:
 * 123 -> digit 3, sum 3, number 12, count 1
 * 12 -> digit 2, sum 5, number 1, count 2
 * 1 -> digit 1, sum 6, number 0, count 3
 */
public class DigitsCount {

    public static void main(String[] args) {
        // 1. Declaration and initialization of variables
        Scanner in = new Scanner(System.in);
        int inputNumber = 0;
        int number = 0;
        int digitsCount = 0;
        int digitsSum = 0;
        int digit = 0;

        // 2. Prompt the user and get the input
        System.out.print("Please insert an integer: ");
        inputNumber = in.nextInt();

        // 3. Process the data (iterative solution)
        number = inputNumber;
        do {

            // digits' sum
            digit = number % 10;
            digitsSum += digit;

            // digits' count
            number /= 10;
            digitsCount++;
        } while (number != 0);

        // 4. Print the result
        System.out.printf("The number %d has %d digits and the sum of its digits is %d",
                inputNumber, digitsCount, digitsSum);
    }
}
