package agh.ii.prinjava.lab02.lst02_03;

// Cannot inherit from final 'FinalClass'
// class TryingToExtendFinalClass extends FinalClass {}

public class Main {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass(10);
        System.out.println("fc.x = " + fc.getX());
    }
}
