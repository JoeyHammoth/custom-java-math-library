package linalg.advanced;

import linalg.Matrix;

/**
 * Attributes class contains methods to get the rank and determinant of a matrix.
 */
public class Attributes {
    Simplification simplification = new Simplification();
    /**
     * Gets the rank of a matrix.
     * @param matrix matrix
     * @return rank of matrix
     */
    public int getRank(Matrix matrix) {
        Matrix rowEchelonForm = simplification.rowEchelonForm(matrix);
        float[][] matrixArray = rowEchelonForm.getMatrix();
        int rank = 0;
        for (int i = 0; i < matrixArray.length; i++) {
            boolean isZeroRow = true;
            for (int j = 0; j < matrixArray[0].length; j++) {
                if (matrixArray[i][j] != 0) {
                    isZeroRow = false;
                    break;
                }
            }
            if (!isZeroRow) {
                rank++;
            }
        }
        return rank;
    }
    /**
     * Gets the determinant of a matrix.
     * @param matrix matrix
     * @return determinant of matrix
     */
    public Matrix getDeterminant(Matrix matrix) {
        if (matrix.getMatrix().length != matrix.getMatrix()[0].length) {
            System.out.println("Determinant not supported for non-square matrices.");
            return null;
        }
        if (matrix.getMatrix().length == 1) {
            return new Matrix(new float[][]{{matrix.getMatrix()[0][0]}});
        }
        if (matrix.getMatrix().length == 2) {
            return new Matrix(new float[][]{{matrix.getMatrix()[0][0] * matrix.getMatrix()[1][1] -
                    matrix.getMatrix()[0][1] * matrix.getMatrix()[1][0]}});
        }
        float determinant = 0;
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            float[][] subMatrix = new float[matrix.getMatrix().length - 1][matrix.getMatrix().length - 1];
            for (int j = 1; j < matrix.getMatrix().length; j++) {
                for (int k = 0; k < matrix.getMatrix().length; k++) {
                    if (k < i) {
                        subMatrix[j - 1][k] = matrix.getMatrix()[j][k];
                    } else if (k > i) {
                        subMatrix[j - 1][k - 1] = matrix.getMatrix()[j][k];
                    }
                }
            }
            determinant += (float) (Math.pow(-1, i) * matrix.getMatrix()[0][i] *
                    getDeterminant(new Matrix(subMatrix)).getMatrix()[0][0]);
        }
        return new Matrix(new float[][]{{determinant}});
    }
}
