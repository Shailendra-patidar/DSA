package Basics;

import java.util.Scanner;

public class ThreeInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first number: ");
       a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        int d = a+b+c;
        System.out.println("Sum of "+a+", "+b+" and "+c+" is: "+ d);

    }
}
