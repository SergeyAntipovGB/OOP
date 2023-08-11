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

    public void count() {
        switch (size()) {
            case 2:
                
                break;
            default:
                break;
        }
    }
    
    public void operation() {
        for (String string : getSymbols()) {
            switch (string) {
                case "+":
                    TwoOperands.add(Double.parseDouble(getNumbers().get(0)), Double.parseDouble(getNumbers().get(1)));
                    result = TwoOperands.getResult();
                    break;
                case "-":
                    ;
                    break;
                case "*":
                    ;
                    break;
                case "/":
                    ;
                    break;
                default:
                    System.out.println("Некорректная операция!");
            }
            result;
        }
    }
    

}
