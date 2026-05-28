package LeetCodeProblems;

public class FindFirstAndLastElementPosition {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left = findLeft(nums, target);
            int right = findRight(nums, target);
            return new int[]{left, right};
        }
        public int findLeft(int[] nums, int target){
            int i=0;
            int j=nums.length-1;
            int leftmost = -1;
            while(i<=j){
                int mid = (i+j)/2;
                if(nums[mid] == target){
                    leftmost = mid;
                    j = mid-1;
                }
                else if(nums[mid]<target){
                    i = mid+1;
                }
                else{
                    j = mid-1;
                }
            }
            return leftmost;
        }
        public int findRight(int[] nums, int target){
            int i=0;
            int j = nums.length-1;
            int rightmost = -1;
            while(i<=j){
                int mid = (i+j)/2;
                if(nums[mid] == target){
                    rightmost = mid;
                    i = mid+1;
                }
                else if(nums[mid]<target){
                    i = mid+1;
                }
                else{
                    j = mid-1;
                }
            }
            return rightmost;
        }
    }
}
