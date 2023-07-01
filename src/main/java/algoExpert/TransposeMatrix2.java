package algoExpert;

import java.util.stream.IntStream;

public class TransposeMatrix2 {
    public int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        IntStream.range(0, matrix.length)
                .forEach(i -> IntStream.range(0, matrix[0].length)
                        .forEach(j -> result[j][i] = matrix[i][j]));
        return result;
    }
}
