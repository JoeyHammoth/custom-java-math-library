package function.basic;

import function.Element;
import function.Type;
/**
 * Represents a variable in a function.
 */
public class Variable extends Element {
    public Variable(char operation, float exponent) {
        super(Type.VARIABLE, operation, exponent);
    }
}
