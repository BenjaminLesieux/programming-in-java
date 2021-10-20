package agh.ii.prinjava.lab05.lst05_05;

import java.util.Objects;

/**
 * <ul>
 *     <li>{@link #equals} overridden, {@link #hashCode} NOT overridden</li>
 *     <li>{@link Comparable} implemented</li>
 * </ul>
 */
final class C1 implements Comparable<C1> {
    private final String s;

    public C1(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C1 c1 = (C1) o;
        return Objects.equals(s, c1.s);
    }

    @Override
    public String toString() {
        return "C1{" + "s='" + s + '\'' + '}';
    }

    @Override
    public int compareTo(C1 o) {
        return s.compareTo(o.s);
    }
}
