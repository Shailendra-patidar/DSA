package Arrays;

import java.util.Scanner;

// Multiply odd indexed elements by 2 and add 10 to even indexed elements
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                arr[i] += 10;
            }
            else {
                arr[i] *= 2;
            }
        }

        System.out.println();
        System.out.print("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
