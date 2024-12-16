package arithmetic.advanced;

import java.util.List;

/**
 * arithmetic.advanced.Exponent class contains methods to calculate the exponent of a number.
 */
public class Exponent {
    /**
     * exponent method calculates the exponent of a number.
     * @param base the base number.
     * @param power the power number.
     * @return the exponent of the number.
     */
    public static float exponent(float base, float power) {
        return (float) Math.pow(base, power);
    }
    /**
     * exponent method calculates the exponent of a number.
     * @param arr the array of numbers.
     * @return the exponent of the numbers.
     */
    public static float exponent(float[] arr) {
        float result = 1;
        for (float i : arr) {
            result *= i;
        }
        return result;
    }
    /**
     * exponent method calculates the exponent of a number.
     * @param list the list of numbers.
     * @return the exponent of the numbers.
     */
    public static float exponent(List<Float> list) {
        float result = 1;
        for (float i : list) {
            result *= i;
        }
        return result;
    }
}
