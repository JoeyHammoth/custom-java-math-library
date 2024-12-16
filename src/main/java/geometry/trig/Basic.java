package geometry.trig;

/**
 * Basic trigonometric functions.
 */
public class Basic {
    /**
     * Returns the sine of the specified angle.
     * @param x
     * @return
     */
    public static double sin(double x) {
        return Math.sin(x);
    }
    /**
     * Returns the cosine of the specified angle.
     * @param x
     * @return
     */
    public static double cos(double x) {
        return Math.cos(x);
    }
    /**
     * Returns the tangent of the specified angle.
     * @param x
     * @return
     */
    public static double tan(double x) {
        return Math.tan(x);
    }
    /**
     * Returns the cosecant of the specified angle.
     * @param x
     * @return
     */
    public static double csc(double x) {
        return 1 / Math.sin(x);
    }
   /**
     * Returns the secant of the specified angle.
     * @param x
     * @return
     */
    public static double sec(double x) {
        return 1 / Math.cos(x);
    }
    /**
     * Returns the cotangent of the specified angle.
     * @param x
     * @return
     */
    public static double cot(double x) {
        return 1 / Math.tan(x);
    }
    /**
     * Returns the arcsine of the specified angle.
     * @param x
     * @return
     */
    public static double arcsin(double x) {
        return Math.asin(x);
    }
    /**
     * Returns the arccosine of the specified angle.
     * @param x
     * @return
     */
    public static double arccos(double x) {
        return Math.acos(x);
    }
    /**
     * Returns the arctangent of the specified angle.
     * @param x
     * @return
     */
    public static double arctan(double x) {
        return Math.atan(x);
    }
    /**
     * Returns the arccosecant of the specified angle.
     * @param x
     * @return
     */
    public static double arccsc(double x) {
        return Math.asin(1 / x);
    }
    /**
     * Returns the arcsecant of the specified angle.
     * @param x
     * @return
     */
    public static double arcsec(double x) {
        return Math.acos(1 / x);
    }
    /**
     * Returns the arccotangent of the specified angle.
     * @param x
     * @return
     */
    public static double arccot(double x) {
        return Math.atan(1 / x);
    }
    public static double convertToRadians(double x) {
        return Math.toRadians(x);
    }
    public static double convertToDegrees(double x) {
        return Math.toDegrees(x);
    }
}
