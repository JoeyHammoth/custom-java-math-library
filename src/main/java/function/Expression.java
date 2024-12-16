package function;

import function.advanced.Cos;
import function.advanced.Log;
import function.advanced.Sin;
import function.basic.Constant;
import function.basic.Variable;

import java.util.ArrayList;
import java.util.List;
/**
 * Expression class represents an expression in the function.
 * It has four fields: elements, constants, variables, trig, and logs.
 * It has a constructor that takes a list of elements as a parameter.
 * It has a getter method: getElements.
 * It has a method categorize that categorizes the elements into constants, variables, trig, and logs.
 */
public class Expression {
    private final List<Element> elements;
    private List<Element> constants = new ArrayList<>();
    private List<Element> variables = new ArrayList<>();
    private List<Element> trig = new ArrayList<>();
    private List<Element> logs = new ArrayList<>();
    public Expression(List<Element> elements) {
        this.elements = elements;
    }
    public List<Element> getElements() {
        return elements;
    }
    /**
     * Categorizes the elements into constants, variables, trig, and logs.
     */
    public void categorize() {
        for (Element element : elements) {
            if (element instanceof Constant) {
                constants.add(element);
            } else if (element instanceof Variable) {
                variables.add(element);
            } else if (element instanceof Sin || element instanceof Cos) {
                trig.add(element);
            } else if (element instanceof Log) {
                logs.add(element);
            }
        }
    }
}
