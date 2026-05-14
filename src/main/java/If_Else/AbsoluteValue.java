package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n >= 0) System.out.println(n);
        else System.out.println(n*(-1));
    }
}
