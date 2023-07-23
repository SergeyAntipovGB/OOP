package work.seminar3.task3;

import java.util.Arrays;
import java.util.Comparator; // compare(T o1, T o2)
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Вариант реализации компаратора с перегрузкой метода        
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        // Используем компаратор для сортировки в порядке возрастания
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1 - num2;
            }
        });
        System.out.println(numbers); // Вывод: [1, 2, 3, 5, 8]

// Вариант реализации компаратора через лямбду
        // List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        // numbers.sort((num1, num2) -> num1 - num2);
        // System.out.println(numbers); // Вывод: [1, 2, 3, 5, 8]
    }
}
