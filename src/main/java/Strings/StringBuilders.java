package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("shailendra");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.append(" patidar");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        s.setCharAt(2,'e');
        System.out.println(s);
        String str = s.toString();
        System.out.println(str);
    }
}
