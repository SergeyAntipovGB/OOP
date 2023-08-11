package home.calculator;

public class Presenter implements Phrases {
    private Model model;
    private View view;

    Exit exit = new Exit();

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /** Метод класса Presenter запрашивает действие и обрабатывает
     * результат
     */
    public void requestExpression() {
        String expression = view.getRequest(REQUEST_EXPRESSION);
        if (isNumber(expression)) {
            int numberOfExpression = Integer.parseInt(expression);
            if (numberOfExpression > 0 & numberOfExpression < 5) {
                performeExpression(numberOfExpression);
            }else
                view.displayAlert(ALERT_ILLEGAL_NUMBER);
        }else
            view.displayAlert(ALERT_NOT_NUMBER);
        if (!exit.isExit()) requestExpression();
    }
    
    /** Метод класса Presenter запрашивает действие и обрабатывает
     * результат
     */
    public void requestOperation() {
        String operation = view.getRequest(REQUEST_OPERATION);


        
    }


    /** Метод проверяет строку на возможность преобразования
     * в целое число
     * @param String string
     * @return Boolean
     */
    private boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void performeExpression(int position) {
        switch (position) {
            case 1:
                view.clearScreen();
                view.displayAlert(HELP);
                break;
            case 2:
                requestOperation();

                break;
            case 3:
                view.clearScreen();
                view.displayAlert(HELP);
                break;
            case 4:
                view.clearScreen();
                view.displayAlert(END);
                view.clearScreen();
                exit.onExit();
                break;
        }
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
