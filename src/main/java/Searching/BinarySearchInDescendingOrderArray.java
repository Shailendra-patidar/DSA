package Searching;

public class BinarySearchInDescendingOrderArray {
        public static void main(String[] args) {
            int[] arr = {98,87,65,65,54,32,21,12};
            int start = 0;
            int end = arr.length-1;
            int target = 21;
            int k = 0;
            while(start<end){
                int mid = (start + end) / 2;
                if(arr[mid] == target){
                    k++;
                    System.out.println("Element found at index: "+mid);
                    break;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            if(k == 0){
                System.out.println("Element not found");
            }
        }
    }

