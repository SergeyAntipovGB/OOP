package home.lesson4.task2;

public class Task2 {
    
    public static <T> void printArray(T[] array) {
        System.out.printf("%s ->  ",
                        array[0].getClass().getName());
        for (T iter : array) {
            System.out.printf("%s; ", iter);
        }
        System.out.println();
    }
}
