package linalg.advanced;

import linalg.Matrix;

/**
 * Inverse class contains methods to check if a matrix is invertible and to find the inverse of a matrix.
 */
public class Inverse {
    Simplification simplification = new Simplification();
    Attributes attributes = new Attributes();
    /**
     * Checks if a matrix is invertible.
     * @param matrix matrix
     * @return true if matrix is invertible, false otherwise
     */
    public boolean isInvertible(Matrix matrix) {
        if (matrix.getMatrix().length != matrix.getMatrix()[0].length) {
            return false;
        }
        return attributes.getDeterminant(matrix).getMatrix()[0][0] != 0;
    }
    /**
     * Finds the inverse of a matrix.
     * @param matrix matrix
     * @return inverse of matrix
     */
    public Matrix getInverse(Matrix matrix) {
        if (!isInvertible(matrix)) {
            System.out.println("Matrix is not invertible.");
            return null;
        }
        float[][] augmentedMatrix = new float[matrix.getMatrix().length][2 * matrix.getMatrix().length];
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix().length; j++) {
                augmentedMatrix[i][j] = matrix.getMatrix()[i][j];
            }
            augmentedMatrix[i][matrix.getMatrix().length + i] = 1;
        }
        Matrix rowEchelonForm = simplification.rowEchelonForm(new Matrix(augmentedMatrix));
        float[][] matrixArray = rowEchelonForm.getMatrix();
        float[][] inverse = new float[matrix.getMatrix().length][matrix.getMatrix().length];
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix().length; j++) {
                inverse[i][j] = matrixArray[i][matrix.getMatrix().length + j];
            }
        }
        return new Matrix(inverse);
    }
}
