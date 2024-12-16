package arithmetic.basic;

import java.util.List;

/**
 * arithmetic.basic.Multiplication class contains methods to multiply two numbers, an array of numbers and a list of numbers.
 */
public class Multiplication {
    /**
     * Multiplies two numbers.
     * @param num1 first number
     * @param num2 second number
     * @return product of two numbers
     */
    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }
    /**
     * Multiplies an array of numbers.
     * @param arr array of numbers
     * @return product of numbers in the array
     */
    public static float multiply(float[] arr) {
        float result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result *= arr[i];
        }
        return result;
    }
    /**
     * Multiplies a list of numbers.
     * @param list list of numbers
     * @return product of numbers in the list
     */
    public static float multiply(List<Float> list) {
        float result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result *= list.get(i);
        }
        return result;
    }
}
