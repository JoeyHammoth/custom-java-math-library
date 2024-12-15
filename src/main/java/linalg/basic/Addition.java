package linalg.basic;

import linalg.Matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * linalg.basic.Addition class contains methods to add two matrices.
 */
public class Addition extends Operation{
    /**
     * Adds two matrices.
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return sum of two matrices
     */
    public Matrix add(Matrix matrix1, Matrix matrix2) {
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
                    result[i][j] = matrix1Array[i][j] + matrix2Array[i][j];
                }
            }
            return new Matrix(result);
        } else {
            List<List<Float>> result = getLists(matrix1, matrix2);
            return new Matrix(result);
        }
    }
    /**
     * Adds a list of matrices.
     * @param matrices list of matrices
     * @return sum of matrices in the list
     */
    public Matrix add(List<Matrix> matrices) {
        if (matrices.size() == 0) {
            System.out.println("No matrices to add.");
            return null;
        }
        Matrix result = matrices.get(0);
        for (int i = 1; i < matrices.size(); i++) {
            result = add(result, matrices.get(i));
        }
        return result;
    }
    /**
     * Adds an array of matrices.
     * @param matrices array of matrices
     * @return sum of matrices in the array
     */
    public Matrix add(Matrix[] matrices) {
        if (matrices.length == 0) {
            System.out.println("No matrices to add.");
            return null;
        }
        Matrix result = matrices[0];
        for (int i = 1; i < matrices.length; i++) {
            result = add(result, matrices[i]);
        }
        return result;
    }
}
