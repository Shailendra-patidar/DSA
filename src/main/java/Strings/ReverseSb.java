package Strings;

public class ReverseSb {
    public static void main(String[] args) {
        String str = "raghav";
        StringBuilder sb = new StringBuilder(str);
        //sb.reverse();
        int i = 0, j = sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
