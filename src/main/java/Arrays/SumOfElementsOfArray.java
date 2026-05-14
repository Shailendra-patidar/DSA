package Arrays;

import java.util.Scanner;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 0;
        for (int i = 0; i < n; i++)
            s += arr[i];

        System.out.println("Sum of the elements is: "+s);
    }
}
