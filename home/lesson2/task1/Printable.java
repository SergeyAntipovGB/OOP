package home.lesson2.task1;

public interface Printable {

    // объявление метода по умолчанию
    default void printRes(double w, double h, double ar, double pr) {
        System.out.printf("\nrectangle (%.1f; %.1f): area = %.2f, perimeter = %.2f\n", w, h, ar, pr);
    }
}
