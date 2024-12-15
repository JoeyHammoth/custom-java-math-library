package linalg.basic;

import linalg.Matrix;

import java.util.List;

/**
 * Subtraction class contains methods to subtract two matrices.
 */
public class Subtraction extends Operation {
    /**
     * Subtracts two matrices.
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return difference of two matrices
     */
    public Matrix subtract(Matrix matrix1, Matrix matrix2) {
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
                    result[i][j] = matrix1Array[i][j] - matrix2Array[i][j];
                }
            }
            return new Matrix(result);
        } else {
            List<List<Float>> result = getLists(matrix1, matrix2);
            return new Matrix(result);
        }
    }
}
