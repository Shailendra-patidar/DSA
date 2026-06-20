package MultiDimensionalArray;

import java.util.Scanner;

public class OutputIn2DArray {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4]; //{{0,0,0,0},{0,0,0,0},{0,0,0,0}}
//        System.out.println(arr.length); // no. of rows
//        System.out.println(arr[0].length); // no. of columns
//        int[][] arr = {{1,3,5,3},{8,5,9,6},{0,9,3,6}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Take Input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
