package function.advanced;

import function.Element;
import function.Function;
import function.Type;
/**
 * Cos class extends Function class and represents the cosine function.
 */
public class Sin extends Function {
    public Sin(Element argument, char operation, float exponent) {
        super(Type.SIN, operation, exponent, argument);
    }
}
