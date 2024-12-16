package function;
/**
 * Function class is an abstract class that represents a function in the function.
 * It has a field: argument.
 * It has a constructor that takes four parameters: type, operation, exponent, and argument.
 * It has a getter method: getArgument.
 */
public abstract class Function extends Element {
    private final Element argument;
    public Element getArgument() {
        return argument;
    }
    public Function(Type type, char operation, float exponent, Element argument) {
        super(type, operation, exponent);
        this.argument = argument;
    }
}
