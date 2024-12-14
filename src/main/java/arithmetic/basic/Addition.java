package arithmetic.basic;

import java.util.List;

/**
 * arithmetic.basic.Addition class contains methods to add two numbers, an array of numbers and a list of numbers.
 */
public class Addition {
    /**
     * Adds two numbers.
     * @param num1 first number
     * @param num2 second number
     * @return sum of two numbers
     */
    public float add(float num1, float num2) {
        return num1 + num2;
    }
    /**
     * Adds an array of numbers.
     * @param arr array of numbers
     * @return sum of numbers in the array
     */
    public float add(float[] arr) {
        float result = 0;
        for (float i : arr) {
            result += i;
        }
        return result;
    }
    /**
     * Adds a list of numbers.
     * @param list list of numbers
     * @return sum of numbers in the list
     */
    public float add(List<Float> list) {
        float result = 0;
        for (float i : list) {
            result += i;
        }
        return result;
    }
}
