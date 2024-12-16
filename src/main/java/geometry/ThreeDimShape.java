package geometry;

/**
 * ThreeDimShape class represents a shape in 3D space.
 * It has a field coordinates that stores the coordinates of the shape.
 * It has a constructor that takes coordinates as arguments and initializes the field.
 * It has getter and setter methods for the coordinates field.
 */
public class ThreeDimShape {
    private ThreeDimCoordinate[] coordinates;
    public ThreeDimShape(ThreeDimCoordinate[] coordinates) {
        this.coordinates = coordinates;
    }
    public ThreeDimCoordinate[] getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(ThreeDimCoordinate[] coordinates) {
        this.coordinates = coordinates;
    }
}
