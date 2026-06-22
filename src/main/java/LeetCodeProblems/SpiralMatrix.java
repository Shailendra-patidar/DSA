package LeetCodeProblems;
import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] mat) {
            List<Integer> ans = new ArrayList<>();
            int m = mat.length, n = mat[0].length;
            int firstRow = 0, lastRow = m-1,firstCol = 0, lastCol = n-1;
            while(firstRow<=lastRow && firstCol<=lastCol){
                //right
                for(int j = firstCol;j<=lastCol;j++){
                    ans.add(mat[firstRow][j]);
                }
                firstRow++;
                if(firstRow>lastRow || firstCol>lastCol) break;
                //down
                for(int i = firstRow;i<=lastRow;i++){
                    ans.add(mat[i][lastCol]);
                }
                lastCol--;
                if(firstRow>lastRow || firstCol>lastCol) break;

                //left
                for(int j = lastCol;j>=firstCol;j--){
                    ans.add(mat[lastRow][j]);
                }
                lastRow--;
                if(firstRow>lastRow || firstCol>lastCol) break;

                //up
                for(int i = lastRow;i>=firstRow;i--){
                    ans.add(mat[i][firstCol]);
                }
                firstCol++;
            }
            return ans;
        }
    }
}
