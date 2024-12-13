package combinatorics;

import arithmetic.advanced.Factorial;

/**
 * combinatorics.Basic class contains basic arithmetic operations like permutation and combination.
 * It uses Factorial class to calculate factorial of a number.
 */
public class Basic {
    /**
     * permutation method calculates the permutation of n and r.
     * @param n is the total number of items.
     * @param r is the number of items to choose.
     * @return the permutation of n and r.
     */
    public int permutation(int n, int r) {
        Factorial factorial = new Factorial();
        int numerator = factorial.factorial(n);
        int denominator = factorial.factorial(n - r);
        return numerator / denominator;
    }
    /**
     * combination method calculates the combination of n and r.
     * @param n is the total number of items.
     * @param r is the number of items to choose.
     * @return the combination of n and r.
     */
    public int combination(int n, int r) {
        Factorial factorial = new Factorial();
        int numerator = factorial.factorial(n);
        int denominator = factorial.factorial(r) * factorial.factorial(n - r);
        return numerator / denominator;
    }
}
