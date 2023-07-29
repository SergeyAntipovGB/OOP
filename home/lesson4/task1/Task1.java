package home.lesson4.task1;

public class Task1 {
    
    public static <T> void printElement(T obj) {
        System.out.printf("%s - %s\n", obj, obj.getClass().getName());
    }
}
