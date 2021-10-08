package agh.ii.prinjava.lab02.lst02_06;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(2);
        System.out.printf("s1Area = %.2f\n", s1.area());

        ToBeConsideredAbstract tbca; // OK, it's just a reference
        //tbca = new ToBeConsideredAbstract(); // 'ToBeConsideredAbstract' is abstract; cannot be instantiated
    }
}
