package arithmetic.advanced;

/**
 * Logarithm class to calculate logarithms of different bases.
 */
public class Logarithm {
    /**
     * log method calculates the logarithm of a number to a given base.
     * @param base is the base of the logarithm.
     * @param number is the number to calculate the logarithm of.
     * @return the logarithm of the number to the given base.
     */
    public float log(float base, float number) {
        try {
            return ln(number) / ln(base);
        } catch (ArithmeticException e) {
            return Float.NaN;
        }
    }
    /**
     * ln method calculates the natural logarithm of a number.
     * @param number is the number to calculate the natural logarithm of.
     * @return the natural logarithm of the number.
     */
    public float ln(float number) {
        try {
            return (float) Math.log(number);
        } catch (ArithmeticException e) {
            return Float.NaN;
        }
    }
    /**
     * log10 method calculates the base 10 logarithm of a number.
     * @param number is the number to calculate the base 10 logarithm of.
     * @return the base 10 logarithm of the number.
     */
    public float log10(float number) {
        try {
            return (float) Math.log10(number);
        } catch (ArithmeticException e) {
            return Float.NaN;
        }
    }
    /**
     * log2 method calculates the base 2 logarithm of a number.
     * @param number is the number to calculate the base 2 logarithm of.
     * @return the base 2 logarithm of the number.
     */
    public float log2(float number) {
        try {
            return (float) (Math.log(number) / Math.log(2));
        } catch (ArithmeticException e) {
            return Float.NaN;
        }
    }
}
