package MultiDimensionalArray;

public class SnakePrintColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{3,5,3,1},{4,6,2,7},{5,7,2,0},{4,8,9,5},{3,6,5,8}};
        for (int i = 0; i < arr[0].length ; i++) {
            if(i%2 == 0){
                for (int j = 0; j <arr.length ; j++) {
                    System.out.print(arr[j][i]);
                }
            }
            else{
                for (int j = arr.length-1; j >= 0 ; j--) {
                    System.out.print(arr[j][i]);
                }
            }
            System.out.println();
        }
    }
}
