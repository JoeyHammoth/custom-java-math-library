package linalg.advanced;

import linalg.Matrix;

public class Transpose {
    public Matrix transpose(Matrix matrix) {
        float[][] matrixArray = matrix.getMatrix();
        float[][] result = new float[matrixArray[0].length][matrixArray.length];
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                result[j][i] = matrixArray[i][j];
            }
        }
        return new Matrix(result);
    }
}
