package function.advanced;

import function.Element;
import function.Function;
import function.Type;
/**
 * Cos class extends Function class and represents the cosine function.
 */
public class Cos extends Function {
    public Cos(Element argument, char operation, float exponent) {
        super(Type.COS, operation, exponent, argument);
    }
}
