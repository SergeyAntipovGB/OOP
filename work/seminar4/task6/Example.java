package work.seminar4.task6;

public class Example {
    // Обобщенный метод с параметрами типа T1 и T2
    public static <T1, T2> T2 put(T1 arg1, T2 arg2) {
        return arg2;
    }

    public static void main(String[] args) {
        // Вызов обобщенного метода с типами String и Integer
        String result1 = put("Hello", 42);
        System.out.println(result1); // Выведет: 42

        // Вызов обобщенного метода с типами Integer и Double
        Double result2 = put(10, 3.14);
        System.out.println(result2); // Выведет: 3.14
    }
}