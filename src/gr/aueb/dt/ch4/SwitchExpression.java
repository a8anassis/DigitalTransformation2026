package gr.aueb.dt.ch4;

import java.util.Scanner;

/**
 * Grades Classifier. The user gives a grade
 * and the program classifies the grade into
 * grade ranges 1-4, 5-6, 7-8, 9-10
 */
public class SwitchExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade;
        char classification = ' ';

        System.out.println("Enter grade (1-10");
        grade = sc.nextInt();

//        switch (grade) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//                classification = 'F';
//                break;
//            case 5:
//            case 6:
//                classification = 'C';
//                break;
//            case 7:
//            case 8:
//                classification = 'B';
//                break;
//            case 9:
//            case 10:
//                classification = 'A';
//                break;
//            default:
//                classification = 'U';
//                break;
//        }

        classification = switch (grade) {
            case 1, 2, 3, 4 -> 'F';
            case 5, 6 -> 'C';
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> 'U';
        };

        System.out.println("The grade is classified as: " + classification);


    }
}
