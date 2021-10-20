package agh.ii.prinjava.lab05.lst05_05;

/**
 * <p>{@link #equals}, {@link #hashCode} NOT overridden
 */
final class C0 {
    private final String s;

    public C0(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public String toString() {
        return "C0{" + "s='" + s + '\'' + '}';
    }
}
