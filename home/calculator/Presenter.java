package home.calculator;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void requestOperation() {



    }
    
    public void requestExpression() {
        String operation = view.getOperation();
        double num1 = view.getOperand();
        double num2 = view.getOperand();
        performeOperation(operation, num1, num2);
    }

    public void performeOperation(String operation, double num1, double num2) {
        switch (operation) {
            case "+":
                model.add(num1, num2);
                break;
            case "-":
                model.subtract(num1, num2);
                break;
            case "*":
                model.multiply(num1, num2);
                break;
            case "/":
                model.divide(num1, num2);
                break;
            default:
                System.out.println("Некорректная операция!");
        }
        view.displayResult(model.getResult());
    }
}
