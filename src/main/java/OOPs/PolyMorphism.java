package OOPs;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("GRRRRRRR");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Human h = new Human();
        Pikachu p = new Pikachu();
        Cat c = new Cat();
        Dog d = new Dog();
        Lion l = new Lion();
        d.speak();
        c.speak();
        h.speak();
        l.speak();
        p.speak();
    }
}
