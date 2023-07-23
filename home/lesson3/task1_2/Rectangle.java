package home.lesson3.task1_2;

public class Rectangle {

    int MULTIPLIER = 2;
    double HEIGHTSTATIC = 3;
    double WIDTHSTATIC = 2;
    
    private double width;  
    private double height;
    
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
        this.width = WIDTHSTATIC;
        this.height = HEIGHTSTATIC;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    CalculateDiagonal diagonal = (width, height) -> Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));

    CalculateArea area = (width, height) -> getWidth() * getHeight();

    public double getArea() {
        return area.calculateArea(width, height);
    }

    CalculatePerimeter perimeter = (width, height) -> (getWidth() + getHeight()) * MULTIPLIER;

    public void printRes() {
        System.out.printf("Width = %.2f, Height = %.2f, Area = %.2f\n", getWidth(), getHeight(), area.calculateArea(getWidth(), getHeight()));
    }
}
