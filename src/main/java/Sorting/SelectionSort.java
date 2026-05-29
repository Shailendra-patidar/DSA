package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,36,8,4,0,1};
        for(int i = 0; i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<=min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[mindex];
            arr[mindex] = arr[i];
            arr[i] = temp;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

}
