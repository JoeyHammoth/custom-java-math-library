package geometry.formula;

/** Class for three-dimensional geometry calculations */
public class ThreeDimensional {
    /** Calculate the volume of a cube
     * @param side The length of a side of the cube
     * @return The volume of the cube
     */
    public static float cubeVolume(float side) {
        return side * side * side;
    }
    /** Calculate the surface area of a cube
     * @param side The length of a side of the cube
     * @return The surface area of the cube
     */
    public static float cubeSurfaceArea(float side) {
        return 6 * side * side;
    }
    /** Calculate the volume of a cuboid
     * @param length The length of the cuboid
     * @param width The width of the cuboid
     * @param height The height of the cuboid
     * @return The volume of the cuboid
     */
    public static float cuboidVolume(float length, float width, float height) {
        return length * width * height;
    }
    /** Calculate the surface area of a cuboid
     * @param length The length of the cuboid
     * @param width The width of the cuboid
     * @param height The height of the cuboid
     * @return The surface area of the cuboid
     */
    public static float cuboidSurfaceArea(float length, float width, float height) {
        return 2 * (length * width + width * height + height * length);
    }
    /** Calculate the volume of a sphere
     * @param radius The radius of the sphere
     * @return The volume of the sphere
     */
    public static float sphereVolume(float radius) {
        return (4 / 3) * (float) Math.PI * radius * radius * radius;
    }
    /** Calculate the surface area of a sphere
     * @param radius The radius of the sphere
     * @return The surface area of the sphere
     */
    public static float sphereSurfaceArea(float radius) {
        return 4 * (float) Math.PI * radius * radius;
    }
    /** Calculate the volume of a cylinder
     * @param radius The radius of the cylinder
     * @param height The height of the cylinder
     * @return The volume of the cylinder
     */
    public static float cylinderVolume(float radius, float height) {
        return (float) Math.PI * radius * radius * height;
    }
    /** Calculate the surface area of a cylinder
     * @param radius The radius of the cylinder
     * @param height The height of the cylinder
     * @return The surface area of the cylinder
     */
    public static float cylinderSurfaceArea(float radius, float height) {
        return 2 * (float) Math.PI * radius * (radius + height);
    }
    /** Calculate the volume of a cone
     * @param radius The radius of the cone
     * @param height The height of the cone
     * @return The volume of the cone
     */
    public static float coneVolume(float radius, float height) {
        return (float) Math.PI * radius * radius * height / 3;
    }
    /** Calculate the surface area of a cone
     * @param radius The radius of the cone
     * @param height The height of the cone
     * @return The surface area of the cone
     */
    public static float coneSurfaceArea(float radius, float height) {
        return (float) Math.PI * radius * (radius + (float) Math.sqrt(radius * radius + height * height));
    }
    /** Calculate the volume of a pyramid
     * @param baseArea The area of the base of the pyramid
     * @param height The height of the pyramid
     * @return The volume of the pyramid
     */
    public static float pyramidVolume(float baseArea, float height) {
        return baseArea * height / 3;
    }
    /** Calculate the surface area of a pyramid
     * @param baseArea The area of the base of the pyramid
     * @param side The side length of the pyramid
     * @return The surface area of the pyramid
     */
    public static float pyramidSurfaceArea(float baseArea, float side) {
        return baseArea + 2 * side;
    }
    /** Calculate the volume of a tetrahedron
     * @param side The side length of the tetrahedron
     * @return The volume of the tetrahedron
     */
    public static float tetrahedronVolume(float side) {
        return (float) Math.sqrt(2) * side * side * side / 12;
    }
    /** Calculate the surface area of a tetrahedron
     * @param side The side length of the tetrahedron
     * @return The surface area of the tetrahedron
     */
    public static float tetrahedronSurfaceArea(float side) {
        return (float) Math.sqrt(3) * side * side;
    }
    /** Calculate the volume of a hexahedron
     * @param side The side length of the hexahedron
     * @return The volume of the hexahedron
     */
    public static float octahedronVolume(float side) {
        return (float) Math.sqrt(2) * side * side * side / 3;
    }
    /** Calculate the surface area of a hexahedron
     * @param side The side length of the hexahedron
     * @return The surface area of the hexahedron
     */
    public static float octahedronSurfaceArea(float side) {
        return 2 * (float) Math.sqrt(3) * side * side;
    }
    /** Calculate the volume of a dodecahedron
     * @param side The side length of the dodecahedron
     * @return The volume of the dodecahedron
     */
    public static float dodecahedronVolume(float side) {
        return (15 + 7 * (float) Math.sqrt(5)) * side * side * side / 4;
    }
    /** Calculate the surface area of a dodecahedron
     * @param side The side length of the dodecahedron
     * @return The surface area of the dodecahedron
     */
    public static float dodecahedronSurfaceArea(float side) {
        return 3 * (float) Math.sqrt(25 + 10 * Math.sqrt(5)) * side * side;
    }
    /** Calculate the volume of an icosahedron
     * @param side The side length of the icosahedron
     * @return The volume of the icosahedron
     */
    public static float icosahedronVolume(float side) {
        return (5 * (3 + (float) Math.sqrt(5)) * side * side * side) / 12;
    }
    /** Calculate the surface area of an icosahedron
     * @param side The side length of the icosahedron
     * @return The surface area of the icosahedron
     */
    public static float icosahedronSurfaceArea(float side) {
        return 5 * (3 + (float) Math.sqrt(5)) * side * side;
    }
    /** Calculate the volume of a parallelepiped
     * @param a The length of the first side of the parallelepiped
     * @param b The length of the second side of the parallelepiped
     * @param c The length of the third side of the parallelepiped
     * @return The volume of the parallelepiped
     */
    public static float ellipsoidVolume(float a, float b, float c) {
        return (4 / 3) * (float) Math.PI * a * b * c;
    }
    /** Calculate the surface area of a parallelepiped
     * @param a The length of the first side of the parallelepiped
     * @param b The length of the second side of the parallelepiped
     * @param c The length of the third side of the parallelepiped
     * @return The surface area of the parallelepiped
     */
    public static float ellipsoidSurfaceArea(float a, float b, float c) {
        float p = (float) Math.pow(a * b, 1.6);
        float q = (float) Math.pow(a * c, 1.6);
        float r = (float) Math.pow(b * c, 1.6);
        return 4 * (float) Math.PI * (p + q + r) / 3;
    }
    /** Calculate the volume of a torus
     * @param R The radius of the torus
     * @param r The radius of the cross-section of the torus
     * @return The volume of the torus
     */
    public static float torusVolume(float R, float r) {
        return 2 * (float) Math.PI * (float) Math.PI * R * r * r;
    }
    /** Calculate the surface area of a torus
     * @param R The radius of the torus
     * @param r The radius of the cross-section of the torus
     * @return The surface area of the torus
     */
    public static float torusSurfaceArea(float R, float r) {
        return 4 * (float) Math.PI * (float) Math.PI * R * r;
    }
    /** Calculate the volume of a frustum
     * @param R The radius of the base of the frustum
     * @param r The radius of the top of the frustum
     * @param height The height of the frustum
     * @return The volume of the frustum
     */
    public static float frustumVolume(float R, float r, float height) {
        return (float) Math.PI * height * (R * R + R * r + r * r) / 3;
    }
    /** Calculate the surface area of a frustum
     * @param R The radius of the base of the frustum
     * @param r The radius of the top of the frustum
     * @param height The height of the frustum
     * @return The surface area of the frustum
     */
    public static float frustumSurfaceArea(float R, float r, float height) {
        float l = (float) Math.sqrt(height * height + (R - r) * (R - r));
        return (float) Math.PI * (R + r) * l + (float) Math.PI * (R * R + r * r);
    }
    /** Calculate the volume of a pyramid frustum
     * @param baseArea1 The area of the base of the frustum
     * @param baseArea2 The area of the top of the frustum
     * @param height The height of the frustum
     * @return The volume of the frustum
     */
    public static float pyramidFrustumVolume(float baseArea1, float baseArea2, float height) {
        return (baseArea1 + baseArea2 + (float) Math.sqrt(baseArea1 * baseArea2)) * height / 3;
    }
    /** Calculate the surface area of a pyramid frustum
     * @param baseArea1 The area of the base of the frustum
     * @param baseArea2 The area of the top of the frustum
     * @param side The side length of the frustum
     * @return The surface area of the frustum
     */
    public static float pyramidFrustumSurfaceArea(float baseArea1, float baseArea2, float side) {
        return baseArea1 + baseArea2 + side;
    }
    /**
     * Calculate the volume of a prism
     * @param baseArea
     * @param height
     * @return
     */
    public static float prismVolume(float baseArea, float height) {
        return baseArea * height;
    }
    /** Calculate the surface area of a prism frustum
     * @param baseArea The area of the base of the frustum
     * @param side The side length of the frustum
     * @return The surface area of the frustum
     */
    public static float prismSurfaceArea(float baseArea, float side) {
        return 2 * baseArea + side;
    }
    /** Calculate the volume of a cylinder frustum
     * @param R1 The radius of the base of the frustum
     * @param R2 The radius of the top of the frustum
     * @param height The height of the frustum
     * @return The volume of the frustum
     */
    public static float cylinderFrustumVolume(float R1, float R2, float height) {
        return (float) Math.PI * height * (R1 * R1 + R1 * R2 + R2 * R2) / 3;
    }
    /** Calculate the surface area of a cylinder frustum
     * @param R1 The radius of the base of the frustum
     * @param R2 The radius of the top of the frustum
     * @param height The height of the frustum
     * @return The surface area of the frustum
     */
    public static float cylinderFrustumSurfaceArea(float R1, float R2, float height) {
        float l = (float) Math.sqrt(height * height + (R1 - R2) * (R1 - R2));
        return (float) Math.PI * (R1 + R2) * l + (float) Math.PI * (R1 * R1 + R2 * R2);
    }
    /** Calculate the volume of a cone frustum
     * @param R1 The radius of the base of the frustum
     * @param R2 The radius of the top of the frustum
     * @param height The height of the frustum
     * @return The volume of the frustum
     */
    public static float coneFrustumVolume(float R1, float R2, float height) {
        return (float) Math.PI * height * (R1 * R1 + R1 * R2 + R2 * R2) / 3;
    }
    /** Calculate the surface area of a cone frustum
     * @param R1 The radius of the base of the frustum
     * @param R2 The radius of the top of the frustum
     * @param height The height of the frustum
     * @return The surface area of the frustum
     */
    public static float coneFrustumSurfaceArea(float R1, float R2, float height) {
        float l = (float) Math.sqrt(height * height + (R1 - R2) * (R1 - R2));
        return (float) Math.PI * (R1 + R2) * l + (float) Math.PI * (R1 * R1 + R2 * R2);
    }
    /** Calculate the volume of an ellipsoid frustum
     * @param a1 The length of the first axis of the base of the frustum
     * @param b1 The length of the second axis of the base of the frustum
     * @param c1 The length of the third axis of the base of the frustum
     * @param a2 The length of the first axis of the top of the frustum
     * @param b2 The length of the second axis of the top of the frustum
     * @param c2 The length of the third axis of the top of the frustum
     * @return The volume of the frustum
     */
    public static float ellipsoidFrustumVolume(float a1, float b1, float c1, float a2, float b2, float c2) {
        return (4 / 3) * (float) Math.PI * (a1 * b1 * c1 + a2 * b2 * c2);
    }
    /** Calculate the surface area of an ellipsoid frustum
     * @param a1 The length of the first axis of the base of the frustum
     * @param b1 The length of the second axis of the base of the frustum
     * @param c1 The length of the third axis of the base of the frustum
     * @param a2 The length of the first axis of the top of the frustum
     * @param b2 The length of the second axis of the top of the frustum
     * @param c2 The length of the third axis of the top of the frustum
     * @return The surface area of the frustum
     */
    public static float ellipsoidFrustumSurfaceArea(float a1, float b1, float c1, float a2, float b2, float c2) {
        float p = (float) Math.pow(a1 * b1, 1.6);
        float q = (float) Math.pow(a1 * c1, 1.6);
        float r = (float) Math.pow(b1 * c1, 1.6);
        float s = (float) Math.pow(a2 * b2, 1.6);
        float t = (float) Math.pow(a2 * c2, 1.6);
        float u = (float) Math.pow(b2 * c2, 1.6);
        return 4 * (float) Math.PI * (p + q + r + s + t + u) / 3;
    }
    /** Calculate the volume of a torus frustum
     * @param R1 The radius of the base of the frustum
     * @param r1 The radius of the cross-section of the base of the frustum
     * @param R2 The radius of the top of the frustum
     * @param r2 The radius of the cross-section of the top of the frustum
     * @return The volume of the frustum
     */
    public static float torusFrustumVolume(float R1, float r1, float R2, float r2) {
        return (float) Math.PI * (R1 * R1 + R1 * R2 + R2 * R2) * (r1 * r1 + r1 * r2 + r2 * r2) / 3;
    }
    /** Calculate the surface area of a torus frustum
     * @param R1 The radius of the base of the frustum
     * @param r1 The radius of the cross-section of the base of the frustum
     * @param R2 The radius of the top of the frustum
     * @param r2 The radius of the cross-section of the top of the frustum
     * @return The surface area of the frustum
     */
    public static float torusFrustumSurfaceArea(float R1, float r1, float R2, float r2) {
        return 4 * (float) Math.PI * (R1 + R2) * (r1 + r2);
    }
    /** Calculate the volume of a prism frustum
     * @param baseArea1 The area of the base of the frustum
     * @param baseArea2 The area of the top of the frustum
     * @param height The height of the frustum
     * @return The volume of the frustum
     */
    public static float prismFrustumVolume(float baseArea1, float baseArea2, float height) {
        return (baseArea1 + baseArea2 + (float) Math.sqrt(baseArea1 * baseArea2)) * height / 3;
    }
    /** Calculate the surface area of a prism frustum
     * @param baseArea1 The area of the base of the frustum
     * @param baseArea2 The area of the top of the frustum
     * @param side The side length of the frustum
     * @return The surface area of the frustum
     */
    public static float prismFrustumSurfaceArea(float baseArea1, float baseArea2, float side) {
        return baseArea1 + baseArea2 + side;
    }

