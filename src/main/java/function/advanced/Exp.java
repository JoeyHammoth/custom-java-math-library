package function.advanced;

import function.Element;
import function.Function;
import function.Type;
/**
 * Cos class extends Function class and represents the cosine function.
 */
public class Exp extends Function {
    public Exp(char operation, float exponent, Element argument) {
        super(Type.EXP, operation, exponent, argument);
    }
}
