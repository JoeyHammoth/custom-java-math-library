package linalg.basic;

import linalg.Matrix;

import java.util.List;

/**
 * Multiplication class contains methods to multiply two matrices.
 */
public class Multiplication extends Operation {
    /**
     * Multiplies two matrices.
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return product of two matrices
     */
    public Matrix multiply(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getType() != matrix2.getType()) {
            System.out.println("Matrix types do not match.");
            return null;
        }
        if (matrix1.getType()) {
            float[][] matrix1Array = matrix1.getMatrix();
            float[][] matrix2Array = matrix2.getMatrix();
            float[][] result = new float[matrix1Array.length][matrix2Array[0].length];
            for (int i = 0; i < matrix1Array.length; i++) {
                for (int j = 0; j < matrix2Array[0].length; j++) {
                    for (int k = 0; k < matrix1Array[0].length; k++) {
                        result[i][j] += matrix1Array[i][k] * matrix2Array[k][j];
                    }
                }
            }
            return new Matrix(result);
        } else {
            System.out.println("Matrix multiplication not supported for list of matrices.");
            return null;
        }
    }
    /**
     * Multiplies a list of matrices.
     * @param matrices list of matrices
     * @return product of matrices in the list
     */
    public Matrix multiply(List<Matrix> matrices) {
        if (matrices.size() == 0) {
            System.out.println("No matrices to multiply.");
            return null;
        }
        Matrix result = matrices.get(0);
        for (int i = 1; i < matrices.size(); i++) {
            result = multiply(result, matrices.get(i));
        }
        return result;
    }
    /**
     * Multiplies an array of matrices.
     * @param matrices array of matrices
     * @return product of matrices in the array
     */
    public Matrix multiply(Matrix[] matrices) {
        if (matrices.length == 0) {
            System.out.println("No matrices to multiply.");
            return null;
        }
        Matrix result = matrices[0];
        for (int i = 1; i < matrices.length; i++) {
            result = multiply(result, matrices[i]);
        }
        return result;
    }
    /**
     * Multiplies a matrix by a scalar.
     * @param matrix matrix
     * @param scalar scalar
     * @return product of matrix and scalar
     */
    public Matrix multiply(Matrix matrix, float scalar) {
        if (matrix.getType()) {
            float[][] matrixArray = matrix.getMatrix();
            float[][] result = new float[matrixArray.length][matrixArray[0].length];
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[0].length; j++) {
                    result[i][j] = matrixArray[i][j] * scalar;
                }
            }
            return new Matrix(result);
        } else {
            System.out.println("Matrix multiplication not supported for list of matrices.");
            return null;
        }
    }
}
