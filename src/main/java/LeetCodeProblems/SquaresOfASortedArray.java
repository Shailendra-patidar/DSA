package LeetCodeProblems;

public class SquaresOfASortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int left = 0;
            int right = nums.length-1;
            int i = nums.length-1;
            int[] ans = new int[nums.length];
            while(left <= right){
                int ls = nums[left] * nums[left];
                int rs = nums[right] * nums[right];
                if(ls<rs){
                    ans[i] = rs;
                    right--;
                }
                else{
                    ans[i] = ls;
                    left++;
                }
                i--;
            }
            return ans;
        }
    }
}
