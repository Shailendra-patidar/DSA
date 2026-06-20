package MultiDimensionalArray;

public class MaximumElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2,3,5,5},{6,5,2,9},{3,6,1,99}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(max<arr[i][j]){
                    max = Math.max(max,arr[i][j]);
                }
            }

        }
        System.out.print(max);
    }


}
