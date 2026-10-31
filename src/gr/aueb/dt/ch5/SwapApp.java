package gr.aueb.dt.ch5;

/**
 * Swaps the given values.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a=%d, b=%d%n", a, b);

        swap(a, b);

        System.out.printf("a=%d, b=%d%n", a, b);
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
