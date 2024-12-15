package linalg.advanced;

import linalg.Matrix;

import java.util.Collections;
import java.util.List;

/**
 * Eigen class contains methods to get the eigenvalues and eigenvectors of a matrix.
 */
public class Eigen {
      Simplification simplification = new Simplification();
        Attributes attributes = new Attributes();
        /**
         * Gets the eigenvalues of a matrix.
         * @param matrix matrix
         * @return eigenvalues of matrix
         */
        public List<Float> getEigenvalues(Matrix matrix) {
            if (matrix.getMatrix().length != matrix.getMatrix()[0].length) {
                System.out.println("Eigenvalues not supported for non-square matrices.");
                return null;
            }
            Matrix characteristicMatrix = new Matrix(matrix.getMatrix());
            for (int i = 0; i < matrix.getMatrix().length; i++) {
                characteristicMatrix.getMatrix()[i][i] -= 1;
            }
            Matrix characteristicMatrixDeterminant = attributes.getDeterminant(characteristicMatrix);
            return Collections.singletonList(characteristicMatrixDeterminant.getMatrix()[0][0]);
        }
        /**
         * Gets the eigenvectors of a matrix.
         *
         * @param matrix matrix
         * @return eigenvectors of matrix
         */
        public float[] getEigenvectors(Matrix matrix) {
            if (matrix.getMatrix().length != matrix.getMatrix()[0].length) {
                System.out.println("Eigenvectors not supported for non-square matrices.");
                return null;
            }
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
            if (rank != matrixArray.length) {
                System.out.println("Eigenvectors not supported for matrices with rank less than the number of rows.");
                return null;
            }
            return rowEchelonForm.getMatrix()[0];
        }

    public Matrix[] eigenDecomposition(Matrix matrix) {
        return new Matrix[]{new Matrix(matrix.getMatrix()), new Matrix(matrix.getMatrix())};
    }
}
