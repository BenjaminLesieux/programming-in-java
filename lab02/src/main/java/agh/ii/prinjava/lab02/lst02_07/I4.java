package agh.ii.prinjava.lab02.lst02_07;

/**
 * Starting from Java 8 interfaces have new capabilities:
 * <ul>
 *     <li>default implementations of methods were added for technical reasons (streams and collection library)</li>
 *     <li>static methods in some cases are useful (e.g., implementing factory methods)</li>
 * </ul>
 */
interface I4 {
    public default void m1() { // <- Modifier 'public' is redundant for interface methods
        System.out.println("I4.m1()");
    } // public is redundant

    /**
     * it is public, but NOT abstract (error: Illegal combination of modifiers: 'abstract' and 'default')
     */
    default void m2() {
        System.out.println("I4.m2()");
    }
}
