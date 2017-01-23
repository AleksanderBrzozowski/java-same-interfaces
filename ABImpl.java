/**
 * @author Aleksander
 */
public class ABImpl {

    private final A a;
    private final B b;

    public ABImpl() {
        a = new A();
        b = new B();
    }

    public A asA() {
        return a;
    }

    public B asB() {
        return b;
    }

    private static class A implements InterfaceA{

        @Override
        public void foo() {
            System.out.println("foo in A");
        }
    }

    private static class B implements InterfaceB{

        @Override
        public void foo() {
            System.out.println("foo in B");
        }
    }
}
