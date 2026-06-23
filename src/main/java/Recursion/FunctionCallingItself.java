package Recursion;

public class FunctionCallingItself {
    public static void main(String[] args) {
        shelu(1);
    }
    public static void shelu(int n){
        if(n==5) return;
        System.out.println("patidar ji");
        shelu(n+1);
    }
}
