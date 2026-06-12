package GFGProblems;

public class MostFrequentCharacter {

    class Solution {
        public char getMaxOccuringChar(String s) {
            // method 1 brute force
            // code here
//            int n = s.length();
//            int maxFreq = -1;
//            char ans = s.charAt(0);
//            for(int i = 0;i<n;i++){
//                int freq = 1;
//                char ch = s.charAt(i);
//                for(int j = i+1;j<n;j++){
//                    if(s.charAt(j) == ch) freq++;
//                }
//                if(freq>maxFreq){
//                    maxFreq = freq;
//                    ans = ch;
//                }
//                else if(freq==maxFreq && ch<ans){
//                    ans = ch;
//                }
//            }
//            return ans;

            //method 2;
            int n = s.length();
            int[] freq = new int[26];
            for(int i = 0;i<n;i++){
                char ch = s.charAt(i);
                int idx = ch-'a';
                freq[idx]++;
            }
            int maxFreq = 0;
            char ans = s.charAt(0);
            for(int i = 0;i<26;i++){
                if(freq[i]>maxFreq){
                    maxFreq = freq[i];
                    ans = (char)(i+97);
                }
            }
            return  ans;
        }
    }
}
