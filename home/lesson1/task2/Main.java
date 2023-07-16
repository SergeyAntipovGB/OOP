package home.lesson1.task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.5, 3.6);
        System.out.printf("\nrectangle1 (%.1f; %.1f) : area = %.2f, perimeter = %.2f\n", rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.calculateArea(), rectangle1.calculatePerimeter());
        System.out.printf("\nrectangle2 (%.1f; %.1f) : area = %.2f, perimeter = %.2f\n", rectangle2.getWidth(), rectangle2.getHeight(), rectangle2.calculateArea(), rectangle2.calculatePerimeter());
        rectangle1.setWidth(10);
        rectangle1.setHeight(20);
        System.out.printf("\nrectangle1 (%.1f; %.1f) : area = %.2f, perimeter = %.2f\n", rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.calculateArea(), rectangle1.calculatePerimeter());
    }
}
