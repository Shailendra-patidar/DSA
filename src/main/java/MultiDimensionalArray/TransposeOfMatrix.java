package MultiDimensionalArray;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5},{6,2,1},{3,6,1}};
        print(arr);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
    public static int[][] print(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

}
