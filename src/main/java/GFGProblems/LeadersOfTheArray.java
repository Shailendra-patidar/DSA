package GFGProblems;

import java.util.ArrayList;
import java.util.Collections;

// this code is not ready to run because this is only logic, it runs on GFG.
public class LeadersOfTheArray {
    class Solution {
        static ArrayList<Integer> leaders(int arr[]) {
            // code here
            ArrayList<Integer> ans = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for(int i = arr.length-1; i>=0;i--){
                if(max <=  arr[i]){
                    ans.add(arr[i]);
                }
                max = Math.max(arr[i], max);
            }
            Collections.reverse(ans);
            return ans;
        }
    }

}
