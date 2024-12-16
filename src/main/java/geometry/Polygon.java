package geometry;

/**
 * Represents a polygon with a given number of sides and side length.
 */
public class Polygon {
    private int sides;
    private double sideLength;

    /**
     * Constructs a polygon with the given number of sides and side length.
     * @param sides the number of sides
     * @param sideLength the length of each side
     */
    public Polygon(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    /**
     * Returns the number of sides of the polygon.
     * @return the number of sides
     */
    public double getPerimeter() {
        return sides * sideLength;
    }

    public double getArea() {
        return (sides * sideLength * sideLength) / (4 * Math.tan(Math.PI / sides));
    }
    /**
     * Returns the length of each side of the polygon.
     * @return the length of each side
     */
    public int getSides() {
        return sides;
    }
}
