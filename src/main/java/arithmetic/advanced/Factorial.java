package arithmetic.advanced;

/**
 * arithmetic.advanced.Factorial class contains two methods: factorial and factorialSum.
 * The factorial method calculates the factorial of a number.
 * The factorialSum method calculates the sum of the factorials of an array of numbers.
 */
public class Factorial {
    /**
     * factorial method calculates the factorial of a number.
     * @param n the number.
     * @return the factorial of the number.
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    /**
     * factorialSum method calculates the sum of the factorials of an array of numbers.
     * @param arr the array of numbers.
     * @return the sum of the factorials of the numbers.
     */
    public int factorialSum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += factorial(i);
        }
        return result;
    }
}
