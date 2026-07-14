package OOPs;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
        StudentData(int[] s){
            marks = s;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,76,53,13,56};
        StudentData s1 = new StudentData(4);
        StudentData s2= new StudentData(arr);
        s1.marks[0] = 34;
        s1.marks[1] = 90;
        s1.marks[2] = 30;
        s1.marks[3] = 78;


    }
}
