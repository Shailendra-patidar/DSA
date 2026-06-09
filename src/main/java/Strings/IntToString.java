package Strings;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        String str = ""+a;
        String str = Integer.toString(a);
        System.out.println(str);


    }
}
