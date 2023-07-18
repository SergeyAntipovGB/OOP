package home.lesson2.task1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 6);
        Rectangle rectangle3 = new Rectangle(15);

        rectangle1.printRes();
        rectangle2.printRes();
        rectangle3.printRes();

        rectangle1.setWidth(10);
        rectangle1.setHeight(20);
        rectangle1.width = 13;
        rectangle1.printRes();

        rectangle1.setWidth();
        rectangle1.printRes();

        rectangle1.sizeRectangle();
    }
}
