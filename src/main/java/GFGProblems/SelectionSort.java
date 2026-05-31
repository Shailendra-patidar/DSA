package GFGProblems;

public class SelectionSort {
    class Solution {
        void selectionSort(int[] arr) {
            // code here
            for(int i = 0; i<arr.length;i++){
                int min = Integer.MAX_VALUE;
                int mindex = -1;
                for(int j = i; j<arr.length;j++){
                    if(min>=arr[j]){
                        min = arr[j];
                        mindex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[mindex];
                arr[mindex] = temp;
            }
        }
    }
}
