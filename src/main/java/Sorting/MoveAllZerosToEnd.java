package Sorting;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,2,5,0,4,0,3,0};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }

}