    /**
     * Calculate the volume of a frustum
     * @param baseArea1
     * @param baseArea2
     * @param height
     * @return
     */
    public static float pyramidFrustumFrustumVolume(float baseArea1, float baseArea2, float height) {
        return (baseArea1 + baseArea2 + (float) Math.sqrt(baseArea1 * baseArea2)) * height / 3;
    }
    /**
     * Calculate the surface area of a frustum
     * @param baseArea1
     * @param baseArea2
     * @param side
     * @return
     */
    public static float pyramidFrustumFrustumSurfaceArea(float baseArea1, float baseArea2, float side) {
        return baseArea1 + baseArea2 + side;
    }

    /**
     * Calculate the volume of a Cylinder Frustum
     * @param R1
     * @param R2
     * @param height
     * @return
     */
    public static float cylinderFrustumFrustumVolume(float R1, float R2, float height) {
        return (float) Math.PI * height * (R1 * R1 + R1 * R2 + R2 * R2) / 3;
    }
    /**
     * Calculate the surface area of a Cylinder Frustum
     * @param R1
     * @param R2
     * @param height
     * @return
     */
    public static float cylinderFrustumFrustumSurfaceArea(float R1, float R2, float height) {
        float l = (float) Math.sqrt(height * height + (R1 - R2) * (R1 - R2));
        return (float) Math.PI * (R1 + R2) * l + (float) Math.PI * (R1 * R1 + R2 * R2);
    }
    /**
     * Calculate the volume of a Cone Frustum
     * @param R1
     * @param R2
     * @param height
     * @return
     */
    public static float coneFrustumFrustumVolume(float R1, float R2, float height) {
        return (float) Math.PI * height * (R1 * R1 + R1 * R2 + R2 * R2) / 3;
    }
    /**
     * Calculate the surface area of a Cone Frustum
     * @param R1
     * @param R2
     * @param height
     * @return
     */
    public static float coneFrustumFrustumSurfaceArea(float R1, float R2, float height) {
        float l = (float) Math.sqrt(height * height + (R1 - R2) * (R1 - R2));
        return (float) Math.PI * (R1 + R2) * l + (float) Math.PI * (R1 * R1 + R2 * R2);
    }
    /**
     * Calculate the volume of an ellipsoid frustum
     * @param a1
     * @param b1
     * @param c1
     * @param a2
     * @param b2
     * @param c2
     * @return
     */
    public static float ellipsoidFrustumFrustumVolume(float a1, float b1, float c1, float a2, float b2, float c2) {
        return (4 / 3) * (float) Math.PI * (a1 * b1 * c1 + a2 * b2 * c2);
    }
    /**
     * Calculate the surface area of an ellipsoid frustum
     * @param a1
     * @param b1
     * @param c1
     * @param a2
     * @param b2
     * @param c2
     * @return
     */
    public static float ellipsoidFrustumFrustumSurfaceArea(float a1, float b1, float c1, float a2, float b2, float c2) {
        float p = (float) Math.pow(a1 * b1, 1.6);
        float q = (float) Math.pow(a1 * c1, 1.6);
        float r = (float) Math.pow(b1 * c1, 1.6);
        float s = (float) Math.pow(a2 * b2, 1.6);
        float t = (float) Math.pow(a2 * c2, 1.6);
        float u = (float) Math.pow(b2 * c2, 1.6);
        return 4 * (float) Math.PI * (p + q + r + s + t + u) / 3;
    }
    /**
     * Calculate the volume of a torus frustum
     * @param R1
     * @param r1
     * @param R2
     * @param r2
     * @return
     */
    public static float torusFrustumFrustumVolume(float R1, float r1, float R2, float r2) {
        return (float) Math.PI * (R1 * R1 + R1 * R2 + R2 * R2) * (r1 * r1 + r1 * r2 + r2 * r2) / 3;
    }
    /**
     * Calculate the surface area of a torus frustum
     * @param R1
     * @param r1
     * @param R2
     * @param r2
     * @return
     */
    public static float torusFrustumFrustumSurfaceArea(float R1, float r1, float R2, float r2) {
        return 4 * (float) Math.PI * (R1 + R2) * (r1 + r2);
    }
}
