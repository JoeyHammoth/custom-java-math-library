package seqser;

/**
 * seqser.Geometric class to calculate the sequence and series of a geometric progression.
 */
public class Geometric {
    /**
     * sequence method calculates the nth term of a geometric sequence.
     * @param a is the first term of the sequence.
     * @param r is the common ratio of the sequence.
     * @param n is the term number.
     * @return the nth term of the sequence.
     */
    public float sequence(float a, float r, int n) {
        return a * (float) Math.pow(r, n - 1);
    }
    /**
     * series method calculates the sum of the first n terms of a geometric series.
     * @param a is the first term of the series.
     * @param r is the common ratio of the series.
     * @param n is the number of terms.
     * @return the sum of the first n terms of the series.
     */
    public float series(float a, float r, int n) {
        return a * (1 - (float) Math.pow(r, n)) / (1 - r);
    }
    /**
     * seriesInfinity method calculates the sum of an infinite geometric series.
     * @param a is the first term of the series.
     * @param r is the common ratio of the series.
     * @return the sum of the infinite geometric series.
     */
    public float seriesInfinity(float a, float r) {
        return a / (1 - r);
    }
}
