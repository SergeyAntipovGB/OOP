package work.seminar3.task1;

public class Task1 {
    public static void main(String[] args) {
        IValue value;
        value = () -> 98.6; // лямбда выражение
        System.out.println(value.getValue());

        IValue2 value2 = (x) -> 100 / x;
        IValue2 value2_1 = (y) -> 24 * y - 5.5;
        System.out.println(value2.getValue(5.0));
        System.out.println(value2_1.getValue(8.0));
        
        IValue3 value3 = (a, b) -> { // блочные лямбда выражения
            double result = 1.0;
            // реализация
            // реализация
            // реализация
            return result;
        };
        System.out.println(value3.getValue(5.0, 3.0));
    }
}
