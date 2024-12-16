package geometry.formula;

/**
 * TwoDimensional class contains methods to calculate the area and perimeter of 2D shapes.
 */
public class TwoDimensional {
    /**
     * RectangleArea method calculates the area of a rectangle.
     * @param length
     * @param breadth
     * @return
     */
    public static float RectangleArea(float length, float breadth) {
        return length * breadth;
    }
    /**
     * RectanglePerimeter method calculates the perimeter of a rectangle.
     * @param length
     * @param breadth
     * @return
     */
    public static float RectanglePerimeter(float length, float breadth) {
        return 2 * (length + breadth);
    }
    /**
     * SquareArea method calculates the area of a square.
     * @param side
     * @return
     */
    public static float SquareArea(float side) {
        return side * side;
    }
    /**
     * SquarePerimeter method calculates the perimeter of a square.
     * @param side
     * @return
     */
    public static float SquarePerimeter(float side) {
        return 4 * side;
    }
    /**
     * CircleArea method calculates the area of a circle.
     * @param radius
     * @return
     */
    public static float CircleArea(float radius) {
        return (float) (Math.PI * radius * radius);
    }
    /**
     * CirclePerimeter method calculates the perimeter of a circle.
     * @param radius
     * @return
     */
    public static float CirclePerimeter(float radius) {
        return (float) (2 * Math.PI * radius);
    }
    /**
     * TriangleArea method calculates the area of a triangle.
     * @param base
     * @param height
     * @return
     */
    public static float TriangleArea(float base, float height) {
        return (base * height) / 2;
    }
    /**
     * TrianglePerimeter method calculates the perimeter of a triangle.
     * @param side1
     * @param side2
     * @param side3
     * @return
     */
    public static float TrianglePerimeter(float side1, float side2, float side3) {
        return side1 + side2 + side3;
    }
    /**
     * TrapezoidArea method calculates the area of a trapezoid.
     * @param base1
     * @param base2
     * @param height
     * @return
     */
    public static float TrapezoidArea(float base1, float base2, float height) {
        return ((base1 + base2) * height) / 2;
    }
    /**
     * TrapezoidPerimeter method calculates the perimeter of a trapezoid.
     * @param side1
     * @param side2
     * @param side3
     * @param side4
     * @return
     */
    public static float TrapezoidPerimeter(float side1, float side2, float side3, float side4) {
        return side1 + side2 + side3 + side4;
    }
    /**
     * ParallelogramArea method calculates the area of a parallelogram.
     * @param base
     * @param height
     * @return
     */
    public static float ParallelogramArea(float base, float height) {
        return base * height;
    }
    /**
     * ParallelogramPerimeter method calculates the perimeter of a parallelogram.
     * @param side1
     * @param side2
     * @return
     */
    public static float ParallelogramPerimeter(float side1, float side2) {
        return 2 * (side1 + side2);
    }
    /**
     * EllipseArea method calculates the area of an ellipse.
     * @param majorAxis
     * @param minorAxis
     * @return
     */
    public static float EllipseArea(float majorAxis, float minorAxis) {
        return (float) (Math.PI * majorAxis * minorAxis);
    }
    /**
     * EllipsePerimeter method calculates the perimeter of an ellipse.
     * @param majorAxis
     * @param minorAxis
     * @return
     */
    public static float EllipsePerimeter(float majorAxis, float minorAxis) {
        return (float) (2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2));
    }
    /**
     * RhombusArea method calculates the area of a rhombus.
     * @param diagonal1
     * @param diagonal2
     * @return
     */
    public static float RhombusArea(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
    /**
     * RhombusPerimeter method calculates the perimeter of a rhombus.
     * @param side
     * @return
     */
    public static float RhombusPerimeter(float side) {
        return 4 * side;
    }
    /**
     * KiteArea method calculates the area of a kite.
     * @param diagonal1
     * @param diagonal2
     * @return
     */
    public static float KiteArea(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
    /**
     * KitePerimeter method calculates the perimeter of a kite.
     * @param side1
     * @param side2
     * @return
     */
    public static float KitePerimeter(float side1, float side2) {
        return 2 * (side1 + side2);
    }
    /**
     * SectorArea method calculates the area of a sector.
     * @param radius
     * @param angle
     * @return
     */
    public static float SectorArea(float radius, float angle) {
        return (float) (0.5 * radius * radius * angle);
    }
    /**
     * SegmentArea method calculates the area of a segment.
     * @param radius
     * @param height
     * @return
     */
    public static float SegmentArea(float radius, float height) {
        return (float) (radius * radius * (Math.asin(height / radius) - (height / radius) * Math.sqrt(1 -
                (height * height) / (radius * radius))));
    }
    /**
     * SegmentPerimeter method calculates the perimeter of a segment.
     * @param radius
     * @param height
     * @return
     */
    public static float SegmentPerimeter(float radius, float height) {
        return (float) (2 * radius * Math.asin(height / radius));
    }
    /**
     * AnnulusArea method calculates the area of an annulus.
     * @param outerRadius
     * @param innerRadius
     * @return
     */
    public static float AnnulusArea(float outerRadius, float innerRadius) {
        return (float) (Math.PI * (outerRadius * outerRadius - innerRadius * innerRadius));
    }
    /**
     * AnnulusPerimeter method calculates the perimeter of an annulus.
     * @param outerRadius
     * @param innerRadius
     * @return
     */
    public static float AnnulusPerimeter(float outerRadius, float innerRadius) {
        return (float) (2 * Math.PI * (outerRadius + innerRadius));
    }
    /**
     * EllipticalSectorArea method calculates the area of an elliptical sector.
     * @param majorAxis
     * @param minorAxis
     * @param angle
     * @return
     */
    public static float EllipticalSectorArea(float majorAxis, float minorAxis, float angle) {
        return (float) (0.5 * majorAxis * minorAxis * angle);
    }
    /**
     * EllipticalSegmentArea method calculates the area of an elliptical segment.
     * @param majorAxis
     * @param minorAxis
     * @param height
     * @return
     */
    public static float EllipticalSegmentArea(float majorAxis, float minorAxis, float height) {
        return (float) (majorAxis * minorAxis * (Math.asin(height / minorAxis) - (height / minorAxis) *
                Math.sqrt(1 - (height * height) / (minorAxis * minorAxis))));
    }
    /**
     * EllipticalSegmentPerimeter method calculates the perimeter of an elliptical segment.
     * @param majorAxis
     * @param minorAxis
     * @param height
     * @return
     */
    public static float EllipticalSegmentPerimeter(float majorAxis, float minorAxis, float height) {
        return (float) (2 * minorAxis * Math.asin(height / minorAxis));
    }
    /**
     * EllipticalAnnulusArea method calculates the area of an elliptical annulus.
     * @param majorOuterAxis
     * @param minorOuterAxis
     * @param majorInnerAxis
     * @param minorInnerAxis
     * @return
     */
    public static float EllipticalAnnulusArea(float majorOuterAxis, float minorOuterAxis, float majorInnerAxis,
                                              float minorInnerAxis) {
        return (float) (Math.PI * (majorOuterAxis * minorOuterAxis - majorInnerAxis * minorInnerAxis));
    }
    /**
     * EllipticalAnnulusPerimeter method calculates the perimeter of an elliptical annulus.
     * @param majorOuterAxis
     * @param minorOuterAxis
     * @param majorInnerAxis
     * @param minorInnerAxis
     * @return
     */
    public static float EllipticalAnnulusPerimeter(float majorOuterAxis, float minorOuterAxis, float majorInnerAxis,
                                                   float minorInnerAxis) {
        return (float) (2 * Math.PI * Math.sqrt((majorOuterAxis * majorOuterAxis + minorOuterAxis *
                minorOuterAxis + majorInnerAxis * majorInnerAxis + minorInnerAxis * minorInnerAxis) / 2));
    }
    /**
     * RegularPolygonArea method calculates the area of a regular polygon.
     * @param side
     * @param sides
     * @return
     */
    public static float RegularPolygonArea(float side, int sides) {
        return (float) (0.25 * sides * side * side / Math.tan(Math.PI / sides));
    }
    /**
     * RegularPolygonPerimeter method calculates the perimeter of a regular polygon.
     * @param side
     * @param sides
     * @return
     */
    public static float RegularPolygonPerimeter(float side, int sides) {
        return side * sides;
    }
    /**
     * EquilateralTriangleArea method calculates the area of an equilateral triangle.
     * @param side
     * @return
     */
    public static float EquilateralTriangleArea(float side) {
        return (float) (Math.sqrt(3) / 4 * side * side);
    }
    /**
     * EquilateralTrianglePerimeter method calculates the perimeter of an equilateral triangle.
     * @param side
     * @return
     */
    public static float EquilateralTrianglePerimeter(float side) {
        return 3 * side;
    }
    /**
     * IsoscelesTriangleArea method calculates the area of an isosceles triangle.
     * @param base
     * @param height
     * @return
     */
    public static float IsoscelesTriangleArea(float base, float height) {
        return (base * height) / 2;
    }
    /**
     * IsoscelesTrianglePerimeter method calculates the perimeter of an isosceles triangle.
     * @param base
     * @param side
     * @return
     */
    public static float IsoscelesTrianglePerimeter(float base, float side) {
        return 2 * side + base;
    }
    /**
     * RightTriangleArea method calculates the area of a right triangle.
     * @param base
     * @param height
     * @return
     */
    public static float RightTriangleArea(float base, float height) {
        return (base * height) / 2;
    }
    /**
     * RightTrianglePerimeter method calculates the perimeter of a right triangle.
     * @param base
     * @param height
     * @param hypotenuse
     * @return
     */
    public static float RightTrianglePerimeter(float base, float height, float hypotenuse) {
        return base + height + hypotenuse;
    }
    /**
     * ScaleneTriangleArea method calculates the area of a scalene triangle.
     * @param side1
     * @param side2
     * @param side3
     * @return
     */
    public static float ScaleneTriangleArea(float side1, float side2, float side3) {
        float s = (side1 + side2 + side3) / 2;
        return (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    /**
     * ScaleneTrianglePerimeter method calculates the perimeter of a scalene triangle.
     * @param side1
     * @param side2
     * @param side3
     * @return
     */
    public static float ScaleneTrianglePerimeter(float side1, float side2, float side3) {
        return side1 + side2 + side3;
    }
    /**
     * QuadrilateralArea method calculates the area of a quadrilateral.
     * @param side1
     * @param side2
     * @param side3
     * @param side4
     * @param diagonal1
     * @param diagonal2
     * @return
     */
    public static float QuadrilateralArea(float side1, float side2, float side3, float side4, float diagonal1,
                                          float diagonal2) {
        float s = (side1 + side2 + side3 + side4) / 2;
        return (float) Math.sqrt((s - side1) * (s - side2) * (s - side3) * (s - side4) - 0.5 *
                (diagonal1 + diagonal2) * (diagonal1 - side1) * (diagonal1 - side2) * (diagonal1 - side3) *
                (diagonal1 - side4));
    }
    /**
     * QuadrilateralPerimeter method calculates the perimeter of a quadrilateral.
     * @param side1
     * @param side2
     * @param side3
     * @param side4
     * @return
     */
    public static float QuadrilateralPerimeter(float side1, float side2, float side3, float side4) {
        return side1 + side2 + side3 + side4;
    }
}
