package PatternPrinting;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j>=(n+1)-i && j<=(n-1)+i){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    int m;
    m= n;
     for (int i=1;i<=n-1;i++){
        for (int j=1;j<=n;j++){
            if (j>=i && j<=((m/2)+2)+i){
                System.out.print("* ");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
