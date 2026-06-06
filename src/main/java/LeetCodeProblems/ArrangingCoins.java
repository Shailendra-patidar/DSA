package LeetCodeProblems;

public class ArrangingCoins {
    class Solution {
        public int arrangeCoins(int n) {
            long lo = 0,hi = n,ans = 0;
            while(lo <= hi){
                long mid = lo + (hi - lo)/2;
                long m = mid*(mid + 1)/2;
                if(m==n) return (int)mid;
                else if(m>n) hi = mid -1;
                else{
                    ans = mid;
                    lo = mid + 1;
                }
            }
            return (int)ans;
        }
    }
}
