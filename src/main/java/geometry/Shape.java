package geometry;

/**
 * Shape class represents a shape in 2D space.
 * It has a field coordinates that stores the coordinates of the shape.
 * It has a constructor that takes coordinates as arguments and initializes the field.
 * It has getter and setter methods for the coordinates field.
 * It has methods to calculate the perimeter and area of the shape.
 */
public class Shape {
    private Coordinate[] coordinates;

    public Shape(Coordinate[] coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinate[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate[] coordinates) {
        this.coordinates = coordinates;
    }
    /**
     * perimeter method calculates the perimeter of the shape.
     * @return
     */
    public float perimeter() {
        float perimeter = 0;
        for (int i = 0; i < coordinates.length - 1; i++) {
            perimeter += Distance.euclidean(coordinates[i], coordinates[i + 1]);
        }
        perimeter += Distance.euclidean(coordinates[coordinates.length - 1], coordinates[0]);
        return perimeter;
    }
    /**
     * area method calculates the area of the shape.
     * @return
     */
    public float area() {
        float area = 0;
        for (int i = 0; i < coordinates.length - 1; i++) {
            area += coordinates[i].getX() * coordinates[i + 1].getY() - coordinates[i + 1].getX() * coordinates[i].getY();
        }
        area += coordinates[coordinates.length - 1].getX() * coordinates[0].getY() - coordinates[0].getX() * coordinates[coordinates.length - 1].getY();
        return Math.abs(area) / 2;
    }

    /**
     * isCoordInside method checks if a given coordinate is inside the shape.
     * @param coord
     * @return
     */
    public boolean isCoordInside(Coordinate coord) {
        int n = coordinates.length;
        int i, j;
        boolean c = false;
        for (i = 0, j = n - 1; i < n; j = i++) {
            if (((coordinates[i].getY() > coord.getY()) != (coordinates[j].getY() > coord.getY())) &&
                    (coord.getX() < (coordinates[j].getX() - coordinates[i].getX()) * (coord.getY() - coordinates[i].getY()) / (coordinates[j].getY() - coordinates[i].getY()) + coordinates[i].getX())) {
                c = !c;
            }
        }
        return c;
    }
}
