package home.lesson2.task1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 6);

        // вызов метода по умолчанию printRes
        rectangle1.printRes(rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.calculateArea(), rectangle1.calculatePerimeter());
        
        rectangle2.printRes(rectangle2.getWidth(), rectangle2.getHeight(), rectangle2.calculateArea(), rectangle2.calculatePerimeter());
        
        rectangle1.setWidth(10);
        rectangle1.setHeight(20);
        
        rectangle1.printRes(rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.calculateArea(), rectangle1.calculatePerimeter());
        
        // вызов метода setWidth()родительского класса Line
        rectangle1.setWidth();

        rectangle1.printRes(rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.calculateArea(), rectangle1.calculatePerimeter());

        // вызов метода по умолчанию интерфейса Size
        rectangle1.sizeRectangle();
    }
}
