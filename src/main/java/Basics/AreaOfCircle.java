package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter a radius: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.println("Area of circle is: " + a);
    }
}
