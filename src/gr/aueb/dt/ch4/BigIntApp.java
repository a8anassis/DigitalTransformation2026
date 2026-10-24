package gr.aueb.dt.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Calculates base^power with BigInteger
 * class that does not overflow.
 */
public class BigIntApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger base;
        BigInteger power;
        BigInteger result = BigInteger.ONE;

        System.out.println("Enter the base and power: ");
        base = sc.nextBigInteger();
        power = sc.nextBigInteger();

        for (int i = 1; i <= power.intValue(); i++) {
            result = result.multiply(base);
        }

        System.out.printf("Result: %d\n", result);



    }
}
