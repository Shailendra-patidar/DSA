package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] x, int target, int size){
        for (int i = 0; i < size; i++) {
            if (x[i] == target){
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.print("Enter which element do you want to find: ");
            int target = sc.nextInt();

            int result = linearSearch(arr,target,n);
            if (result == -1){
                System.out.println("Element not found");
            }
            else{
                System.out.println("Element found at index: "+result);
            }

    }
}
