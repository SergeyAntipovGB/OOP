package home.lesson1.task2;

public class Rectangle {
    double width;
    double height;
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        this.width = 2;
        this.height = 3;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
    
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

}
