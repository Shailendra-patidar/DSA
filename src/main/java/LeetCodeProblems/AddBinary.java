package LeetCodeProblems;

public class AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            StringBuilder sb = new StringBuilder();
            int i = ch1.length - 1;
            int j = ch2.length - 1;
            int carry = 0;
            while(i>=0 || j>=0 || carry>0){
                int aNum = i>=0 ? ch1[i] - '0' : 0;
                int bNum = j>=0 ? ch2[j] - '0' : 0;
                int sum = aNum + bNum + carry;
                int ans = sum % 2;
                carry = sum / 2;
                i--;
                j--;
                sb.append((char)(ans + '0'));
            }
            return sb.reverse().toString();
        }
    }
}
