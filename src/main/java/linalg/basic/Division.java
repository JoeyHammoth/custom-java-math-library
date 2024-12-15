package linalg.basic;

import linalg.Matrix;

/**
 * Division class contains methods to divide two matrices.
 */
public class Division extends Operation {
    /**
     * Divides two matrices.
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return quotient of two matrices
     */
    public Matrix divide(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getType() != matrix2.getType()) {
            System.out.println("Matrix types do not match.");
            return null;
        }
        if (matrix1.getType()) {
            float[][] matrix1Array = matrix1.getMatrix();
            float[][] matrix2Array = matrix2.getMatrix();
            float[][] result = new float[matrix1Array.length][matrix1Array[0].length];
            for (int i = 0; i < matrix1Array.length; i++) {
                for (int j = 0; j < matrix1Array[0].length; j++) {
                    result[i][j] = matrix1Array[i][j] / matrix2Array[i][j];
                }
            }
            return new Matrix(result);
        } else {
            System.out.println("Matrix division not supported for list of matrices.");
            return null;
        }
    }
    /**
     * Finds the common factor of two matrices.
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return common factor of two matrices
     */
    public Matrix findCommonFactor(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getType() != matrix2.getType()) {
            System.out.println("Matrix types do not match.");
            return null;
        }
        if (matrix1.getType()) {
            float[][] matrix1Array = matrix1.getMatrix();
            float[][] matrix2Array = matrix2.getMatrix();
            float[][] result = new float[matrix1Array.length][matrix1Array[0].length];
            for (int i = 0; i < matrix1Array.length; i++) {
                for (int j = 0; j < matrix1Array[0].length; j++) {
                    result[i][j] = matrix1Array[i][j] % matrix2Array[i][j];
                }
            }
            return new Matrix(result);
        } else {
            System.out.println("Matrix division not supported for list of matrices.");
            return null;
        }
    }
    /**
     * Divides a matrix by a scalar.
     * @param matrix matrix
     * @param scalar scalar
     * @return quotient of matrix and scalar
     */
    public Matrix divide(Matrix matrix, float scalar) {
        if (matrix.getType()) {
            float[][] matrixArray = matrix.getMatrix();
            float[][] result = new float[matrixArray.length][matrixArray[0].length];
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[0].length; j++) {
                    result[i][j] = matrixArray[i][j] / scalar;
                }
            }
            return new Matrix(result);
        } else {
            System.out.println("Matrix division not supported for list of matrices.");
            return null;
        }
    }
}
