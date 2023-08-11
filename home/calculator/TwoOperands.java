package home.calculator;

/** Дочерний класс математического процессора. Предназначен
 *  для решения простых выражений из двух дробных операндов
 */
public class TwoOperands extends BaseMath {
    private double num1;
    private double num2;
    private double result;

    /** Конструктор класса TwoOperands
     * @param double num1
     * @param double num2
     */
    public TwoOperands(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0.0;
    }

    /** Метод сложения двух дробных чисел */
    public void add() {
        result = num1 + num2;
    }

    /** Метод вычитания двух дробных чисел */
    public void subtract() {
        result = num1 - num2;
    }

    /** Метод деления двух дробных чисел */
    public void divide() {
        result = num1 / num2;
    }

    /** Метод умножения двух дробных чисел */
    public void multiply() {
        result = num1 * num2;
    }

    public double getResult() {
        return result;
    }
}