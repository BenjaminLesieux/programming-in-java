package agh.ii.prinjava.lab01.lst01_01;

/**
 * Encapsulation demo
 */
public class Main {
    public static void main(String[] args) {
        HelloEncapsulation enDemo = new HelloEncapsulation(42);

        // int propVal = enDemo.propVal; // (!)
        // To read or to modify the value of "propVal", we cannot access it directly
        // because of the access modifier ("private"). Instead:
        int propVal = enDemo.getPropVal();
        propVal++;
        enDemo.setPropVal(propVal);

        Car v1 = new Car("Mercedes", "AGH234");

        System.out.println(v1.getBrand() + " " + v1.getPlaq());

        Vehicule v2 = new Vehicule("Ferrari");

        System.out.println(v2.lowerBrand() + " " + v2.plaq());
    }

    public record Vehicule(String brand, String plaq){
        public Vehicule(String brand) {
            this(brand, "no plaques");
        }
    }
}