package gr.aueb.dt.ch4;

/**
 * Use the for control structure
 * to the following cases
 */
public class StarsApp {

    public static void main(String[] args) {

        // Print ten horizontal stars
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        // Print ten vertical stars
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        // Print 10 rows with 10 stars in each row
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // Print stars in an increasing order for 10 rows starting with one,
        // So, one star - 1st row, two stars - second row, etc
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // Print stars in a decreasing order starting for 10 rows,
        // So, ten star - 1st row, nine stars - second row, etc
        for (int i = 1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
