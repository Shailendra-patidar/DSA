package OOPs;

class Students{
    String name; // null
    private int rno; //0
    double cgpa; //0.0
    private void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
    public void p(){
        print();
    }

}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.cgpa = 34;
        s1.name ="Hemant";
        s1.p();

        Students s2 = new Students();
        s2.p();
    }
}
