package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * Displays a menu with option.
 */
public class DoMenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Insert a product");
            System.out.println("2. Remove a product");
            System.out.println("3. Exit");
            choice = sc.nextInt();
        } while (choice != 3);

        System.out.println("Thank you for using our app!");
    }
}
