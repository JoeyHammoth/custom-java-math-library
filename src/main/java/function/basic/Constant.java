package function.basic;

import function.Element;
import function.Type;

/**
 * Represents a constant value in a function.
 */
public class Constant extends Element {
    private final float value;
    public Constant(float value, char operation) {
        super(Type.CONSTANT, operation, 1);
        this.value = value;
    }
    public Constant(float value, char operation, float exponent) {
        super(Type.CONSTANT, operation, exponent);
        this.value = value;
    }
    public float getValue() {
        return value;
    }
}
