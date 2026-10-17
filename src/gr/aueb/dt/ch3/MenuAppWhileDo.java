package gr.aueb.dt.ch3;

import java.util.Scanner;

/**
 * Displays a menu with option.
 * Enforces that the menu will be displayed
 * at least once.
 */
public class MenuAppWhileDo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Insert a product");
            System.out.println("2. Remove a product");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            if (choice == 3) {
                break;
            }
        }

        System.out.println("Thank you for using our program.");
    }
}
