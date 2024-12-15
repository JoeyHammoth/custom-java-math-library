package linalg.advanced;

import linalg.Matrix;

/**
 * Identity class contains methods to check if a matrix is diagonal, symmetric,
 * skew-symmetric, upper triangular, lower triangular, identity, orthogonal, hermitian, or unitary.
 */
public class Identity {
    /**
     * Checks if a matrix is diagonal.
     * @param matrix matrix
     * @return true if matrix is diagonal, false otherwise
     */
    public boolean isDiagonal(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                if (i != j && matrixArray[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Checks if a matrix is symmetric.
     * @param matrix matrix
     * @return true if matrix is symmetric, false otherwise
     */
    public boolean isSymmetric(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                if (matrixArray[i][j] != matrixArray[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Checks if a matrix is skew-symmetric.
     * @param matrix matrix
     * @return true if matrix is skew-symmetric, false otherwise
     */
    public boolean isSkewSymmetric(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                if (matrixArray[i][j] != -matrixArray[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Checks if a matrix is upper triangular.
     * @param matrix matrix
     * @return true if matrix is upper triangular, false otherwise
     */
    public boolean isUpperTriangular(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrixArray[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Checks if a matrix is lower triangular.
     * @param matrix matrix
     * @return true if matrix is lower triangular, false otherwise
     */
    public boolean isLowerTriangular(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = i + 1; j < matrixArray[0].length; j++) {
                if (matrixArray[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Checks if a matrix is identity.
     * @param matrix matrix
     * @return true if matrix is identity, false otherwise
     */
    public boolean isIdentity(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                if (i == j && matrixArray[i][j] != 1) {
                    return false;
                }
                if (i != j && matrixArray[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Checks if a matrix is orthogonal.
     * @param matrix matrix
     * @return true if matrix is orthogonal, false otherwise
     */
    public boolean isOrthogonal(Matrix matrix) {
        return isDiagonal(matrix) && isSymmetric(matrix);
    }
    /**
     * Checks if a matrix is hermitian.
     * @param matrix matrix
     * @return true if matrix is hermitian, false otherwise
     */
    public boolean isHermitian(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                if (i != j && matrixArray[i][j] != matrixArray[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Checks if a matrix is unitary.
     * @param matrix matrix
     * @return true if matrix is unitary, false otherwise
     */
    public boolean isUnitary(Matrix matrix) {
        return isDiagonal(matrix) && isHermitian(matrix);
    }
}
