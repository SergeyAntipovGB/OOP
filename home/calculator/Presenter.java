package home.calculator;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void requestExpression() {
        String expression = view.getRequestExpression();
        // Exception exception = new Exception();
        if (isNumber(expression)) {
            int numberOfExpression = Integer.parseInt(expression);
            if (numberOfExpression > 0 & numberOfExpression < 5) {
                performeExpression(numberOfExpression);
            }
        }
    }
    
    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void performeExpression(int position) {
        switch (position) {
            case 1:
                // model.add(num1, num2);
                break;
            case 2:
                // model.subtract(num1, num2);
                break;
            case 3:
                // model.multiply(num1, num2);
                break;
            case 4:
                // model.divide(num1, num2);
                break;
            default:
                System.out.println("Некорректная операция!");
        }
        view.displayResult(model.getResult());
    }

    // public void requestOperation() {
    //     String operation = view.getOperation();
    //     double num1 = view.getOperand();
    //     double num2 = view.getOperand();
    //     performeOperation(operation, num1, num2);
    // }


    // public void performeOperation(String operation, double num1, double num2) {
    //     switch (operation) {
    //         case "+":
    //             model.add(num1, num2);
    //             break;
    //         case "-":
    //             model.subtract(num1, num2);
    //             break;
    //         case "*":
    //             model.multiply(num1, num2);
    //             break;
    //         case "/":
    //             model.divide(num1, num2);
    //             break;
    //         default:
    //             System.out.println("Некорректная операция!");
    //     }
    //     view.displayResult(model.getResult());
    // }
}
