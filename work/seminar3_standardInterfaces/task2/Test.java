package work.seminar3_standardInterfaces.task2;

public class Test {
    public static void main(String[] args) {
        ISomeTest<Integer> iSomeTest = (n, d) -> n > d;
        System.out.println(iSomeTest.test(5, 6));

        ISomeTest<Double> iSomeTest2 = (m, d) -> m > d;
        System.out.println(iSomeTest2.test(6.0, 1.0));
    }
}
