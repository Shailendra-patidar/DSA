package Recursion;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int n = 5;
       int ans = fact(n);
        System.out.println("factorial is: "+ans);
    }
    public static int  fact(int n){
        if(n==0 || n==1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }

}
