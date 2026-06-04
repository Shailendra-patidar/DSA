package LeetCodeProblems;

public class MaximumCountOfPositiveIntegerandNegativeInteger {
    class Solution {
        public int maximumCount(int[] nums) {
            int low = 0;
            int high = nums.length-1;
            int max = Integer.MIN_VALUE;
            int negpos = binarySearch(nums, low, high,-1);
            int pospos = binarySearch(nums, low, high,0);
            int poscount = nums.length - pospos;
            max = Math.max(poscount, negpos);
            return max;
        }

        public int binarySearch(int[] nums, int low, int high, int x){
            while(low<=high){
                int mid = low + (high - low)/2;
                if(nums[mid]<= x){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            return low;
        }
    }
}
