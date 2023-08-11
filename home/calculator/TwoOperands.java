package home.calculator;

public class TwoOperands extends BaseMath {
    private double num1;
    private double num2;
    private double result;

    public TwoOperands(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0.0;
    }

    public void add() {
        result = num1 + num2;
    }

    public void subtract() {
        result = num1 - num2;
    }

    public void divide() {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            // Exception.openFlag();
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    public void multiply() {
        result = num1 * num2;
    }

    public double getResult() {
        return result;
    }
}