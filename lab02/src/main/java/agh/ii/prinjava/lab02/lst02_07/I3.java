package agh.ii.prinjava.lab02.lst02_07;

/**
 * <ul>
 *     <li>A variable declared in an interface is public, static, final; since it's constant, it must be initialised</li>
 *     <li>{@code public}, {@code static}, and {@code final} are redundant for variables declared in an interface</li>
 *     <li>static blocks are not allowed in interfaces</li>
 * </ul>
 */
interface I3 {
    // static { int x4 = 5; } // static blocks are not allowed in interfaces<
    // int x1; // it's final, so it must be initialised

    public static final int x2 = 3; // "public static final" is redundant
    int x3 = 5; // it is still "public static final"

    void m1(); // it is still public abstract
}
