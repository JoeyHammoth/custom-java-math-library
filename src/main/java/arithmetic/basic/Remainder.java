package arithmetic.basic;

/**
 * arithmetic.basic.Remainder class contains a method to find the remainder of two numbers.
 */
public class Remainder {
    /**
     * Finds the remainder of two numbers.
     * @param num1 first number
     * @param num2 second number
     * @return remainder of two numbers
     */
    public float remainder(float num1, float num2) {
        try {
            return num1 % num2;
        } catch (ArithmeticException e) {
            System.out.println("arithmetic.basic.Remainder by zero is not allowed.");
            return 0;
        }
    }
}
