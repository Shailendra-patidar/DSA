package PatternPrinting;

import java.util.Scanner;

public class NumberAlphabetTriangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    if(i%2==0){
                        System.out.print((char)(j+64) + " ");
                    }
                    else {
                        System.out.print(j +" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
