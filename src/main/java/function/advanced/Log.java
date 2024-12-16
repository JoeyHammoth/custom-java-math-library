package function.advanced;

import function.Element;
import function.Function;
import function.Type;
/**
 * Log class extends Function class and represents the logarithm function.
 */
public class Log extends Function {
    private final Element base;
    public Log(Element base, Element arg, char operation, float exponent) {
        super(Type.LOG, operation, exponent, arg);
        this.base = base;
    }
    public Element getBase() {
        return base;
    }
}
