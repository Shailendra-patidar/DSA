package Basics;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);
        a = a+1;
        System.out.println(a);

        int b = 10;
        System.out.println(b--); //10  vlaue - 9
        System.out.println(--b); //8 value - 8
        System.out.println(++b); // 9  value - 9
        System.out.println(b++); // 9  value 10
        System.out.println(b); // 10
    }
}
