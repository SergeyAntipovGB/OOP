package home.lesson2.task1;

public interface Size {
    // метод по умолчанию
    default void sizeRectangle() {
        System.out.println("Прямоугольник не имеет объема!");
    }
}
