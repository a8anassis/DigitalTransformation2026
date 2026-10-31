package gr.aueb.dt.ch5;

/**
 * Calculate the factorial n! with
 * a method.
 */
public class FactorialApp {

    public static void main(String[] args) {

    }

    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;    // result = result * i
        }

        return result;
    }

}
