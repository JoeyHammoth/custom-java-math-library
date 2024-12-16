package arithmetic.basic;

import java.util.List;

/**
 * arithmetic.basic.Subtraction class contains methods to subtract two numbers, an array of numbers and a list of numbers.
 */
public class Subtraction {
    /**
     * Subtracts two numbers.
     * @param num1 first number
     * @param num2 second number
     * @return difference of two numbers
     */
    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }
    /**
     * Subtracts an array of numbers.
     * @param arr array of numbers
     * @return difference of numbers in the array
     */
    public static float subtract(float[] arr) {
        float result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result -= arr[i];
        }
        return result;
    }
    /**
     * Subtracts a list of numbers.
     * @param list list of numbers
     * @return difference of numbers in the list
     */
    public static float subtract(List<Float> list) {
        float result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result -= list.get(i);
        }
        return result;
    }
}
