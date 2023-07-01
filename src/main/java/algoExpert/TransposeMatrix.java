package algoExpert;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(a[0].length);
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int[][] ints = transposeMatrix.transposeMatrix(a);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.println(ints[i][j]);
            }
        }
    }

    public int[][] transposeMatrix(int[][] matrix) {
        // Write your code here.
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }

        }
        return result;
    }
}

