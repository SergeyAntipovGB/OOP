package home.calculator;

public class Calculator {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(model, view);

        /* запуск калькулятора */
        presenter.requestExpression();
    }
}
