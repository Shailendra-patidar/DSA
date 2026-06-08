package Strings;

public class PassingStringToMethod {
    public static void change(String x) {
        x = "Shailendra";
    }
    public static void main(String[] args) {
        String x = "Vaibhav";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
