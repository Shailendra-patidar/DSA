package GFGProblems;

import java.util.ArrayList;

public class RemoveDuplicateElementUsingArrayList {
    class Solution {
        ArrayList<Integer> removeDuplicates(int[] arr) {
            ArrayList<Integer> k = new ArrayList<>();
            k.add(arr[0]);
            for(int i = 1;i<arr.length;i++){
                if(arr[i] != arr[i-1]){
                    k.add(arr[i]);
                }
            }
            return k;
        }
    }

}
