package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,45,56,67,78,89,90,98};
        int start = 0;
        int end = arr.length-1;
        int target = 900;
        int k = 0;
        while(start<end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                k++;
                System.out.println("Element found at index: "+mid);
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        if(k == 0){
            System.out.println("Element not found");
        }
    }
}
