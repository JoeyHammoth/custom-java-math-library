package linalg.advanced;

import linalg.basic.Multiplication;
import linalg.Matrix;

/**
 * Diagonal class contains methods to diagonalize a matrix.
 */
public class Diagonal {
    Eigen eigen = new Eigen();
    /**
     * Diagonalizes a matrix.
     * @param matrix matrix
     * @return diagonal matrix
     */
    public Matrix diagonalize(Matrix matrix) {
        if (matrix.getMatrix().length != matrix.getMatrix()[0].length) {
            System.out.println("Diagonalization not supported for non-square matrices.");
            return null;
        }
        double[] eigenvalues = eigen.getEigenvalues(matrix).stream().mapToDouble(Float::floatValue).toArray();
        float[][] eigenvectors = new float[][]{eigen.getEigenvectors(matrix)};
        float[][] diagonalMatrix = new float[matrix.getMatrix().length][matrix.getMatrix()[0].length];
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                for (int k = 0; k < matrix.getMatrix().length; k++) {
                    diagonalMatrix[i][j] += eigenvectors[i][k] * eigenvectors[k][j];
                }
            }
        }
        return new Matrix(diagonalMatrix);
    }
    /**
     * Orthogonally diagonalizes a matrix.
     * @param matrix matrix
     * @return orthogonal matrix
     */
    public Matrix orthogonalDiagonalize(Matrix matrix) {
        if (matrix.getMatrix().length != matrix.getMatrix()[0].length) {
            System.out.println("Orthogonal diagonalization not supported for non-square matrices.");
            return null;
        }
        double[] eigenvalues = eigen.getEigenvalues(matrix).stream().mapToDouble(Float::floatValue).toArray();
        float[][] eigenvectors = new float[][]{eigen.getEigenvectors(matrix)};
        float[][] diagonalMatrix = new float[matrix.getMatrix().length][matrix.getMatrix()[0].length];
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                for (int k = 0; k < matrix.getMatrix().length; k++) {
                    diagonalMatrix[i][j] += eigenvectors[i][k] * eigenvectors[k][j];
                }
            }
        }
        float[][] orthogonalMatrix = new float[matrix.getMatrix().length][matrix.getMatrix()[0].length];
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                for (int k = 0; k < matrix.getMatrix().length; k++) {
                    orthogonalMatrix[i][j] += eigenvectors[i][k] * eigenvectors[k][j];
                }
            }
        }
        return new Matrix(orthogonalMatrix);
    }
    /**
     * Orthonormally diagonalizes a matrix.
     * @param matrix matrix
     * @return orthonormal matrix
     */
    public Matrix gramSchmidtDiagonalize(Matrix matrix) {
        if (matrix.getMatrix().length != matrix.getMatrix()[0].length) {
            System.out.println("Gram-Schmidt diagonalization not supported for non-square matrices.");
            return null;
        }
        double[] eigenvalues = eigen.getEigenvalues(matrix).stream().mapToDouble(Float::floatValue).toArray();
        float[][] eigenvectors = new float[][]{eigen.getEigenvectors(matrix)};
        float[][] diagonalMatrix = new float[matrix.getMatrix().length][matrix.getMatrix()[0].length];
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                for (int k = 0; k < matrix.getMatrix().length; k++) {
                    diagonalMatrix[i][j] += eigenvectors[i][k] * eigenvectors[k][j];
                }
            }
        }
        float[][] orthogonalMatrix = new float[matrix.getMatrix().length][matrix.getMatrix()[0].length];
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                for (int k = 0; k < matrix.getMatrix().length; k++) {
                    orthogonalMatrix[i][j] += eigenvectors[i][k] * eigenvectors[k][j];
                }
            }
        }
        float[][] orthonormalMatrix = new float[matrix.getMatrix().length][matrix.getMatrix()[0].length];
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                for (int k = 0; k < matrix.getMatrix().length; k++) {
                    orthonormalMatrix[i][j] += eigenvectors[i][k] * eigenvectors[k][j];
                }
            }
        }
        return new Matrix(orthonormalMatrix);
    }
}
