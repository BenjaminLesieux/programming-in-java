package agh.ii.prinjava.lab03.lst03_09;

import java.io.Serializable;

/**
 * Not serializable because of a non-serializable field (nsc)
 */
class NonSerializableCls2 implements Serializable {
    private String name;
    private NonSerializableClass1 nsc; // <- a field of non-serializable type

    public NonSerializableCls2(String name, NonSerializableClass1 nsc) {
        this.name = name;
        this.nsc = nsc;
    }

    @Override
    public String toString() {
        return "NonSerializableCls2{" + "name='" + name + '\'' + ", nsc=" + nsc + '}';
    }
}
