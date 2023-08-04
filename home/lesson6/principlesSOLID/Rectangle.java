package home.lesson6.principlesSOLID;

public class Rectangle implements Printer {

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

    // по принципу единственной ответственности определение методов CalculateDiagonal, CalculateArea и CalculatePerimeter вынесены в отдельные интерфейсы. По принципу открытости/закрытости мы не изменяем родительские интерфейсы, но можем модифицировать методы
    CalculateDiagonal diagonal = (width, height) -> Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));

    CalculateArea area = (width, height) -> getWidth() * getHeight();

    CalculatePerimeter perimeter = (width, height) -> (getWidth() + getHeight()) * MULTIPLIER;
    
    public double getArea() {
        return area.calculateArea(width, height);
    }
    
    // согласно принципу инверсии зависимостей и принципу открытости/закрытости метод printRes() вынесен в абстрактный интерфейс Printer, который имплементируется классом
    @Override
    public void printRes() {
        System.out.printf("Width = %.2f, Height = %.2f, Area = %.2f\n", getWidth(), getHeight(), area.calculateArea(getWidth(), getHeight()));
    }
}
