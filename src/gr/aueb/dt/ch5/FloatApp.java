package gr.aueb.dt.ch5;

import java.util.Scanner;

/**
 * Just a demo for floating point numbers
 */
public class FloatApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float myFloat = 1.234f;
        double myDouble = 1.234;
        final double PI = 3.14;
        double myGrade;

        System.out.println("Enter grade (1-10");
        myGrade = sc.nextDouble();

        System.out.println("Grade" +  myGrade);

        System.out.printf("%.2f\n", myFloat);
        System.out.printf("%.3f\n", myDouble);
        System.out.printf("%f\n", PI);

        // +, -, *, /, %
        // Division by 0 gives Infinity
        // Division of floating points gives floating point
    }
}
