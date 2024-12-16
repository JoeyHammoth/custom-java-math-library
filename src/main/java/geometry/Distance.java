package geometry;

/**
 * Distance class contains static methods to calculate the distance between two points in 2D space.
 * It has methods to calculate Euclidean, Manhattan, Chebyshev, Minkowski, Hamming, Cosine, and Jaccard distances.
 */
public class Distance {
    /**
     * Euclidean method calculates the Euclidean distance between two points.
     * @param c1
     * @param c2
     * @return
     */
    public static float euclidean(Coordinate c1, Coordinate c2) {
        float xDiff = c1.getX() - c2.getX();
        float yDiff = c1.getY() - c2.getY();
        return (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Manhattan method calculates the Manhattan distance between two points.
     * @param c1
     * @param c2
     * @return
     */
    public static float manhattan(Coordinate c1, Coordinate c2) {
        float xDiff = c1.getX() - c2.getX();
        float yDiff = c1.getY() - c2.getY();
        return Math.abs(xDiff) + Math.abs(yDiff);
    }
    /**
     * Chebyshev method calculates the Chebyshev distance between two points.
     * @param c1
     * @param c2
     * @return
     */
    public static float chebyshev(Coordinate c1, Coordinate c2) {
        float xDiff = c1.getX() - c2.getX();
        float yDiff = c1.getY() - c2.getY();
        return Math.max(Math.abs(xDiff), Math.abs(yDiff));
    }
    /**
     * Minkowski method calculates the Minkowski distance between two points.
     * @param c1
     * @param c2
     * @param p
     * @return
     */
    public static float minkowski(Coordinate c1, Coordinate c2, float p) {
        float xDiff = c1.getX() - c2.getX();
        float yDiff = c1.getY() - c2.getY();
        return (float) Math.pow(Math.pow(Math.abs(xDiff), p) + Math.pow(Math.abs(yDiff), p), 1 / p);
    }
    /**
     * Hamming method calculates the Hamming distance between two points.
     * @param c1
     * @param c2
     * @return
     */
    public static float hamming(Coordinate c1, Coordinate c2) {
        return c1.getX() == c2.getX() && c1.getY() == c2.getY() ? 0 : 1;
    }
    /**
     * Cosine method calculates the Cosine distance between two points.
     * @param c1
     * @param c2
     * @return
     */
    public static float cosine(Coordinate c1, Coordinate c2) {
        float dotProduct = c1.getX() * c2.getX() + c1.getY() * c2.getY();
        float magnitude1 = (float) Math.sqrt(c1.getX() * c1.getX() + c1.getY() * c1.getY());
        float magnitude2 = (float) Math.sqrt(c2.getX() * c2.getX() + c2.getY() * c2.getY());
        return dotProduct / (magnitude1 * magnitude2);
    }
    /**
     * Jaccard method calculates the Jaccard distance between two points.
     * @param c1
     * @param c2
     * @return
     */
    public static float jaccard(Coordinate c1, Coordinate c2) {
        return 1 - cosine(c1, c2);
    }
}
