package function;

/**
 * Element class is an abstract class that represents an element in the function.
 * It has three fields: type, exponent, and operation.
 * It has a constructor that takes three parameters: type, operation, and exponent.
 * It has three getter methods: getType, getOperation, and getExponent.
 */
public abstract class Element {
    private final Type type;
    private final float exponent;
    private final Operation operation;

    public Type getType() {
        return type;
    }
    public Operation getOperation() {
        return operation;
    }
    public float getExponent() {
        return exponent;
    }
    public Element(Type type, char operation, float exponent) {
        this.type = type;
        this.exponent = exponent;
        if (operation == '+') {
            this.operation = Operation.ADD;
        } else if (operation == '-') {
            this.operation = Operation.SUBTRACT;
        } else if (operation == '*') {
            this.operation = Operation.MULTIPLY;
        } else if (operation == '/') {
            this.operation = Operation.DIVIDE;
        } else {
            throw new IllegalArgumentException("Invalid operation");
        }
    }
}
