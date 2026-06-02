package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,4,55,3,21,78,76,5,43};
        int target = 1;
        int k = 5;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == target){
                k++;
                System.out.println("Element found at index: "+i);
                break;
            }
        }
        if(k==0){
            System.out.println("Element not found");
        }
    }

}
