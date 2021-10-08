package agh.ii.prinjava.lab01.lst01_01;

/**
 * Encapsulation is often referred to as one of the following:
 * <ul>
 *     <li>bundling together of publicly accessible methods and privately accessible data</li>
 *     <li>data hiding (controversial, see link below)</li>
 *     <li>controlled access to the object properties</li>
 * </ul>
 * <p>
 * Note: it is the object state (the snapshot of values of object properties) that is encapsulated
 *
 * @see <a href="https://www.infoworld.com/article/2075271/encapsulation-is-not-information-hiding.html">
 * Encapsulation is not information hiding</a></li>
 */
public class HelloEncapsulation {
    private int propVal; // the encapsulated state

    /**
     * <strong> Question 1 </strong> <br><br>
     *
     * Encapsulation is a way to protect the data of an object by making it
     * only accessible with a getter, and only changeable via a setter
     *
     * This way, the data is more protected.
     *
     * <br><br>
     * <strong>Question 2</strong><br><br>
     *
     * A getter is a way of accessing the value of a variable, without the fear of
     * changing its value when working with it and assigning it to another one.
     *
     * A setter's purpose is to change the value of the protected variable
     *
     * <br><br>
     * <strong>Question 3</strong><br><br>
     *
     * "this" keyword : access every variable (either private, protected or public) of the class
     *  or call a constructor of the class or a method <br>
     * "super" keyword : same as "this" but with a parent class, you can access every variable
     *  (either public or protected) of the parent class, or call a constructor of the class
     *  or a method
     *
     *  <br><br>
     *  <strong>Question 4</strong><br><br>
     *
     *  "inheritance" : It's like a mother and its child. A parent class can pass attributes, methods to its child
     *  class <br>
     *  "polymorphism" : Define a child class as the type of its Parent class. This way we can manipulate multiple
     *  different childs of the same parent without worrying about any differencies. Ex: ArrayList -> List
     *
     * <br><br>
     * <strong>Question 5</strong><br><br>
     * */
    public HelloEncapsulation(int prop) {
        this.propVal = prop;
    }

    /**
     * Accessor methods (including <i>getters</i>) do not change the state of an object
     * (compare to {@code const} member functions in C++)
     */
    public int getPropVal() {
        return propVal;
    }

    /**
     * Mutator methods (including <i>setters</i>) change the state of an object
     */
    public void setPropVal(int propVal) {
        this.propVal = propVal;
    }

    /**
     * If a property (or a method result) is of the {@code boolean} type,
     * the corresponding "getter" is usually named {@code isSth()} and not {@code getSth()}
     */
    public boolean isEncapsulated() {
        return true; // Of course, it is
    }
}
