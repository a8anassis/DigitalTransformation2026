package gr.aueb.dt.ch4;

import java.util.Scanner;

/**
 * We present to the use a menu, and we
 * ask the user to select an option and based on user's
 * option we provide a feedback
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        final int EXIT = 5;

        do {
            System.out.println("Select one of the following options:");
            System.out.println("1. Profile View");
            System.out.println("2. Profile Edit");
            System.out.println("3. Settings");
            System.out.println("4. Help / Support");
            System.out.println("5. Exit");

            choice = sc.nextInt();

//            switch (choice) {
//                case 1:
//                    System.out.println("Profile View");
//                    break;
//                case 2:
//                    System.out.println("Profile Edit");
//                    break;
//                case 3:
//                    System.out.println("Settings");
//                    break;
//                case 4:
//                    System.out.println("Help / Support");
//                    break;
//                case 5:
//                    System.out.println("Exit");
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//                    break;
//            }


            // Arrow Syntax, no break needed, >=Java14
            switch (choice) {
                case 1 -> System.out.println("Profile View");
                case 2 -> System.out.println("Profile Edit");
                case 3 -> System.out.println("Settings");
                case 4 -> System.out.println("Help / Support");
                case 5 -> System.out.println("Exit");
                default -> System.out.println("Invalid choice");
            }

        } while (choice != EXIT);
    }
}
