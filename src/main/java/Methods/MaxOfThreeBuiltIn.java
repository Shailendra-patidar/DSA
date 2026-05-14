package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c =sc.nextInt();
        System.out.println("Maximum: " + Math.max(Math.max(a,b),c));
        System.out.println("Minimum: "+ Math.min(Math.min(a,b),c));
//        int p = Math.max(a,b);
//        int q = Math.max(b,c);
//        if (p>q){
//            System.out.println("greater: "+p);
//        }
//        else{
//            System.out.println("greater: "+q);
//        }
    }
}
