package linalg;

import java.util.List;

/**
 * linalg.matrix class contains methods to get and set elements of a matrix.
 */
public class Matrix {
    private float[][] matrix;
    private List<List<Float>> matrixList;
    private boolean type;
    public Matrix(float[][] matrix) {
        this.matrix = matrix;
        this.type = true;
    }
    public Matrix(List<List<Float>> matrixList) {
        this.matrixList = matrixList;
        this.type = false;
    }
    /**
     * Gets the type of the matrix.
     * @return type of the matrix
     */
    public boolean getType() {
        return type;
    }
    /**
     * Gets the matrix.
     * @return matrix
     */
    public float[][] getMatrix() {
        return matrix;
    }
    /**
     * Gets the matrix as a list.
     * @return matrix as a list
     */
    public List<List<Float>> getMatrixList() {
        return matrixList;
    }
    /**
     * Sets the matrix.
     * @param matrix matrix
     */
    public void setMatrix(float[][] matrix) {
        this.matrix = matrix;
    }
    /**
     * Sets the matrix as a list.
     * @param matrixList matrix as a list
     */
    public void setMatrixList(List<List<Float>> matrixList) {
        this.matrixList = matrixList;
    }
    /**
     * Gets the element of the matrix at the specified row and column.
     * @param i row
     * @param j column
     * @return element of the matrix at the specified row and column
     */
    public float getMatrixElement(int i, int j) {
        return matrix[i][j];
    }
    /**
     * Gets the element of the matrix as a list at the specified row and column.
     * @param i row
     * @param j column
     * @return element of the matrix as a list at the specified row and column
     */
    public float getMatrixListElement(int i, int j) {
        return matrixList.get(i).get(j);
    }
    /**
     * Sets the element of the matrix at the specified row and column.
     * @param i row
     * @param j column
     * @param value value to set
     */
    public void setMatrixElement(int i, int j, float value) {
        matrix[i][j] = value;
    }
    /**
     * Sets the element of the matrix as a list at the specified row and column.
     * @param i row
     * @param j column
     * @param value value to set
     */
    public void setMatrixListElement(int i, int j, float value) {
        matrixList.get(i).set(j, value);
    }
    /**
     * Gets the number of rows in the matrix.
     * @return number of rows in the matrix
     */
    public int getMatrixRows() {
        return matrix.length;
    }
    /**
     * Gets the number of columns in the matrix.
     * @return number of columns in the matrix
     */
    public int getMatrixColumns() {
        return matrix[0].length;
    }
}
