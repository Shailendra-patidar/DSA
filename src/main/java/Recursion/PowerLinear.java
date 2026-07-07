package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int a = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int b = sc.nextInt();
       int ans = pow(a,b);
        System.out.println(a+" raised to the power of "+b+" is: "+ ans);
    }
//    // T.C = O(b)
//    public static int pow(int a, int b){
//        if(b==0) return 1;
//        return a*pow(a,b-1);
//    }

    //T.C. = O(log b)
    public static int pow(int a, int b){
        if(b==0) return 1;
        int call = pow(a,b/2);
        if(b%2 == 0)
        return call*call;
        else return a * call * call;
    }

}
