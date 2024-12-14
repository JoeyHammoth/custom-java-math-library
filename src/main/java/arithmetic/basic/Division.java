package arithmetic.basic;

import java.util.List;

/**
 * arithmetic.basic.Division class contains methods to divide two numbers, an array of numbers and a list of numbers.
 */
public class Division {
    /**
     * Divides two numbers.
     * @param num1 first number
     * @param num2 second number
     * @return quotient of two numbers
     */
    public float divide(float num1, float num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("arithmetic.basic.Division by zero is not allowed.");
            return 0;
        }
    }
    /**
     * Divides an array of numbers.
     * @param arr array of numbers
     * @return quotient of numbers in the array
     */
    public float divide(float[] arr) {
        float result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            try {
                result /= arr[i];
            } catch (ArithmeticException e) {
                System.out.println("arithmetic.basic.Division by zero is not allowed.");
                return 0;
            }
        }
        return result;
    }
    /**
     * Divides a list of numbers.
     * @param list list of numbers
     * @return quotient of numbers in the list
     */
    public float divide(List<Float> list) {
        float result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            try {
                result /= list.get(i);
            } catch (ArithmeticException e) {
                System.out.println("arithmetic.basic.Division by zero is not allowed.");
                return 0;
            }
        }
        return result;
    }
}
