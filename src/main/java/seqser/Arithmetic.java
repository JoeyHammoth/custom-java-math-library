package seqser;

/**
 * seqser.Arithmetic Sequence and Series
 */
public class Arithmetic {
    /**
     * sequence method calculates the nth term of an arithmetic sequence.
     * @param a is the first term of the sequence.
     * @param d is the common difference of the sequence.
     * @param n is the term number.
     * @return the nth term of the sequence.
     */
    public float sequence(float a, float d, int n) {
        return a + (n - 1) * d;
    }
    /**
     * series method calculates the sum of the first n terms of an arithmetic series.
     * @param a is the first term of the series.
     * @param d is the common difference of the series.
     * @param n is the number of terms.
     * @return the sum of the first n terms of the series.
     */
    public float series(float a, float d, int n) {
        return (float) n / 2 * (2 * a + (n - 1) * d);
    }
}
