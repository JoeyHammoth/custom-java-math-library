package geometry;

/**
 * A class to represent a 3D coordinate.
 */
public class ThreeDimCoordinate extends Coordinate {
    private float z;

    public ThreeDimCoordinate(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
}
