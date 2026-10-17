package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * The user enters two integers and the
 * program calculates the minimum of two integers.
 */
public class MinApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int min;

        System.out.println("Please enter the first and second number: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

//        if (num1 > num2) {
//            min = num2;
//        } else {
//            min = num1;
//        }

        min = num1 < num2 ? num1 : num2;

    }
}
