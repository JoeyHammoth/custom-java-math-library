package geometry;

/**
 * Coordinate class represents a point in 2D space.
 * It has two fields x and y representing the x and y coordinates of the point.
 * It has a constructor that takes x and y as arguments and initializes the fields.
 * It has two getter methods getX() and getY() that return the x and y coordinates respectively.
 */
public class Coordinate {
    private float x;
    private float y;
    public Coordinate(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
}
