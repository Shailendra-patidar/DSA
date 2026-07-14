package OOPs;

public class Constructors {
    public static class Car{
        int seats;
        String name;
        double length;

        Car(int x, String s, double l){
            seats = x;
            name = s;
            length = l;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia",3.99);
        c1.print();
        Car c2 = new Car(4,"Lord Alto",4.56);
        c2.print();
    }
}
