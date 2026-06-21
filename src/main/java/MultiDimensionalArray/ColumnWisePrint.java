package MultiDimensionalArray;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{2,5,4,3},{4,6,3,6},{8,9,4,0}};
        for (int j = 0;j<arr[0].length;j++){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
