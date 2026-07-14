package OOPs;

public class UserDefinedDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Shailendra";
        s.rno = 107;
        s.cgpa = 8.17;

        Student s1 = new Student();
        s1.name = "vaibhav";
        s1.rno = 132;
        s1.cgpa = 6.17;

        Student s2 = new Student();
        s2.name = "tushar";
        s2.rno = 133;
        s2.cgpa = 7.35;

        System.out.println(s.name+" "+s.rno+" "+s.cgpa);
        s1.cgpa = 7.56;
        System.out.println(s1.cgpa);

    }
}
