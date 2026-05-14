package PatternPrinting;

import java.util.Scanner;

public class LeftFaceFullPyramid {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();

        int i,j,k=0;
        for ( i=1;i<=7;i++){
             if(i<=4){
                 k++;
             }
             else {
                 k--;
             }
            for(j=1;j<=4;j++){
                if(j<=k){
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
