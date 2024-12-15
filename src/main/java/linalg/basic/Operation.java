package linalg.basic;

import linalg.Matrix;

import java.util.ArrayList;
import java.util.List;

public abstract class Operation {
    public static List<List<Float>> getLists(Matrix matrix1, Matrix matrix2) {
        List<List<Float>> matrix1List = matrix1.getMatrixList();
        List<List<Float>> matrix2List = matrix2.getMatrixList();
        List<List<Float>> result = new ArrayList<>();
        for (int i = 0; i < matrix1List.size(); i++) {
            List<Float> row = new ArrayList<>();
            for (int j = 0; j < matrix1List.get(0).size(); j++) {
                row.add(matrix1List.get(i).get(j) + matrix2List.get(i).get(j));
            }
            result.add(row);
        }
        return result;
    }
}
