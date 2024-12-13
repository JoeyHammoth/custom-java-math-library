package seqser;

/**
 * seqser.Harmonic.java
 * Purpose: To calculate the nth term and sum of an arithmetic sequence.
 *
 */
public class Harmonic {
    /**
     * sequence method calculates the nth term of an arithmetic sequence.
     * @param a is the first term of the sequence.
     * @param d is the common difference of the sequence.
     * @param n is the term number.
     * @return the nth term of the sequence.
     */
    public float sequence(float a, float d, int n) {
        return 1 / (a + (n - 1) * d);
    }
    /**
     * series method calculates the sum of the first n terms of an arithmetic series.
     * @param a is the first term of the series.
     * @param d is the common difference of the series.
     * @param n is the number of terms.
     * @return the sum of the first n terms of the series.
     */
    public float series(float a, float d, int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / (a + (i - 1) * d);
        }
        return sum;
    }
}
