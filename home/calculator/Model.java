package home.calculator;

import java.util.List;

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

    public boolean isZero() {
        return divideByZero;
    }

    public Model() {}    

    public Model(List<String> numbers, List<String> symbols) {
        this.numbers = numbers;
        this.symbols = symbols;
        this.result = 0.0;
        this.divideByZero = false;
    }    

    BaseMath operands;

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
