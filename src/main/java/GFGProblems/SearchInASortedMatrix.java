package GFGProblems;

public class SearchInASortedMatrix {
    class Solution {
        public boolean searchMatrix(int[][] mat, int x) {
            // code here
            int rows = mat.length, cols = mat[0].length;
            int lo = 0,hi = rows*cols-1;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                int midRow = mid/cols, midCols = mid%cols;
                if(mat[midRow][midCols] == x) return true;
                else if(mat[midRow][midCols] < x) lo = mid + 1;
                else hi = mid - 1;
            }
            return false;
        }
    }

}
