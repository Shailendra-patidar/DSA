package MultiDimensionalArray;

public class ReverseAllRowsOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2,5,3,6},{7,5,2,8},{8,4,2,5}};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = arr[0].length-1; j >=0 ; j--) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
