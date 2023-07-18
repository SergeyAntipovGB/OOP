package home.lesson2.task1;

public class Rectangle extends Line implements Stateble, Printable, Geometry, Color, Size {

    private double height;
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        super.width = WIDTHSTATIC;
        this.height = HEIGHTSTATIC;
    }

    public Rectangle(double length) {
        super.width = length;
        this.height = length;
    }

    public Rectangle(double width, double height) {
        super.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return getWidth() * getHeight();
    }
    
    @Override
    public double calculatePerimeter() {
        return (getWidth() + getHeight()) * MULTIPLIER;
    }

    @Override
    public double CalculateDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }

    @Override
    public String getColor() {
        return "none color";
    }

    @Override
    public void setColor() {
        System.out.println("Setting silver color");;
    }

    @Override
    public void printRes() {
        System.out.printf("\nRectangle (Width: %.1f; Height: %.1f)\nArea: %.2f, Perimeter: %.2f\n", getWidth(), getHeight(), calculateArea(), calculatePerimeter());
    }
}
