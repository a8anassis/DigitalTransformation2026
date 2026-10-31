package gr.aueb.dt.ch5;

import java.util.Scanner;

/**
 * The user inserts three floating-point numbers
 * that represent the three sides of a triangle and
 * the program decides whether the triangle is right.
 *
 * The expression for deciding is a^2 = b^2 + c^2
 */
public class RightTriangle {

    public static void main(String[] args) {

        // Declaration and initialization of variables
        Scanner input = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;
        final double EPSILON = 0.000005;

        // Data Input and binding
        System.out.println("Please enter the three sides of the triangle");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // Process
        isRight = Math.abs(a*a - b*b - c*c) <= EPSILON;

        System.out.println("The area of the triangle is " + (isRight ? "right" : "wrong"));
    }
}
