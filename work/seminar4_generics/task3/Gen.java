package work.seminar4_generics.task3;

public class Gen<T> {
    T ob;

    public Gen(T o) {
        ob = o;
    }
}

class UseTest {

    // использование ограниченного шаблона
    // static void test(Gen<? super B> a) {
    static void test(Gen<?> parametr) {
    // static void test(Gen<? extends A> parametr) {
        //
    }

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> ga = new Gen<>(a);
        Gen<B> gb = new Gen<>(b);
        Gen<C> gc = new Gen<>(c);
        Gen<D> gd = new Gen<>(d);

        test(ga);
        test(gb);
        test(gc);
        test(gd);
    }
}
