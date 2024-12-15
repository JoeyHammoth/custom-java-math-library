package linalg.advanced;

import linalg.Matrix;

/**
 * Simplification class contains methods to simplify a matrix.
 */
public class Simplification {
    /**
     * Finds the row echelon form of a matrix.
     * @param matrix matrix
     * @return row echelon form of matrix
     */
    public Matrix rowEchelonForm(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                if (matrixArray[i][j] != 0) {
                    for (int k = i + 1; k < matrixArray.length; k++) {
                        float factor = matrixArray[k][j] / matrixArray[i][j];
                        for (int l = 0; l < matrixArray[0].length; l++) {
                            matrixArray[k][l] -= factor * matrixArray[i][l];
                        }
                    }
                    break;
                }
            }
        }
        return new Matrix(matrixArray);
    }
    /**
     * Finds the reduced row echelon form of a matrix.
     * @param matrix matrix
     * @return reduced row echelon form of matrix
     */
    public Matrix reducedRowEchelonForm(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                if (matrixArray[i][j] != 0) {
                    float factor = 1 / matrixArray[i][j];
                    for (int k = 0; k < matrixArray[0].length; k++) {
                        matrixArray[i][k] *= factor;
                    }
                    for (int k = 0; k < matrixArray.length; k++) {
                        if (k != i) {
                            factor = matrixArray[k][j] / matrixArray[i][j];
                            for (int l = 0; l < matrixArray[0].length; l++) {
                                matrixArray[k][l] -= factor * matrixArray[i][l];
                            }
                        }
                    }
                    break;
                }
            }
        }
        return new Matrix(matrixArray);
    }
    /**
     * Finds the reduced row echelon form of a matrix using Gaussian elimination.
     * @param matrix matrix
     * @return reduced row echelon form of matrix
     */
    public Matrix gaussianElimination(Matrix matrix) {
        return reducedRowEchelonForm(rowEchelonForm(matrix));
    }
}
