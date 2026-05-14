package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = sc.nextInt();
        double b = Math.ceil(n/2);
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==b || j==b){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
