package Basics;

public class CharDataType {
    public static void main(String[] args) {
        char c = 's';
        System.out.println(c);

        //typecasting - ek data type se doosre data type conversion
        char ch = 'A';
        int a = ch; //implicit typecasting
        System.out.println(a);

        char sh = 'a';
        int b = (int)sh;    // explicit typecasting
        System.out.println(b);


        char h = 'b';
        System.out.println(h+0);
        System.out.println(h+h);
        System.out.println(h*h);

        System.out.println("************************************");

        //Integer to character
        int x = 284;
        int y = 23;
        System.out.println((char)x);
        System.out.println((char)y);
    }
}
