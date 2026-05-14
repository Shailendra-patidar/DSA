package PatternPrinting;

import java.util.Scanner;

public class FullPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n+(n-1);j++){
                if(j>=(n+1)-i && j<=(n-1)+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }

