package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        int i = 0;
       int j = str.length()-1;
       int check = 0;
       while(i<=j){
           if(str.charAt(i) == str.charAt(j)){
               i++;
               j--;
               check++;
           }
           else{
               break;
           }
       }
       if(check == 0){
           System.out.println("Not palindrome");
       }
       else{
           System.out.println("Palindrome");
       }
    }
}
