/**
 * @author Aleksander
 */
public class Main {

    public static void aMethod(InterfaceA a) {
        a.foo();
    }

    public static void bMethod(InterfaceB b) {
        b.foo();
    }

    public static void main(String[] args) {
        final ABImpl ab = new ABImpl();

        aMethod(ab.asA());
        bMethod(ab.asB());
    }
}
