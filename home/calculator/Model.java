package home.lesson7;

public class Model {
    private double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }

    public void divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }

    public double getResult() {
        return result;
    }
}