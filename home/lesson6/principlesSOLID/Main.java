package home.lesson6.principlesSOLID;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(20.5, 25.0));
        rectangles.add(new Rectangle(15.3, 11.5));
        rectangles.add(new Rectangle(4.6, 45.9));
        rectangles.add(new Rectangle(5.3, 2.5));
        rectangles.add(new Rectangle(55.2, 32.1));
        rectangles.add(new Rectangle(25.3, 25.5));
        rectangles.add(new Rectangle(4.6, 14.2));
        rectangles.add(new Rectangle(20.0, 14.8));

        System.out.println("\nНеупорядоченный список прямоугольников:");
        for (Rectangle rectangle : rectangles) {
            rectangle.printRes();
        }

        Comparator<Rectangle> areaComparator = (rectangle1, rectangle2) -> (int) (rectangle1.getArea() - rectangle2.getArea());

        rectangles.sort(areaComparator);

        System.out.println("\nУпорядоченный по возрастанию площади прямоугольников список :");
        for (Rectangle rectangle : rectangles) {
            rectangle.printRes();
        }
    }
}
