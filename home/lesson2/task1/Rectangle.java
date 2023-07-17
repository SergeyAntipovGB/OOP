package home.lesson2.task1;

public class Rectangle extends Line implements Stateble, Printable, Geometry, Color, Size {
    // поле width, методы getWidth и setWidth наследуются из класса Line
    double height;
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // перегрузка метода setWidth() класса Line
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        this.width = WIDTHSTATIC;
        this.height = HEIGHTSTATIC;
    }

    public Rectangle(double length) {
        this.width = length;
        this.height = length;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // переопределение метода calculateArea() класса Geometry
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    // переопределение метода calculatePerimeter() класса Geometry
    @Override
    public double calculatePerimeter() {
        return (width + height) * MULTIPLIER;
    }

    // переопределение метода CalculateDiagonal() класса Geometry
    @Override
    public double CalculateDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public String getColor() {
        return "none color";
    }

    @Override
    public void setColor() {
        System.out.println("none color");;
    }

}
