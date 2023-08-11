package home.calculator;

import java.util.List;

/** Класс обрабатывает логику произведения
 * вычислений над данными
 */
public class Model {
    private List<String> numbers;
    private List<String> symbols;
    private double result;
    private boolean divideByZero;

    public Double getResult() {
        return result;
    }

    public int size() {
        return numbers.size();
    }

    public List<String> getSymbols() {
        return symbols;
    }
    
    public List<String> getNumbers() {
        return numbers;
    }

    /** Индикатор деления на 0
     *  @return boolean
     */
    public boolean isZero() {
        return divideByZero;
    }

    /** Конструктор по умолчанию
     */
    public Model() {}    

    /** Конструктор класса Model
     * @param numbers
     * @param symbols
     */
    public Model(List<String> numbers, List<String> symbols) {
        this.numbers = numbers;
        this.symbols = symbols;
        this.result = 0.0;
        this.divideByZero = false;
    }    

    /* Объявление объекта родительского класса BaseMath
     * для использования дочерними классами
     */
    BaseMath operands;

    /** Метод определяет количество операндов в выражении и
     * инициализирует объект класса BaseMath конструктором
     * подходящего дочернего класса.
     * Возвращает флаг деления на 0
     * @return boolean isZero()
     * Если значение флага true - происходит попытка деления на 0.
     */
    public boolean count() {
        switch (size()) {
            case 2:
                operands = new TwoOperands(
                    Double.parseDouble(getNumbers().get(0)),
                    Double.parseDouble(getNumbers().get(1))
                );
                operation();
                break;
            /** можно реализовать вычисления 3 и более операндов 
            *   используя наследование класса BaseMath
            case 3:
                operands = new ThreeOperands(
                    Double.parseDouble(getNumbers().get(0)),
                    Double.parseDouble(getNumbers().get(1)),
                    Double.parseDouble(getNumbers().get(2))
                );
                operation();
                break;*/
            default:
                break;
        }
        return isZero();
    }
    
    /** Метод выбирает нужные математические действия,
     * производит проверку деления на 0, отправляет
     * запрос на вычисления. Результат вычислений
     * помещается в поле приватное result.
     */
    public void operation() {
        for (String string : getSymbols()) {
            switch (string) {
                case "+":
                    operands.add();
                    break;
                case "-":
                    operands.subtract();
                    break;
                case "*":
                    operands.multiply();
                    break;
                case "/":
                    if (Double.parseDouble(getNumbers().get(1)) == 0) {
                        divideByZero = true;
                        break;
                    }else {
                        operands.divide();
                        break;
                    }
            }
            result += operands.getResult();;
        }
    }
    

}
