package LeetCodeProblems;

public class TransposeMatrix {
    class Solution {
        public int[][] transpose(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            int[][] matrix2 = new int[col][row];
            for(int i = 0;i<matrix2.length;i++){
                for(int j = 0;j<matrix2[0].length;j++){
                    matrix2[i][j] = matrix[j][i];
                }
            }
            return matrix2;
        }
    }
}
