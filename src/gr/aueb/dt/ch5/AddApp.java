package gr.aueb.dt.ch5;

/**
 * Calculates the sum of two ints by
 * using a method.
 */
public class AddApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;

        sum = add(num1, num2);        // invoke with real params

        System.out.println("The sum is " + sum);
    }

    public static int add(int a, int b) {   // we define formal params
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) return 0;   // we make a validation of the input data with state test
        return a / b;
    }
}
