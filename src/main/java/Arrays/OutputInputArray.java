package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5,18,2,45,67,68};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }

        //input
        int[] shelu = new int[10];
        for (int i = 0; i < shelu.length; i++) {
            System.out.print("Enter "+(i+1)+ " number: ");
            shelu[i] = sc.nextInt();
        }

        //print
        System.out.print("Elements in array: ");
        for (int i = 0; i < shelu.length; i++) {
            System.out.print(shelu[i]+" ");
        }
    }
}
